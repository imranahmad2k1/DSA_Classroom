import java.util.Scanner;
public class main {
    public static void main(String[] args){

	boolean flag;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Expression: ");
        String expression = sc.next();

	int size = expression.length();
	Stack stack = new Stack(size);

	flag=true;
	for(int i=0;i<size;i++){
		if(expression.charAt(i)=='['){
			stack.push(expression.charAt(i));
		}
		else if(expression.charAt(i)==']'){
			char x = stack.pop();
			if(x=='[')continue;
			else{
				flag=false;
				break;
			}
		}

		else if(expression.charAt(i)=='{'){
			stack.push(expression.charAt(i));
		}
		else if(expression.charAt(i)=='}'){
			char x = stack.pop();
			if(x=='{')continue;
			else{
				flag=false;
				break;
			}
		}

		else if(expression.charAt(i)=='('){
			stack.push(expression.charAt(i));
		}
		else if(expression.charAt(i)==')'){
			char x = stack.pop();
			if(x=='(')continue;
			else{
				flag=false;
				break;
			}
		}

	}

	if(stack.isEmpty() && flag==true){
		System.out.println("Expression is Valid");
	}
	else{
		System.out.println("Expression is not Valid");
	}
    }
    
}
