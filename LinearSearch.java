package welcomeToJava;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,t,n,c=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array length");
		 n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Target");
		t=sc.nextInt();
		for(i =0;i<n;i++) {
			if(a[i]==t) {
				
				c++;
			}
			
			
		}
		
		if(c>0) {
			System.out.println("The Element is Present at thr Position of " + i);
		}
		
		else if(c==0) {
			System.out.println("The element is not found in array");
		}

	}

}
