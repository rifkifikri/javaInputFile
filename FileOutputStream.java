import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStream extends BacaFile{
	
	public static void main(String[] args) {
		FileOutputStream file= new FileOutputStream();
		Scanner input= new Scanner(System.in);
		
		try {
			File myFile= new File(file.draf());
			
			String fileTmp="",fileTmp2="", inputan,inputan2;
			
			System.out.print("masukkan inputan nama : ");
			inputan=input.nextLine();
			System.out.print("masukkan inputan NBI : ");
			inputan2=input.nextLine();
			FileWriter fileWriter = new FileWriter(myFile);
			fileTmp=inputan;
			fileTmp2=inputan2;
			fileWriter.write("Nama : "+fileTmp);
			fileWriter.write("\nNBI : "+fileTmp2);
			
			fileWriter.close();
			
			Scanner filereader =new Scanner(myFile);
			
			while(filereader.hasNextLine()) {
				String data= filereader.nextLine();
				
				System.out.println(data);
				
			}
			filereader.close();
		}catch(IOException e) {
			System.out.println("terjadi kesalahan"+ e.getMessage());
		}
	}
}
