public class Power {
    public static int power(int x,int n){
    if(n==0){
        return 1;
    }
    //int xnm1=power(x,n-1)
    return x*power(x,n-1);

}
public static int optimizedpower(int a,int n){

if(n==0){
    return 1;
}
int halfpower=optimizedpower(a,n/2);
int halfpowersq=halfpower * halfpower;//optimized TC=O(logn)
//int halfpowersq=optimizedpower(a,n/2)*optimizedpower(a,n/2);
//n is odd
if(n%2 !=0){
    halfpowersq=a *halfpowersq; 
}
return halfpowersq;
}
public static void main(String args[]){
    int x=2 , n=10;
    System.out.print(power(x, n));
}
}
