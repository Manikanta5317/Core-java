class T 
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=++i + i + i++ + i + --i + i + i-- + i;
		//     2 
		System.out.println(i);//1
		System.out.println(j);//16
	}
}
