package esercizi;

/**
 * Classe per l'acquisizione di input
 * 
 * @author: Boschello Michele
 * @author: Ursomando Alessandro
 * 
 */

import java.io.IOException;
import java.io.BufferedReader;

public class Tastiera
{   
    public static final int NO_ERR=0;
    public static final int CONVERSION_ERR=1;
    public static final int IO_ERR=2;
    public static final int OUT_OF_BOUND_ERR=3;
    
    private static int errCode=0;
    private static String errDescription;
    
    private static BufferedReader stdIn=new BufferedReader(new java.io.InputStreamReader(System.in));
   
    /**
     * Questo metodo legge un intero da tastiera e lo restituisce
     */
    private static void reset_error()
    {
        errCode=0;
        errDescription="Nessun Errore";
    }
    private static void setErrorStr()
    {
        switch (errCode)
        {
            case NO_ERR: {
                errDescription="Nessun Errore!";
                break;
            }
            case CONVERSION_ERR: {
                errDescription="Errore di conversione!";
                break;
            }
            case IO_ERR: {
                errDescription="Errore di Input/Output!";
                break;
            }
            case OUT_OF_BOUND_ERR: {
                errDescription="Testo troppo lungo!";
                break;
            }
        }
    }
    public static int getErr()
    {
        return errCode;
    }
    public static String getStrErr()
    {
        return errDescription;
    }
    public static int leggiUnIntero()
    {
        int toReturn=0;
        reset_error();
        System.out.flush();
        try
        {
            toReturn = Integer.parseInt(stdIn.readLine());
        }
        catch (java.io.IOException e)
        {
            errCode=IO_ERR;
            setErrorStr();
        }
        catch (java.lang.IllegalArgumentException e)
        {
            errCode=CONVERSION_ERR;
            setErrorStr();
        }     
        return toReturn;      
    }
  
    /**
     * Questo metodo legge un numero double da tastiera e lo restituisce
     */
    public static double leggiUnDouble()
    {
        double toReturn=0.0;
        reset_error();
        System.out.flush();        
        try
        {
            toReturn = Double.parseDouble(stdIn.readLine());
        }
        catch (java.io.IOException e)
        {
            errCode=IO_ERR;
            setErrorStr();
        }
        catch (java.lang.IllegalArgumentException e)
        {
            errCode=CONVERSION_ERR;
            setErrorStr();
        }     
        return toReturn;     
    }
    
    /**
     * Questo metodo legge una stringa da tastiera e la restituisce
     */
    public static String leggiUnaStringa()
    {
        String toReturn = new String("");
        reset_error();
        System.out.flush();
        try
        {
            toReturn = stdIn.readLine();
        }
        catch (java.io.IOException e)
        {
            errCode=IO_ERR;
            setErrorStr();
        }     
        return toReturn;
    }
  
    /**
     * Questo metodo legge un carattere da tastiera e lo restituisce
     */
    public static char leggiUnCarattere()
    {
        char toReturn = '\0';
        reset_error();
        System.out.flush();
        try
        {
            toReturn = stdIn.readLine().charAt(0);
        }
        catch (java.io.IOException e)
        {
            errCode=IO_ERR;
            setErrorStr();
        }
        catch (java.lang.StringIndexOutOfBoundsException e)
        {
            errCode=OUT_OF_BOUND_ERR;
            setErrorStr();
        }
     
        return toReturn;
    }
}