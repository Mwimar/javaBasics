import java.util.Scanner;

public class User{
    public static void main(String[] args){
        String stats="I am a backend developer";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Howdy ?");

       String newStart= scanner.nextLine();
        System.out.println(newStart);
        scanner.close();

    }
}