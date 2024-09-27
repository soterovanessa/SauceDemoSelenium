package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;


public class ValidacaoPage extends RunCucumberTest {


    @FindBy(css = "#checkout_complete_container > h2")
    private WebElement titleValidacao;


    public ValidacaoPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public String validacaoCompra(){
       return pegarTexto(titleValidacao);

    }

}
