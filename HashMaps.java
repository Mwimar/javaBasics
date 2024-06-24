import java.util.HashMap;
public class HashMaps{
    public static void main(String[] args){

        HashMap<String,Integer> examScores= new HashMap<String,Integer>();

        examScores.put("Biology", 90);
        examScores.put("Chemistry", 79);
        examScores.put("Physics", 85);
        examScores.putIfAbsent("Physics", 68);// replaces if value is absent;
        examScores.replace("Biology",81);

        System.out.println(examScores.getOrDrfault("Kiswahili",76));;
        System.out.println(examScores.toString());
        System.out.println(examScores.get("Chemistry"));// printing individual item
    }
}