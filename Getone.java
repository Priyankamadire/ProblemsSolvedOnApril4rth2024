import java.util.*;
public class Getone{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solve(n));
    }
    public static int solve(int n){
        int cnt =0;
        while(n!=0){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=n-1;
              
            }
           
            cnt++;
        }
        return cnt;
        
    }
}