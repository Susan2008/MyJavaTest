/**
 * 
 */
package study_java;

/**  
 * <p>Title: StringBufferTest</p>  
 * <p>Description: ����StringBuffer���滻����</p>  
 * @author �ⶬ÷  
 * @date 2018��1��10��  
 */
public class StringBufferTest {
	 
	    public static void main(String[] args) {
	          String s = "0123456|78987|6543210"; // ԭʼstring
	          String re = "78987";// ԭʼstring����Ҫ���滻������
	          String s_re1 = "789-987";// ������1
	          String s_re2 = "7890987";// ������2
	 
	          StringBuffer sb = new StringBuffer(s);// ����һ��StringBuffer
	          System.out.println("�滻ǰ��" + sb.toString());
	
             //ʹ��replace��ʽ�滻
	         int size = re.length();// ��ȡre�ĳ���
	         int p = sb.lastIndexOf(re); // ��ȡre��ԭʼstring�е���ʼλ��
	         sb.replace(p, p + size, s_re1);// ��ʼ�滻
	         System.out.println("��һ���滻��" + sb.toString());
	
	         // ��delete��insert��ʽ�滻
	         int length = s_re1.length();
	         int pIndex = sb.lastIndexOf(s_re1);
	         sb.delete(pIndex, pIndex + length);
	         System.out.println("ɾ�����ݺ�" + sb.toString());
             sb.insert(pIndex, s_re2);
	         System.out.println("�������ݺ�" + sb.toString());
	     }
	 
	 }
