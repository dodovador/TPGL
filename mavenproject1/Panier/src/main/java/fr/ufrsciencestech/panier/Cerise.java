public class Cerise{
    private double prix;
    private String origine;
	
    public Cerise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Australie";
    }
    
    public Cerise(double prix, String origine) 
    {
        if(prix < 0)
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if(origine.equals(""))
            this.origine = "Australie";  //Australie par défaut
	    else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Cerises sont equivalentes
        if(o != null && this.getClass() == o.getClass()){
            Cerise or = (Cerise) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Cerise a des noyaux
        return false;
    }

}