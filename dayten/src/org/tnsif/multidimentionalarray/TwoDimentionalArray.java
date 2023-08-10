package org.tnsif.multidimentionalarray;
import java.util.*;
public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		int arr[][]= new int[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//printing arrays.
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
