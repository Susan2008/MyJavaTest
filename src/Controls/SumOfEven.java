/**
 * 
 */
package Controls;

/**  
 * <p>Title: SumOfEven</p>  
 * <p>Description: </p>  
 * @author 吴冬梅  
 * @date 2018年1月19日  
 */
public class SumOfEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=1;
		int i2=1;
		int sum1=0,sum2=0;
		while(i1<1000){
			if(0==i1%2){
				sum1+=i1;
			}
			i1++;
		}
		System.out.println("用while，1到1000中，所有偶数的和为："+sum1);
		do {
			if (0==i2%2) {
				sum2+=i2;
			} 
			i2++;
		} while (i2<1000);
		System.out.println("用do while，1到1000中，所有偶数的和为："+sum2);
	}

}
