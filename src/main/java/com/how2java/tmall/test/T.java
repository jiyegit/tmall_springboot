package com.how2java.tmall.test;

public class T {
    public static String replace( String str, String oldStr, String newStr)
    {
        int i, j, n, l = oldStr.length();
        String rst = "";

        for ( i = 0, n = str.length() ; i < n && (j = str.indexOf(oldStr,i)) >= 0 ; i = j + l )
        {
            rst += str.substring(i,j) + newStr;
        }
        if (i < n) rst += str.substring(i);

        return rst;
    }
    public static String prep4DB(String argStr)
    {
        if (argStr == null) return ""; else return replace(argStr,"'","''");
    }
    public static void main(String[] args) {
        String s=T.prep4DB("aasdasdasd--asdfasdfasd-fsd-fa-sdf-asdfasfeaw");
        System.out.println(s);
    }
}
