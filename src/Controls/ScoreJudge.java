/**
 * 
 */
package Controls;

/**  
 * <p>Title: ScoreJudge</p>  
 * <p>Description:IF������� </p>  
 * @author �ⶬ÷  
 * @date 2018��1��19��  
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
					System.out.println("�ɼ�����");				
				}
				else {
					System.out.println("�ɼ�����");
				}
				
			}
			else {
				System.out.println("�ɼ�����");
			}
			
		}
		else {
			System.out.println("��Ҫ����");
		}
	}

}
