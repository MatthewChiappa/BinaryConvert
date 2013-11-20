// This program converts a number into its binary
// form and reverses the order of the numbers. Then
// changing the binary 1s and 0s to its integer form. 

import java.util.Stack;

public class ReverseBinary {
  
  // two stacks are used in order to hold the 1s and 0s
  
  Stack<Integer> stack = new Stack<Integer>();
  Stack<Integer> reverseStack = new Stack<Integer>();
  int size;
  
  public static void main(String[] args) {
    
    ReverseBinary main = new ReverseBinary();
    main.convertToBin(13);
    main.reverse();
    System.out.println(main.convertToNum());
    
  }
  
  // converts the integer to its binary form
  
  public void convertToBin(int num) {
    
    int remainder;
    
    while (num > 0) {
     
      remainder = num % 2;
      stack.push(remainder);
      num = num / 2;
      size++;
      
    } 
  }
  
  // reverses the order of the binary numbers by popping and 
  // pushing between the stacks
  
  public void reverse() {
    for (int i = 0; i < size; i++)   
      reverseStack.add(stack.pop());
  }
  
  // converts the reversed binary form back into an integer
  
  public int convertToNum() {
    
    int prev = 0;
    int total = 0;
    
    for (int i = 0; i < size; i++) {
      
      int remainder = reverseStack.pop();
      total = (prev * 2) + remainder;
      prev = total;
      
    }
    
    return total;
  }
  
}