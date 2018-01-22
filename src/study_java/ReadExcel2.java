package study_java;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel2 {
	
	public  static  List<List<String>>  addExcel() throws Throwable{
		 jxl.Workbook readwb = null;    
       InputStream instream = new FileInputStream("c:\\Æ»¹û.xls");   
       readwb = Workbook.getWorkbook(instream);   
       Sheet readsheet = readwb.getSheet(0);      
       int rsColumns = readsheet.getColumns();        
       int rsRows = readsheet.getRows(); 
       List<List<String>> list2 = new ArrayList<List<String>>();      

       for(int column = 1;column < rsColumns;column ++)
       {
       	ArrayList<String> list1=new ArrayList<String>();
       
       	for(int row = 1;row < rsRows;row ++)
       	{
       		Cell cell = readsheet.getCell(column, row);
       		String content = cell.getContents();

        		if(content == null|| content.isEmpty())
       		{
       			continue;
       		}
        		
        		if(content!=null){
        			list1.add(content);
        		}
	 	
       	}

       	 list2.add(list1);
       }
       System.out.println(list2);
       System.out.println(list2.size());
       return list2;	
	} 
	  
	public static void main(String[] args) throws Throwable {
		addExcel();
	}
}

