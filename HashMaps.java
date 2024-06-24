import java.util.HashMap;
public class HashMaps{
    public static void main(String[] args){

        HashMap<String,Integer> examScores= new HashMap<String,Integer>();

        examScores.put("Biology", 90);
        examScores.put("Chemistry", 79);
        examScores.put("Physics", 85);
        examScores.putIfAbsent("Physics", 68);// replaces if value is absent;
        examScores.replace("Biology",81);
//        examScores.clear();
//        examScores.remove("Physics");
//
//        System.out.println(examScores.get("Chemistry"));// printing individual item
//        System.out.println(examScores.getOrDefault("Kiswahili",76));
//        System.out.println(examScores.size());
//        System.out.println(examScores.toString());
//        System.out.println(examScores.containsKey("Biology"));
//        System.out.println(examScores.containsValue(Integer.valueOf(81)));
//        System.out.println(examScores.isEmpty());
        examScores.forEach((subject,score)->{
//            System.out.println(subject+ " "+ score);
            examScores.replace(subject,score-20);
        });
        System.out.println(examScores.toString());
    }
}