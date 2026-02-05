 package coursework1.studgrading1;
import java.util.Scanner;

public class StudGrading1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //students' counter
        int i=0;
        //grade counter
        int g1=0, g2=0, g3=0, g4=0, g5=0, g6=0, g7=0, g8=0, g9=0;
        //while loop
        while(i<5){
           //identify veriables
           int grade=0;
           String remark="";
           //request for user input
           System.out.println("Enter Students' scores:");
           int score=input.nextInt();
           
             //if statement
             if(score>=80 && score<=100){
                 grade=1; remark="D1"; g1++;
             }
             
             else if(score>=75){
                 grade=2; remark="D2"; g2++;
             }
             
              else if(score>=66){
                 grade=3; remark="C3"; g3++;
             }
             
              else if(score>=60){
                 grade=4; remark="C4"; g4++;
             }
             
              else if(score>=50){
                 grade=5; remark="C5"; g5++;
             }
             
              else if(score>=45){
                 grade=6; remark="C6"; g6++;
             }
             
              else if(score>=35){
                 grade=7; remark="P7"; g7++;
             }
             
              else if(score>=30){
                 grade=8; remark="P8"; g8++;
             }
             
              else if(score>=0){
                 grade=9; remark="F"; g9++;
             }
             
              else{
                  System.out.println("Invalid score!! try again...");
                  continue;
              }
             
             System.out.println("Score:"+score+", Grade:"+grade+", Remark:"+remark+" ");
             i++;
        }
        //summary
        System.out.println("\n===== GRADE SUMMARY =====");
        System.out.println("Grade 1 (D1): " + g1);
        System.out.println("Grade 2 (D2): " + g2);
        System.out.println("Grade 3 (C3): " + g3);
        System.out.println("Grade 4 (C4): " + g4);
        System.out.println("Grade 5 (C5): " + g5);
        System.out.println("Grade 6 (C6): " + g6);
        System.out.println("Grade 7 (P7): " + g7);
        System.out.println("Grade 8 (P8): " + g8);
        System.out.println("Grade 9 (F): " + g9);
    
      
    }
}