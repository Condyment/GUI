
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;
import java.util.Vector;

public class Vectorandstuufs {
	private Vector<Integer> v = new Vector<Integer>();

 private int thespecialnumber;
	synchronized void calcprodus_printout() {

		if (v.isEmpty()) {
			try {
				wait();
				System.out.println("Almost done");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		int array[]=new int[thespecialnumber];
for(int i=0;i<thespecialnumber;i++)
{
	array[i]=v.get(i)*v.get(i);
}

try {
		Writer w = new FileWriter("out.txt");
		for(int i=0;i<thespecialnumber;i++) {
		w.write( String.valueOf(array[i]) );
		w.write("\n");
		}
		w.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
for(int i=0;i<thespecialnumber;i++)
{
	System.out.println(array[i]);
}
	System.out.println("Evrything is done");
}

	
	

	public void readstheinfile() {

		try {
			FileInputStream fileInStreamObj = new FileInputStream("in.txt");
			InputStream inStreamObject = ((InputStream) fileInStreamObj);
			Scanner sc = new Scanner(inStreamObject);
			FileInputStream fileInStreamObj1 = new FileInputStream("in.txt");
			InputStream inStreamObject1 = ((InputStream) fileInStreamObj1);
			Scanner sc1 = new Scanner(inStreamObject1);
			Scanner s = new Scanner(System.in);
			int numberoflines = 0;
			while (sc1.hasNextLine()) {

				sc1.nextLine();
				numberoflines++;
			}
			thespecialnumber=numberoflines;
			String e[] = new String[numberoflines];
			int number[] = new int[numberoflines];
			for (int i = 0; i < numberoflines; i++) {

				e[i] = sc.nextLine();

			}
			for (int i = 0; i < numberoflines; i++) {

				number[i] = Integer.parseInt(e[i]);
			}
			for (int i = 0; i < numberoflines; i++) {
				v.add(number[i]);
			}
			System.out.println(v);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
synchronized(this) {
	
	notify();
}
	}

}
