import java.util.*;

public class longestcommonprefix {
    public static String LongestCommonPrefix(String[] str){
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str[] = {"club", "clap", "clove"};
        System.out.print(LongestCommonPrefix(str));
    }
}
