public class Automobile {

    public static final int ruote = 4;
    public String marchio;
    public int cilindrata;

    public Automobile() {
        this.marchio = "Audi";
    }

    public Automobile(String marchio) {
        this.marchio = marchio;
    }

    public Automobile(String marchio, int cilindrata) {
        this.marchio = marchio;
        this.cilindrata = cilindrata;
    }

}
