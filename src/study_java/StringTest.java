/**
 * 
 */
package study_java;

/**  
 * <p>Title: StringTest</p>  
 * <p>Description: </p>  
 * @author �ⶬ÷  
 * @date 2018��1��18��  
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Java World!";
		String s1 = " sun java ";
		System.out.println(s.startsWith("Welcome"));//�ַ�����Welcome��ͷ
		System.out.println(s.endsWith("World"));//�ַ�����World��β
		String sL = s.toLowerCase();//ȫ��ת����Сд
		String sU = s.toUpperCase();//ȫ��ת���ɴ�д
		System.out.println(sL);
		System.out.println(sU);
		String b = s.substring(11);//�ӵ�ʮһλ��ʼ
		System.out.println(b);
		String c = s.substring(8,11);//�ӵڰ�λ��ʼ�ڵ�ʮһλ����
		System.out.println(c);
		String d = s1.trim();//ȥ����β�Ŀո�
		System.out.println(d);
		String s2 = "���ǳ���Ա������ѧjava";
		String e = s2.replace("��","��");
		System.out.println(e);
		int f = 5;
		String s3 = String.valueOf(f);
		System.out.println(s3);
		String s4 = "����,���,����";
		String[] g = s4.split(",");
		System.out.println(g[0]);
	}

}
