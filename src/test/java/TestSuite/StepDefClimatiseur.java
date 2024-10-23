package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.ClimatiseurPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClimatiseur {
	@Given("lutilisateur est sur Climatiseur")
	public void lutilisateur_est_sur_climatiseur() throws Exception {
		 Config.driver = new EdgeDriver();
		   Config.confedge();
		   Config.maximize();
		   Config.driver.get(Utils.getproprety("ClimatiseurLink"));
	}

	@When("lutilisateur  clique sur le produit {string}")
	public void lutilisateur_clique_sur_le_produit(String nameproduct) throws Exception {
		ClimatiseurPage page=new ClimatiseurPage();
		page.clickOnProductByName(nameproduct);
	}

	@Then("lutilisateur se dirige vers la page du produit {string}")
	public void lutilisateur_se_dirige_vers_la_page_du_produit(String titleproduct) {
		ClimatiseurPage page=new ClimatiseurPage();
page.verifproductTitle(titleproduct);
	}

}
