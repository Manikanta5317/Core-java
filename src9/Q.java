class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
        {
			System.out.println("if");
        }
		else if(false)
		{
			System.out.println("if2");
		}
		else
		{
			if(true)
			{
				System.out.println("if3");
			}
		}
		System.out.println("main end");
	}
}
