package testid.testid;

import org.testng.annotations.Test;

public class JenkinsSum {
	 @Test
	   public void sumof() {
	      
	      // Read the first number from the Jenkins parameter
	      int num1 = Integer.parseInt(System.getenv("FIRST_NUM"));

	      // Read the second number from the Jenkins parameter
	      int num2 = Integer.parseInt(System.getenv("SECOND_NUM"));

	      // Calculate the sum of the two numbers
	      int sum = num1 + num2;

	      // Print out the result
	      System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
	   }
}
