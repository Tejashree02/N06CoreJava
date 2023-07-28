/* There are N people Standing in a circle waiting to be executed. 
 *The counting out begins at some point in the circle and proceeds around a circle in a fixed direction.
 *In Each step a certain number of people are Skipped and the next person is executed.
 *The elimination proceeds around the circle(which is becoming smaller and smaller as the executed people are removed),
 *until only the last person remains, who is given freedom  */

//Given the Total num of person N and a number K which indicated that k-1 person are
//skipped and the Kth person is killed in a circle.The task is to choose the person in the initial circle that survives

package org.tnsif.dayfourchallenge;
import java.util.*;
public class CircleSurviveChallenge {
	public static int  survive(int n,int k) {
		if(n==1) {
			return 1;
		}else {
			return(survive(n-1,k)+k-1)%n+1;
		}
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Value for n and k: ");
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println("The Person that Survivies: " +survive(n,k));
		
		
		
	}

}
