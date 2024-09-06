import java.util.Scanner;

public class pow{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base");

        Double base = scanner.nextDouble();

        System.out.println("Enter exponent");

        int exponent = scanner.nextInt();

        Double result; 

        if (exponent < 0){
            result = 1 / power(base, -exponent);
        }
        else{
            result = power(base, exponent);
        }

        System.out.println(result);


        scanner.close();

    }

    public static Double power(Double base, int exponent){
        
        Double result;

        // base case:
        if (exponent == 0){
            result = 1.0;
        }

        else{
            result = base * power(base, exponent - 1);
        }



        return result;

    }
    

}
