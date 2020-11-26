package bluej;

import vetement_prix.Prix;

/**
 */
public class Vetement {
    private String type = "Inconnu";
    private String couleur = "Inconnu";
    //private Prix prix = null;
    private Armoire armoire = null;

    /**
     * Constructeur d'objets de classe Vetement
     */
    public Vetement(String type, String couleur) {
        this.type = type;
        this.couleur = couleur;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getCouleur() {
        return this.couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    public Armoire getArmoire() {
        return this.armoire;
    }
    
    public void setArmoire(Armoire armoire) {
    	if (this.armoire != null && this.armoire != armoire) {
    		this.armoire.removeVetement(this);
    	}
    	
    	if (armoire == null) {
    		this.armoire = null;
    		return;
    	}

    	else {
    		this.armoire = armoire;
    		this.armoire.addVetement(this);
    		
    	}
        
    }
    
    /*public void setPrix(Prix prix) {
        this.prix = prix;
    }*/

    /**
     * V�rifier les attributs du vetement et lui ajoute un prix
     * 
     * @param type le type
     * @param couleur la couleur
     * @param prix une instance de la classe Prix
     * return true si le vetement a le m�me type et la m�me couleur, false sinon
     */
    /*public boolean verifierVetement(String type, String couleur, Prix prix) {
        this.setPrix(prix);
        return this.type == type && this.couleur == couleur;
    }*/
}