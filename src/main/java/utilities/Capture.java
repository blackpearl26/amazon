package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture {
	
	public static String dateTime()	{
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");
		LocalDateTime current = LocalDateTime.now();
		String time = current.format(d);
		return time;
	}
	
	
	public static void screenshot(WebDriver driver, String name) throws IOException	{
		String time = Capture.dateTime();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\automation\\amazon\\Screenshot\\"+name+time+".jpeg");
		FileHandler.copy(source, destination);
		
	}
	
	
	public static void main(String[] args)	{
		System.out.println(Capture.dateTime()); 
	}
	
	
	
	
	
	
	
	
	
	

}
