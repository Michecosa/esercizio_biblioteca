public class Libro {
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String codice, String autore) {
        super(titolo, annoPubblicazione, codice);
        this.autore = autore;
    }

    public String getAutore() {return autore};

    public void setAutore() {
        if (autore.equals("")) {
            System.out.println("Autore non può essere vuoto");
        } else {
            this.autore = autore;
        }
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println("Autore: " + autore);
    }
}