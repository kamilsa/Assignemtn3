import java.util.BitSet;

public class Bits {

    public static BitSet convert(int value) {
        BitSet bits = new BitSet();
        int index = 0;
        while (value != 0) {
            if (value % 2 != 0) {
                bits.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        return bits;
    }

    public static int convert(BitSet bits, int len) {
//        long value = 0;
//        for (int i = 0; i < bits.length(); ++i) {
//            value += bits.get(i) ? (1 << i) : 0;
//        }
//        return value;
        String str = "";
        for(int i = 0; i < len; i++){
            str += bits.get(i) ? "1" : "0";
        }
        return Integer.parseInt(str, 2);
    }

    public static BitSet concatBitSets(BitSet b1, BitSet b2){
        int length = b1.length()+1;
        BitSet res = (BitSet)b1.clone();
        for(int i = 0; i < b2.length()+1; i++){
            res.set(length++, b2.get(i));
        }
        return res;
    }
    public static BitSet concatBitSets(BitSet b1, int startIndex, BitSet b2){
        int length = startIndex;
        BitSet res = (BitSet)b1.clone();
        for(int i = 0; i < b2.length()+1; i++){
            res.set(length++, b2.get(i));
        }
        return res;
    }
    public static BitSet offset(int value){
        BitSet bits = new BitSet();
        int index = 0;
//        value  = value >> 1;
        while (value != 0) {
            if (value % 2 != 0) {
                bits.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        bits.clear(0);
//        bits = Bits.convert(Bits.convert(bits) >> 1);
//        System.out.println("\n-offset--");
//        for(int i = 0; i < bits.size(); i++) {
//            if (bits.get(i))
//                System.out.print(1);
//            else
//                System.out.print(0);
//        }
//        System.out.println("\n---");
        return bits;
    }
}
