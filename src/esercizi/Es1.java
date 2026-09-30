/*
 *Scrivi un programma in Java che legga un numero intero positivo di 4 cifre inserito dall'utente (es. 4382) e verifichi se è valido come di seguito descritto:
Estrai le 4 singole cifre dal numero intero inserito.
Calcola la somma pesata:
Moltiplica la 1ª e la 3ª cifra per 3.
Moltiplica la 2ª e la 4ª cifra per 1.
Somma i risultati ottenuti per ottenere il codice di controllo.

Il codice è valido se è un multiplo di 10.
Altrimenti, il codice non è valido.

Esempi di test:
4382 -> Codice non Valido
3131 -> Codice valido
 */
package esercizi;


public class Es1 {
    public static void main(String[] args) {
        
            System.out.println("Inserisci un numero intero a 4 cifre: ");
            int numero = Tastiera.leggiUnIntero();
            if(numero <1000 || numero>9999){
                System.out.println("Il coidce non ha 4 cifre");
            }
            int cifra1 = numero/1000;
            int cifra2 = (numero/100)%10;
            int cifra3 = (numero/10)%10;
            int cifra4 = numero%10;
            
            int controlloCifra = (cifra1 * 3) + (cifra2 *1) + (cifra3 * 3) + (cifra4 * 1);
            if(controlloCifra%10==0) {
                System.out.println("Il codice e' valido");
            }else{
                System.out.println("Il codice non e' valido");
            }
         

    }
    
}
