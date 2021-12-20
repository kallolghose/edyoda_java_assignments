package com.edyoda.springmvcdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        double a, b,c;
//        a = 3.0/0;
//        b = 0/4.0;
//        c=0/0.0;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        int x;
//        x = 5;
//        {
//            int y = 6;
//            System.out.print(x + " " + y);
//        }
//        System.out.println(x + " " + y);

//        byte x = 64;
//        int i;
//        byte y;
//        i = x << 2;
//        y = (byte) (x << 2);
//        System.out.print(i + " " + y);

//        Integer i = new Integer(257);
//        byte x = i.byteValue();
//        System.out.println(x);
//
//        recursion obj = new recursion() ;
//        System.out.println(obj.func(5));
//
//        int a = Character.MIN_VALUE;
//        System.out.print((char)a);

//        ArrayList<String> obj = new ArrayList();
//        obj.add("A");
//        obj.add("B");
//        obj.add("C");
//        obj.add(1, "D");
//        System.out.println(obj);


//        LinkedList<Integer> list = new LinkedList();
//        list.add(new Integer(2));
//        list.add(new Integer(8));
//        list.add(new Integer(5));
//        list.add(new Integer(1));
//        Iterator<Integer> i = list.iterator();
//        Collections.reverse(list);
//        Collections.sort(list);
//        while(i.hasNext())
//            System.out.print(i.next() + " ");
//
//        Thread t = Thread.currentThread();
//        t.setName("New Thread");
//        System.out.println(t);

        //new newthread();

        overload obj = new overload();
        int a = 2;
        double b = 3.2;
        obj.add(a, a);
        obj.add(b, b);
        System.out.println(obj.x + " " + obj.y);

    }


}

class overload
{
    int x;
    double y;
    void add(int a , int b)
    {
        x = a + b;
    }
    void add(double c , double d)
    {
        y = c + d;
    }
    overload()
    {
        this.x = 0;
        this.y = 0;
    }
}

class newthread extends Thread
{
    Thread t1, t2;
    newthread()
    {
        t1 = new Thread(this,"Thread_1");
        t2 = new Thread(this,"Thread_2");
        t1.start();
        t2.start();
    }
    public void run()
    {
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.equals(t2));
    }
}

class A
{
    int i;
    void display()
    {
        System.out.println(i);
    }
}

class B extends A
{
    int j;
    void display()
    {
        System.out.println(j);
    }
}

class recursion
{
    int func (int n)
    {
        int result;
        if (n == 1)
            return 1;
        result = func (n - 1);
        return result;
    }
}