package Chap02;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < 0) {
				continue;
			} else {
				sum += arr[i];
			}

		}
		System.out.println(sum);
	}

}
