class Z42
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=1;
		int j=test(i++);
		//System.out.println("main end:");
		System.out.println("main end:" + i + ", " + j);
	}
	public static int test(int i) 
	{
		
		System.out.println("from test:" + i );
		return i++;
	}
}
//i=1---int i=1--- from test i=1--return i=1(i=2)--