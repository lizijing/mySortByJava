package mysort;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-16 下午7:44:01 
 * 类说明 
 */
/*
 * 冒泡排序类A1 继承于A
 */
public class A1<T extends  Comparable<? super T>> extends A <T> {
	public A1(T []a)
	{
		super(a);
	}
	
	public void doSort(T[]a)
	{
		//a[0]=0;
		int i,j,temp;
		boolean flag;
	
		for(i=1;i<a.length;i++)
		{   flag=true;
			for(j=1;j<a.length-i;j++)
			{
				if(compare(a[j], a[j+1]))
				{   flag=false;
	                a[0]=a[j];
					a[j]=a[j+1];
					a[j+1]=a[0];
					swap();
				}
				
			}
			if(flag==true)
				break;
		}
		System.out.println("冒泡排序");
		for(i=1;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		System.out.print(operation.toString());
	
		
		
		
	}

}
