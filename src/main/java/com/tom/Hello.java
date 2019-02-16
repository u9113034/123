package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        int age = 19;   // short & long
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;    //只要看到有小數點的數字JAVA會自動判定為double
        Float weight2 = 77.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";
    }
}
