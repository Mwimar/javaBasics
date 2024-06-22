import java.util.Arrays;
public class ArraysBase {
    public static void main (String[] args){
//        char vowels[]= new char[5];
//
//        vowels[0]='a';
//        vowels[1]='e';
//        vowels[2]='i';
//        vowels[3]='o';
//        vowels[4]='u';
        char vowels[] = {'i', 'u', 'a', 'o', 'e'};
        Arrays.sort(vowels);
        char key='u';
        //binarySearch only works in sorted arrays;
        Arrays.fill(vowels,'x');



        System.out.println(Arrays.toString(vowels));
        System.out.println();
    }
}