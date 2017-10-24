# Objectives
The aim of this kata is to learn about some feature of Java 8. It is more focused on Stream, lambda and Date api.
It is advised to use Test Driven Development to do this Kata

# Part I : Basic String Calculator

1. Create a Basic String calculator with a method int sum(string numbers)
    1. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
		2. Start with the simplest test case of an empty string and move to 1 and two numbers
		3. Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
		4. Remember to refactor after each passing test
2. Allow the sum method to handle an unknown amount of numbers
3. Allow the sum method to handle new lines between numbers (instead of commas).
    1. the following input is ok:  “1\n2,3”  (will equal 6)
	  2. the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)
4. Support different delimiters
    1. to change a delimiter, the beginning of the string will contain a separate line that looks like this:   “/1/[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
    2. the first line is optional. all existing scenarios should still be supported
5. Calling sum with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message
stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.
6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2


# Part II : Scientific String Calculator
1. Create a Scientific String calculator with a method sumDate(String date, String period)
    1.1 The method can take a date and a period (a list of number of days). If date is empty, then it returns the minimum date. If period is empty, then it returns  the date itself.
2. Allow the sumDate to handle an unknown amount of days number
3. Allow the sumDate to accept a period or an unknown amount of days number  (a period is formated like P2Y3M5D)
4. Allow the sumDate to accept an unknown amount of periods or  an unknown amount of day numbers





	
