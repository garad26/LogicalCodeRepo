package test_package;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class int_1_prog_gh {
	
	static int totalPrice(int arr[], int n) {
		int sum = 0;
		
		Set<Integer> priceList = new HashSet<Integer>();
		
		for(int price : arr) {
			priceList.add(price);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		System.out.println(totalPrice(arr,N));
	}

}
