package packtp2;

import java.util.HashSet;
import java.util.Set;

public class Tp2main {

	public static void main(String[] args) {
		Set < Chambre> setChambres = new HashSet < Chambre > ();
		
		 
			setChambres.add(new Chambre(101, "Suite", 4, true));
	        setChambres.add(new Chambre(102, "Standard", 2, true));
	        setChambres.add(new Chambre(103, "Deluxe", 3, true));
	        setChambres.add(new Chambre(104, "Suite", 2, false));
	        
	        System.out.println(setChambres);
	        // 1. Supprimer une chambre
//	        supprimerChambre(104, setChambres);
	}



// Méthode pour supprimer une chambre du Set si elle est disponible
	public static boolean supprimerChambre(int numChambre, Set<Chambre> setChambres) {
	    for (Chambre chambre : setChambres) {
	        if (chambre.getNumChambre() == numChambre) {
	            if (chambre.isDisponible()) {
	                setChambres.remove(chambre);
	                System.out.println("Chambre " + numChambre + " supprimée.");
	                return true;
	            } else {
	                System.out.println("La chambre " + numChambre + " est réservée et ne peut pas être supprimée.");
	                return false;
	            }
	        }
	    }
	    System.out.println("Chambre non trouvée.");
	    return false;
}
}
