package data_structure;

import java.util.BitSet;

/**
 * @author mkemiche
 * @created 16/04/2021
 */
public class BitsetEx {

    public static void main(String[] args) {
        BitSet bs = new BitSet(5);
        BitSet bs2 = new BitSet(5);
        BitSet[] bitSets = new BitSet[3];

        bitSets[1] = bs;
        bitSets[2] = bs2;

        bitSets[1].and(bitSets[2]);
        System.out.println(bitSets[1]);

        bitSets[1].set(4);
        System.out.println(bitSets[1]);

//        bs.and(bs2);
        System.out.println(bs);
        System.out.println(bs2);
////
//        bs.set(1, true);
//        System.out.println(bs);
//        System.out.println(bs2);
//
//        bs2.set(2, true);
//        System.out.println(bs);
//        System.out.println(bs2);

    }

}
