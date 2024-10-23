package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefAjoutPanier {
	@Given("lutilisateur est sur la page du produit")
	public void lutilisateur_est_sur_la_page_du_produit() throws Exception {
		 Config.driver = new EdgeDriver();
		   Config.confedge();
		   Config.maximize();
		   Config.driver.get(Utils.getproprety("ajoutpanierlink"));
	}

	@When("lutilisateur  clique sur le bouton {string} et clique sur {string}")
	public void lutilisateur_clique_sur_le_bouton_et_clique_sur(String string, String string2) throws Exception {
		AjoutPanier page =new AjoutPanier();
		page.ajoutproduct();
	}

	@Then("Le produit est ajouter au panier {string}")
	public void le_produit_est_ajouter_au_panier(String producttitlee) {
		AjoutPanier page =new AjoutPanier();
page.verifajoutPanier(producttitlee);
	}


}
