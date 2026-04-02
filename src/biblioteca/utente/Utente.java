package biblioteca.utente;

import biblioteca.risorsa.Risorsa;
import java.util.ArrayList;

public class Utente {
    // Attributi privati
    private String nome;
    private String idUtente;
    private ArrayList<Risorsa> risorseInPrestito;

    // Costruttore
    public Utente(String nome, String idUtente) {
        this.nome = nome;
        this.idUtente = idUtente;
        // Inizializzo la lista così non è null quando l'utente viene creato
        this.risorseInPrestito = new ArrayList<>();
    }

    // --- Metodi per la gestione dei prestiti ---

    public void prendiInPrestito(Risorsa risorsa) {
        if (risorsa != null) {
            risorseInPrestito.add(risorsa);
            System.out.println("Risorsa '" + risorsa.getTitolo() + "' aggiunta ai prestiti di " + nome);
        }
    }

    public void restituisci(Risorsa risorsa) {
        if (risorseInPrestito.contains(risorsa)) {
            risorseInPrestito.remove(risorsa);
            System.out.println("Risorsa '" + risorsa.getTitolo() + "' restituita correttamente.");
        } else {
            System.out.println("L'utente non ha in prestito questa risorsa.");
        }
    }

    public void stampaRisorse() {
        System.out.println("\n--- Risorse in prestito a: " + nome + " (ID: " + idUtente + ") ---");
        if (risorseInPrestito.isEmpty()) {
            System.out.println("Nessuna risorsa attualmente in prestito");
        } else {
            for (Risorsa r : risorseInPrestito) {
                // visualizzaDettagli() stampa cose diverse
                // a seconda che r sia un Libro, una Rivista o un Ebook
                r.visualizzaDettagli();
            }
        }
    }

    // --- Getter e Setter (Accesso controllato ai dati) ---

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getIdUtente() {return idUtente;}
    public void setIdUtente(String idUtente) {this.idUtente = idUtente;}
    public ArrayList<Risorsa> getRisorseInPrestito() {return risorseInPrestito;}
}