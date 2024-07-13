import java.util.Scanner;
public class practice {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter length? ");
        int length= scanner.nextInt();

         System.out.print(" Enter width?");
         int width = scanner.nextInt();
         System.out.printf("The Area is calculated by multiplying the length %d by width %d which equals " +(length*width)+ "squared ",length,width );

scanner.close();
    }
}
