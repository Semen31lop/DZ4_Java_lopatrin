package Hw4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    private static LinkedList<Integer> spisok;
    public static void main(String[] args) {
        LinkedList<Integer> spisok= new LinkedList<>();
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            spisok.add(rnd.nextInt(1,20));
        }
        System.out.println(spisok);
        enqueue(spisok);
        System.out.println("возвращам первый элемент из очереди и удаляем его " + "\n"+ dequeue(spisok)); 
        System.out.println(spisok);

        System.out.println("возвращаем первый элемент из очереди, не удаляя его  "+ "\n" + first(spisok)); 
        System.out.println(spisok);
    }
    public static void enqueue(LinkedList<Integer> spisok) {
        System.out.println("Введите элемент: ");
        Scanner sk = new Scanner(System.in);
        String n = sk.nextLine();
        int a = Integer.parseInt(n.trim());
        spisok.addLast(a);
        System.out.println(spisok);  
        
    }
    public static int dequeue(LinkedList<Integer> spisok) {
        int num = spisok.get(0);
        spisok.remove(0);
        return num;

    }
    public static int first(LinkedList<Integer> spisok) {
        int num = spisok.get(0);
        return num;
    }
    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
