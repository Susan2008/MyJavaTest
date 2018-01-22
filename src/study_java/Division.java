/**
 * 
 */
package study_java;

/**  
 * <p>Title: Division</p>  
 * <p>Description:字符串分割，将分割的字符串依次打印出来 </p>  
 * @author 吴冬梅  
 * @date 2018年1月18日  
 */
public class Division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abd,cde,fgh,hij");
		String []news=s.split(",");
		
		System.out.println("按分割符分割后的字符串是：");
		for(int i=0;i<news.length;i++){
			System.out.println(news[i]);
		}
		
		String []new2=s.split(",", 2);
		System.out.println("按分割符分割后的字符串是：");
		for(int j=0;j<new2.length;j++){
			System.out.println(new2[j]);
		}
	}

}
