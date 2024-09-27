package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Runners.RunnerBase.getDriver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("que eu na tela home do site saude demo")
    public void queEuNaTelaHomeDoSiteSaudeDemo() {
        getDriver().get("https://www.saucedemo.com/");

    }

   @And("realize o login")
  public void realizeOLogin() {
       loginPage.digitaUsername();
       loginPage.digitarPassword();
       loginPage.clicarBtn();
   }

    @And("esteja na pagina de produtos")
    public void estejaNaPaginaDeProdutos() {
        loginPage.paginaProdutos();
    }
}


