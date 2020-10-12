package application;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;

import com.opencsv.CSVReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	
	@FXML
	public ComboBox<String> combobox;
	
	ObservableList<String> list= FXCollections.observableArrayList("FB","Google","Microsoft");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		combobox.setItems(list);
	}
	
	public void submit(ActionEvent e) throws FileNotFoundException {
		//String stock= combobox.getValue();
		//System.out.println(stock);
		
		try {
			Stage primaryStage = new Stage();
			Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("application/new_window.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception ef) {
			ef.printStackTrace();
		}
		
		//CSVReader reader= new CSVReader(new FileReader("H:\\5th Sem\\Project\\Stock Predictor Final\\Final Codes\\"+stock+".csv"));
		//String[] nextLine;	
	} 
}
