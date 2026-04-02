package biblioteca.biblioteca;
import biblioteca.risorsa.Risorsa;
import biblioteca.utente.Utente;
import java.util.ArrayList;

public class GestoreBiblioteca {
    private String nome;
    private ArrayList<Risorsa> inventario = new ArrayList<>();
    private ArrayList<Utente> utenti = new ArrayList<>();

    public GestoreBiblioteca(String nome) { this.nome = nome; }

    public void aggiungiRisorsa(Risorsa r) { inventario.add(r); }
    public void aggiungiUtente(Utente u) { utenti.add(u); }

    public void stampaInventario() {
        System.out.println("--- Inventario " + nome + " ---");
        for (Risorsa r : inventario) {
            r.visualizzaDettagli(); // Polimorfismo
        }
    }
}