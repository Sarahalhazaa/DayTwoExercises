import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DayTweExercises {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Scanner scanner = new Scanner(System.in);

//-Exercise (Java Basics)
// -Q1--------------------------------------------------------------
        System.out.print("Enter Weight(Kg):");
        double Weight = scanner.nextDouble();
       System.out.print("Enter Height(m):");
        double Height = scanner.nextDouble();
        BMI(Weight, Height);
//--Q2--------------------------------------------------------------
        System.out.print("Enter Marks Obtained:");
        double MarksObtained = scanner.nextDouble();
        System.out.print("Enter Total Marks:");
        double TotalMarks = scanner.nextDouble();
       CalculatingMarksObtained( MarksObtained,TotalMarks);
//--Q3---------------------------------------------------------------
        System.out.print("Enter Amount in USD=");
        double AmountInUSD = scanner.nextDouble();
        System.out.print("Enter Exchange Rate (USD to EUD)=");
        double ExchangeRate = scanner.nextDouble();
        ConvertUSDTOEUR( AmountInUSD, ExchangeRate);

//--Q4---------------------------------------------------------------
//        System.out.print(" Enter a sentence:");
//            String sentence = scanner.nextLine();
//        LengthAndReversalString(sentence);
//--Q5---------------------------------------------------------------
//        System.out.print(" Enter a sentence:");
//        String sentence1 = scanner.nextLine();
//        System.out.print(" Enter Start Index:");
//        int StartIndex= scanner.nextInt();
//        System.out.print(" Enter End Index:");
//        int EndIndex= scanner.nextInt();
//        ExtractSubstring(sentence1,StartIndex,EndIndex);
//--Q6---------------------------------------------------------------
//        System.out.print(" Enter a sentence:");
//        String sentence2 = scanner.nextLine();
//        System.out.print(" Enter Keyword :");
//        String Keyword = scanner.nextLine();
//        SearchForKeyword(sentence2 ,Keyword);
//--Q7---------------------------------------------------------------
//        System.out.print(" Enter a sentence:");
//        String sentence3 = scanner.nextLine();
//        System.out.print(" Enter Word to Replece:");
//        String word1 = scanner.nextLine();
//        System.out.print(" Enter Replecement Word:");
//        String word2 = scanner.nextLine();
//        ReplaceWord(sentence3,word1,word2);
// --Q8--------------------------------------------------------------
//        System.out.print(" Enter a sentence:");
//        String sentence4 = scanner.nextLine();
//        System.out.print(" Enter a sentence:");
//        String sentence5 = scanner.nextLine();
//        ComparingEqualityTwoString(sentence4,sentence5);


//-Exercise(Conditional)
// -Q1-----------------------------------------------------------------
//        System.out.printf(" A -Admin %n B- Superuser %n C- User %n");
//        System.out.printf("Choose the character that represents your role :");
//        String role = scanner.nextLine();
//        CheckRole(role);
//-Q2-------------------------------------------------------------------
//        System.out.print("Enter First Number:");
//        double num1= scanner.nextDouble();
//        System.out.print("Enter Second Number:");
//        double num2= scanner.nextDouble();
//        System.out.print("Enter  Third  Number:");
//        double num3= scanner.nextDouble();
//       greatestNumber(num1,num2,num3);
//-Q3-------------------------------------------------------------------
//        WeekDays();

//-Q4-------------------------------------------------------------------
//        System.out.print("Enter Numeric score:");
//        double NumericScore= scanner.nextDouble();
//        GradingScale(NumericScore);
//-Q5-------------------------------------------------------------------
//        System.out.print("Enter Your age:");
//        int age = scanner.nextInt();
//        AgeCategoriesClassification( age);

    }
        public static void BMI (double Weight,double Height){
            if (Height == 0) {
                System.out.print("Cannot divide by zero.");
            } else {
               double result = Weight/(Height*Height);
                System.out.printf("BMI= "+result+"%n");
            }

        }

    public static void CalculatingMarksObtained (double MarksObtained,double TotalMarks){
       if (TotalMarks == 0) {
          System.out.printf("Cannot divide by zero. %n");
         } else {
             double Percentage = (MarksObtained/TotalMarks)*100;
              System.out.printf("Percentage= "+Percentage+"% %n");
 }

    }
    public static void ConvertUSDTOEUR(double AmountInUSD, double ExchangeRate){
        if (AmountInUSD == 0) {
            System.out.printf("cannot multiply by zero.%n");
        } else if (ExchangeRate== 0) {
            System.out.print("cannot multiply by zero.");}
        else {
           double AmountInEUR= AmountInUSD*ExchangeRate;
            System.out.printf("Amount in EUR="+ AmountInEUR+"%n");

        }

    }

    public static void LengthAndReversalString( String sentence){
        StringBuilder n = new StringBuilder(sentence);
        System.out.println("length of the string: "+sentence.length()+" And Reversed string:"+ n.reverse().toString());
    }

    public static void ExtractSubstring(String sentence1,int StartIndex,int EndIndex){
       System.out.println("Substring:"+sentence1.substring(StartIndex,EndIndex));


    }

    public static void SearchForKeyword(String sentence2 ,String Keyword){

        boolean K = sentence2.toLowerCase().contains(Keyword);
        if(K){
        System.out.println("keyword " +Keyword+ " is present in the sentence.");}
        else{ System.out.println(" keyword " + Keyword + " is  NOT present in the sentence.");}
    }

    public static void ReplaceWord(String sentence3,String word1 ,String word2){

         System.out.println("sentence after modification: "+ sentence3.replaceAll(word1,word2) );


    }
    public static void ComparingEqualityTwoString(String sentence4,String sentence5){
        boolean A= sentence4.equalsIgnoreCase(sentence5);
        if(A){
            System.out.println(" String are equal.");}
        else{ System.out.println("String are not equal.");}

    }
    public static void CheckRole(String role){
        if (role.equalsIgnoreCase("A")){
            System.out.println("Welcome Admin");}
        else if (role.equalsIgnoreCase("B")) {
                System.out.println("Welcome Superuser");
            } else {  System.out.println("Welcome User");}

            }
    public static void greatestNumber( double num1 , double num2 ,double num3){
        double greatest = Math.max(Math.max(num1,num2),num3);
        System.out.println("greatest: "+ greatest);
    }

    public static void GradingScale (double NumericScore){
        System.out.print("Letter Grade: ");
        if (NumericScore >=90)
            System.out.println("A");
           else if (NumericScore >=80)
                System.out.println("B");
               else if (NumericScore >=70)
                    System.out.println("C");
                  else  if (NumericScore >=60)
                        System.out.println("D");
                      else    if (NumericScore >=0)
                              System.out.println("F");


    }
    public static void WeekDays(){
        Random random =new Random();
        int RandomNumber = random.nextInt(7)+ 1;
        if (RandomNumber == 1)
            System.out.println("Sunday");
           else if (RandomNumber == 2)
                System.out.println("Monday");
             else   if (RandomNumber == 3)
                    System.out.println("Tuesday");
                else   if (RandomNumber == 4)
                        System.out.println("Wednesday");
                     else  if (RandomNumber == 5)
                            System.out.println("Thursday");
                          else   if (RandomNumber == 6)
                                System.out.println("Friday");
                                if (RandomNumber == 7)
                                    System.out.println("Saturday");
    }
    public static void AgeCategoriesClassification( int age){
        if (age<13)
            System.out.println("You are a child");
        else if (age<=19)
                System.out.println("You are a teenager");
           else if (age>=20)
                    System.out.println("You are an adult");
    }
}




