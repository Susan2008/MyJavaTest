/**
 * 
 */
package study_java;

/**  
 * <p>Title: MyString_test</p>  
 * <p>Description: �ַ������÷���</p>  
 * @author �ⶬ÷  
 * @date 2018��1��8��  
 */
public class MyString_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring="Hello a world abc";
		int size1=mystring.length();
		System.out.println("mystring�ĳ�����   "+size1);
		System.out.println("mystringת����Сд�Ľ����    "+mystring.toLowerCase());
		System.out.println("mystringת���ɴ�д�Ľ����    "+mystring.toUpperCase());
		System.out.println("mystring�滻��ĸ�Ľ����    "+mystring.replace('a', 'Y'));
		System.out.println("mystring�в���w��ĸ��������    "+mystring.indexOf('w'));
		//�����ң���������1�������ұ߽粻��������9  
		String str=mystring.substring(1, 9);
		//������Ϊ4������4��ʼ�и4֮ǰ�Ĳ�Ҫ  
		String str1=mystring.substring(4);
		System.out.println("mystring�и������ַ�����   "+str);
		System.out.println("mystring������4��ʼ�и������ַ�����   "+str1);	
	    //lastIndexOf�пո񣨡����������ֵ�λ��  �ȼ������ַ�������
		System.out.println("mystring�пո�λ��   "+mystring.lastIndexOf(""));	
	}

}
