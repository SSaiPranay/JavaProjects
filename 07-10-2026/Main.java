/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		int n = nums.length;
		int max_l = nums[0];
		int min_l = nums[0];
		int tsum = 0;
		int[] r_nums = new int[n];
		for (int i=0 ; i < n ;i++){
		  System.out.println(nums[i]);  
		  if (max_l<nums[i]){
		      max_l = nums[i];
		  }
		  if (min_l > nums[i]){
		      min_l=nums[i];
		  }
		  tsum = tsum + nums[i];
		  r_nums[n-i-1]= nums[i];
		}
		System.out.println("The array is : "+ Arrays.toString(nums));
		System.out.println("Length of array is : "+n);
		System.out.println("Maximum element in the array is : "+max_l);
		System.out.println("Minimum element in the array is : "+min_l);
		System.out.println("Total Sum of array is : "+tsum);
		System.out.println("Reversed array is : "+ Arrays.toString(r_nums));
		
	}
}
