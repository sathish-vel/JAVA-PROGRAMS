import java.io.File;
import java.io.IOException;

class CreateFile{
	public static void main(String args[]){
		//Create a file
		try{
			File obj = new File("F:/JAVA PROGRAMS/Basics_Programs/file_handling/newFile1.txt");
			if(obj.createNewFile()){
				System.out.println("File created: " + obj.getName());
			}
			else
				System.out.println("File already exists.");
		}
		catch(IOException e){
			System.out.println("An Error occurred");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}