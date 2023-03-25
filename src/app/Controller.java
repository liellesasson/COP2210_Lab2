package app;

public class Controller {

   //-------------------------------------------------------------
   // beginning of main(String[] args)) method

   public static void main(String[] args){

       yourInfoHeader();

       int minutes = 33;
       int hours = 15;
       int days = 4;

       int secondsInMinute = 60;
       int secondsInHour = secondsInMinute * 60;
       int secondsInDay = secondsInHour * 24;
       int totalSeconds = secondsInMinute * minutes + secondsInHour * hours + secondsInDay * days;

       printStepHeader(3);
       System.out.printf("Number of seconds in %d days, %d hours and %d minutes is %d", days, hours, minutes, totalSeconds);

       double initialInvestment = 125000;

       double year1InterestRate = .05;
       double year2InterestRate = 0.09;
       double year3InterestRate = -0.035;
       double year4InterestRate = 0.07;

       double year1InvestmentValue = (year1InterestRate * initialInvestment) + initialInvestment;

       double year2InvestmentValue = (year2InterestRate * year1InvestmentValue) + year1InvestmentValue;
       double year3InvestmentValue = (year3InterestRate * year2InvestmentValue) + year2InvestmentValue;

       double year4InvestmentValue = (year4InterestRate * year3InvestmentValue) + year3InvestmentValue;
       double totalInterestEarned = (year4InvestmentValue - initialInvestment);

       printStepHeader(4);
       System.out.println("InitialInvestment:\t\t\t" + initialInvestment);
       System.out.println("year1InvestmentValue:\t\t" + year1InvestmentValue);
       System.out.println("year2InvestmentValue:\t\t" + year2InvestmentValue);
       System.out.println("year3investmentValue:\t\t" + year3InvestmentValue);
       System.out.println("year4investmentValue:\t\t" + year4InvestmentValue);
       System.out.println("totalInterestEarned:\t\t" + totalInterestEarned);
       System.out.println();

       System.out.printf("initialInvestment:\t\t\t%10.2f", initialInvestment);
       System.out.printf("\nyear1InvestmentValue:\t\t%10.2f", year1InvestmentValue);
       System.out.printf("\nyear2InvestmentValue:\t\t%10.2f", year2InvestmentValue);
       System.out.printf("\nyear3InvestmentValue:\t\t%10.2f", year3InvestmentValue);
       System.out.printf("\nyear4InvestmentValue:\t\t%10.2f", year4InvestmentValue);
       System.out.printf("\ntotalInterestEarned:\t\t%10.2f", totalInterestEarned);

       double circleDiameter = 17.3543;
       double circleRadius = circleDiameter / 2;
       double circleCircumference = 2 * Math.PI * circleRadius;
       double circleArea = Math.PI * Math.pow(circleRadius, 2);

       printStepHeader(5);
       System.out.printf("circleDiameter: \t\t\t%-10.4f", circleDiameter);
       System.out.printf("\ncircleRadius: \t\t\t\t%-10.4f", circleRadius);
       System.out.printf("\ncircleCircumference: \t\t%-10.4f", circleCircumference);
       System.out.printf("\ncircleArea: \t\t\t\t%-10.4f", circleArea);

       double rectangleHeight = 19.4;
       double rectangleWidth = 34.7;

       double triangleHeight = 16.4;
       double triangleBase = 20.1;

       double rectanglePerimeter = 2 * (rectangleHeight + rectangleWidth);
       double rectangleArea = rectangleHeight * rectangleWidth;

       double triangleHypotenuse = StrictMath.hypot(triangleHeight, triangleBase);

       double trianglePerimeter = triangleBase + triangleHeight + triangleHypotenuse;
       double triangleArea = (triangleHeight * triangleBase) / 2;

       double totalPerimeter = trianglePerimeter + rectanglePerimeter;
       double totalArea = triangleArea + rectangleArea;

       printStepHeader(6);
       System.out.printf("rectangleHeight: \t\t\t%8.1f", rectangleHeight);
       System.out.printf("\nrectangleWidth: \t\t\t%8.1f", rectangleWidth);
       System.out.printf("\ntriangleHeight: \t\t\t%8.1f", triangleHeight);
       System.out.printf("\nrectanglePerimeter: \t\t%8.1f", rectanglePerimeter);
       System.out.printf("\nrectangleArea: \t\t\t\t%8.1f", rectangleArea);
       System.out.printf("\ntriangleHypotenuse: \t\t%8.1f", triangleHypotenuse);
       System.out.printf("\ntrianglePerimeter: \t\t\t%8.1f", trianglePerimeter);
       System.out.printf("\ntriangleArea: \t\t\t\t%8.1f", triangleArea);
       System.out.printf("\ntotalPerimeter: \t\t\t%8.1f", totalPerimeter);
       System.out.printf("\ntotalArea: \t\t\t\t\t%8.1f", totalArea);

       double airflow = 1.253;
       double x = 1.392;
       double y = 0.72;
       double z = 4.2932;

       double temp1 = Math.cos(Math.pow(airflow,3));
       double temp2 = Math.exp(6 * x * Math.pow(y,4));
       double temp3 = 2 * Math.sqrt(7 * x * Math.pow(y,5.23) * z);
       double temp4 = (1.8 * x * y * z);
       double temp5 = (Math.pow(.75, Math.pow(2, x * y *z)));
       double temp6 = Math.sqrt(airflow + x);
       double boost = (temp1 * (temp2 + temp3)/temp6 + temp4 + temp5);

       printStepHeader(7);
       System.out.printf("airflow: \t\t\t\t%-8.6f", airflow);
       System.out.printf("\nx: \t\t\t\t\t\t%-8.6f", x);
       System.out.printf("\ny: \t\t\t\t\t\t%-8.6f", y);
       System.out.printf("\nz: \t\t\t\t\t\t%-8.6f", z);
       System.out.printf("\ntemp1: \t\t\t\t\t%-8.6f", temp1);
       System.out.printf("\ntemp2: \t\t\t\t\t%-8.6f", temp2);
       System.out.printf("\ntemp3: \t\t\t\t\t%-8.6f", temp3);
       System.out.printf("\ntemp4: \t\t\t\t\t%-8.6f", temp4);
       System.out.printf("\ntemp5: \t\t\t\t\t%-8.6f", temp5);
       System.out.printf("\ntemp6: \t\t\t\t\t%-8.6f", temp6);
       System.out.printf("\nboost: \t\t\t\t\t%-8.6f", boost);



   } //end main


    //--------------------------------------------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader(){

        System.out.println("===============================================");
        System.out.println("PROGRAMMER: " + "Lielle Sasson");
        System.out.println("PANTHER ID: " + "6304972");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO1");
        System.out.println("SEMESTER: \t " + "Spring 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("Assignment: " + "Lab2");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===============================================");
        System.out.println();

    }//end yourInfoHeader


    //----------------------------------------------------------------
    // beginning of printStepHeader(int stepNumber) method

    public static void printStepHeader(int stepNumber){

       System.out.println();
       System.out.println();
       System.out.println("=======================================");
       System.out.println("Step: " + stepNumber);
       System.out.println("=======================================");

    }//end printStepHeader

    //-------------------------------------------------------------------------



}
