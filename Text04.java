package com.itheima;

public class Text04 {
    public static void main(String[] args) {

        int[] arr = new int[24];
        arr[0] = 1;
        arr[1] = 1;

        for (int x=2; x<arr.length; x++) {
            arr[x] = arr[x-1] + arr[x-2];
            System.out.println( x+1 + "个月时兔子的对数是：" + arr[x]);
        }
    }
}
