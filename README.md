# Gestione Biblioteca Digitale - OOP Project

Il sistema permette la gestione di una biblioteca digitale dove è possibile catalogare diverse tipologie di risorse, gestire gli utenti e monitorare i prestiti.

- **Incapsulamento**: Tutti gli attributi sono privati e accessibili solo tramite metodi getter e setter.
- **Ereditarietà**: Utilizzo di una classe base (`Risorsa`) e classi derivate specifiche.
- **Polimorfismo**: Gestione di collezioni miste e overriding del metodo `visualizzaDettagli()`.


<br>
<br>

## Architettura del Software

Il progetto è suddiviso nei seguenti pacchetti:

### pacchetto: `risorsa`
Contiene la logica relativa ai beni della biblioteca.
* **Risorsa**: Classe base con attributi comuni (titolo, anno di pubblicazione, codice univoco).
* **Libro**: Estende Risorsa, aggiunge l'attributo `autore`.
* **Rivista**: Estende Risorsa, aggiunge l'attributo `numero`.
* **Ebook**: Estende Risorsa, aggiunge l'attributo `formato`.

### pacchetto: `utente`
* **Utente**: Gestisce l'anagrafica (nome, idUtente) e la lista delle risorse attualmente in prestito (`ArrayList<Risorsa>`).

### pacchetto: `biblioteca`
* **Biblioteca**: Classe core che contiene l'inventario completo e l'elenco degli utenti registrati. Gestisce le operazioni di ricerca e stampa globale.

### pacchetto: `main`
* **Main**: Punto di ingresso dell'applicazione dove viene simulato l'inserimento dei dati e vengono dimostrate le funzionalità richieste.

<br>
<br>

## Suddivisione dei Ruoli

Il lavoro è stato ripartito tra i membri del team come segue:

| Membro | Responsabilità | Pacchetti gestiti |
| :--- | :--- | :--- |
| **Michela** | Gestione Logica Business & Test | `utente`, `biblioteca`, `main` |
| **Gabriele** | Definizione Struttura Dati | `risorsa` |
