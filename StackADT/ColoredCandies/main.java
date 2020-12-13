import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
	//Putting candies in the box
        System.out.print("No of Candies you want to put in the Box: ");
        int length = sc.nextInt();

        System.out.println("");//for beautification

        int size = length;
	Stack stack = new Stack(size);
	Stack stack2 = new Stack(size);

	int i=0;
	while(size>0){
		System.out.print("Which candy you want to put at spot " + (i+1)+"\n==========================================\n1.Yellow\n2.Orange\n3.Red\n\nYour choice: ");
	 	int choice = sc.nextInt();
		System.out.println("");//for beauification
		if(choice==1){
			stack.push("yellow");
			size--;
			i++;
		}
		else if(choice==2){
			stack.push("orange");
			size--;
			i++;
		}
		else if(choice==3){
			stack.push("red");
			size--;
			i++;
		}
		else{
			System.out.println("\nWrong Choice\n");
		}
	}
	System.out.println("Candies in the Box:\n===================");
	stack.PrintStack();
	System.out.println("===================");

	//Taking Favourite Candies out of the box:
	System.out.print("\n\nWhich colour candies you want:\n===============================\n1.Yellow\n2.Orange\n3.Red\n\nYour choice: ");
	int choice = sc.nextInt();
	while(choice<1 && choice>3){
		System.out.print("Wrong choice!!\nWhich candy you want:\n=======================\n1.Yellow\n2.Orange\n3.Red\n\nYour choice: ");
		choice = sc.nextInt();
	}
	String fav="";
	String candy="";
	if(choice==1){
	 	fav = "yellow";
	}
	else if(choice==2){
	 	fav = "orange";
	}
	else{
	 	fav = "red";
	}

	boolean flag=false;
	int out = 0;

	for(int j=0;j<length;j++){
		candy = stack.pop();
		if(fav.equals(candy)){
			flag=true;
			System.out.print("Here is your Candy: '"+candy+"' !!!\n");
			out++;
		}
		else{
			stack2.push(candy);
		}
	}
	if(flag=false){
		System.out.print(fav+" candy was not present in the box");
		for(int j=0;j<length;j++){
			stack.push(stack2.pop());
		}
	}

	else{
		for(int j=0;j<length-out;j++){
			stack.push(stack2.pop());
		}
	}
        System.out.println("\nCandies in the Box:\n===================");
	stack.PrintStack();
	System.out.println("===================");                                   
    }           	
    
}
