/*
la cifra di controllo di un codice a barre EAN-13 (la 13ª cifra) si calcola applicando
un algoritmo matematico specifico basato sulle prime 12 cifre.
Passaggi per il calcolo:
Per capire il funzionamento, prendiamo come esempio un codice fittizio composto dalle prime 12 cifre: 366000523458.
    1. Moltiplica le cifre in posizione pari per 3 e quelle in posizione dispari per 1 (partendo da sinistra verso destra):
        ◦ Posizioni dispari (1ª, 3ª, 5ª, 7ª, 9ª, 11ª): (3+6+0+5+3+5) × 1 = 22
        ◦ Posizioni pari (2ª, 4ª, 6ª, 8ª, 10ª, 12ª): (6+0+0+2+4+8) × 3 = 20 × 3 = 60 
    2. Somma i due risultati:
        ◦ 22 + 60 = 82 
    3. Trova il multiplo di 10 successivo o uguale alla somma ottenuta:
        ◦ Il multiplo di 10 successivo a 82 è 90. 
    4. Sottrai la somma dal multiplo di 10:
        ◦ 90 - 82 = 8 
La cifra di controllo finale è 8, e il codice EAN-13 completo sarà 3660005234588.
 */
package esercizi;

public class Es2 {
    
     public static void main(String[] args) {
          int[] cifre = new int[12];
          int sommaPari = 0;
          int sommaDispari = 0;
         System.out.println("Inserisci le prime 12 cifre: ");
         for(int i = 0; i<12;i++){
             System.out.print("Cifra " + (i + 1) + ": ");
             cifre[i] = Tastiera.leggiUnIntero();   
         }
         
         for(int i = 0; i<12;i++){
             //posizione pari
            if((i+1)%2==0){
                sommaPari+=cifre[i] * 3;
            }else{
                sommaDispari+=cifre[i];
            }
         }
         int somma = sommaPari + sommaDispari;
         System.out.println("La somma dei due risultati è: " + somma);
         
         
         
         
         
    }
}
