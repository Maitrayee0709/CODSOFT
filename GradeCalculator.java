import java.util.*;
public class GradeCalculator{
    
        Scanner sc= new Scanner(System.in);
        double s1, s2, s3, s4, s5;
        double avgscore;

        void add_score(){

        System.out.println("enter your scores in subjects out of 100");
        
        System.out.println("score in Physics");
        s1 = sc.nextDouble();
        System.out.println("score in Chemistry");
        s2 = sc.nextDouble();
        System.out.println("score in Biology");
        s3 = sc.nextDouble();
        System.out.println("score in Maths");
        s4 = sc.nextDouble();
        System.out.println("score in Computer Science");
        s5 = sc.nextDouble();
        
        }

        void display(){
        double totalmarks = s1 + s2 + s3 + s4 + s5;
        System.out.println("Your total score out of 500 is " + totalmarks);
        avgscore = totalmarks/5;
        System.out.println("your average percentage is "+ avgscore + "%");

        }

        void myGrade(){
        if(avgscore >= 90){
            System.out.println("you've got A grade excellent!");
        } else if (avgscore >= 80){
            System.out.println("you've got B grade very good!");
        } else if (avgscore >= 70){
            System.out.println("you've got C grade satisfactory");
        } else if (avgscore >= 60){
            System.out.println("you've got D Grade work hard");
        } else if (avgscore >= 50){
            System.out.println("you've got E grade poor performace, need improvement!");
        } else {
            System.out.println("sorry you've failed better luck next time.");
        }
          }

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        gc.add_score();
        gc.display();
        gc.myGrade();
    }
}
