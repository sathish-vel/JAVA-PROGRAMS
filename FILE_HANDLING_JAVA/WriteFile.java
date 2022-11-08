import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class WriteFile{
	public static void main(String args[]){
		//Write a file
		try{
		
			FileWriter myWriter = new FileWriter("newFile.txt");
			myWriter.write("Hiii iam writting something about java, java is high level programing language. ");
			myWriter.close();
			System.out.println("success fully wrote to the file");
		}
		catch(IOException e){
			System.out.println("An Error occurred");
			e.printStackTrace();
		}		
	}
}