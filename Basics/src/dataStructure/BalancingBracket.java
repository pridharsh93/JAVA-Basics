package dataStructure;

import java.util.Stack;

public class BalancingBracket {
	
	Stack<Character> stack=new Stack<Character>();
	
	public String balanceBracket(String str) {
		
		String output = new String();
		
		for(Character ch:str.toCharArray()) {
			if(!isBracket(ch)) {
				System.out.println("Invalid Entry, only Bracket input is allowed");
				 stack.push(ch);
				 break;
			}else {
				if(ch=='{'||ch=='['||ch=='(') {
					stack.push(ch);
				}else {
					if(!stack.isEmpty() && ((ch=='}' && stack.peek()=='{')
							||(ch==']' && stack.peek()=='[')
							||(ch==')' && stack.peek()=='('))) {
						stack.pop();}
						else {
							stack.push(ch);
							break;}
				}
			}
			
		}
		
		if(stack.isEmpty()) 
			output="Balanced";
		else output = "Not Balanced";
		
		return output;
	}
	
	public boolean isBracket(Character ch) {
		boolean flag;
		if (ch=='{'||ch=='}'||ch=='['||ch==']'||ch=='('||ch==')') {
			flag=true;
		}else
			flag=false;
		return flag;
		
	}
	public static void main(String[] args) {
		BalancingBracket br=new BalancingBracket();
		String str="{}()[.]{}";
		String op = br.balanceBracket(str);
		System.out.println(op);
		//System.out.println(br.isBracket('['));
		//System.out.println(br.isBracket('1'));

	}

}
