public class BinaryString {
    public static void PrintBinStrings(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;

        }
        PrintBinStrings(n-1,0,str + "0");
        if(lastplace==0){
            PrintBinStrings(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
          PrintBinStrings(3,0,"");
    }
}
