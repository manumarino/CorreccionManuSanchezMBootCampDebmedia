public class Mago  extends Guerrero {

    public Mago() {
        System.out.println("Mago creado");
    }

    public Mago(int id, String nombre, double fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public double ataqueBasico(){
        return 0;
    }

    public double ataqueMagico() {
        double v = 0;
        if (this.armado()) {
            v = this.fuerza * this.arma.poderAtaque;
        }

        return v;
    }

    public void imprime() {
        System.out.println("ID: "+this.id+". Mago: "+this.nombre+". Fuerza: "+this.fuerza);
        if (this.armado()) {
            System.out.print("ARMADO con: ");
            System.out.println("Baculo ID: "+this.arma.id+", "+this.arma.nombre+", "+this.arma.poderAtaque);
        }
        else {
            System.out.println("DESARMADO");
        }
    }
    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Baculo.class) {
            this.arma = arma;
            return true;
        }
        else {

            System.out.println("Soy Mago y solo utilizo Baculo");
            return false;
        }
    }
}
