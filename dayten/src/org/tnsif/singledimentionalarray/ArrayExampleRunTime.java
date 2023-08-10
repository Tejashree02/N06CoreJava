package org.tnsif.singledimentionalarray;
import java.util.*;
/* array to demonstracte on array using runtime input values and to find largest element*/
public class ArrayExampleRunTime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements in array: ");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\n Elements are: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");;
		}
		
		int max= arr[0];
		for(int j=0;j<n;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		System.out.println("\nLargest Element: " +max);
		
		
		Arrays.sort(arr);
		System.out.println("Sorted Elements are: ");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		
	}

}
