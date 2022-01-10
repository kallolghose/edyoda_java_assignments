package com.ghoseka.aspect.programs;

import java.util.Scanner;
import java.util.Stack;

public class HitProgram {

    public int maxHitCount(String str){
        Stack<String> stack = new Stack<>();
        int max = -999;
        for(int i = 0; i<str.toLowerCase().length(); i++){
            if(str.charAt(i) == 'h'){
                if(stack.isEmpty() || stack.peek() == "h")
                    stack.push("h");
                else{
                    int temp = evaluate(stack);
                    if(temp >= max)
                        max = temp;
                }
            }
            else if(str.charAt(i) == 'i'){
                if(!stack.isEmpty() && (stack.peek() == "h" || stack.peek() == "i"))
                    stack.push("i");
            }
            else if(str.charAt(i) == 't'){
                if(!stack.isEmpty() && (stack.peek() == "i" || stack.peek() == "t"))
                    stack.push("t");
            }
            else{
                int temp = evaluate(stack);
                if(temp >= max)
                    max = temp;
            }
        }
        int temp = evaluate(stack);
        if(temp >= max)
            max = temp;
        return max;
    }

    public int evaluate(Stack<String> stack){
        int length = 0;
        if(!stack.isEmpty() && stack.peek() == "t"){
            length = stack.size();
        }
        stack.removeAllElements();
        return length;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.next();

        HitProgram hitProgram = new HitProgram();
        System.out.println(hitProgram.maxHitCount(str));

    }

}
