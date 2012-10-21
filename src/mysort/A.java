package mysort;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-16 下午7:13:29 
 * 类说明 
 */
public abstract class A<T extends  Comparable<? super T>> {//泛型要继承Comparable接口才能在compare函数使用泛型
	M operation = new M();
	//public int[]a={0,7,6,5,9,8,6,4};
	T []arr;
	public A(T a[])
	{   
		arr=(T[]) a.clone();//关键的一句
		
		/*arr=(T[])new Object[a.length];
		for(int i=1;i<a.length;i++)
		{
			arr[i]=a[i];
		}*/
	}
    /*
     * 比较次数
     */
	public final boolean compare(T a,T b)
	{
		operation.plusCompareCount();
		if(a.compareTo(b)>0)
			return true;
		else 
			return false;
	}
	
	/*
	 * 交换次数
	 */
	public final void swap()
	{
		operation.plusSwapCount();
	}
	/*
	 * 虚方法doSort
	 */
	public abstract  void doSort(T a[]);
	/*
	 * sort方法计时并计时
	 */
	public final M sort(){
		long start=System.nanoTime();
		doSort(arr);
		long time=System.nanoTime()-start;
		System.out.print("\ntime is:");
		System.out.println(time);
		return operation;
		
	}
}   
