package string;

public class JavaStrings {
    public static void main (String [] args) {
        // both sre pointing to the same memory location, as both contain the same string even though both are different variables.
        String srt1 = "java";
        String str2 = "java";

        // declaring string two different ways:
        String string1 = "This is a String, and this type of declaration is mostly suggested"; // When used "string literal" if two variables contains same string, both variables actually points to the same memory location instead of making two instances of the same string. It's called string constant pool.
        String string2 = new String("This is another string, and this type of declaration is redundant."); // When used "new" every instance is stored separately in the heap memory, like any other object.
        System.out.println(string1);
        System.out.println(string2);

        // Strings are immutable. Here is an example:
        String name = "Aritra"; // This lives in a separate memory location.
        System.out.println(name);
        name = "Kumar"; // This lives in a separate memory location. When it is reassigned, it does not replace the previous string, it lives in a separate memory location than the previous string. Later garbage collector cleans the unused memory.
        System.out.println(name);
    }
}
