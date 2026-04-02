package biblioteca.risorsa;

public class Libro extends Risorsa{
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String codice, String autore) {
        super(titolo, annoPubblicazione, codice);
        this.autore = autore;
    }

    public String getAutore() {return autore;}

    public void setAutore(String autore) {
        if (autore.equals("")) {
            System.out.println("Autore non può essere vuoto");
        } else {
            this.autore = autore;
        }
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("═════════════════════════════════════════════════");
        System.out.println("                      LIBRO                      ");
        System.out.println("═════════════════════════════════════════════════");
        super.visualizzaDettagli();
        System.out.println(" autore  : " + autore);
        System.out.println("═════════════════════════════════════════════════");
    }
}