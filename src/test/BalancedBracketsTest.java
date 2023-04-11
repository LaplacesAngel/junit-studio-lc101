package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void balancedStringInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedString2InsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedString3InsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyQuotesInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


    @Test
    public void openingBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void backwardsBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void doubleBackwardsBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oneClosedBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oneOpenedBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void balancedAndUnbalancedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

}
