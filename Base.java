public class Base{
       static int age;
    public static void main(String[] args){
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> e9259e891d01da50937c1b5810d976395cfb0f09
        String company="Webdon inc";
        char copyrightSymbol='\u00A9';
        int num1=50;
        double num2=num1;
        System.out.println(num2);

//        System.out.println("I am "+ age+ " years old");

        boolean isStudent=true;
        boolean isLibraryMember=false;
        System.out.println(isStudent && isLibraryMember);

        int dig1=5;
//        System.out.println(name);
        String name= "Mwima";
        String work="Software Engineer";
        int exp=5;
        String formattedText=String.format("%s is a %s with %d years experience", name,work,exp);
        System.out.println(formattedText);
        String str1=new String("xxl");
        String str2=new String("xxl");
        String str3=new String("XXL");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));


<<<<<<< HEAD
=======
=======
       age=26;
       age=30;
        System.out.println("I am "+ age+ " years old");
>>>>>>> 3436a850c53227437397ff7d7b1cc36e25e1114e
>>>>>>> e9259e891d01da50937c1b5810d976395cfb0f09
    }
}