package webbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrome {
public static <WebDriver> void main(String[] args) {
	
		
		WebDriver driver = new WebDriver();
		driver.get("https://orangehrm.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement element:links) {
			
		
			
			String linkname = element.getText();
			System.out.println(element.getText());
			
			
		
		
		
		
		
	}


	


	}



}
		
		

	}

}
