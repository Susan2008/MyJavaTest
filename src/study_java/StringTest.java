/**
 * 
 */
package study_java;

/**  
 * <p>Title: StringTest</p>  
 * <p>Description: </p>  
 * @author 吴冬梅  
 * @date 2018年1月18日  
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Java World!";
		String s1 = " sun java ";
		System.out.println(s.startsWith("Welcome"));//字符串以Welcome开头
		System.out.println(s.endsWith("World"));//字符串以World结尾
		String sL = s.toLowerCase();//全部转换成小写
		String sU = s.toUpperCase();//全部转换成大写
		System.out.println(sL);
		System.out.println(sU);
		String b = s.substring(11);//从第十一位开始
		System.out.println(b);
		String c = s.substring(8,11);//从第八位开始在第十一位结束
		System.out.println(c);
		String d = s1.trim();//去掉首尾的空格
		System.out.println(d);
		String s2 = "我是程序员，我在学java";
		String e = s2.replace("我","你");
		System.out.println(e);
		int f = 5;
		String s3 = String.valueOf(f);
		System.out.println(s3);
		String s4 = "我是,这的,大王";
		String[] g = s4.split(",");
		System.out.println(g[0]);
	}

}
