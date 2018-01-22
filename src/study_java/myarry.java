/**
 * 
 */
package study_java;

/**  
 * <p>Title: myarry</p>  
 * <p>Description: 遍历数组</p>  
 * @author 吴冬梅  
 * @date 2018年1月18日  
 */
public class myarry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []myarry={1,2,3,4,5};
		System.out.println("数组索引为0的元素为："+myarry[0]);
		System.out.println("数组长度为："+myarry.length);
		int i=0;
		while(i<myarry.length){
			System.out.println(myarry[i]);
			i++;
		}
	}

}
