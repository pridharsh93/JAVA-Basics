package com.practise;
//package com.practise;
public class Boxing {
	
	static int num=3;
	static Integer a1= new Integer(num);//autoboxing
	public static int b=a1;//unboxing
	int c=10;
	String s1="abc";
	String s2= "def";
	
	public int display(int c) {// c variable doesnot take the global c variable value.
		
		return c;
	}
	public void print() {
		String s3= new String("abc");
		if(!(s1==s2)) {
			System.out.println(s1+"is equal to"+s2);
		}if(s1.equals(s3)) {
			System.out.println(s1+"is equal to"+s3);
		}
		//System.out.println(+this.c);
	}
	public static void main(String[] args) {
		// int num=3;
		// Integer a1= new Integer(num);//autoboxing
		// int b=a1;//unboxing	
		Boxing box=new Boxing();
		
		System.out.println("Value of the wrapper class integer");
System.out.println(absoluteValue(a1));
System.out.println(a1);//internally unboxed
System.out.println("value of the primitive integer: "+b);
System.out.println(b);
System.out.println(box.c);
//System.out.println(box.display(c)); works if c is static

System.out.println(box.display(box.c));

PrivateClass cls= new PrivateClass();
cls.setA(5);
cls.setName("hi");
System.out.println(cls.getA());
Boxing b1=new Boxing();
b1.print();
	}

	private static Integer absoluteValue(Integer a1) {
		//int a= a1;
		return a1;
	}
	
	

}
