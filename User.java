import java.util.Scanner;

public class User{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Howdy ?");
       String newStart= scanner.nextLine();

        System.out.print(newStart);

        scanner.close();

    }
}