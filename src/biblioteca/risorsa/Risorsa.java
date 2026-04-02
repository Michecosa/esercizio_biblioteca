package biblioteca.risorsa;

public abstract class Risorsa {
    private String titolo;
    private int annoPubblicazione;
    private String codice; //primaryKey autoincrement

    public Risorsa(String titolo, int annoPubblicazione, String codice) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.codice = codice;
    }

        // GETTER
        public String getTitolo() {return titolo;}

        public int getAnnoPubblicazione() {return annoPubblicazione;}

        public String codice() {return codice;}

        //SETTER
        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public void setAnnoPubblicazione(int annoPubblicazione) {
            this.annoPubblicazione = annoPubblicazione;
        }

        //stampa dettagli della risorsa
        public void visualizzaDettagli() {
            System.out.println("║ titolo  : " + titolo);
            System.out.println("║ anno    : " + annoPubblicazione);
            System.out.println("║ codice  : " + codice);
        }
    }