
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived("Hello");

	}

}
class Base{
	Base() { this("a", "b");}
	
	Base (String x, String y) {
		System.out.println(x+y);
	}
}
class Derived{
	Derived (String s) 
	{
		System.out.println(s);
	}
}