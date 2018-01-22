/**
 * 
 */
package Controls;

/**  
 * <p>Title: Draw</p>  
 * <p>Description:switch语句 </p>  
 * @author 吴冬梅  
 * @date 2018年1月19日  
 */
public class Draw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		switch(num){
		case 1:
			System.out.println("恭喜你，获得了一等奖");
			break;
		case 2:
			System.out.println("恭喜你，获得了2等奖");
			break;
		case 3:
			System.out.println("恭喜你，获得了3等奖");
			break;
		default:
			System.out.println("很遗憾，下次再来");
		}
		
	}

}
