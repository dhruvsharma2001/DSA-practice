import java.util.*;

public class groupanagrams {
    private static String getFrequencyString(String str){
        int[] freq = new int[26];
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder frequencyString = new StringBuilder();
        char c = 'a';
        for(int i:freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }

  public static List<List<String>> groupAnagramsCategorizeByFrequency(String[] strs) {

    // Check for empty inputs
    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> frequencyStringsMap = new HashMap<>();
    for (String str : strs) {

      String frequencyString = getFrequencyString(str);

      // If the frequency string is present, add the string to the list
      if (frequencyStringsMap.containsKey(frequencyString)) {
        frequencyStringsMap.get(frequencyString).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        frequencyStringsMap.put(frequencyString, strList);
      }
    }

    return new ArrayList<>(frequencyStringsMap.values());
  }
    public static void main(String[] args) {
        String str[] = {"aab", "bba", "baa", "abbccc"};
        System.out.println(groupAnagramsCategorizeByFrequency(str));
    }
}
