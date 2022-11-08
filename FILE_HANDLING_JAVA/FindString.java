import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
class FindString{
	public static void main(String args[]){
	
		//Read a file and find the word of "java"
		try{
			FileReader fr=new FileReader("newFile.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			if(line.indexOf("java")!=-1) {
				System.out.println("java Available"); 
			}
			else { System.out.println("Not Available"); }
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}