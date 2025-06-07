public class RemoveDuplicatesFromAString {
    public static void RemoveDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            RemoveDuplicates(str, idx+1, newStr, map);
        }else{
             map[currChar-'a']=true;
            RemoveDuplicates(str,idx+1,newStr.append(currChar),map);

        }
    } 
    public static void main(String args[]){
        String str="bhaibhai";
        RemoveDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
