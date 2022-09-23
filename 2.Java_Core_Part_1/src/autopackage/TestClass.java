package autopackage;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestClass {
    public static void main(String[] args) {

        byte _byte = 0;
        short _short = 1;
        int _int = 3;
        long _long = 4;
        float _float = 5.0F;
        double _double = 6.0;
        char _char = '7';
        boolean _boolean = true;

        Byte $byte = new Byte(_byte);
        System.out.println($byte.getClass());

        Short $short = new Short(_short);
        System.out.println($short.getClass());

        Integer $integer = new Integer(_int);
        System.out.println($integer.getClass());

        BigInteger bigInteger = new BigInteger(String.valueOf(_int));
        System.out.println(bigInteger.getClass());

        Long $long = new Long(_long);
        System.out.println($long.getClass());

        Float $float = new Float(_float);
        System.out.println($float.getClass());

        Double $double = new Double(_double);
        System.out.println($double.getClass());

        BigDecimal bigDecimal = new BigDecimal(_double);
        System.out.println(bigDecimal.getClass());

        Character $character = new Character(_char);
        System.out.println($character.getClass());

        Boolean $boolean = new Boolean(_boolean);
        System.out.println($boolean.getClass());

    }
}
