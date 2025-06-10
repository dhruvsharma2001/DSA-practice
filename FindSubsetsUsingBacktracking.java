public class FindSubsetsUsingBacktracking {
     public static void findsub(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice include character in ans
        findsub(str,ans+str.charAt(i),i+1);
        //no choice exclude charactr in ans
        findsub(str,ans,i+1);


    }
    public static void main(String args[]){
        String str="abc";
        findsub(str,"",0);
    
    }
}
