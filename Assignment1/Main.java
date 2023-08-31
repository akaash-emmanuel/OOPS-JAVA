import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for factorial calculation: ");
        int factorial = in.nextInt();
        int result = 1;

        for(int i = 1; i<= factorial; i++){
           result = result * i;
        }


        System.out.println("The factorial of "+factorial+"is" +result);





        in.close();
    }
}