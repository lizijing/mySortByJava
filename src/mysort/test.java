package mysort;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-16 下午8:10:06 
 * 类说明 
 */
public class test {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
	    int n;
		int para;
		Double[]a=new Double[args.length];
		para=Integer.parseInt(args[0]);
		for(int i=1;i<args.length;i++)
		{
			a[i]=Double.parseDouble(args[i]);
		}
		System.out.println("Original:");
		for(int i=1;i<args.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
	   switch(para)
		{
		case 1://冒泡排序
		{   
			A1 <Double> op= new A1<Double> (a);
			op.sort();
			
			break;
		}
		case 2://插入排序
		{   
			A2 <Double>op= new A2<Double>(a);
			op.sort();
			
			break;
		}
		case 3://选择排序
		{   
			A3 <Double>op= new A3<Double>(a);
			op.sort();
		}
		}
		
	}
}
