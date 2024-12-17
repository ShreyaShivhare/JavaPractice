package com.example.practice.Arrays;


public class StackArrays {

    private int max_size;
    private int[] stackArray;
    private int top;

    public StackArrays(int size){
        max_size=size;
        stackArray =new int[max_size];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == max_size-1);
    }

    public void push(int item){
        if(!isFull()){
            stackArray[++top] = item;
        }else{
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stackArray[--top] ;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return stackArray[top];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int size(){
        return top +1;
    }
    
    public static void main(String args[]){
        StackArrays stack = new StackArrays(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size after pop is: " + stack.size());
    }
}
