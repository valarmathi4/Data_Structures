package dynamicProgram;
import java.util.*;
public class fibonacci { //memorisation

	 public static int fib(int[] dp,int n){
	        if(n<=1){
	            return n;
	        }
	        if(dp[n]!=-1){
	            return dp[n];
	        }
	        dp[n]=fib(dp,n-1)+fib(dp,n-2);
	        return dp[n];
	    }
		public static void main(String[] args) {
		    int n=4;
		    int[] dp=new int[n+1];
		    Arrays.fill(dp,-1);
		    fib(dp,n);
		    
			System.out.println(fib(dp,n));
		}
	}