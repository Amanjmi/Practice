import java.io.File;

public class Launch1 {

	public static void main(String[] args) {
		int filecount=0;
		int dircount =0;
		String Location="D:\\Software\\JAVA nippets questions\\Snippets";
				File f =new File("Location");
				String[] Name=f.list();
				for(String names : Name) {
					File f1 =new File(f,names);
					if(f1.isFile())
						filecount++;
					if(f1.isDirectory())
						dircount++;
					System.out.println(names);
					System.out.println("Filecount "+ filecount);
					System.out.println("Dircount " + dircount);
	}
	}
}
