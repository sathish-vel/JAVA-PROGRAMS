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
		//Read a file
		try{
			File obj = new File("newFile.txt");
			Scanner reader = new Scanner(obj);
			while(reader.hasNextline){
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(IOexception e){
			System.out.println("An Error occurred.");
			e.peintStackTrace();
		}
		
		
		
		
	}
}