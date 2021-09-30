package homework;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's grade here: ");
        int grade = Integer.valueOf(input.nextLine());
        if(grade>=90){System.out.println("The student's Letter Grade is: A");}
        else if(grade>=80){System.out.println("The student's Letter Grade is: B");}
        else if(grade>=70){System.out.println("The student's Letter Grade is: C");}
        else if(grade>=55){System.out.println("The student's Letter Grade is: D");}
        else {
            System.out.println("The student's Letter Grade is: F");
        }
        input.close();
    }
}
