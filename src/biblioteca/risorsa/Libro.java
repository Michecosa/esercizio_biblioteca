package biblioteca.risorsa;

public class Libro extends Risorsa{
    private String autore;

    //costruttore
    public Libro(String titolo, int annoPubblicazione, String codice, String autore) {
        super(titolo, annoPubblicazione, codice);
        this.autore = autore;
    }
    //getter
    public String getAutore() {return autore;}

    //setter
    public void setAutore(String autore) {
        if (autore.equals("")) {
            System.out.println("Autore non può essere vuoto");
        } else {
            this.autore = autore;
        }
    }

    @Override //polimorfismo. Aggiunge caratterizzazione classe  e divisori
    public void visualizzaDettagli() {
        System.out.println("═════════════════════════════════════════════════");
        System.out.println("                      LIBRO                      ");
        System.out.println("═════════════════════════════════════════════════");
        super.visualizzaDettagli(); //eredita da visualizzaDettagli in Risorsa
        System.out.println(" autore  : " + autore);
        System.out.println("═════════════════════════════════════════════════");
    }
}