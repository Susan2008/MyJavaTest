/**
 * 
 */
package Controls;

/**  
 * <p>Title: SumOfEven</p>  
 * <p>Description: </p>  
 * @author �ⶬ÷  
 * @date 2018��1��19��  
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
		System.out.println("��while��1��1000�У�����ż���ĺ�Ϊ��"+sum1);
		do {
			if (0==i2%2) {
				sum2+=i2;
			} 
			i2++;
		} while (i2<1000);
		System.out.println("��do while��1��1000�У�����ż���ĺ�Ϊ��"+sum2);
	}

}
