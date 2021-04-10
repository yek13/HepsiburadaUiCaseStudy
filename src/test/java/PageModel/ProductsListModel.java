package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsListModel extends BaseModel {
    public static By productsList = By.xpath("//*[@class='search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex']");
    public static By searchBoxOld = By.xpath("//*[@id='SearchBoxOld']//input");
    public static By keyword = By.className("keyword");

    List<WebElement> product;

    Random random =new Random();

    public void selectRandomProduct(){
        product = findElements(productsList);
        int productNumber = random.nextInt(product.size());
        clickElement(product.get(productNumber));

    }
    public boolean isTrueSearchedProduct() {
        if (getAttribute(searchBoxOld,"value").contains(getText(keyword))) {
            return true;
        }
        return false;
    }


}
