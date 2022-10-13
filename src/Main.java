public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();

        int puerta1 = 1;
        int puerta2 = 1;
        int puerta3 = 1;

        var Puerta = suma(puerta1, puerta2, puerta3);
    System.out.println(Puerta+ miCoche.puerta + " puertas");
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {
        public int puerta = 2;

        public void SumarPuerta() {
            this.puerta++;
        }
    }
}