class StringMethods{
    public static void main(String[] args){
        String myFirstName = "Aritra";
        System.out.println(myFirstName.toUpperCase());
        System.out.println(myFirstName.toLowerCase());
        String myLastName = "  Kumar  ";
        System.out.println(myLastName.trim()); // trims spaces
        String myOtherName = "cyphenstine";
        String startsWithO = "Oscar";

        int value = myOtherName.compareTo(startsWithO);//if positive then first string has a bigger value, if negetive then has a smaller value, if 0 then same. a has less value than b.
        System.out.print(value);
    }
}