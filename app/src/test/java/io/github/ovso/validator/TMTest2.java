package io.github.ovso.validator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class TMTest2 {

    @Test
    public void solution() {
        String a = "penpineapple";
        String b = "applepen";

        StringBuffer bf = new StringBuffer();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j < a.length(); j++) {
                bf.append(a.charAt(j));
                if (!b.contains(bf)) {
                    bf.delete(j - i, j - i + 1);
                    break;
                }
            }
            list.add(bf.toString());
            bf.delete(0, a.length());
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= count) {
                count = list.get(i).length();
            }
        }
        System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == count) {
                System.out.println(list.get(i));
            }
        }
    }

    @Test
    public void solution2() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int tmp = 0, divisor = 0, dividend = 0;
        for (int i = 1; i < 10000; i++) {
            if (num > tmp && tmp + i >= num) {
                if (i % 2 == 0) {
                    divisor = i + 1 - (num - tmp);
                    dividend = (num - tmp);
                } else {
                    divisor = (num - tmp);
                    dividend = i + 1 - (num - tmp);
                }
                break;
            }
            tmp += i;
        }
        System.out.print(dividend + "/" + divisor);
    }
}
