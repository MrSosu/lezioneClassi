import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {

        Automobile auto1 = new Automobile();
        Automobile auto2 = new Automobile("BMW");

        System.out.println(auto1.marchio);
        System.out.println(auto2.marchio);

        Ciccio ciccio = new Ciccio();
        System.out.println(ciccio.ciccioNumero);
        System.out.println(ciccio.ciccioStringa);

        Automobile auto3 = new Automobile("FIAT", 1200);

        auto1.cilindrata = 1600;

        Utilities.somma(3, 5);
        Utilities utilities = new Utilities();
        utilities.stampaCiao();

    }

}
