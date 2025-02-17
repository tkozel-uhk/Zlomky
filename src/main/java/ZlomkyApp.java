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
    }
}
