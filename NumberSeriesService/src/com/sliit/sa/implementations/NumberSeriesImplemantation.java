package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.NumberSeriesInterfaces;

public class NumberSeriesImplemantation implements NumberSeriesInterfaces{
	
	 public  int fibonacci(int n) {
	        if (n <= 1)
	        	return n;
	        else 
	        	return fibonacci(n-1) + fibonacci(n-2);
	    }
	 
	 public int findSquareNumber(int num) {
			return num * num;
		}
	 
	 public int findFactorial(int number) {
	        int result = 1;

	        for (int factor = 2; factor <= number; factor++) {
	            result *= factor;
	        }

	        return result;
	    }
	 
	 public boolean checkPrime(int checker) {
		 boolean result = false;
		 
		 for (int i = 2; i <= checker/2;) {
			 //condition for non-prime numbers
			 if(checker % i == 0) {
				 result = true;
				 return result;
			 }
			 break;

		 }
		 
		 return result;
		/* if(!result) {
			 System.out.println(checker + " is a prime number");
		 }
		 else {
			 System.out.println(checker + " is not a prime number");
		 }*/
	 }
	 
/*	 public int findMax(int no1, int no2) {
			if (no1> no2) {
				return no1;
			}
			else {
				return no2;
			}
		}
		
		public int findMin(int no1, int no2) {
			if (no1> no2) {
				return no2;
			}
			else {
				return no1;
			}
		}*/
	 @Override
		public int findMax(int no1, int no2) {
			if (no1 > no2) {
				return no1;
			} else {
				return no2;
			}
		}

		@Override
		public int findMin(int no1, int no2) {
			if (no1 > no2) {
				return no2;
			} else {
				return no1;
			}
		}

		@Override
		public boolean checkOdd(int checker) {
			boolean result = true;
			int anz = checker % 2;

			if (anz == 0) {
				result = false;
			}

			return result;
		}

		@Override
		public boolean checkEven(int checker) {
			boolean result = true;
			int anz = checker % 2;

			if (anz == 1) {
				result = false;
			}

			return result;
		}

		@Override
		public boolean checkPerfectNumber(int checker) {
			boolean result = true;
			int sum = 0;

			for (int i = 1; i < checker; i++) {
				if (checker % i == 0) {
					sum = sum + i;
				}
			}
			if (sum != checker) {
				result = false;
			}
			return result;
		}

		@Override
		public boolean checkArmStrongNumber(int checker) {
			boolean result = true;
			int a, c, b = 0;
			int count = 0;
			int sum = 0;
			a = checker;
			c = checker;

			while (a > 0) {
				a = a / 10;
				count++;
			}
			while (checker > 0) {
				b = checker % 10;
				sum = (int) (sum + Math.pow(b, count));
				checker = checker / 10;
			}
			if (sum != c) {
				result = false;
			}

			return result;
		}

}
