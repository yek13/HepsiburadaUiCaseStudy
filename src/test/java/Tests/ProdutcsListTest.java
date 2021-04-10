package Tests;

import PageModel.ProductsListModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProdutcsListTest {


    ProductsListModel productListModel=new ProductsListModel();

    @Step("Listelenen ürünler arasından rastgele ürün seçilir.")
    public void selectRandomProduct(){
        productListModel.selectRandomProduct();
    }

    @Step("Aranan ürünün geldiği görülür.")
    public void isTrueSearchedProduct(){
        Assert.assertTrue("Aranan urun gelmedi",productListModel.isTrueSearchedProduct());

    }

}
