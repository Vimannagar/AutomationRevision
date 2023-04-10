package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		System.out.println("first line of code");
		
		
		String path = "F:\\Desktop\\VimanNagar\\16 sdhfkjdshkfjskdfApr\\Automation Testing.docx";
		
		FileInputStream fis = new FileInputStream(path);
		
		System.out.println("last line of code");
	}

}
