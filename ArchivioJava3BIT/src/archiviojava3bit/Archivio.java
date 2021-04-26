package archiviojava3bit;

import java.util.ArrayList;

/**
 * Contiene gli oggetti del programma.
 * Implementata tramite un ArrayList.
 * Ci permette di inserire gli oggetti,
 * effettuare ricerche e
 * aggiungere/rimuovere/modificare un oggetto.
 * @author INSERISCI_NOME
 */
public class Archivio {
    private ArrayList<Articolo> archivio;
    
    //Costruttore
    public Archivio(){
      //Creo l'array list vuoto
      archivio = new ArrayList(0);
    }
    
    //Metodo per inserire un Articolo
    public void inserisci(Articolo articolo){
      //aggiungo l'oggetto ricevuto nell'ArrayList
      archivio.add(articolo);
    }
    
    //Metodo per ricerca in base al codice
    public Articolo ricerca(String codice){
      for(int i=0; i<archivio.size();i++){
        //Prediamo l'oggetto in pèosizione i
        Articolo articolo = archivio.get(i);
        if(articolo.getCodice()==codice){
          return articolo;
        }
      }
      //Se arrivo qui significa che l'articolo non c'è
      return null;
    }
    
}
