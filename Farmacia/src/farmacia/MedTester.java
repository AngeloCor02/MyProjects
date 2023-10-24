package farmacia;
//	Infine, si implementi la classe MedTester che visualizzi un pulsante che, se premuto, 
//	mostri a video l’output delle operazioni elencate e salvi su file l’elenco dei medicinali
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Arrays;
	import java.util.Date;
	import java.util.List;
	
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;

	public class MedTester extends JFrame{

	    Medicinale m=new Medicinale("nome","azi",new Date(2040,6,5),3,new Stato("Intermedio",12));
	    Medicinale e=new Medicinale("nomeello","azi",new Date(2022,6,5),4,new Stato("Intermedio",12));
	    Medicinale d=new Medicinale("nomesi","cazi",new Date(2030,6,5),2,new Stato("Intermedio",12));

	    List<Medicinale> l=Arrays.asList(m,e,d);

	    MedSystem medicine=new MedSystem(l);

	     JButton button1;
	     JTextArea text;
	     
	     
	     

	     public MedTester(){
	         createTextArea();
	         createButton1();
	         createPanel();
	         setSize(800, 300);
	    }

	     public void createTextArea() {
	         text= new JTextArea();
	         text.setEditable(false);
	     }
	     
	     public void createButton1(){
	        button1 = new JButton("Mostra le cose");
	        class AddInterestListener implements ActionListener{
	            public void actionPerformed(ActionEvent event) {
	                text.setText("");
	                text.append("Stampa scaduti di un azienda\n");
	                for(int i=0;i<medicine.stampaScaduti("azi").size();i++){
	                    text.append(medicine.stampaScaduti("azi").get(i).toString()+"\n");
	                }
	                text.append("Stampa sperimentali intermedi\n");
	                for(int i=0;i<medicine.sperimentaliInt().size();i++){
	                    text.append(medicine.sperimentaliInt().get(i).toString()+"\n");
	                }
	                text.append("Stampa min e max\n");
	                for(int i=0;i<medicine.maxEMin().size();i++){
	                    text.append(medicine.maxEMin().get(i).toString()+"\n");
	                }
	                text.append("Stampa ordinata per nome\n");
	                for(int i=0;i<medicine.stampa().size();i++){
	                    text.append(medicine.stampa().get(i).toString()+"\n");
	                }
	            }
	        }
	        ActionListener listener = new AddInterestListener();
	            button1.addActionListener(listener);
	    }



	    public void createPanel(){
	        JPanel panel = new JPanel();
	        panel.add(button1);
	        panel.add(text);
	        add(panel);
	    }
	}

	
