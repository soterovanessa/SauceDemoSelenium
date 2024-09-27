@sauceDemo
Feature: Teste Automacao


  Scenario: Validar o fluxo de compra

    Given que eu na tela home do site saude demo
    And  realize o login
    And esteja na pagina de produtos
    When seleciono a blusa bolt TShirt
    And  seleciono uma bike light
    And  clico no botao adcionar ao carrinho
    And clico no botao do menu checkout
    Then realizo a compra
    And valido a compra com sucesso

