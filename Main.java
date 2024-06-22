import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int age=40;
        String name="masasa";
        System.out.println(name.toUpperCase()+" will be "+(age+10)+" years old");
        int [] ages={23,17,14,35,29};
//        for(int i=0; i<ages.length;i++){
//            System.out.println(ages[i]);
//        }
        for(int i:ages){
            if(i<20){
                System.out.println(i*2);
            }else{
            System.out.println(i);
                
            }
        }
//        System.out.println(ArraysBase.toString(ages));


    }
}