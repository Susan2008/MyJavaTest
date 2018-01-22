/*
 * 用java写个判断一个内容对不对，对的话结束，不对的继续，这就要用到do while语句，今天就在这里教大家do while语句，我用一个猜小明名字的案例教学
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
			System.out.println("请输入xm的真实姓名：");
			String name=scan.next();
			if(name.equals("小明")){
				i++;
				System.out.println("恭喜你输入正确，他的名字是小明");
			}else{
				System.out.println("输入错误，他的名字不是"+name);
				System.out.println("是否继续，是Y  不是N");
				String name1=scan.next();			
			if(name1.equals("N")){
				i++;
				System.out.println("就知道你猜不出");
			   }
			}
		    }while(i!=1);
		}
		
}


