class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
        {
			System.out.println("if");
        }
		else
		{
			System.out.println("else begin");
			if(true)
			{
				System.out.println("if2");
			}
			else
			{
				System.out.println("else2 begin");
				if(true)
				{
					System.out.println("if3");
				}
				System.out.println("else2 end");
			}
			System.out.println("else end");
		}
		System.out.println("main end");
	}
}