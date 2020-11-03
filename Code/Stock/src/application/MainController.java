package application;



import java.io.FileInputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	public static String stock;
	
	@FXML
	ToggleGroup toggle;
	 @FXML
	    private AnchorPane heading;

	    @FXML
	    private Label heading2;

	    @FXML
	    private Button submit;
	    @FXML private ImageView image2;

	
	public void submit(ActionEvent e) throws FileNotFoundException {
		
		RadioButton selectedRadioButton = (RadioButton) toggle.getSelectedToggle();
		stock= selectedRadioButton.getText();
		//System.out.println(stock);
		
		try {
			System.out.println("Hello");
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		
	} 
}
