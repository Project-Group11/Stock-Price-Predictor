package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class newcontroller {
@FXML LineChart<String,Number> linechart;
	
	public void btn(ActionEvent e) throws IOException, CsvException {	
		linechart.getData().clear();
		
		System.out.println("Hello");
		 
	        // Create an object of file reader 
	        // class with CSV file as a parameter. 
	        String file= "H:\\5th Sem\\Project\\Stock Predictor Final\\Final Codes\\ITC.NS.csv";
			FileReader filereader = new FileReader(file);
	        
	  
	        // create csvReader object and skip first Line 
	        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build(); 
	        List<String[]> allData = csvReader.readAll(); 
	  
	        // print Data 
	        XYChart.Series<String, Number> series= new XYChart.Series<String, Number>();
	        for (int i= allData.size()-10; i<allData.size(); i++) { 
	        	series.getData().add(new XYChart.Data<String, Number>(allData.get(i)[0], Float.parseFloat(allData.get(i)[1])));
	        } 
		
		linechart.getData().add(series);
	}
}
