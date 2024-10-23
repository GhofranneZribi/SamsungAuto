package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefHomePage {
	@Given("lutilisateur est sur la page dacceuil")
	public void lutilisateur_est_sur_la_page_dacceuil() throws Exception {
	   Config.driver = new EdgeDriver();
	   Config.confedge();
	   Config.maximize();
	   Config.driver.get(Utils.getproprety("webhomelink"));
	}

	@When("lutilisateur survole sur le menu {string} et clique sur le sous menu {string}")
	public void lutilisateur_survole_sur_le_menu_et_clique_sur_le_sous_menu(String menu, String submenu) throws Exception {
		HomePage page =new HomePage();
		page.mousehoover(menu, submenu);
	}

	@Then("lutilisateur se dirige vers la page de sous menu {string}")
	public void lutilisateur_se_dirige_vers_la_page_de_sous_menu(String submenuverif) {
		HomePage page =new HomePage();
page.verifSubmenuTitle(submenuverif);
	}

}
