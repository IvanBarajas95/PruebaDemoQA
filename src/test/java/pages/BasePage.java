package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage  extends Method {
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement name;
    @FindBy(xpath= "//input[@id='lastName']")
    private WebElement apellido;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    private WebElement gendermale;
    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement uploadPicture;

    String imagen = "C:\\Users\\ivano\\OneDrive\\Escritorio\\programming.jpg";

    public void form(){
        WAIT_INTERFACE.waitForElementToClickeable(10,2,name);
        SEN_KEYS_INTERFACE.sendKeys(name,"Ivan");
        WAIT_INTERFACE.waitForElementToClickeable(10,2,apellido);
        SEN_KEYS_INTERFACE.sendKeys(apellido,"Barajas");
        WAIT_INTERFACE.waitForElementToClickeable(10,2,gendermale);
        UTILS_INTERFACE.clickElement(gendermale);
        UTILS_INTERFACE.scrollIntoView(uploadPicture);
        SEN_KEYS_INTERFACE.sendKeys(uploadPicture,imagen);
        WAIT_INTERFACE.waitForElementToClickeable(10,2,uploadPicture);
        //uploadPicture.sendKeys(imagen);

    }
}
