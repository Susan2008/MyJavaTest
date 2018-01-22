/*
 计算从1开始的连续n个自然数之和，当其和值刚好超过100时结束，求这个n值
 */
package study_java;

public class cs_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int sum=0;
		do{
			n++;
			sum=sum+n;	
		}while(sum<100);
		System.out.println("sum="+sum);
		System.out.println("n="+n);
	}

}
