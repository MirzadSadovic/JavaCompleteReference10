package poglavlje20utilityclasses;

//Ilustracija upotrebe klase Calendar

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {
        String mjeseci[] = {
        "jan", "feb", "mar", "apr",
        "maj", "jun", "jul", "aug", 
        "sep", "okt", "nov", "dec"};
        
        //Konstruise kalendar inicijalizovan tekućim vremenom i datumom
        //u tekućem lokalnom geografskom podrucju i tekućoj časovnoj zoni.
        Calendar kalendar = Calendar.getInstance();
        
        //Prikazivanje tekućeg vremena i datuma
        System.out.print("Datum: ");
        System.out.print(mjeseci[kalendar.get(Calendar.MONTH)] + ". ");
        System.out.print(kalendar.get(Calendar.DATE) + ". ");
        System.out.println(kalendar.get(Calendar.YEAR) + ".");
        
        System.out.print("Vrijeme: ");
        System.out.print(kalendar.get(Calendar.HOUR) + ":");
        System.out.print(kalendar.get(Calendar.MINUTE) + ":");
        System.out.println(kalendar.get(Calendar.SECOND));
        
        //Zadavanje vremena i datuma i njihovo prikazivanje
        kalendar.set(Calendar.HOUR, 10);
        kalendar.set(Calendar.MINUTE, 29);
        kalendar.set(Calendar.SECOND, 59);
        System.out.print("Ažurirano vrijeme: ");
        System.out.print(kalendar.get(Calendar.HOUR) + ":");
        System.out.print(kalendar.get(Calendar.MINUTE) + ":");
        System.out.println(kalendar.get(Calendar.SECOND));
    }
}
