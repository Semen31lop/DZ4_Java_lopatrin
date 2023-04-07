package Hw4;

import java.util.LinkedList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> summ = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            summ.add(rnd.nextInt(1,10));
            }
        System.out.println(summ);
        ex1(summ);
    }
    static void ex1(LinkedList<Integer> summ){
        int sum = 0;
        for (int i = 0; i < summ.size(); i++) {
            sum += (int) summ.get(i);
        }
        System.out.println(sum);
    }
}
