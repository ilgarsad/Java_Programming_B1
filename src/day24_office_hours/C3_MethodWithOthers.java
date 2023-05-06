package day24_office_hours;

public class C3_MethodWithOthers {

    public static String dayOfWeek(int num) {  // 2


        if (num > 7 || num < 1) {
//            System.out.println("Number is not in the range.");
            return "Number is not in the range.";
        }

        String [] words = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //                   0           1           2            3          4          5         6
        return words [num-1];
    }

    public static String dayOfWeek2 (int num) {

        String day = "";
        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = " Num is not in the range";
        }

        return day;
    }

    public static String dayOfWeek3 (int num) {


        switch (num) {
            case 1:
                return  "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return  "Wednesday";
            case 4:
                return  "Thursday";
            case 5:
                return "Friday";
            case 6:
                return  "Saturday";
            case 7:
                return  "Sunday";
            default:
                return  " Num is not in the range";
        }

    }

    public static void main(String[] args) {

        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek2(5));
        System.out.println(dayOfWeek3(6));

    }
}
