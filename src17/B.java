class B 
{
	B()
	{
		System.out.println("B()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1=new B();
		System.out.println("----------");
		 B b2=new B();
		System.out.println("----------");
		B b3=new B();
		/*System.out.println("----------");
		b1=new B();
		System.out.println("----------");
		b1=new B();*/
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*




main begin
B()
----------
B()
----------
B()
----------
main end
*/