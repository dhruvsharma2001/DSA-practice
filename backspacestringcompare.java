public class backspacestringcompare {
     public static String getActual(String input){
        StringBuilder result = new StringBuilder();
        int hashCount = 0;
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            if(hashCount>0){
                hashCount--;
            }else{
                result.insert(0, input.charAt(i));
            }
        }
        return result.toString();
    }
    public static boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }
    public static void main(String args[]){
        String s = "ab##";
        String t = "c#d#";
        System.out.print(backspaceCompare(s, t));
    }
}
