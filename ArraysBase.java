import java.util.Arrays;
public class ArraysBase {
    public static void main (String[] args){
        char vowels[]= new char[5];

        vowels[0]='a';
        vowels[1]='e';
        vowels[2]='i';
        vowels[3]='o';
        vowels[4]='u';

        System.out.println(vowels[1]);
        System.out.println(Arrays.toString(vowels));
    }
}