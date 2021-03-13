
package Sieve;

public class Sieve {

/*
* source stores a predecessor sieve, which
* holds a prime number.
* factor is an integer that is incremented
* when the base sieve is called.
*/
   private Sieve source;
   private int factor;
   
   /*
    *  constructs a base Sieve.
    */
   public Sieve() {
       this.source = null;
       this.factor = 1;
    /* TODO: initialize instance fields */
   }
   
   /**
    * constructs a Sieve using a prime number
    * and a predecessor Sieve
    * @param divisor prime number.
    * @param predecessor Sieve.
    */
   public Sieve(int divisor, Sieve predecessor) {
    /* TODO: initialize instance fields */
       this.source = predecessor;
       this.factor = divisor;
   }
   
   /**
    * returns the next incremented integer.
    * This integer is either the next
    * prime number or divisible by the factor
    * of a Sieve object.
    * @return the next integer .
    */
   public int next() {
    if(this.source == null) {
    /* The base case releases
    * the next integer and returns it.    
    */
           this.factor++;
           return this.factor;
    } else {
    int candidate;
    /* The recursive case calls  
    * the next() method iteratively
    * until the integer, returned
    * from the base case, is not
    * divisible by the factor of
    * any Sieve object created so far.
    */
              // candidate = this.source.next();
    do {
                    candidate = this.source.next();
    } while(candidate%this.factor == 0 );
                   
                        return candidate;
                   
    }
   }

   public static void main(String[] args) {
       Sieve sifter = new Sieve();
       /* generates the first 500
        * prime numbers. Each prime number
        * is displayed right-justified and
        * within a seven-column wide area.
        */
       for(int count = 0; count < 500; count++) {
           Sieve Siff = new Sieve(sifter.next(), sifter);
           sifter = Siff;
           System.out.println(""+Siff.factor);

         if(count % 10 == 9) {
             System.out.println(" ");
         }
       }
}
}

/* Copyright © 2020 Shervin Hajiamini
  I am indebted to my colleague, John David Stone, for assistance with this handout.
*/
