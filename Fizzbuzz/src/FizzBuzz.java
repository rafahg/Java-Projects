public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz myJavaFizz = new FizzBuzz();
        myJavaFizz.fizzBuzz(100);
    }

    public static void fizzBuzz(int number) {
        int n = 0;
        String value = null;
        while (n <= number) {
            if(n % 15 == 0) {
                value = "fizzbuzz";
            } else if  (n % 3 == 0) {
                value = "buzz";
            } else if (n % 5 == 0) {
                value = "fizz";
            } else {
                value = String.valueOf(n);
            }
            n += 1;
            System.out.println(value);
        }
    }

}
