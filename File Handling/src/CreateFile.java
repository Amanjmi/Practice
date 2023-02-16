import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f= new File("abc.text");
		System.out.println(f.exists());
		f.createNewFile();
		FileWriter f1 = new FileWriter("abc.text",true);
		f1.write("\n");
		f1.write(98);
		f1.write("\n");
		f1.write("Hello Eclipse how are you");
		f1.write("\n");
		char[] ch={'C','K','O','D','I','N','G'};
		f1.write(ch);
		f1.flush();
		f1.close();
		System.out.println("open your current directory");
	}

}
