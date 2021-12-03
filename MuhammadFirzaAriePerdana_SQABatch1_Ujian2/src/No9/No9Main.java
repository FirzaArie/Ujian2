package No9;

import java.util.Scanner;

public class No9Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int z = sc.nextInt();
		int nilai [] = new int [z];
		System.out.println(jumlahArray (nilai));
		int arr [] = new int [z];
		System.out.println(cariNilai(arr, z));

	}
	public static int jumlahArray(int[] nilai) {
		 int sum = 0;
		 for (int i = 0; i<nilai.length; i++) {
		  sum += nilai[i];
		  int total = sum ;
		  System.out.println("#");
		 }
		 return sum;
		}
		public static boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x<arr.length; x++) {
		  if (arr[x] == nilai)
		   return true;
		 }
		 return false;
		}

}
