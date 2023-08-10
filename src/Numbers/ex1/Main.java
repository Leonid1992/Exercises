/* If you could receive up to eight different types of radio signals simultaneously (into your
computer & a program you wrote) and you needed to be able to record which of those eight
you received at any given time, what would be a highly compact (or compressed - using
the least amount of memory or storage) way to record them (using what you learned in this
module)? For example, you could receive signals A + B + C simultaneously, or A + D, or just
G, etc.
1. If you received signals A + D + C simultaneously, how could you efficiently determine
that D was one of the signals you received - based on your solution above?
 */

package Numbers.ex1;

public class Main {

    //Segnale A: Bit 1
    //Segnale B: Bit 2
    //Segnale C: Bit 4
    //Segnale D: Bit 8
    //Segnale E: Bit 16
    //Segnale F: Bit 32
    //Segnale G: Bit 64
    //Segnale H: Bit 128
    public static void main(String[] args) {
        int signalABC = 1 | 2 | 4;
        int signalAD = 1 | 8;
        int signalADC = 1 | 8 | 4;  // 13

        System.out.println((13 & 8) == 8);

    }

}
