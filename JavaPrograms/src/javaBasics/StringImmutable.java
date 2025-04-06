package javaBasics;

public class StringImmutable {
	public static void main(String[] args) {
        String originalString = "Hello";
        String str1="Hello";
        StringBuffer str= new StringBuffer("Hello");
        System.out.println("Address of str   : " + System.identityHashCode(str));
        System.out.println("Address of str1: " + System.identityHashCode(str1));
        
        System.out.println("Original String: " + originalString);
        System.out.println("Address of OriginalString: " + System.identityHashCode(originalString));

        // Attempt to modify the string
        String modifiedString = originalString.concat(" World");
        System.out.println("Modified String: " + modifiedString);
        System.out.println("Address of modifiedString: " + System.identityHashCode(modifiedString));

        // Check if the original string has changed
        System.out.println("Original String after modification attempt: " + originalString);
        System.out.println("Address of String original after modification: " + System.identityHashCode(originalString));
        
        int i=10;
        double Double=i+10;
        System.out.println(i);
        System.out.println(Double);
        System.out.println(i);
    }
}
