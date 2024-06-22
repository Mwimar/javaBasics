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
        int startIndex=1;
        int endIndex=3;
        Arrays.fill(vowels, startIndex, endIndex,'x');
int numbers[] ={1,2,3,4,5};
int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
Arrays.fill(numbers,0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));



    }
}