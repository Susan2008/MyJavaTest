/**
 * 
 */
package study_java;

/**  
 * <p>Title: MyString_test</p>  
 * <p>Description: 字符串常用方法</p>  
 * @author 吴冬梅  
 * @date 2018年1月8日  
 */
public class MyString_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring="Hello a world abc";
		int size1=mystring.length();
		System.out.println("mystring的长度是   "+size1);
		System.out.println("mystring转换成小写的结果是    "+mystring.toLowerCase());
		System.out.println("mystring转换成大写的结果是    "+mystring.toUpperCase());
		System.out.println("mystring替换字母的结果是    "+mystring.replace('a', 'Y'));
		System.out.println("mystring中查找w字母的索引是    "+mystring.indexOf('w'));
		//从左到右，包括索引1，但是右边界不包含索引9  
		String str=mystring.substring(1, 9);
		//从索引为4，包含4开始切割，4之前的不要  
		String str1=mystring.substring(4);
		System.out.println("mystring切割后的新字符串是   "+str);
		System.out.println("mystring从索引4开始切割后的新字符串是   "+str1);	
	    //lastIndexOf中空格（“”）最后出现的位置  等价于求字符串长度
		System.out.println("mystring中空格位置   "+mystring.lastIndexOf(""));	
	}

}
