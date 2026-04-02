package biblioteca.biblioteca;
import biblioteca.risorsa.Risorsa;
import biblioteca.utente.Utente;
import java.util.ArrayList;

public class GestoreBiblioteca {
    private String nome;
    private ArrayList<Risorsa> inventario = new ArrayList<>();
    private ArrayList<Utente> utenti = new ArrayList<>();

    public GestoreBiblioteca(String nome) { this.nome = nome; }

    // --- Getter per l'inventario ---
    // Serve al Main per poter ciclare tra le risorse
    public ArrayList<Risorsa> getInventario() {
        return inventario;
    }

    public void aggiungiRisorsa(Risorsa r) { inventario.add(r); }
    public void aggiungiUtente(Utente u) { utenti.add(u); }

    // Metodo per cercare una risorsa specifica nell'inventario tramite codice
    public Risorsa cercaPerCodice(String codice) {
        for (Risorsa r : inventario) {
            if (r.codice().equalsIgnoreCase(codice)) {
                return r;
            }
        }
        return null; // Ritorna null se non trova nulla
    }

    public void stampaInventario() {
        System.out.println("\n--- Inventario " + nome + " ---");
        if (inventario.isEmpty()) {
            System.out.println("La biblioteca è vuota");
        } else {
            for (Risorsa r : inventario) {
                r.visualizzaDettagli(); // Polimorfismo
            }
        }
    }

    // Getter e Setter per il nome 
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}