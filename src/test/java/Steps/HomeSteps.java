package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Runners.RunnerBase.getDriver;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @When("seleciono a blusa bolt TShirt")
    public void selecionoABlusaBoltTShirt() {
        homePage.itemTshirt();
    }

    @And("seleciono uma bike light")
    public void escolhoUmaBikeLigth() {
        homePage.bikeLigth();
    }

    @And("clico no botao adcionar ao carrinho")
    public void clicoNoBotaoAdcionarAoCarrinho() {

    }

}


