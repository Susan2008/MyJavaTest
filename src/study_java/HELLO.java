/*
 * ��javaд���ж�һ�����ݶԲ��ԣ��ԵĻ����������Եļ��������Ҫ�õ�do while��䣬�����������̴��do while��䣬����һ����С�����ֵİ�����ѧ
 */
package study_java;

import java.util.Scanner;

public class HELLO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int i=0;
		do{
			System.out.println("������xm����ʵ������");
			String name=scan.next();
			if(name.equals("С��")){
				i++;
				System.out.println("��ϲ��������ȷ������������С��");
			}else{
				System.out.println("��������������ֲ���"+name);
				System.out.println("�Ƿ��������Y  ����N");
				String name1=scan.next();			
			if(name1.equals("N")){
				i++;
				System.out.println("��֪����²���");
			   }
			}
		    }while(i!=1);
		}
		
}


