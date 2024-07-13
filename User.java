
import java.util.Scanner;
public class User{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Who is it be ?");
       String name= scanner.nextLine();


        System.out.printf("Wassup %s, How old are you?",name);
       int age= scanner.nextInt();

        System.out.printf("%d is a perfect age. Which languages do you like?",age);
        scanner.nextLine();
        String language=scanner.nextLine();

        System.out.printf("%s is good for backend development", language);


        scanner.close();

    }
}