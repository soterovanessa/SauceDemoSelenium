package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;


public class CheckPage extends RunCucumberTest {

    @FindBy(css = "#shopping_cart_container > a")
    private WebElement btnCarrinhocheckOut;

    @FindBy(id = "checkout")
    private WebElement btnCheckout;

    @FindBy(css = "#first-name")
    private WebElement checkName;

    @FindBy(id = "last-name")
    private  WebElement checkLast;

    @FindBy(id = "postal-code")
    private WebElement checkCode;

    @FindBy(id = "continue")
    private WebElement checkContinue;

    @FindBy(id = "finish")
    private WebElement btnCompra;


    public CheckPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void carrinhoCheckout(){
        clicar(btnCarrinhocheckOut);
    }

    public void botaoCheckout(){
        clicar(btnCheckout);
    }

    public void inserirName(){
        digitar(checkName, "Rosa");
    }

    public void inserirLast(){
        digitar(checkLast, "Lilás");
    }

    public void inserirZipCode(){
        digitar(checkCode,"55024740");
    }

    public void btnContinue(){
        clicar(checkContinue);
    }

    public void compraFinalizada(){
        clicar(btnCompra);
    }
}
