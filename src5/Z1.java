class Z1
{
	public static void main(String[] args) 
	{
		int i=10;
		if(true || (i++==10))
        {
			System.out.println("if:" +i);
			i++;
		}
	    System.out.println("main end:" +i);
	}
}
