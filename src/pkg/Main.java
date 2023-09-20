package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);
		
		for(int i=1; i<n; i++) {
			if(arr[i-1] < arr[i]) list.add(arr[i]);
		}
		
		return list;
	
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
