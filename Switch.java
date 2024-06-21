import java.util.Scanner;

public class Switch{
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

        switch(operation){
            case "sum":
                System.out.printf("%f+%f=%f", numbr1, numbr2, numbr1+numbr2);
                break;
            case "sub":
                System.out.printf("%f-%f=%f", numbr1, numbr2, numbr1-numbr2);
                break;
            case "mul":
                System.out.printf("%f*%f=%f", numbr1, numbr2, numbr1*numbr2);
                break;
            case "div":
                if(numbr2==0){
                    System.out.print("Cannot divide by zero");
                }else{
                System.out.printf("%f/%f=%f", numbr1, numbr2, numbr1/numbr2);
                      }
                break;
            default:
                System.out.printf("%s is not a supported operation",operation);
        }

        scanner.close();

    }
}