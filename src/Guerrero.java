
public abstract class Guerrero {
    public int id;
    public String nombre;
    public double fuerza;

    public Arma arma;

    public void guerrero (int id, String nombre, double fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public double ataqueBasico() {
        return 0;
    } // ESto es mejor mandarlo abstracto, asi no implementas nada acá

    public void imprime() {
    }

    public boolean cargaArma(Arma arma) {
        return false;
    }

    public boolean armado() {
        return (this.arma != null);
    }
}
