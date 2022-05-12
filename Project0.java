/*
 * PROJECT 0
 *
 * This file is a SKELETON file. It has a SMALL set of test to check some features of 
 * the FRACTIONS class.  The BOSS system will test ALL parts of your solution.
 * You must create your own tests.
 * 
 * Tasks:
 *
 * 1) Create your own tests for the FRACTIONS class 
 *
 * 2) Fill in the following fields:
 *
 * NAME: Shiv Dhanji
 * UNIVERSITY ID: 2109288
 * DEPARTMENT: Mathematics
 */

/**
 * Classname: Project0
 * Description: This class utlises a new type for fractions
 *              and corresponding arithmetic.
 * 
 * @author : A.Hague for use in the course MA117
 * @version: history: v1.0
 */

public class Project0 {
    // Simple tester function.
    public static void main(String[] args) {
        // Test constructors.
        Fraction A = new Fraction(90,-16);
        Fraction H = new Fraction(1,3);
        Fraction S = new Fraction(4,-7);
        
        // Test conversions.
        System.out.println("A = "+A+" = "+A.toDouble());
        System.out.println("H = "+H+" = "+H.toFloat());
        System.out.println("S = "+S+" = "+S.toString());
        
        // Test operations.
        System.out.println("A+H = "+A.add(H));
        System.out.println("A-S = "+A.subtract(S));
        System.out.println("H*H = "+H.multiply(H));
        System.out.println("S/H = "+S.divide(H));

        // Test errors
        // While a denominator of 0 is not valid, the Fraction should continue to work.
        // Only toFloat() and toDouble() will implicitly raise divide by zero exceptions,
        // and this is the expected behaviour
		Fraction Bad = new Fraction(10,0);
        Fraction Bad2 = new Fraction(0,-0);
        Fraction Bad3 = new Fraction(-7,0);
		System.out.println(Bad);
        System.out.println(Bad2);
        System.out.println(Bad3);
        System.out.println();
        System.out.println(Bad.toDouble());
        System.out.println(Bad2.toFloat());
        System.out.println(Bad3.toString());
        System.out.println();
        System.out.println(Bad.add(Bad2));
        System.out.println(Bad2.subtract(Bad3));  
        System.out.println(Bad3.multiply(Bad));  
        System.out.println(Bad.divide(Bad));    
    }
}
