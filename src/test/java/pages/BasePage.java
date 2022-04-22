package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {

    /**Se generan los atributos necesarios que va a necesitar la clase base
     * Como lo son el Driver
     * Las esperas
     *
     */
    protected static WebDriver driver;
    private static Actions action;


    static{

        /**Se setea la ubciacion del driver se termina de instanciar al driver
         * Se asigna el tiempo de espera
         */
        System.setProperty("webdriver.chrome.driver","C:\\Driver2\\chromedriver.exe");
        ChromeOptions chromeOptions= new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    /**
     * Se inicializa el constructor de la clase base
     * @param driver
     */
    public BasePage(WebDriver driver){
        BasePage.driver = driver;


    }

    //** Metodo utilizado para navegar a la URL*/
    public static void  navigateTo(String url){
        driver.get(url);
    }

    /**Metodo que se utilizará para cerrar el navegador finalizada la corrida del caso de prueba */
    public static void closeBrowser(){
        driver.quit();
    }


    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por Xpath
     * Transformando una espera explicita en implicita
     * @return
     */
    private WebElement Find(String locator){
        return driver.findElement(By.xpath(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *ClassName*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByClassName(String locator){
        return driver.findElement(By.className(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *CssSelector*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByCssSelector(String locator){
        return driver.findElement(By.cssSelector(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *Id*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindById(String locator){
        return driver.findElement(By.id(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *LinkText*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByLinkText(String locator){
        return driver.findElement(By.linkText(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *Name*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByName(String locator){
        return driver.findElement(By.name(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *PartialLinkText*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByPartialLinkText(String locator){
        return driver.findElement(By.partialLinkText(locator));
    }

    /**Metodo que recibe como parametro un localizador de un elemento web y busca el elemento  por *TagName*
     * Transformando una espera explicita en implicita
     */
    private WebElement FindByTagName(String locator){
        return driver.findElement(By.tagName(locator));
    }

    /**
     * Metodo que localiza un elemento por xpath y realiza un click sobre el
     * @param locator
     */
    public void clickElement(String locator){
        Find(locator).click();
    }

    /**
     * Metodo que localiza un elemento por ClassName y realiza un click sobre el
     * @param locator
     */
    public void clickElementByClassName(String locator){
        FindByClassName(locator).click();
    }

    /**
     * Metodo que localiza un elemento por CssSlector y realiza un click sobre el
     * @param locator
     */
    public void clickElementByCssSelector(String locator){
        FindByCssSelector(locator).click();
    }

    /**
     * Metodo que localiza un elemento por Id y realiza un click sobre el
     */
    public void clickElementById(String locator){
        FindById(locator).click();
    }

    /**
     * Metodo que localiza un elemento por LinkText y realiza un click sobre el
     * @param locator
     */
    public void clickElementByLinkText(String locator){
        FindByLinkText(locator).click();
    }

    /**
     * Metodo que localiza un elemento por Name y realiza un click sobre el
     * @param locator
     */
    public void clickElementByName(String locator){
        FindByName(locator).click();
    }

    /**
     * Metodo que localiza un elemento por PartialLinkText y realiza un click sobre el
     * @param locator
     */
    public void clickElementByPartialLinkText(String locator){
        FindByPartialLinkText(locator).click();
    }

    /**
     * Metodo que localiza un elemento por tagName y realiza un click sobre el
     * @param locator
     */
    public void clickElementByTagName(String locator){
        FindByTagName(locator).click();
    }

    /**
     * Busca un elemento por su localizador en este caso xpath y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void write(String locator,String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso ClassName y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByClassName(String locator,String textToWrite){
        FindByClassName(locator).clear();
        FindByClassName(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso CssSelector y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByCssSelector(String locator,String textToWrite){
        FindByCssSelector(locator).clear();
        FindByCssSelector(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso Id y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeById(String locator,String textToWrite){
        FindById(locator).clear();
        FindById(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso LinkText y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByLinkText(String locator,String textToWrite){
        FindByLinkText(locator).clear();
        FindByLinkText(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso Name y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByName(String locator,String textToWrite){
        FindByName(locator).clear();
        FindByName(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso PartialLinkText y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByPartialLinkText(String locator,String textToWrite){
        FindByPartialLinkText(locator).clear();
        FindByPartialLinkText(locator).sendKeys(textToWrite);
    }

    /**
     * Busca un elemento por su localizador en este caso TagName y limpia la caja de texto
     * e ingresa el texto solicitado como parametro
     * @param locator
     * @param textToWrite
     */
    public void writeByTagName(String locator,String textToWrite){
        FindByTagName(locator).clear();
        FindByTagName(locator).sendKeys(textToWrite);
    }


    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
    }


    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }

    public void hoveOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    public void hoveOverElement02(String locator){
        action.moveToElement(FindById(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick (String locator){
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";

        return Find(cellINeed).getText();
    }

    public void setValueFromTable(String locator, int row, int column,String stringTosend){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";

        Find(cellINeed).sendKeys(stringTosend);
    }

    /**
     * @param iFrameIndex
     * Se switchea para que el driver reconosca un iFrame que es Una pagina adentro de otra pagina
     */
    public void switchToIframe(int iFrameIndex){driver.switchTo().frame(iFrameIndex);}


    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    /**
     * Se switchea para que el driver detecte el popup de alerta que inhabilita mi pantalla.
     */
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * Retorna el texto de un localizador por Xpath
     * @param locator
     * @return
     */
    public String texFromElement(String locator){
        return Find(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por ClasName se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementByClassName(String locator){
        return FindByClassName(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por CssSelector se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementByCssSelector(String locator){
        return FindByCssSelector(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por ID se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementById(String locator){
        return FindById(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por LinkTest se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementByLinkText(String locator){
        return FindByLinkText(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por Name se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementByName(String locator){
        return FindByName(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por PartialLinkText se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementByPartialLinkText(String locator){
        return FindByPartialLinkText(locator).getText();
    }

    /**
     * Retorna el texto de un localizador por Nombre del Tag se utilizará para validar
     * @param locator
     * @return
     */
    public String texFromElementTagName(String locator){
        return FindByTagName(locator).getText();
    }


    /**
     * @param locator
     * @return
     * Retorna verdadero o falso (true or false) si un elemento se encuentra Habilitado
     */
    public boolean elementEnable(String locator){
        return Find(locator).isEnabled();
    }

    /**
     * @param locator
     * @return
     * Retorna verdadero o falso (true or false) si un elemento se encuentra visible retornando verdadero si es que lo encuentra
     */
    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    /**
     * @param locator
     * @return
     * Retorna verdadero o falso (true or false) si un elemento se encuentra seleccionado retornando Verdadero si esto es de esa manera
     */
    public boolean elementIsSelected(String locator){
        return Find(locator).isSelected();
    }

    /**
     * @param locator
     * @return
     *
     * Retorna un lista de elementos si se cumple la condicion de ser por Nombre de clase
     */
    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    /**
     *  Retorna un lista de elementos si se cumple la condicion de ser por ID
     * @param locator
     * @return
     */
    public List<WebElement> bringMeAllElementsById(String locator){
        return driver.findElements(By.id(locator));
    }

    /**
     * Falta completar esta funcion esta parte
     * @param index
     */

    public List<WebElement> bringMeAllElementsByXpath(String locator,int index){
        return driver.findElements(By.xpath(locator));
    }

    public List<WebElement> bringMeAllElementsByCssSelector(String locator,int index){
        return driver.findElements(By.cssSelector(locator));
    }

    public List<WebElement> bringMeAllElementsByTagName(String locator,int index){
        return driver.findElements(By.tagName(locator));
    }

}
