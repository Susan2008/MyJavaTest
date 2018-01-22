package study_java;

import java.io.File;

public class MKfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File logFile=new File("E://logFile.txt");
		if(!logFile.exists()){
			try{
				logFile.createNewFile();
			}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		else {
			System.out.println("文件已存在");
		}
			
		}
	}


