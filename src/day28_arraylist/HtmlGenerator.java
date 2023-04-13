package day28_arraylist;
public class HtmlGenerator {

/*
    Input:
            li^3
    Output:
            <li></li><li></li><li></li>

 */

    public static String htmlGenerator (String str){  //li  ^   3

        String html = "";
        String [] parts = str.split("\\^");
        int count = Integer.parseInt( parts[1]);


        for (int i = 0; i < count; i++) {
            //<li></li>   <li></li>     <li></li>
            html += "<" + parts[0] + "></" + parts[0] + ">";  //<li></li>
        }


        return html;
    }

    public static void main(String[] args) {
        String result = htmlGenerator("li^3");
        System.out.println(result);

        System.out.println(htmlGenerator("div^2"));
    }
}
