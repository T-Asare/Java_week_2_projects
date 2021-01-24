public class PerfectNumber {
   public static boolean isPerfectNumber(int number) {
        int newSum = 0; // declare and initialise a variable to store some of factors
        if (number > 1) { // state limits as in number must be greater than one (must be a positive integer)
            for (int i = 1; i < number; i++) { //start off with one and test for factors between one and the given number
                if (number % i == 0) {// a factor gives a remainder of 0
                    newSum += i;//add up factors
                }

           }
            if (number == newSum) { // compare sum of factors to original number
                return true; // if true, method returns true
            } else {
                return false; //returns false is sum is not equal to number
            }
        }
       else{
            return false; // returns false if number is less than 1
            }
        }

  }
