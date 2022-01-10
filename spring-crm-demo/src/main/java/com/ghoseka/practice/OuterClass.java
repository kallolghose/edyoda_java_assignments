package com.ghoseka.practice;

public class OuterClass {

    private int a;

    class InnerClass {

        private int b;

        public InnerClass(int a1, int b){
            this.b = b;
            a = a1;
        }

    }

    static class StaticInnerClass {
        private int c;

        public StaticInnerClass(int c){
            this.c = c;
        }
    }

}
