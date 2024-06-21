import java.util.Scanner;

public class Conditions{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter First number:");
        double numbr1=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Second number:");
        double numbr2=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform?");
        String operation=scanner.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f+%f=%f", numbr1, numbr2, numbr1+numbr2);
        }






        scanner.close();

    }
}