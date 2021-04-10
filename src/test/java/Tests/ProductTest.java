package Tests;

import PageModel.ProductModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductTest {

    ProductModel productModel=new ProductModel();

    @Step("Kullanıcı, seçilen ürün için ürün detayda <key> tabına gider.")
    public void selectTabsNavigation(String key){
        productModel.selectTabsNavigation(key);
    }

    @Step("Kullanıcı gelen değerlendirmeler içerisinde ilk değerlendirmenin <key> butonuna basar.")
    public void selectEvaluationUseful(String key){
        productModel.selectEvaluationUseful(key);
    }

    @Step("Kullanıcı <key> yazısının geldiğini görür.")
    public void getMessage(String key){
        Assert.assertEquals("Beklenilen mesaj gelmedi",key, productModel.getMessage());
    }

    @Step("Sırala dropbox'ına tıklanır")
    public void clickSortDropbox(){
        productModel.clickSortDropBox();
    }

    @Step("Sırala dropbox'ı doğru şekilde kontrol edilir.")
    public void sortElementControl(){
        productModel.sortElementControl();
    }
}
