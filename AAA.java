package Redrock;

import java.util.ArrayList;
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入添加的内容：");
        String a = in.next();
        System.out.println("输入删除的内容序号：");
        int b = in.nextInt();
        System.out.println("输入要改变的内容序号：");
        int c = in.nextInt();
        System.out.println("输入要改变成的内容：");
        String d = in.next();
        System.out.println("输入要查询的内容序号：");
        int e = in.nextInt();
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("立即");
            list.add("立即就");
            list.add(a);
            list.remove(b);
            list.set(c, d);
            String ele = list.get(e);
            System.out.println(list);
            System.out.println();
            System.out.println("查询的内容：" + ele);
        }
    }
}

