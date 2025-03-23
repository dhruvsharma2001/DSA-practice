public class lengthoflastword {
    public static int LengthOfLastWord(String s){
         int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
                continue;
            }else{
                if(count>0){
                    return count;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        String s = "Hello World";
        System.out.print(LengthOfLastWord(s));
    }
}
