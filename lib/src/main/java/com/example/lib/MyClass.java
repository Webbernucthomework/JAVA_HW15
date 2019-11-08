package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入現在時間(時:分:秒)");
        String scan = scanner.next();
        String Hr,Min;
        int hr,min;
        int F =scan.indexOf(":");
        int E = scan.lastIndexOf(":");
        Hr = scan.substring(0,F);
        Min = scan.substring(F+1,E);
        hr=Integer.parseInt(Hr);
        min=Integer.parseInt(Min);
        int totalmin =hr*60+min;
        if(totalmin>=450&&totalmin<1020){
            System.out.println("現在是上課時間");
        }
        else {
            System.out.println("現在是下課時間");
        }


    }
}
