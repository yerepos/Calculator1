package com.company;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		print(new StringHandler(sc.next()).getResult());
    }
	private static void print(String message){
		System.out.print(message);
	}
}

 
