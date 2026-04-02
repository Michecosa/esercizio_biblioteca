package biblioteca.risorsa;

public class Rivista extends Risorsa{
    private int numeroRivista;

    public Rivista(String titolo, int annoPubblicazione, String codice, int numeroRivista) {
        super(titolo, annoPubblicazione, codice);
        this.numeroRivista = numeroRivista;
    }

    public int getNumeroRivista() {return numeroRivista;}

    public void setNumeroRivista(int numeroRivista) {
        if (numeroRivista <= 0) {
            System.out.println("Errore. Numero rivista deve essere maggiore di 0");
        } else {
            this.numeroRivista = numeroRivista;
        }
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║          RIVISTA             ║");
        System.out.println("╠══════════════════════════════╣");
        super.visualizzaDettagli();
        System.out.println("║ numero  : " + numeroRivista);
        System.out.println("╚══════════════════════════════╝");
    }

}