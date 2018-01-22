/**
 * 
 */
package study_java;

/**  
 * <p>Title: StringBuffer_Test</p>  
 * <p>Description: 当对字符串进行修改的时候，需要使用 StringBuffer</p>  
 * @author 吴冬梅  
 * @date 2018年1月10日  
 */
public class StringBuffer_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer=new StringBuffer("菜鸟教程官网：");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.print(sBuffer);
	}

}
