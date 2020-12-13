
public class Stack {
  int top=-1;
  String Stack[];
  
  public Stack(int x){
    Stack = new String[x];
  }
  
  void push(String x){
    if(!(isFull())){
      top++;
      Stack[top]=x;
    }
    
  }
  
  String pop(){
    if(!(isEmpty())){
      String x = Stack[top];
      top--;
      return x;
    }
    return "null";
  }
  
  String peek(){
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