package Steps;

import Pages.CheckPage;
import Pages.ValidacaoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ValidacaoSteps {

    private static final String TITLE_PEDIDO = "Thank you for your order!";
    ValidacaoPage validacaoPage = new ValidacaoPage();

    @And("valido a compra com sucesso")
    public void validoACompraComSucesso() {
        Assert.assertEquals(validacaoPage.validacaoCompra(),TITLE_PEDIDO);
    }
}

