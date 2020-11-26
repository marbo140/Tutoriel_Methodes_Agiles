package classes;

/**
 */
public class Vetement
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String type = "Inconnu";
    private String couleur = "Inconnu";
    private Prix prix;

    /**
     * Constructeur d'objets de classe Vetement
     */
    public Vetement(String type, String couleur)
    {
        // initialisation des variables d'instance
        this.type = type;
        this.couleur = couleur;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getCouleur(){
        return this.couleur;
    }
    
    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
    
    public void setPrix(Prix prix){
        this.prix = prix;
    }

    /**
     * Vérifier les attributs du vetement et lui ajoute un prix
     * 
     * @param type le type
     * @param couleur la couleur
     * @param prix une instance de la classe Prix
     * return true si le vetement à le même type et la même couleur, false sinon
     */
    public boolean verifierVetement(String type, String couleur, Prix prix)
    {
        this.setPrix(prix);
        return this.type == type && this.couleur == couleur;
    }
}
