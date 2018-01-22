package study_java;

import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class readExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jxl.Workbook readwb=null;
		try{
			//构建Workbook对象, 只读Workbook对象  
			 //直接从本地文件创建Workbook  
			//从输入流创建Workbook 
			InputStream instream=new FileInputStream("C:/苹果.xls");
			readwb=Workbook.getWorkbook(instream);
			//获取第一张sheet表,sheet的下标是从0开始
			Sheet readsheet=readwb.getSheet(0);
		
			//获取sheet表中包含的总列数  
			int Coulums=readsheet.getColumns();

			//获取sheet表中的总行数
			int Rows=readsheet.getRows();
	
			for(int coulum=0;coulum<Coulums;coulum++)
			{
				for(int row=0;row<Rows;row++)
				{
					Cell cell=readsheet.getCell(coulum, row);
			
					String content=cell.getContents();
			
					if(content == null|| content.isEmpty())
					{
						continue;
					}
					System.out.println(cell.getContents()+"");
					
					
				}
				System.out.println();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
