public class Persona {

    private String nome;
    private String cognome;
    private int eta;
    private String numeroTelefono;

    public Persona(String nome, String cognome, int eta, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta < 0 ? 0 : eta;
        this.numeroTelefono = numeroTelefono;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta < 0 || eta > 120) {
            System.out.println("età non valida, modifica fallita");
        }
        else {
            this.eta = eta;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
