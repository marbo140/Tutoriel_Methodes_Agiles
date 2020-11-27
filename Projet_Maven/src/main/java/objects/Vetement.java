package objects;

/**
 */
public class Vetement {
    private String type = "Inconnu";
    private String couleur = "Inconnu";
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

}