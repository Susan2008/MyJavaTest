/**
 * 
 */
package study_java;

/**  
 * <p>Title: Division</p>  
 * <p>Description:�ַ����ָ���ָ���ַ������δ�ӡ���� </p>  
 * @author �ⶬ÷  
 * @date 2018��1��18��  
 */
public class Division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abd,cde,fgh,hij");
		String []news=s.split(",");
		
		System.out.println("���ָ���ָ����ַ����ǣ�");
		for(int i=0;i<news.length;i++){
			System.out.println(news[i]);
		}
		
		String []new2=s.split(",", 2);
		System.out.println("���ָ���ָ����ַ����ǣ�");
		for(int j=0;j<new2.length;j++){
			System.out.println(new2[j]);
		}
	}

}
