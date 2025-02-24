import cz.uhk.zlomky.model.Zlomek;

import java.util.Arrays;

public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoreni instance(=objektu) tridy ZLomek
        Zlomek a = new Zlomek(3, 4);
        System.out.printf("Zlomek a = %s\n", a);

        Zlomek b = new Zlomek(2, 5);

        Zlomek c = a.krat(b);
        System.out.printf("a * b = %s\n", c.zkratit());
        System.out.printf("a / b = %s\n", a.deleno(b).zkratit());
        System.out.printf("a + b = %s\n", a.plus(b));
        System.out.printf("a - b = %s\n", a.minus(b));

        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = new Zlomek(3,0);

        try {
            Zlomek all = sumaZlomku(poleZlomku);
            System.out.printf("Soucet je %s\n", all);
        } catch (ArithmeticException e) {
            System.out.println("Chyba pri vypoctu sumy zlomku: "+e.getMessage());
            e.printStackTrace();
        }

        Number[] pole2 = new Number[8];
        for (int i = 0; i < poleZlomku.length; i++) {
            pole2[i] = poleZlomku[i];
        }
        pole2[4] = 10;
        pole2[5] = 20;
        pole2[6] = 30.025;
        pole2[7] = 40;
        double suma = 0;
        for( Number n : pole2 ){
            System.out.printf("%s\n", n);
            suma += n.doubleValue();
        }
        System.out.printf("Soucet je %s\n", suma);
    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);

        for (Zlomek z : pole) {
            soucet = soucet.plus(z);  //soucet += z
        }

        return soucet.zkratit();
    }
}
