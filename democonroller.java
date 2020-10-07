package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class democonroller
{
	@SuppressWarnings("rawtypes")
	@FXML LineChart linechart1;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void btn(ActionEvent event)
	{
		XYChart.Series<String,Number> series=new XYChart.Series<String,Number>();
//	    series.getData().add(new XYChart.Data<String, Number>("Jan",200));
//	    series.getData().add(new XYChart.Data<String, Number>("Feb",400));
//	    series.getData().add(new XYChart.Data<String, Number>("Mar",300));
//	    series.getData().add(new XYChart.Data<String, Number>("Apr",100));
//	    series.getData().add(new XYChart.Data<String, Number>("May",700));
//	    series.getData().add(new XYChart.Data<String, Number>("Jun",300));
        String filename="doc/data.csv";
        File file=new File(filename);
        try
        {
        Scanner inputStream=new Scanner(file);
        while(inputStream.hasNext())
        {
        	String d1=inputStream.next();
            int d2=Integer.parseInt(inputStream.next());
        	series.getData().add(new XYChart.Data<String,Number>(d1,d2));
//        	System.out.println(d1);
        }
        inputStream.close();
        }
        catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        linechart1.getData().add(series);
	}
}
	

