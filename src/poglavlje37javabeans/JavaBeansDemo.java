package poglavlje37javabeans;

public class JavaBeansDemo { 
    //Prosta svojstva -> Simple Properties
    private double dubina;
    private double visina;
    private double sirina;

    public double getDubina() {
        return dubina;
    }

    public void setDubina(double dubina) {
        this.dubina = dubina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }
    
    //Indeksirana svojstva (N -> ime svojstva, T -> tip) ->Indexed Properties
 
    //public T getN(int index);
    //public void setN(int index, T vrijednost);
    
    //public T[] getN();
    //public void setN(T vrijednost[]);
    
    private double podaci[];

    public double getPodaci(int index){
        return podaci[index];
    }
    
    public void setPodaci(int index, double vrijednost){
        podaci[index ] = vrijednost;
    }

    public double[] getPodaci() {
        return podaci;
    }
    
    public void setPodaci(double[] vrijednost){
        podaci = new double[vrijednost.length];
        System.arraycopy(vrijednost, 0, podaci, 0, vrijednost.length);
    }
}
