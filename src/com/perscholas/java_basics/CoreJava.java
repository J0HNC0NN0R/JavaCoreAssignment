package com.perscholas.java_basics;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CoreJava {
	
	public static void main(String[] args) {
		twoIntSum();
		twoDoubleSum();
		intDoubleSum();
		twoIntQuotient();
		twoDoubleQuotient();
		xyQuotient();
		namedConstant();
		calculateTotal();
		
	}
	
	// Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
	public static void twoIntSum() {
				int var1 = 1;
		int var2 = 2;
		int sum_task1 = var1 + var2;
		System.out.println("Two Integer Sum: " + sum_task1);
		
	}
	
	//Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
	public static void twoDoubleSum() {
		double var3 = 3;
		double var4 = 4;
		double sum_task2 = var3 + var4;
		System.out.println("Two Double Sum: " + sum_task2);
		
	}
	
	//Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
	//Assign the sum to a variable. Print out the result. What variable type must the sum be?
	public static void intDoubleSum() {	
		int var5 = 5;
		double var6 = 6;
		double sum_task3 = var5 + var6;
		System.out.println("Integer Double Sum: " + sum_task3);
		
	}
	
	//Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
	//Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
	public static void twoIntQuotient() {
		int var6 = 6;
		int var7 = 7;
		double sum_task4 = var7 / var6;
		System.out.println("Two Integer Quotient: " + sum_task4);
		
	}
	
	//Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. 
	//Print out the result. Now, cast the result to an integer. Print out the result again.
	public static void twoDoubleQuotient() {
		double var8 = 8;
		double var9 = 9;
		double sum_task5 = var9 / var8;
		System.out.println("Two Double Quotient: " + sum_task5);
		
	}
		
	//Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. 
	//Now, cast y to a double and assign it to q. Print q again.
	public static void xyQuotient() {
		int y = 6;
		int q = (int)y;
		System.out.println("X Y Quotient: " + q);
		
	}
	
	//Write a program that declares a named constant and uses it in a calculation. Print the result.
	public static void namedConstant() {
		final double time = 3.14;
		double sum_task7 = time + 1;
		System.out.println("Named Constant: " + sum_task7);
			
	}
		
	/**Write 3 variables of products at a cafe.
	* Assign the products prices
	* Create 2 more variables called subtotal and totalSale 
	* Complete an "order" for 3 items of the first product
	* 4 items of the second product
	* 2 items of the third product.
	* Add them all together to calculate the subtotal.
	* create a constant called "SALES_TAX" and add sales tax to the subtotal to obtain the totalSale amount.
	* Be sure to format the results to two decimal places.
	*/
	public static void calculateTotal() {
		double milk = 1.50;
		double coffee = 2.45;
		double sugar = 0.30;
		
		double order1 = milk * 3;
		double order2 = coffee * 4;
		double order3 = sugar * 3;
		
		double subtotal = order1 + order2 + order3;
		final double SALES_TAX = 0.0836;
		double tax = subtotal * SALES_TAX;
		double totalSale = subtotal + tax;
		
		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance();
		decimalFormat.setMinimumFractionDigits(2);
		System.out.println("Total Sale: " + decimalFormat.format(totalSale));
		
	}
}