//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here. 
                    int ans=0;
                    for(int i=0;i<n;i++){
                        String s=String.valueOf(a[i]);
                        if(ispali(s)){
                            ans++;
                        }
                    }   
                    
                    return ans==n ? 1 : 0;
                }
                
                public static boolean ispali(String s){
                    StringBuilder sb=new StringBuilder(s);
                    sb.reverse();
                    return s.equals(sb.toString());
                       
                    
            }
}