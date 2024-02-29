import java.util.Scanner;
public class Gradecalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Hindi Subject marks (out of 100) : ");
        double hindi = sc.nextDouble();

        System.out.print("Enter English Subject marks (out of 100) : ");
        double english = sc.nextDouble();

        System.out.print("Enter Maths Subject marks (out of 100) : ");
        double maths = sc.nextDouble();

        System.out.print("Enter Physics Subject marks (out of 100) : ");
        double Phy = sc.nextDouble();

        System.out.print("Enter Chemistry Subject marks (out of 100) : ");
        double chemistry = sc.nextDouble();

        double totalmarks = (hindi + english + maths + Phy + chemistry);
        double averagePercent = (totalmarks * 100) / 500;  

        char grade;
        if(averagePercent>=90){
            grade='A';
        }else if (averagePercent >= 80) {
            grade = 'B';
        } else if (averagePercent >= 70) {
            grade = 'C';
        } else if (averagePercent >= 60) {
            grade = 'D';
        } else if (averagePercent >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks : "+totalmarks);
        System.out.println("Average Percentage : "+ averagePercent +" %");
        System.out.println("Grade : "+grade);
    }
}