public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz myJavaFizz = new FizzBuzz();
        myJavaFizz.fizzBuzz(100);
    }

    public static String fizzBuzz(int number) {


            if( number % 15 == 0) {
                return "fizzbuzz";
            } else if  (number % 3 == 0) {
                return "buzz";
            } else if (number % 5 == 0) {
                return "fizz";
            } else {
                return String.valueOf(number);
            }


    }

}
