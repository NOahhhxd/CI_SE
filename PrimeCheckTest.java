import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("7 is a prime number", PrimeCheck.isPrime(7), true);
	assertEquals("41243 is a prime number", PrimeCheck.isPrime(41243), true);
	assertEquals("97 is a prime number", PrimeCheck.isPrime(97), true);
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
	assertEquals("10 is not a prime number", PrimeCheck.isPrime(10), false);
	assertEquals("42 is not a prime number", PrimeCheck.isPrime(42), false);
	assertEquals("1337 is not a prime number", PrimeCheck.isPrime(1337), false);
  }
}
