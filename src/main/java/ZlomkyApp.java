import cz.uhk.zlomky.model.Zlomek;

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
        poleZlomku[3] = a.deleno(b);

        Zlomek all = sumaZlomku(poleZlomku);
        System.out.printf("Soucet je %s\n", all);
    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);

        for (Zlomek z : pole) {
            soucet = soucet.plus(z);  //soucet += z
        }

        return soucet.zkratit();
    }
}
