import java.util.Scanner;


public class fibonacci{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fibonacci number: ");

        int n = scanner.nextInt();

        System.out.println("The n-th fibonacci number is : " + fib(n));

        scanner.close();
    }


    public static int fib(int n){

        int result ;

        if (n <= 1){
            result = 0;
        }
        else if (n==2){
            result = 1;
        }
        else{
            result = fib(n-1) + fib(n-2);
        }

        return result;
    }


}
