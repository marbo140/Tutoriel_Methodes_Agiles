package testsCucumber.steps;

import objects.Armoire;
import objects.Vetement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class RangerVetementSteps {
	Vetement vetement; 
	Armoire armoire;
	
	@Given("j'ai un vetement de type \"(.*?)\" et de couleur \"(.*?)\" a ranger$")
	public void vetement_a_ranger(String type, String couleur) throws Throwable {
		vetement = new Vetement(type, couleur);
		System.out.println("Vetement à ranger : "+ type + " " + couleur);
	}

	@Given("^j'ai une armoire disponible$")
	public void avoir_armoire_disponible() {
		armoire = new Armoire();
		System.out.println("Armoire disponible");
	}
	
	@When("^je range le vetement dans l'armoire$")
	public void ranger_vetement_dans_armoire() {
		armoire.addVetement(vetement);
		System.out.println("Rangement du vetement dans l'armoire");
	}
  
	@Then("^l'armoire contient bien le vetement$")
	public void armoire_contient_vetement() {
		assertTrue(armoire.hasVetement(vetement));
		System.out.println("Armoire contient bien le vetement");
	}
	
	@Then("^le vetement est bien dans cette armoire$")
	public void vetement_dans_armoire() {
		assertEquals(vetement.getArmoire(), armoire);	
		System.out.println("Vetement bien dans l'armoire");
	}
}