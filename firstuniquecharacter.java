import java.util.HashMap;

public class firstuniquecharacter {
    public static int FirstUniqueCharacter(String str){
        int index = -1;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int freq = freqMap.getOrDefault(c, 0);
            freqMap.put(c, (freq+1));
        }

        for(int i=0;i<str.length();i++){
            if(freqMap.get(str.charAt(i))==1){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String args[]){
        String str = "FourByFourFrog";
        System.out.println(FirstUniqueCharacter(str));
    }
}
