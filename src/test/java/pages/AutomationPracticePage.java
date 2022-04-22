package pages;

public class AutomationPracticePage extends BasePage{
    /**
     * Se inicializa el constructor de la clase base
     *
     *
     */
    public AutomationPracticePage() {
        super(driver);
    }

    String searchBox = "search_query_top";
    String allElements = "homefeatured";
    String searchClick = "//*[@id='searchbox']/button";
    String imagenClick = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img";

    String addCartBoton = "//*[@id='add_to_cart']";
    String addCrartBoton2 = "//*[@id='add_to_cart']/button";

    public void navegarApagina(){
        navigateTo("http://automationpractice.com/index.php");
    }

    public void clickBox (String ropa){
        writeById(searchBox, ropa);
    }

    public void clickElement(){

        clickElement(searchClick);
    }

    public void clickImagen(){
        clickElement(imagenClick);
    }

    public void switchPanel(){
        switchToIframe(0);
    }

    public void clickAddCart(){
        clickElement(addCartBoton);
    }

    public void clickAddCart2(){
        clickElement(addCrartBoton2);
    }
}
