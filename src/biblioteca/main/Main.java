package biblioteca.main;
import biblioteca.risorsa.*;
import biblioteca.utente.Utente;
import biblioteca.biblioteca.GestoreBiblioteca;

public class Main {
    public static void main(String[] args) {
        GestoreBiblioteca miaBiblioteca = new GestoreBiblioteca("Biblioteca Comunale");

        // Creazione risorse
        Libro l1 = new Libro("Il Signore degli Anelli", 1954, "L001", "J.R.R. Tolkien");
        Ebook e1 = new Ebook("Clean Code", 2008, "E001", "PDF");
        
        miaBiblioteca.aggiungiRisorsa(l1);
        miaBiblioteca.aggiungiRisorsa(e1);

        // Creazione utenti
        Utente u1 = new Utente("Mario Rossi", "U001");
        
        // Simulazione prestito
        u1.prendiInPrestito(l1);
        
        // Stampe di verifica
        miaBiblioteca.stampaInventario();
        u1.stampaRisorse();
    }
}