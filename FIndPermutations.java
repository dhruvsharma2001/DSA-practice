public class FIndPermutations {
    public static void findperm(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=>"ad"+"de"="abde"
            String NewStr=str.substring(0, i) + str.substring(i+1);
            findperm(NewStr,ans+curr);



        }
    }
    public static void main(String args[]){
        String str="abc";
        findperm(str,"");
    }
}
