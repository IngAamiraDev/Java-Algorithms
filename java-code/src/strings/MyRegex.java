package strings;

/*
Sample Input:
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output:
true
true
true
false
false
false

 */


class MyRegex2 {
    String ippattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
}

public class MyRegex {
    public static void main(String[] args) {
        System.out.println(MyRegex2("000.12.12.034"));
        System.out.println(MyRegex2("121.234.12.12"));
        System.out.println(MyRegex2("23.45.12.56"));
        System.out.println(MyRegex2("00.12.123.123123.123"));
        System.out.println(MyRegex2("122.23"));
        System.out.println(MyRegex2("Hello.IP"));
        System.out.println(MyRegex2("259.259.259.259"));
        System.out.println(MyRegex2("12.12.12.12"));
        System.out.println(MyRegex2("266.266.266.266"));
    }
    public static boolean MyRegex2 (String ip) {
        MyRegex2 regex = new MyRegex2();
        return ip.matches(regex.ippattern);
    }

}
