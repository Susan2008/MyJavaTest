/**
 * 
 */
package study_java;

import java.util.ArrayList;
import java.util.List;

/**  
 * <p>Title: test_list</p>  
 * <p>Description:����list����;list.size()���������list�����ж��ٸ�Ԫ�� </p>  
 * @author �ⶬ÷  
 * @date 2018��1��8��  
 */
public class test_list {

	private static int i;

	/**
	 * @param args
	 * @param i 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for(i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
