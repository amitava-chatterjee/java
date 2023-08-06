/*
Why to use Lambda
1. Reduces the lines of code
2. To call APIs very effectively
3. To write more readable, maintainable and concise code
*/

public class LambdaTest{
	public static void main(String args[]){
		LambdaInterface l = () -> System.out.println("Hi");
		l.test();
		AddInterface a = (int x, int y) -> {
			System.out.println("This is add function");
			return x + y;
		};
		System.out.println(a.add(32, 56));
		AddInterface b = (x, y) -> x + y;
		System.out.println(b.add(3, 5));
	}
}
