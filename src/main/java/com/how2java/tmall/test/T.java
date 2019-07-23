package com.how2java.tmall.test;

public class T {

    public static void main(String[] args) {
        String service_ip="118.145.6.113";
        String site_id="s233834";
        String password="Abcd1234";
        String[] cmds = {"Action:Set Password","Server_IP:" + service_ip,"Site_ID:" + site_id,"Password:" + password};
        for (String s:cmds) {
            System.out.println(s);
        }
    }

}
