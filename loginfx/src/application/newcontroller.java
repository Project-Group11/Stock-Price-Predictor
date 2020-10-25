package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class newcontroller extends MainController implements Initializable {
@FXML LineChart<String,Number> linechart;
@FXML private Label pred;
		
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			stock= MainController.stock;
			System.out.println(stock);
			String file= "H:\\5th Sem\\Project\\Stock Predictor Final\\Final Codes\\"+stock+"_predicted.csv";
			
			try {
			FileReader filereader = new FileReader(file);
	        // create csvReader object and skip first Line 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord;
	        String predd=null;
	        while ((nextRecord = csvReader.readNext()) != null) { 
	            for (String cell : nextRecord) { 
	                 predd=cell;
	            } 
	        } 
			
	       pred.setText(predd);
			}
			catch(Exception e) {
				pred.setText("File Not Found");
			}
		} 

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
