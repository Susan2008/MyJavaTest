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
			//����Workbook����, ֻ��Workbook����  
			 //ֱ�Ӵӱ����ļ�����Workbook  
			//������������Workbook 
			InputStream instream=new FileInputStream("C:/ƻ��.xls");
			readwb=Workbook.getWorkbook(instream);
			//��ȡ��һ��sheet��,sheet���±��Ǵ�0��ʼ
			Sheet readsheet=readwb.getSheet(0);
		
			//��ȡsheet���а�����������  
			int Coulums=readsheet.getColumns();

			//��ȡsheet���е�������
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
