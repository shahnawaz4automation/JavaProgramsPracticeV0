package java_programs_practice_082024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo030824 {
	public static void main(String[] args) throws IOException {
		File file = new File(".\\newFile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Created new file");
		}
		else {
			System.out.println("File already exists");
		}
		FileWriter fi = new FileWriter(file);
		fi.write("Hi \n");
		fi.write("This is shahnawaz");
		fi.flush();
		
		//fi.close();
		
		FileReader fo = new FileReader(file);
		System.out.print((char)fo.read());
		System.out.println((char)fo.read());
		file.delete();
		
		File file1 = new File(".\\newFile1.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		String s = "My name is shahnawazm";
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
		FileInputStream fis = new FileInputStream(file1);
		int i = fis.read();
		
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
			
	}
}