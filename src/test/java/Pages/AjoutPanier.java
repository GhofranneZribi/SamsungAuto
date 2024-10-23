package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjoutPanier {
@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
WebElement btnacheter;
@FindBy(css = "button.btn.btn-secondary[data-dismiss='modal']")
WebElement btncontinuer;
@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
WebElement productName;
@FindBy(id="cart-block")
WebElement btnajoutPanier;

public AjoutPanier() {
	PageFactory.initElements(Config.driver, this);
}
public void ajoutproduct() throws Exception {
	Thread.sleep(3000);
	btnacheter.click();
	Config.attente(10);
	 WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15)); 
	    wait.until(ExpectedConditions.elementToBeClickable(btncontinuer));
	    btncontinuer.click();
	    btnajoutPanier.click();
}
public void verifajoutPanier(String producttitle) {
	Assert.assertEquals(producttitle, productName.getText());
	}
}
