package biblioteca.main;

import biblioteca.risorsa.*;
import biblioteca.utente.Utente;
import biblioteca.biblioteca.GestoreBiblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreBiblioteca miaBiblioteca = new GestoreBiblioteca("Biblioteca Comunale");

        // Dati di popolamento
        Libro l1 = new Libro("Il Signore degli Anelli", 1954, "L001", "J.R.R. Tolkien");
        Libro l2 = new Libro("1984", 1949, "L002", "George Orwell");
        Ebook e1 = new Ebook("Clean Code", 2008, "E001", "PDF");
        Ebook e2 = new Ebook("Java: The Complete Reference", 2018, "E002", "EPUB");
        
        miaBiblioteca.aggiungiRisorsa(l1);
        miaBiblioteca.aggiungiRisorsa(l2);
        miaBiblioteca.aggiungiRisorsa(e1);
        miaBiblioteca.aggiungiRisorsa(e2);

        Utente utenteCorrente = new Utente("Mario Rossi", "U001");
        miaBiblioteca.aggiungiUtente(utenteCorrente);

        boolean esci = false;

        while (!esci) {
            System.out.println("\n--- MENU BIBLIOTECA ---");
            System.out.println("1. Visualizza tutti i Libri");
            System.out.println("2. Visualizza tutti gli Ebook");
            System.out.println("3. Effettua un prestito");
            System.out.println("4. Visualizza i miei libri in prestito");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            switch (scelta) {
                case 1:
                    System.out.println("\n--- ELENCO LIBRI ---");
                    // Filtriamo l'inventario per mostrare solo i Libri
                    for (Risorsa r : miaBiblioteca.getInventario()) {
                        if (r instanceof Libro) {
                            r.visualizzaDettagli();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- ELENCO EBOOK ---");
                    // Filtro l'inventario per mostrare solo gli Ebook
                    for (Risorsa r : miaBiblioteca.getInventario()) {
                        if (r instanceof Ebook) {
                            r.visualizzaDettagli();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Inserisci il codice della risorsa da prendere: ");
                    String codiceCercato = scanner.nextLine();
                    
                    // Cercho la risorsa nell'inventario
                    Risorsa trovata = null;
                    for (Risorsa r : miaBiblioteca.getInventario()) {
                        if (r.codice().equalsIgnoreCase(codiceCercato)) {
                            trovata = r;
                            break;
                        }
                    }

                    if (trovata != null) {
                        utenteCorrente.prendiInPrestito(trovata);
                    } else {
                        System.out.println("[Errore] Codice non trovato");
                    }
                    break;

                case 4:
                    utenteCorrente.stampaRisorse();
                    break;

                case 0:
                    esci = true;
                    System.out.println("Arrivederci!\n\n");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }
        scanner.close();
    }
}