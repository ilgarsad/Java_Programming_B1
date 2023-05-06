package day13_string;

public class C1_StringMemory {

    public static void main(String[] args) {

        //first way to create String object
        String nothing = "";    // we have nothing
        String space = " ";     // 1 space
        String str1 = "Java";   // this is the way of creating the String by literals
        String str2 = "Java";   // We have 2 different variable name but 1 variable. This means we only have 1 Java in the heap/String pool

        String str3 = "JavA";
        String str4 = "JavA";
        String str5 = "JavA";

        String str6 = "JAvA";
        String str7 = "JAvA";
        String str8 = "JAvA";

        System.out.println(str1 == str2);   //true (== compares the value)
        System.out.println(str3 == str4);   //true
        System.out.println(str5 == str7);   //false

        System.out.println("-------------------------------------");


        //2nd way of creating String value;

//        Scanner input = new Scanner(System.in);
        String str9 = new String ( "Java");
        System.out.println(str9);

        System.out.println("Hello World");

//        String concatenate = "Hello World" + "2";

        String word1 = "loop";
        String word2 = "loop";

        String word3 = new String("loop");
        String word4 = new String("loop");
        String word5 = new String("Loop");

        System.out.println(word3 == word4); //false. Because it is not the same object. Location of the object is different.

        System.out.println(word3.equals(word4));    // this method comes from String class
        System.out.println(word3.equals(word5));

        String a = "Loop camp";     // a new object in String pool
        String b = a;               // existing object in String pool
        String d = a + " is great!"; // "Loop camo is great!" new object in String pool

        a = "Loop CAMP";            // It is a brand-new String object

        a = "Loop camp";            // It is a brand-new String object

        //Scanner name = input.next();



    }
}

//Literal is value that is written directly in the code. For example when you write String animal = "cat"; no matter what part of the code the program sees animal it always thinks its cat because we said animal literally means cat in the beginning.