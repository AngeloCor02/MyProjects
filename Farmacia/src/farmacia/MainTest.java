package farmacia;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;

public class MainTest {


	    public static void main(String[] args) {

	        JFrame frame = new MedTester();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	        
	        Medicinale m=new Medicinale("nome","azi",new Date(2040,6,5),3,new Stato("Intermedio",12));
		    Medicinale e=new Medicinale("nomeello","azi",new Date(2022,6,5),4,new Stato("Intermedio",12));
		    Medicinale d=new Medicinale("nomesi","cazi",new Date(2030,6,5),2,new Stato("Intermedio",12));

		    List<Medicinale> l=Arrays.asList(m,e,d);
	        
		    FileWriter w;
			
			try {
				
				w = new FileWriter("D:\\Programmazione\\JAVA\\prova.txt");

				BufferedWriter b;
				
				
				b= new BufferedWriter(w);
			
				for(int i=0;i<l.size();i++) {
					
					b.write(l.get(i) + "\n");
				
				}
				
				b.flush();
				b.close();
				
			}catch (IOException r) {
				
				
				r.printStackTrace();
				
			}
		    
		    
	        }
	
}
