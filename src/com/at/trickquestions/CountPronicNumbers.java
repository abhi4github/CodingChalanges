package com.at.trickquestions;

public class CountPronicNumbers {
	/**
	 * 
	 * Write a function Solution that given two integers A and B, 
	 * returns the number of integers from the range[A..B] (ends are included)_
	 * which can be expressed as the product of two consequtive integers,
	 * that is X*(X+1), for some integer X
	 * 
	 * Example:
	 * 1. Given A=6, B=20 function should return 3.
	 * These integers are 6 = 2 * 3, 12 = 3 * 4 and 20 = 4 * 5
	 * 
	 * 2. Given A=21, B=29, the fubction should return 0
	 * There are no integers of the form x*(X+1) in this interval.
	 * 
	 * Write an efficient algorithm for following assumptions
	 * 
	 * 1. A and B are integers within the range [1... 1,000,000,000]
	 * 2. A <= B
	 * 
	 * 
	 */
	
	public static void main (String[] args) {
		
		solution(1,1);
		System.out.println("-------------------------------");
		solution(16,16);
		System.out.println("-------------------------------");
		solution(17,17);
		System.out.println("-------------------------------");
		solution(12,59);
		System.out.println("-------------------------------");
	}
	
	public static int solution(int A, int B) {
		
		System.out.println("A = " + A + ", B = " + B );
		
		int start = (int)Math.floor(Math.sqrt(A));
		int end = (int)Math.ceil(Math.sqrt(B));
		
		System.out.println("start = " + start);
		System.out.println("end = " + end);
		int count = 0;
		for (int i = start; i < end; i++) {
			System.out.println( i + " * " + (i+1) + " = " + (i * (i+1)));
			int product = i * (i+1);
			if(product >= A && product <= B){
				count++;
			}
		}
		
		System.out.println("result = " + count);
		return count; 
	}
}
