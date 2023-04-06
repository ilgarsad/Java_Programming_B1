package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {

    public static void main(String[] args) {
        System.out.println(StringUtil.reverseStr("Java"));
        // We can assign whatever the method returns to the variable with the matching data type
        String fixed = StringUtil.fixFormat("toM" + " is friend with " + StringUtil.fixFormat("Jerry"));
        System.out.println(fixed);

        System.out.println(StringUtil.camelCase("JAVA is gooD LAnguaGE"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));
    }
}
