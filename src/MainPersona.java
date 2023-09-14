public class MainPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Marco", "Adriani", 29, "3698521478512");
        System.out.println(p1.getEta());
        p1.setEta(-10);
        System.out.println(p1.getEta());
    }

}
