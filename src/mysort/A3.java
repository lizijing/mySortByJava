package mysort;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-16 下午7:44:32 
 * 类说明 
 */
/*
 * 选择排序，继承于A
 */
public class A3 <T extends  Comparable<? super T>>extends  A<T>{
	public A3 (T a[])
	{
		super(a);
	}
    public void doSort(T a[])
    {
    	// a[0]=0;
 		int i,j,temp;
 		
 		for(i=2;i<=a.length-1;i++)
 		{
 			a[0]=a[i];
 			j=i-1;
 			while(compare(a[j], a[0]))
 			{
 				a[j+1]=a[j];
 				j--;
 			}
 			a[j+1]=a[0];
 			swap();
 		}
 		System.out.println("选择排序");
 		for(i=1;i<a.length;i++)
 		{
 			System.out.print(a[i]);
 			System.out.print(" ");
 		}
 		System.out.print("\n");
 		System.out.print(operation.toString());
    }
}
