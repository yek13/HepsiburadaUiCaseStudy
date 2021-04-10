package PageModel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ProductModel extends BaseModel{

    public static By productReviewsTab = By.id("productReviewsTab");
    public static By btnYes = By.xpath("(//div[@class='hermes-ReviewCard-module-tAGUS'])[1]");
    public static By lblHermesMessage = By.xpath("(//span[@class='hermes-ReviewCard-module-1ZiTv'])[1]");
    public static By lblProductRateNoReviewsYet = By.className("hermes-ProductRate-module-QusM-");
    public static By sortElements = By.xpath("//*[contains(@class,'hermes-Sort-module-2npZQ')]");
    public static By dropboxSort = By.xpath("//*[@class='hermes-Sort-module-pGjws']");

    List<WebElement> sortValue;
    List<String> sortElementsName;

    public void selectTabsNavigation(String key){
        switch (key) {
            case "Değerlendirmeler":
                scrollToElement(findElement(productReviewsTab));
                clickElement(productReviewsTab);
                break;

            default:
                System.out.println("Nothing");

            }
    }

    public void selectEvaluationUseful(String key){
        switch (key) {
            case "Evet":
                scrollToElement(findElement(btnYes));
                clickElement(btnYes);
                break;

            default:
                System.out.println("Nothing");

            }
    }

    public String getMessage(){
        return getText(lblHermesMessage);
    }

    public void clickSortDropBox(){
        clickElement(dropboxSort);
    }

    public void sortElementControl(){
        sortValue = findElements(sortElements);
        sortElementsName = new ArrayList<>();
        sortElementsName.add("En yeni değerlendirme");
        sortElementsName.add("En faydalı değerlendirme");
        sortElementsName.add("Puana göre azalan");
        sortElementsName.add("Puana göre artan");

        for (int i=0;i<sortElementsName.size();i++){
            Assert.assertEquals(sortElementsName.get(i),sortValue.get(i).getText());
        }
    }

}
