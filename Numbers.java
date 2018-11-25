
/**
 * 
 * Klasse zur Berechnung verschiedener Zahlen
 * Portfoliopruefung 1 - Aufgabenteile Zahlen I und Zahlen II
 * 
 * @author Ole Reichhelm, Niklas Held
 * @version 1.0
 */
public class Numbers {
    
    /**
    * Errechnung der Fibonacci-Zahl mit Rekursion 
    * fibonacciR(63) = 6557470319842
    **/
    public long fibonacciR(long n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciR(n-1) + fibonacciR(n-2);
        }
    }
   
    /**
    * Errechnung der Fibonacci-Zahl mit Schleife 
    * fibonacciS(63) = 6557470319842
    **/
    public long fibonacciS(int n){
       
        long finalResult = 0; 
        long firstInterimResult = 1; 
        long secondInterimResult = 1; 
       
        if(n == 1 || n == 2){
            return 1; 
        } else {
            for(int i=3; i <= n; i++){
                finalResult = secondInterimResult + firstInterimResult;
                secondInterimResult = firstInterimResult; 
                firstInterimResult = finalResult; 
            }
        } 
       
        return finalResult;
    }
    
    public long fibonacciRTest(){
    finalResult = secondInterimResult + firstInterimResult;
    secondInterimResult = firstInterimResult; 
    firstInterimResult = finalResult; 
    
    //selbstaufruf mit secondIterimRessult und firstInterimResult
}   
    

    /**
    * Errechnung einer römischen Zahl aus einer Dezimalzahl
    **/
    public String roman(int n) {

        String returnString = "";                
        int ones, tens, hundreds, thousands;
        
        ones = n%10;
        tens = n/10%10;
        hundreds = n/100%10;
        thousands = n/1000%10;        
        
        returnString = romanHelp(hundreds, "C", "D", "M") + romanHelp(tens, "X", "L", "C") + romanHelp(ones, "I", "V", "X") + returnString;
        
        for (int i = thousands; i>0; i--) {
            returnString = "M" + returnString;
        }
                    
        return returnString;
    }
    
    /**
    * Hilfsfunktion für das Errechnen eines Zahlensegments
    **/
    private String romanHelp (int n, String smallString, String middleString, String largeString) {
        
        String returnString = "";
        
        if (n >= 1 && n <= 3) {
            for (int i = n; i>0; i--) {
                returnString = smallString + returnString;
            }
        } else if (n == 4) {
            returnString = smallString + middleString + returnString;
        } else if (n >= 5 && n <= 8) {
            n = n - 5;
            for (int i = n; i>0; i--) {
                returnString = smallString + returnString;
            }
            returnString = middleString + returnString;
        } else if (n == 9) {
            returnString = smallString + largeString + returnString;
        }
        
        return returnString;
    }
    
}


