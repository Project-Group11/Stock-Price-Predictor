package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Vector;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class newcontroller extends MainController implements Initializable {
@FXML LineChart<String,Number> linechart;
@FXML Label pred;
@FXML Label pred2;
@FXML ImageView predicted;
@FXML ImageView accuracy_graph;
@FXML ImageView predictedjoin;
		
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			stock= MainController.stock;
			System.out.println(stock);
//			String file= "src/model_data/"+stock+"_predicted.csv";
//			Image image1 = new Image("C:/Users/Harman"+stock+"_actual_graph.png");
//			Image image2 = new Image("C:/Users/Harman"+stock+"_accuracy_graph.png");
			
//			try {
//			//actual_graph= new ImageView();
//			actual_graph.setImage(image1);
//			accuracy_graph.setImage(image2);
////			FileReader filereader = new FileReader(file);
////	        // create csvReader object and skip first Line 
////	        CSVReader csvReader = new CSVReader(filereader); 
////	        String[] nextRecord;
////	        String predd=null;
////	        while ((nextRecord = csvReader.readNext()) != null) { 
////	            for (String cell : nextRecord) { 
////	                 predd=cell;
////	            } 
////	        } 
//			String file= "C:\\Users\\Harman\\modeldata\\"+stock+"_predicted.csv";
			try {
				FileInputStream inputstream1 = new FileInputStream("C:\\Users\\Harman\\modeldata\\"+stock+"predicted.png");
				FileInputStream inputstream2 = new FileInputStream("C:\\Users\\Harman\\modeldata\\"+stock+"accuracy_graph.png");
				FileInputStream inputstream3 = new FileInputStream("C:\\Users\\Harman\\modeldata\\"+stock+"predictedjoin.png");
//				FileReader filereader = new FileReader(file);
//				@SuppressWarnings("resource")
//				CSVReader csvReader = new CSVReader(filereader); 
                String predd=null;
//                Vector<String> v=new Vector();
				Scanner sc = new Scanner(new File("C:\\Users\\Harman\\modeldata\\"+stock+"_predicted.csv"));  
				sc.useDelimiter("\n");   //sets the delimiter pattern  
				while (sc.hasNext())  //returns a boolean value  
				{ 

				  predd=sc.next();//find and returns the next complete token from this scanner  
				} 
//				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
//
//				LocalDateTime now = LocalDateTime.now(); 
//				System.out.println(now);
				Date dNow = new Date();
			    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
				predd=ft.format(dNow).toString()+" - "+predd.substring(0,7);
//						" "+predd.substring(0,5);
//				predd=sc.next();
//				predd=v.elementAt(v.size()-1)
				
				System.out.println(predd);
                String predd2=null;
				Scanner sc1 = new Scanner(new File("C:\\Users\\Harman\\modeldata\\"+stock+"_predicteddays.csv"));  
				sc1.useDelimiter("\n");   //sets the delimiter pattern  
				while (sc1.hasNext())  //returns a boolean value  
				{  
				  
				  predd2=sc1.next();  //find and returns the next complete token from this scanner  
				} 
				Date dNow1 = new Date(System.currentTimeMillis() + 86400 * 1000 * 7);
			    SimpleDateFormat ft1 = new SimpleDateFormat ("dd/MM/yyyy");
				predd2=ft.format(dNow1).toString()+" - "+predd2.substring(0,7);
				
//				predd2=sc1.next();
				System.out.println(predd2);				
//				String[] nextRecord;
//      	        String predd=null;
//      	      System.out.println("here");
//      	      while ((nextRecord = csvReader.readNext()) != null) { 
//	            for (String cell : nextRecord) { 
//	                 predd=cell;
//	            } 
//      	      }
	            pred.setText(predd);
	            pred2.setText(predd2);
//	            System.out.println(predd);
				Image image1 = new Image(inputstream1); 
				Image image2 = new Image(inputstream2);
				Image image3 = new Image(inputstream3);
				predicted.setImage(image1);
				accuracy_graph.setImage(image2);
				predictedjoin.setImage(image3);
				
//				ImageView imageView = new ImageView(image2);
//				image.setX(50); 
//			      image.setY(25); 
//			      
//			      //setting the fit height and width of the image view 
//			    image.setFitHeight(455); 
//			      image.setFitWidth(500); 
//			      
//			      //Setting the preserve ratio of the image view 
//			      image.setPreserveRatio(true); 
////			      Group root = new Group(imageView);  
//			      
//			      //Creating a scene object 
////			      Scene scene = new Scene(root, 600, 500);  
//			      
//			      //Setting title to the Stage 
////			      stage.setTitle("Loading an image");  
//			      
//			      //Adding scene to the stage 
//			      image.setImage(image2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
//	       pred.setText(predd);
//			}
//			catch(Exception e) {
//				pred.setText("File Not Found");
//			}
//		} 

	public void btn(ActionEvent e) throws IOException, CsvException {	
		//linechart.getData().clear();
		
		
		 
	        // Create an object of file reader 
	        // class with CSV file as a parameter. 
		
		
       
       
	  
	        // print Data 
	        //XYChart.Series<String, Number> series= new XYChart.Series<String, Number>();
	        //for (int i= allData.size()-10; i<allData.size(); i++) { 
	        	//series.getData().add(new XYChart.Data<String, Number>(allData.get(i)[0], Float.parseFloat(allData.get(i)[1])));
	        //} 
		
		//linechart.getData().add(series);
	}
}