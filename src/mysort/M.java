package mysort;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-16 下午7:02:05 
 * 类说明 
 */
public final class M {
	private  int compareCount;
	private  int swapCount;
	
	public M(){//重写构造器
		this.compareCount=0;
		this.swapCount=0;
	}
	
	public String toString(){
		String str="CompareCount:"+this.compareCount+"\nSwapCount:"+swapCount;
		return str;
	}
	public void plusCompareCount()
	{   
		compareCount++;
		
	}
	public void plusSwapCount()
	{
		swapCount++;
	}
}
