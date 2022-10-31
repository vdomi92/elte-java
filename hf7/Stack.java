import java.util.*;

public class Stack{

    private int actualSize;
    private int maxLength;
    private Integer[] myStack;

    public int size(){ return this.actualSize; }
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
        if(this.size() == this.getMaxLength()){
            this.maxLength = this.getMaxLength() * 2;
            Integer[] tmpStack = new Integer[this.maxLength];
            for(int i = 0; i < this.maxLength / 2; i++) { tmpStack[i] = myStack[i]; };
            this.myStack = tmpStack;
        }
        this.actualSize = this.size() + 1; 
        this.myStack[this.size()] = newValue;
    }

    public boolean empty(){
        return this.size() == 0;
    }

    public Integer pop(){
        Integer retVal = null;
        try{
            if(this.empty()){
                throw new NoSuchElementException("Stack is already empty!");
            }
            if(this.size() * 2 == this.getMaxLength()){
                this.maxLength = this.size();
                Integer[] tmpStack = new Integer[this.maxLength];
                for(int i = 0; i < this.maxLength; i++) { tmpStack[i] = myStack[i]; };
                this.myStack = tmpStack;
            }
            retVal = this.myStack[this.size()];
            this.myStack[this.size()] = null;
            this.actualSize = this.size() - 1;         
        }
        catch(NoSuchElementException e){
            System.out.println("Stack is already empty!");
        }
        return retVal;
    }


    public static void main(String[] args){

    }
}