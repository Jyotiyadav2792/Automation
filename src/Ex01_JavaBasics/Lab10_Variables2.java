package Ex01_JavaBasics;

public class Lab10_Variables2 {
    public static void main(String[] args) {
        // byte age = 128;   // Out of range: byte range is -128 to 127
        int age = 128;        // Use int instead

        System.out.println(age);  // Output: 128

        age = age + 1;  // age is now 129 (but overwritten in the next line)
        age = 30;       // age is updated to 30

        System.out.println(age);  // Output: 30

        // Valid identifiers
        int _ = 65;  // Valid (though not recommended in real-world code)
        int $ = 65;  // Valid
        int year = 2025;
        int this_is_a_very_long_name_in_the_class_hello_$_akakak = 89;
    }
}
