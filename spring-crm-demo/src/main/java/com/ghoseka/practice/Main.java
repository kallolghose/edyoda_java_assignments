package com.ghoseka.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(10, 20);

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass(10);
        Anonymous anonymous = new AnonymousClass();
        anonymous.display();

        Anonymous anonymous1 = new Anonymous() {
            @Override
            public void display() {
                System.out.println("Hello");
            }
        };
    }

}
