package testsCucumber.steps;


import objects.Vetement;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class ConcevoirVetementSteps {
	Vetement vetement; 
	
	@Given("^j'ai une idee de vetement a creer$")
	public void idee_de_vetement() throws Throwable {
		System.out.println("Idee de vetement");
	}
	
	@Given("^j'ai cree un vetement de type \"(.*?)\" et de couleur \"(.*?)\"$")
	@When("^je cree le vetement avec pour type \"(.*?)\" et pour couleur \"(.*?)\"$")
	public void cree_vetement(String type, String couleur) {
		vetement = new Vetement(type, couleur);
		System.out.println("Vetement créé : "+ type + " " + couleur);
	}
	
	@When("^je transforme son/sa \"(.*?)\" pour \"(.*?)\"$")
	public void transforme_vetement(String caracteristique, String valeur) {
		if (caracteristique == "type") {
			vetement.setType(valeur);	
		}
			
		if (caracteristique == "couleur") {
			vetement.setCouleur(valeur);
		}
		
		System.out.println("Caractéristique "+ caracteristique + " transformée");
	}
  
	@Then("^j'obtiens un vetement de type \"(.*?)\" et de couleur \"(.*?)\"$")
	public void obtiens_vetement(String type, String couleur) {
		assertEquals(vetement.getType(), type);
		assertEquals(vetement.getCouleur(), couleur);
		System.out.println("Vetement conforme");
	}
	
	@Then("^le vetement a bien pour \"(.*?)\" \"(.*?)\"$")
	public void caracteristique_vetement_transforme(String caracteristique, String valeur) {
		if (caracteristique == "type") {
			assertEquals(vetement.getType(), valeur);	
		}
	
		if (caracteristique == "couleur") {
			assertEquals(vetement.getCouleur(), valeur);
		}
		
		System.out.println("Vetement transformé conforme");
	}
}