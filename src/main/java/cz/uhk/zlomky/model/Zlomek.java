package cz.uhk.zlomky.model;

public class Zlomek extends Number {
    private final int citatel;
    private final int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek krat(Zlomek druhy) {
        return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
    }
    public Zlomek deleno(Zlomek druhy) {
        return new Zlomek(citatel * druhy.jmenovatel, jmenovatel * druhy.citatel);
    }
    public Zlomek plus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel + druhy.citatel*jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }
    public Zlomek minus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel - druhy.citatel*jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek zkratit() {
        int a = Math.abs(citatel);
        int b = Math.abs(jmenovatel);
        if (a < b) {
            int pom = a;
            a = b;
            b = pom;
        }

        int zb;
        do {
            zb = a % b;
            a = b;
            b = zb;
        } while (zb != 0);
        return new Zlomek(citatel / a, jmenovatel / a);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }

    @Override
    public int intValue() {
        return citatel / jmenovatel;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double)citatel) / jmenovatel;
    }
}
