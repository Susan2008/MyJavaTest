/**
 * 
 */
package study_java;

/**  
 * <p>Title: StringBufferTest</p>  
 * <p>Description: 利用StringBuffer来替换内容</p>  
 * @author 吴冬梅  
 * @date 2018年1月10日  
 */
public class StringBufferTest {
	 
	    public static void main(String[] args) {
	          String s = "0123456|78987|6543210"; // 原始string
	          String re = "78987";// 原始string中需要被替换的内容
	          String s_re1 = "789-987";// 新内容1
	          String s_re2 = "7890987";// 新内容2
	 
	          StringBuffer sb = new StringBuffer(s);// 构造一个StringBuffer
	          System.out.println("替换前：" + sb.toString());
	
             //使用replace方式替换
	         int size = re.length();// 获取re的长度
	         int p = sb.lastIndexOf(re); // 获取re在原始string中的起始位置
	         sb.replace(p, p + size, s_re1);// 开始替换
	         System.out.println("第一次替换后：" + sb.toString());
	
	         // 用delete和insert方式替换
	         int length = s_re1.length();
	         int pIndex = sb.lastIndexOf(s_re1);
	         sb.delete(pIndex, pIndex + length);
	         System.out.println("删除内容后：" + sb.toString());
             sb.insert(pIndex, s_re2);
	         System.out.println("插入内容后：" + sb.toString());
	     }
	 
	 }
