class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=5;
		switch(i)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("odd value");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("even value");
				break;
		}
		System.out.println("main end");
	}
}