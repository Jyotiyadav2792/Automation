package Ex01_JavaBasics;

public class Lab08_Variables {
    public static void main(String[] args) {

        // Variable declarations with different data types
        int num = 5;                   // Integer (whole number)
        float floatValue = 12.99f;     // Float (must end with 'f')
        char character = 'T';          // Character
        boolean isTrue = true;         // Boolean
        String greeting = "Hello";     // String
        double doubleValue = 44.55;    // Double (more precision than float)
        long longValue = 13422233L;    // Long (must end with 'L')

        /*
         * byte age = 45;
         * - byte → data type (smallest integer type)
         * - age → variable name
         * - 45 → literal (value assigned to the variable)
         */

        // Output the values
        System.out.println("Integer: "+ num);
        System.out.println("Float: " + floatValue);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + greeting);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
    }
}
