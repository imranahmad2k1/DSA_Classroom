
public class ArrayStack {
  int top=-1;
  int Stack[];
  
  public ArrayStack(int x){
    Stack = new int[x];
  }
  
  void push(int x){
    if(!(isFull())){
      top++;
      Stack[top]=x;
    }
    
  }
  
  int pop(){
    if(!(isEmpty())){
      int x = Stack[top];
      top--;
      return x;
    }
    return -1;
  }
  
  int peek(){
    return Stack[top];
  }
  
  boolean isEmpty(){
    if(top==-1){
      return true;
    }
    return false;
  }
  
  boolean isFull(){
    if(top==Stack.length-1){
      return true;
    }
    return false;
  }
  
  int NoOfElements(){
    return top+1;
  }
  
  void PrintStack(){
    for(int i=top;i>=0;i--){
      System.out.println(Stack[i]);
    }
  }
}