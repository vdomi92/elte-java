import java.util.*;

public class Stack{

    private int actualSize;
    private int maxLength;
    private Integer[] myStack;

    public int getActualSize(){ return this.actualSize; }
    public int getMaxLength(){ return this.maxLength; }
    public Integer[] getMyStack(){ return this.myStack; }

    public Stack(){
        this.actualSize = 0;
        this.maxLength = 4;
        this.myStack = new Integer[maxLength];
        for(int i = 0; i < 4; i++){
            myStack[i] = null;
        }
    }

    public void push(int x){
        Integer newValue = new Integer(x);
        if(this.getActualSize() == this.getMaxLength()){
            this.maxLength = this.getMaxLength() * 2;
            Integer[] tmpStack = new Integer[this.maxLength];
            for(int i = 0; i < this.maxLength; i++){ tmpStack[i] = null; };
            for(int i = 0; i < this.maxLength / 2; i++) { tmpStack[i] = myStack[i]; };
            this.myStack = tmpStack;
        }
        this.actualSize = this.getActualSize() + 1; 
        this.myStack[this.getActualSize()] = newValue;
    }

    public boolean isEmpty(){
        return this.getActualSize() == 0;
    }

    public void pop(){
        try{
            if(this.isEmpty()){
                throw new NoSuchElementException("Stack is already empty!");
            }
            this.myStack[this.getActualSize()] = null;
            this.actualSize = this.getActualSize() - 1;
        }
        catch(NoSuchElementException e){
            System.out.println("Stack is already empty!");
        }
    }


    public static void main(String[] args){

    }
}