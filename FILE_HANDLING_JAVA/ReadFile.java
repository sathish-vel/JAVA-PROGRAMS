import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class ReadFile{
	public static void main(String args[]){
	
		//Read a file
		try{
			File obj = new File("newFile.txt");
			Scanner reader = new Scanner(obj);
			while(reader.hasNextLine()){
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("An Error occurred.");
			e.printStackTrace();
		}
		
		
		
		
	}
}