package v2_4_List;

import java.util.Stack;

public class StackSample {

    public void checkPeek(){
        Stack<Integer> intStack = new Stack<>();
        for(int loop=0; loop<5; loop++){
            intStack.push(loop);
            System.out.println(intStack.peek());
        }
        System.out.println(intStack.size());
    }

    public void checkPop(){
        Stack<Integer> intStack = new Stack<>();
        for(int loop=0; loop<5; loop++){
            intStack.push(loop);
            System.out.println(intStack.pop());
        }
        System.out.println(intStack.size());
    }
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
        sample.checkPop();
    }
}
