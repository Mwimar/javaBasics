public class Base{
       static int age;
    public static void main(String[] args){
        String company="Webdon inc";
        char copyrightSymbol='\u00A9';
        int num1=50;
        double num2=num1;
        System.out.println(num2);
//        System.out.println(company+ copyrightSymbol);
//        System.out.println("I am "+ age+ " years old");

        boolean isStudent=true;
        boolean isLibraryMember=false;
        System.out.println(isStudent && isLibraryMember);

        int dig1=5;
        System.out.println(dig1++);
        System.out.println(dig1);
        System.out.println(++dig1);

    }
}