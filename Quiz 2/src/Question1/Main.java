/*The current tuition rate for 2015-2016 is $12,520 (not including room and board).

Write a program that will calculate the total cost of tuition to complete a degree and determine the monthly payment for your student loan.

Assumptions:
1) You're a freshman, this is the first year you'll be paying tuition
2) You plan to attend a standard four year degree. You don't drop out, take time off, etc.
3) Each year there is an percentage increase (variable, based on university costs)
4) Assume a fixed APR for your student loan. The rate should be a variable in the program.
5) The repayment schedule (how many years) should be a variable in the program.
6) Assume the student loan uses a fixed amount for payback (in other words, you'll be paying the same amount each month when you repay the loan).


Hint:
Initial tuition cost, percentage increases for tuition, repayment APR and term should be variables read by Scanner.

Skills used:
Basic math, power function, loop (for loop), display formatted answer.

Advanced skills used:
Amortization. Hint: https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html

Deliverables:
Java Project using JDK 1.8
Encapsulated class with private attributes, public methods
JUnit 4 test cases implemented (Don't Junit the scanner stuff, just the methods doing the calculating)
Methods should be well-documented, and javadocs created for project
Make sure to submit a .zip file (not jar, not .war, not .rar)*/

package Question1;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	/**
	 * @author Konark Christian
	 * @version 1.0.0
	 */
	public static void main(String args[]) {
		double itc = 12520; // Initial Tuition Cost
		System.out.println("What is the repayment APR?");
		double rAPR = sc.nextFloat(); // Repayment APR
		int term = 4; // Percentage Increases for Tuition

		double ans = amortization(itc, (rAPR / 12), term);

		System.out.printf("The amortization is %f", ans);
	}

	public static double amortization(double p, double i, int n) {
		double ans = p * (i + (i / (updateRate(i, n) - 1)));
		return ans;
	}

	public static double updateRate(double i, int n) {
		System.out.println("What is the percentage increases for tuition costs?");
		double pit = sc.nextFloat(); // Percentage Increases for Tuition
		double ans = (1 + i);
		while (n > 1) {
			ans += 1 + updateI(i, i, n, pit);
			n--;
		}
		return ans;
	}

	public static double updateI(double iFinal, double i, int exp, double inc) {
		if (exp > 1) {
			i=i*updateI(iFinal, i + i * inc, exp - 1, inc);
		}
		return i;

	}
}
