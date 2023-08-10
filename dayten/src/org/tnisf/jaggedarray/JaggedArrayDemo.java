//program to demonstrate on jagged array
package org.tnisf.jaggedarray;
import java.util.*;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaration of jagged array
		int arr[][]= new int[3][];
		arr[0]= new int[2];
		arr[1]= new int[1];
		arr[2]= new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int q= sc.nextInt();
		int p= sc.nextInt();
		int r= sc.nextInt();

	}

}
