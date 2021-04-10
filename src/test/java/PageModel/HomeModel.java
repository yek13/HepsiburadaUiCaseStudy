package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HomeModel extends BaseModel {

    public static By txtSearchBar = By.xpath("//input[@class='desktopOldAutosuggestTheme-input']");

    public void userVisitSite(String key){
        webDriver.get(key);
    }

    public void setSearchBar(String key){
        sendKeys(txtSearchBar,key);
        webDriver.findElement(txtSearchBar).sendKeys(Keys.ENTER);

    }

}
