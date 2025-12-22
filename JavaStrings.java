public class JavaStrings {
    public static void main (String [] args) {
        // both of them are pointing at the same memory location, as both contain the same string even though both are different variables.
        String srt1 = "java";
        String str2 = "java";

        // declaring string two different ways:
        String string1 = "This is a String"; // When used "string literal" if two variables contains same string, both variables actually points to the same memory location instead of making two instances of the same string. It's called string constant pool, and this type of declaration is mostly suggested.
        String string2 = new String("This is a String"); // When used "new" every instance is stored separately in the heap memory, like any other object, and this type of declaration is redundant.
        System.out.println(string1);
        System.out.println(string2);

        // Strings are immutable. Here is an example:
        String name = "Aritra"; // This lives in a separate memory location.
        System.out.println(name);
        name = "Kumar"; // This lives in a separate memory location. When it is reassigned, it does not replace the previous string, it lives in a separate memory location than the previous string. Later garbage collector cleans the unused memory.
        System.out.println(name);

        String string3 = "This is a String";

        // Here references are checked rather than values. In primitive data types like "int" values are checked and in non-primitive datatypes references are checked.
        if (string1 == string3){ // here "==" compares the memory location, not the content.
            System.out.println("both are same!");
        }

        if (string1.equals(string2)){ // here the content is compared and not the memory location.
            System.out.println("both are same!");
        }else {
            System.out.println("both are not same!"); // this is the output
        }

        if (string1 == string2){
            System.out.println("both are same!"); // this is the output
        }else {
            System.out.println("both are not same!");
        }
    }
}
