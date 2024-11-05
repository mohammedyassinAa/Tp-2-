package packtp2;

public class Chambre {
    private int numChambre;     
    private String type;        
    private int capacite;       
    private boolean disponible; 

    public Chambre(int numChambre, String type, int capacite, boolean disponible) {
        this.numChambre = numChambre;
        this.type = type;
        this.capacite = capacite;
        this.disponible = disponible;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public String getType() {
        return type;
    }

    public int getCapacite() {
        return capacite;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
