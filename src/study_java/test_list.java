/**
 * 
 */
package study_java;

import java.util.ArrayList;
import java.util.List;

/**  
 * <p>Title: test_list</p>  
 * <p>Description:遍历list集合;list.size()。代表的是list里面有多少个元素 </p>  
 * @author 吴冬梅  
 * @date 2018年1月8日  
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
