package pck;

public class Calc {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		char op='+';
		int result=0;
		switch(op)
		{
		case '+' :  result = a+b;
		break;
		case  '-': result=a-b;
		break;
		case '/' : result = a/b;
		break;
		case '*' : result = a*b;
		break;
		default : System.out.println("invalid choice");
		}
		System.out.println("result="+result);
	}

}
