public class Loops{
    public static void main(String[] args){
        int sum=0;
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        for(int index=0; index<numbers.length; index++){
            sum+=numbers[index];
        }
            System.out.println(sum);

    }
}