package Pages;

import Runners.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;


public class LoginPage extends RunCucumberTest {

    @FindBy(id = "user-name")
    private WebElement txtUsername;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    @FindBy(css = "#[data-test='primary-header']")
    private WebElement btnProdutos;

    @FindBy(className = "app_logo")
    private WebElement validLogo;

    //WebElement logo = getDriver().findElement(By.className("Swag Labs"));

    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void digitaUsername(){
        digitar(txtUsername, "standard_user");
    }

    public void digitarPassword(){
        digitar(txtPassword, "secret_sauce");
    }

    public void clicarBtn(){
        clicar(btnLogin);
    }

    public void paginaProdutos(){
      clicar(validLogo);
    }
}