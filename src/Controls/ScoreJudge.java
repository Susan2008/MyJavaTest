/**
 * 
 */
package Controls;

/**  
 * <p>Title: ScoreJudge</p>  
 * <p>Description:IF控制语句 </p>  
 * @author 吴冬梅  
 * @date 2018年1月19日  
 */
public class ScoreJudge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=87;
		
		if(score >=60){
			if(score >=80){
				if(score >=90){
					System.out.println("成绩优异");				
				}
				else {
					System.out.println("成绩良好");
				}
				
			}
			else {
				System.out.println("成绩及格");
			}
			
		}
		else {
			System.out.println("需要补考");
		}
	}

}
