package com.zhouxin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            try2();
            try3();
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }

        /*try {
            try3();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);

        }*/
    }
    public static String try1(){
        try {
            System.out.println(1/0);
            return "success";
        } catch (Exception e) {
            System.out.println(e);
            return "failed";
        }
    }

    public static void try2() {
        try {
            int x = 1 / 0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("try2 : " + e);
        }
    }

    public static void try3() throws Exception {
        throw new Exception();
    }
}
