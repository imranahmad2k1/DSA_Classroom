
public class Stack {
  int top=-1;
  char Stack[];
  
  public Stack(int x){
    Stack = new char[x];
  }
  
  void push(char x){
    if(!(isFull())){
      top++;
      Stack[top]=x;
    }
    
  }
  
  char pop(){
    if(!(isEmpty())){
      char x = Stack[top];
      top--;
      return x;
    }
    return 'x';
  }
  
  char peek(){
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