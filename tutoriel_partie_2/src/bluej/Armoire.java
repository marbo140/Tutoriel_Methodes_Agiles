package bluej;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Armoire {
	private ArrayList<Vetement> contenu = null;
	
	public Armoire() {
		this.contenu = new ArrayList<Vetement>();
	}
	
	public void addVetement(Vetement vetement) {
		if (vetement != null && !this.hasVetement(vetement)) {
		    this.contenu.add(vetement);
			vetement.setArmoire(this);
		}
	}
	
	public void removeVetement(Vetement vetement) {
		if (this.contenu.remove(vetement)) {
			vetement.setArmoire(null);
		}
	}
	
	public boolean hasVetement(Vetement vetement) {
		return this.contenu.contains(vetement);	
	}
	
	public List<Vetement> getContenu() {
		return  Collections.unmodifiableList(this.contenu);
	}
}
