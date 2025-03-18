import java.util.*;

public class partitionlabels {
    public static List<Integer> PartitionLabel(String str){
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<str.length();){
            int startIndex = i;
            int endIndex = str.lastIndexOf(str.charAt(startIndex));
            for(int s= startIndex+1;s<=endIndex-1;s++){
                int lastIndexOfNextCharacter = str.lastIndexOf(str.charAt(s));
                if(lastIndexOfNextCharacter>endIndex){
                    endIndex = lastIndexOfNextCharacter;
                }
            }
            result.add(endIndex-startIndex+1);
            i = endIndex+1;
        }
        return result;
    }
    public static void main(String args[]){
        String str = "ababxdedg";
        System.out.println(PartitionLabel(str));
    }
}
