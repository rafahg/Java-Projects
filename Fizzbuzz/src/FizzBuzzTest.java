import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.fizzBuzz(15);
        String result2 = subject.fizzBuzz(3);
        String result3 = subject.fizzBuzz(5);
        String result4 = subject.fizzBuzz(17);
        assertEquals("fizzbuzz", result);
        assertEquals("buzz", result2);
        assertEquals("fizz",result3);
        assertEquals("17",result4);

    }
}