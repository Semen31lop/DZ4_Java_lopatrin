package Hw4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ex1();
        
    }
    static void ex1() {
        LinkedList<Integer> spisok = new LinkedList<>();
        Random rnd= new Random();
        int n=10;
        for (int i = 0; i < n; i++) {
            spisok.add(rnd.nextInt(2,10));
        }
        System.out.println(spisok);
        Collections.reverse(spisok);
        System.out.println(spisok);
    }
   
    
}
