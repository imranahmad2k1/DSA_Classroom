import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args){
	int size=5;
	ArrayStack myStack = new ArrayStack(size);
	ArrayStack tempStack = new ArrayStack(size);
	Random rand = new Random();

	for(int i=0;i<size;i++){
		int element = rand.nextInt(10);
		myStack.push(element);
	}

	System.out.println("Original Stack");
	myStack.PrintStack();
	System.out.println();

	//A. Set secondElement to the second element from the top of myStack, leaving myStack without its original top two elements.
	int secondElement = 99;
	System.out.println("secondElement: "+secondElement);
	tempStack.push(myStack.pop());
	tempStack.push(myStack.pop());
	myStack.push(secondElement);
	int extra = tempStack.pop();
	myStack.push(tempStack.pop());
	tempStack.push(extra);

	System.out.println("For A. Set secondElement to the second element from the top of myStack, leaving myStack without its original top two elements.\nSTACK:");
	myStack.PrintStack();
	System.out.println("");

	//B. Set bottomElement1 equal to the bottom element in myStack, leaving myStack empty.
	int bottomElement1 = 10;
	System.out.println("bottomElement1: "+bottomElement1);
	tempStack.push(myStack.pop());
	myStack.pop();
	tempStack.push(myStack.pop());
	tempStack.push(myStack.pop());
	tempStack.push(myStack.pop());

	myStack.push(bottomElement1);

	System.out.println("For B. Set bottomElement1 equal to the bottom element in myStack, leaving myStack empty.\nSTACK:");
	myStack.PrintStack();
	System.out.println("");

	//C. Set bottomElement2 equal to the bottom element in myStack, leaving myStack unchanged.
	int bottomElement2 = 19;
	System.out.println("bottomElement2: "+bottomElement2);
	myStack.pop();
	myStack.push(bottomElement2);
	
        extra = tempStack.pop();
	myStack.push(tempStack.pop());
	myStack.push(tempStack.pop());
	int xtra = tempStack.pop();
	myStack.push(tempStack.pop());
	myStack.push(xtra);
	tempStack.push(extra);

	System.out.println("For C. Set bottomElement2 equal to the bottom element in myStack, leaving myStack unchanged.\nSTACK:");
	myStack.PrintStack();
	System.out.println();

	// D. Print out the contents of myStack, leaving myStack unchanged.
	extra = tempStack.pop();
	for(int i=0;i<size-1;i++){
		tempStack.push(myStack.pop());
	}
	myStack.pop();
	tempStack.push(extra);

	for(int i=0;i<size;i++){
		myStack.push(tempStack.pop());
	}
 
	System.out.println("For D. Print out the contents of myStack, leaving myStack unchanged.");
	myStack.PrintStack();
	System.out.println();
	

    }
    
}
