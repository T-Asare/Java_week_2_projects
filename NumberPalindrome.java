public class NumberPalindrome {
    public static void isPalindrome(int number){
        int absoluteValue = Math.abs(number);//Convert input into absolute value so that the number is always positive
        int remainder;
        int reverse= 0; //reverse value initialized at 0
        int tempValue = absoluteValue; // storing absolute value of number in a variable to make sure that when value changes in the while loop, the initial value will be available for comparison
        while (absoluteValue >0) { // loop runs until input number becomes a decimal value or negative value
            remainder = absoluteValue%10; //using modulo operator to find the remainder for each place value of input value
            reverse =  (reverse*10)+remainder; // constructing reverse number by multiplying by ten increasing place value for previous iteration
            absoluteValue = absoluteValue/10; // dividing each place value by ten one place value at a time
        }
        if( tempValue == reverse){ // comparing constructed reverse to original value
            System.out.println("We have a Palindrome ");
        }
        else {
            System.out.println("This is not a Palindrome");
        }
    }
}

