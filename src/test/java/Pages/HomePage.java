package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;


public class HomePage extends RunCucumberTest {

    @FindBy(css = "#item_1_title_link > div")
    private  WebElement item1;

    @FindBy(css = "#item_0_title_link > div")
    private WebElement item2;

    @FindBy(id = "add-to-cart")
    private WebElement addCart;

    @FindBy (id = "back-to-products")
    private WebElement backProducts;

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void itemTshirt(){
        clicar(item1);
        clicar(addCart);
       clicar(backProducts);
    }
    public void bikeLigth(){
        clicar(item2);
        clicar(addCart);

    }

}