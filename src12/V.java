class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("do-while-begin");
			if(i == 3)
			{
				i++;
				continue;
			}
			System.out.println("do-while-end");
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
