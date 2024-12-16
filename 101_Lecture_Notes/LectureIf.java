/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        boolean x = true;
        boolean y = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");
        int num = sc.nextInt();
        
        if (num > 10){
        System.out.print("Your number is greater than 10");
        }
       
        else if (num < 10){
        System.out.print("Your number is less than 10");
        }
	}
}