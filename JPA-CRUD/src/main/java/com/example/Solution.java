package com.example;

import java.util.Scanner;
import java.lang.*;

class Test{
	public void find(int i) {
		
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i;j++) {
			 int k1=sc.nextInt();
			 int k2=sc.nextInt();
			 int tr=sc.nextInt();
			
		if(Math.abs(tr-k1)==Math.abs(tr-k2)) {
		System.out.println("Truck");
		}
		else if(tr-k1<tr-k2) {
			System.out.println("Kid 1");
		}
		else  {
			System.out.println("Kid 2");
		}
	}
	}
	
}

public class Solution {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Test t=new Test();
		int k1,k2,tr;
		int i=sc.nextInt();
		
           t.find(i);

}
}