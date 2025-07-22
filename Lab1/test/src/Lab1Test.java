import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lab1Test {

    @Test
    public void testSayHello() {
        assertEquals("Hello, Alrin!", Lab1.sayHello("Alrin"));
        assertEquals("Hello, John!", Lab1.sayHello("John"));
        assertEquals("Hello, !", Lab1.sayHello(""));
    }

    @Test
    public void testAdd() {
        assertEquals(10, Lab1.add(4, 6));
        assertEquals(0, Lab1.add(-5, 5));
        assertEquals(-10, Lab1.add(-4, -6));
    }

    @Test
    public void testNegate() {
        assertEquals(-5, Lab1.negate(5));
        assertEquals(0, Lab1.negate(0));
        assertEquals(5, Lab1.negate(-5));
    }

    @Test
    public void testGreater() {
        assertEquals(10, Lab1.greater(10, 2));
        assertEquals(7, Lab1.greater(3, 7));
        assertEquals(5, Lab1.greater(5, 5));
        assertEquals(-1, Lab1.greater(-1, -2));
    }

    @Test
    public void testRectangleArea() {
        assertEquals(20, Lab1.rectangleArea(4, 5));
        assertEquals(0, Lab1.rectangleArea(0, 5));
        assertEquals(0, Lab1.rectangleArea(0, 0));
        assertEquals(56, Lab1.rectangleArea(7, 8));
    }

    @Test
    public void testGradeCategory() {
        assertEquals("A", Lab1.gradeCategory(95));
        assertEquals("A", Lab1.gradeCategory(90));
        assertEquals("B", Lab1.gradeCategory(85));
        assertEquals("B", Lab1.gradeCategory(80));
        assertEquals("C", Lab1.gradeCategory(75));
        assertEquals("C", Lab1.gradeCategory(70));
        assertEquals("F", Lab1.gradeCategory(69));
        assertEquals("F", Lab1.gradeCategory(0));
        assertEquals("F", Lab1.gradeCategory(-10)); // test invalid input
        assertEquals("F", Lab1.gradeCategory(101)); // test out-of-bound
    }

    @Test
    public void testIsEven() {
        assertTrue(Lab1.isEven(4));
        assertFalse(Lab1.isEven(3));
        assertTrue(Lab1.isEven(0));
        assertTrue(Lab1.isEven(-6));
        assertFalse(Lab1.isEven(-7));
    }

    @Test
    public void testSumToN() {
        assertEquals(15, Lab1.sumToN(5));
        assertEquals(1, Lab1.sumToN(1));
        assertEquals(0, Lab1.sumToN(0));
        assertEquals(55, Lab1.sumToN(10));
    }

    @Test
    public void testReverseNumber() {
        assertEquals(4321, Lab1.reverseNumber(1234));
        assertEquals(1, Lab1.reverseNumber(1));
        assertEquals(0, Lab1.reverseNumber(0));
        assertEquals(21, Lab1.reverseNumber(1200));
        assertEquals(987654321, Lab1.reverseNumber(123456789));
    }

    @Test
    public void testIsPrime() {
        assertTrue(Lab1.isPrime(17));
        assertFalse(Lab1.isPrime(18));
        assertFalse(Lab1.isPrime(1)); // 1 is not a prime
        assertFalse(Lab1.isPrime(0));
        assertFalse(Lab1.isPrime(-7));
        assertTrue(Lab1.isPrime(2));
        assertTrue(Lab1.isPrime(3));
    }

    @Test
    public void testCountDigits() {
        assertEquals(3, Lab1.countDigits(504));
        assertEquals(1, Lab1.countDigits(9));
        assertEquals(1, Lab1.countDigits(0));
        assertEquals(5, Lab1.countDigits(12345));
        assertEquals(4, Lab1.countDigits(-1234)); // assuming negative numbers are valid
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Lab1.isPalindrome("racecar"));
        assertFalse(Lab1.isPalindrome("banana"));
        assertTrue(Lab1.isPalindrome("madam"));
        assertTrue(Lab1.isPalindrome("a"));
        assertTrue(Lab1.isPalindrome(""));
        assertFalse(Lab1.isPalindrome("abc"));
        assertTrue(Lab1.isPalindrome("abba"));
        assertFalse(Lab1.isPalindrome("abcd"));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Lab1.factorial(5));
        assertEquals(1, Lab1.factorial(0));
        assertEquals(1, Lab1.factorial(1));
        assertEquals(3628800, Lab1.factorial(10));
    }
}
