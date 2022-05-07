import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    Question1 test;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Initializing...");
        test = new Question1();
    }
    @Test
    public void evenOrOddTwoExpectedEven() {
        assertEquals(test.evenOrOdd(2),"even");
    }
    @Test
    public void evenOrOddNegativeTwoExpectedEven() {
        assertEquals(test.evenOrOdd(-2),"even");
    }
    @Test
    public void evenOrOddThreeExpectedOdd() {
        assertEquals(test.evenOrOdd(3),"odd");
    }
    @Test
    public void evenOrOddNegativeFiveExpectedOdd() {
        assertEquals(test.evenOrOdd(-5),"odd");
    }

    @Test
    public void minMaxRepeatedZerosExpectedThatElements() {
        int[] arr = {0,0,0,0,0};
        int[] expected = {0,0};
        Assertions.assertArrayEquals(test.minMaxValue(arr), expected);
    }
    @Test
    public void minMaxRepeatedNumbersExpectedThatElements() {
        int[] arr = {1,1,1,1,1};
        int[] expected = {1,1};
        Assertions.assertArrayEquals(test.minMaxValue(arr), expected);
    }
    @Test
    public void minMaxPositiveElementsExpectedTrue() {
        int[] arr = {22,4,1,111,69};
        int[] expected = {1,111};
        Assertions.assertArrayEquals(test.minMaxValue(arr), expected);
    }
    @Test
    public void minMaxNegativeElementsExpectedTrue() {
        int[] arr = {-22,-4,-1,-111,-69};
        int[] expected = {-111,-1};
        Assertions.assertArrayEquals(test.minMaxValue(arr), expected);
    }
    @Test
    public void minMaxDifferentElementsExpectedTrue() {
        int[] arr = {-22,4,-1,-111,69};
        int[] expected = {-111,69};
        Assertions.assertArrayEquals(test.minMaxValue(arr), expected);
    }

    @AfterEach
    public void afterEach(){
        test = null;
        System.out.println("Test done");
    }
}