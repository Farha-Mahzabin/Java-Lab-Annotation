/** <h1> Calculator </h1>
 * 
 * The calculator program will do mathematical operations on numeric values.
 * Here, a + b means, a and b are two numbers which will be added.
 * The program will take several inputs,
 * for every input, it will give a single output.
 * 
 * <p>
 * <b>Note:</b> Only use +, -, *, / and % operators.
 * 
 * @author Farha Mahzabin
 * @version 1.0
 * @since 1.0
 *
 */	


public class Calculator1 
{
	/**
	 * Returns the summation of two int or double values.
	 * 
	 *@param numA  The initial number
	 *@param numB The number to be added
	 *@return the sum of the given numbers
	 */
	
	public double addNum(double numA, double numB)
	{
		return numA + numB;
	}
	
	/**
	 * Returns the subtraction of two int or double values.
	 * 
	 *@param numA  The initial number
	 *@param numB The number to be subtracted
	 *@return the subtracted value of the given numbers
	 */
	
	public double subNum(double numA, double numB)
	{
		return numA - numB;
	}
	
	/**
	 * Returns the multiplication of two int or double values.
	 * 
	 *@param numA  The initial number
	 *@param numB The value to be multiplied by
	 *@return the multiplied value of the given numbers
	 */
	
	public double multiplyNum(double numA,double numB)
	{
		return numA * numB;
	}
	
	/**
	 * Returns the division of two int or double values.
	 * 
	 *@param numA  The initial number to be divided
	 *@param numB The second number to be divided by
	 *@return the division of the given numbers
	 */
	
	public double divNum(double numA,double numB)
	{
		return numA / numB;
	}
		
	/**
	 * Returns the modulus of the first number over the other.
	 * 
	 *@param numA The number to perform the modulus operation on
	 *@param numB The value to perform the modulus operation with
	 *@return the modulus operation's value between its arguments.
	 */
	public double modNum(int numA, int numB)
	{
		return numA % numB;
	}
}
