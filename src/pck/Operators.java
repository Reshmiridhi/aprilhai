package pck;

public class Operators {

	public static void main(String[] args) {
	//Arithmetic operators
		int a = 20 , b =10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
		//Assignment operators
		int c=30, d=20;
		System.out.println(c+=d); //c=c+d c=30+20=50
		System.out.println(c-=d);//c=c-d 50-20=30
		System.out.println(c==d);
		System.out.println(c*=d);
		System.out.println(c/=d);
		System.out.println(c%=d);

		//Relational operators(==,<,<=,>,>==,!=)
		int p= 50, q = 70;
		System.out.println(p>q);
		System.out.println(p==q);
		System.out.println(p<q);
		System.out.println(p>=q);
		System.out.println(p<=q);
		System.out.println(p!=q);
		
		//Logical operators
		String username = "abc";
		String password = "abc123";
		System.out.println(username=="abc" && password=="abc123");
		System.out.println(username=="abc1" && password=="abc123");
		System.out.println(!(username=="abc"));
		 
		
		//Unary operators
		int m=4;
		System.out.println(m++);//post increment
		System.out.println(m);
		System.out.println(++m);//Pry increment
		
	}

}
