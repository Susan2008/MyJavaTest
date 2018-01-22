package study_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		String time = df.format(day);
		System.out.println(time);   
		
	}

}
