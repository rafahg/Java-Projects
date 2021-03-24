public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz myJavaFizz = new FizzBuzz();
        System.out.println(myJavaFizz.fizzBuzz(17));
        System.out.println(myJavaFizz.fizzBuzz(15));
        System.out.println(myJavaFizz.fizzBuzz(3));
        System.out.println(myJavaFizz.fizzBuzz(5));
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
