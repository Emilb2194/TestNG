Feature: Navegar y comprar

  Se procede a comprar

  #noinspection GherkinBrokenTableInspection
  @IniciarCompra
  Scenario Outline: Ejemplo de login

    Given Navegar a la pagina de comprar
    When Ingresar <Ropa> buscarla y hacer click sobre ella


    Examples: Datos

      |Ropa|
      |T-shirts|