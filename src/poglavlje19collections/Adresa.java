package poglavlje19collections;

//A simple mailing list example
public class Adresa {
    private String ime;
    private String ulica;
    private String postanskiBroj;
    private String grad;
    private String drzava;
   

    public Adresa(String ime, String ulica, String postanskiBroj, String grad, String drzava) {
        this.ime = ime;
        this.ulica = ulica;
        this.postanskiBroj = postanskiBroj;
        this.grad = grad;
        this.drzava = drzava;
        
    }

    @Override
    public String toString() {
        return ime + "\n" + ulica + "\n" + postanskiBroj + " " + grad + " " + drzava;
    }
    
    
}
