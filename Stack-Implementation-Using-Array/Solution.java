public class Solution{
    static class Stack {
        int[] arr;
        int top;
        Stack(int capacity) {
            arr = new int[capacity];
            top=-1;
        }
        public void push(int num) {
          if(isFull() == 0) {
            arr[++top] = num;
          }
        }
        public int pop() {
         if(isEmpty() == 0) {
            return arr[top--];
         }
         return -1;
        }
        public int top() {
            if(isEmpty() == 0) {
                return arr[top];
            }
            return -1;
        }
        public int isEmpty() {
            if(top == -1) {
                return 1;
            }
            return 0;
        }
        public int isFull() {
            if(top == arr.length-1) {
                return 1;
            }
            return 0;
        }
    }
}