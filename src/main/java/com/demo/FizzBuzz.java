package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{
		if(num%15 == 0 )
		{
			return "FizzBuzz";
		}
		if(num%3 == 0 )
		{
			return "Fizz";
		}
		if (num%5 == 0)
		{
			return "Buzz";	
		}
		return String.valueOf(num);
	}
	
	String processNumbers (int[] numList)
	{
		StringBuilder result = new StringBuilder(numList[0]);
		for (int i = 1; i < numList.length; i++)
		{
// 			result += processNumber(numList[i]);
			result.append(", ").append(numList[1]);
		}

		return result.toString();
	}

}
