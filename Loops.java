public class Loops{
    public static void main(String[] args){
//        int sum=0;
//        int numbers[] = {1,2,3,4,5,6,7,8,9};
//        for(int index=0; index<numbers.length; index++){
//            sum+=numbers[index];
//        }

//        for(int number=1; number<=10; number++){
//            for(int multiplier=1; multiplier<=10; multiplier++){
//                System.out.printf("%d X %d = %d \n", number,multiplier, number*multiplier);
//            }
//
//                   }
//        for (int number=1; number<50; number++){
//            if(number%2==1){
//                System.out.println(number);
//            }
//        }
//        int numbers []={3,7,3,9,6,1,2};
//
//        int sum=0;
//
//        for (int number:numbers){
//            sum+=number;
//        }
//            System.out.println(sum);
        int number=5;
        int multiplier=1;

        while(multiplier<=10){
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            multiplier++;
        }

    }
}