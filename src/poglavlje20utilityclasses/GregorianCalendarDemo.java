package poglavlje20utilityclasses;

//Ilustracija upotrebe klase GregorianCalendar

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

    public static void main(String[] args) {
        String mjeseci[] = {
            "jan", "feb", "mar", "apr",
            "maj", "jun", "jul", "aug",
            "sep", "okt", "nov", "dec"};
        
        int godina = 0;
        
        //Izrada objekta klase GregorianCalendar inicijalizovanog tekućim vremenom
        //i datumom u tekućoj časovnoj zoni i tekućem geografskom području.
        GregorianCalendar gkalendar = new GregorianCalendar();
        
        //Prikazivanje tekućeg vremena i datuma.
        System.out.print("Datum: ");
        System.out.print(gkalendar.get(Calendar.DATE) + ". ");
        System.out.print(mjeseci[gkalendar.get(Calendar.MONTH)] +". ");
        System.out.println(gkalendar.get(Calendar.YEAR) + ".");
        
        System.out.print("Vrijeme: ");
        System.out.print(gkalendar.get(Calendar.HOUR) + ":");
        System.out.print(gkalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gkalendar.get(Calendar.SECOND));
        
        //Provjeravanje da li je godina prestupna
        if(gkalendar.isLeapYear(godina)){
            System.out.println("Tekuća godina je prestupna");
        }else{
            System.out.println("Tekuća godina nije prestupna");
        }
    }
}
