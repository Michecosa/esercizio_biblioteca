package biblioteca.risorsa;

public class Ebook extends Risorsa {
     private String formato;

    public Ebook(String titolo, int annoPubblicazione, String codice, String formato) {
        super(titolo, annoPubblicazione, codice);
        this.formato = formato;
    }

    public String getFormato() {return formato;}

    public void setFormato(String formato) {
        if (formato.equals("")) {
            System.out.println("Errore. formato non può essere vuoto");
        } else {
            this.formato = formato;
        }
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("═════════════════════════════════════════════════");
        System.out.println("                    EBOOK                        ");
        System.out.println("═════════════════════════════════════════════════");
        super.visualizzaDettagli();
        System.out.println(" formato : " + formato);
        System.out.println("═════════════════════════════════════════════════");
    }
}