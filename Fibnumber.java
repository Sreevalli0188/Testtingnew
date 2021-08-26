
public class Fibnumber {
	public void FibNumber()
	{
		int num =5;
		int temp;
		int n1=0,n2=1;
		//0 1 2 3
		System.out.print( 0 + " " + 1 + " ");
		for(int i=2;i<num;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(temp + " ");
		}
		}
	public int FibNum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return FibNum(n-1)+ FibNum(n-2);
		}
	}
	
	public static void main(String[] args) {
		Fibnumber obj=new Fibnumber();
		//obj.FibNumber();
		int num=4;
		int a1[]=new int[num];
		for(int i=0;i<num;i++)
		{
			//a1[i] =obj.FibNum(i);
			System.out.println(obj.FibNum(i));
			
		}
		
//System.out.println(a1[100]);
	}

}
