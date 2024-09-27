package Steps;

import Pages.CheckPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static Runners.RunnerBase.getDriver;

public class CheckSteps {

    CheckPage checkPage = new CheckPage();

    @And("clico no botao do menu checkout")
    public void clicoNoBotaoDoMenuCheckout() {
        checkPage.carrinhoCheckout();
    }

    @Then("realizo a compra")
    public void realizoACompra() {
        checkPage.botaoCheckout();
        checkPage.inserirName();
        checkPage.inserirLast();
        checkPage.inserirZipCode();
        checkPage.btnContinue();
         checkPage.compraFinalizada();
    }
}
