package algorithms;

public class EquakeTester {

    public static void main(String[] args){
        Double mg1 = 1.0;
        Double mg2 = 6.0;

        Double n1 = mg1 > 10 ? 0 : mg1;
        Double n2 = mg2 > 10 ? 0 : mg2;

        Double aveMg = n1 == n2 ? n1 :(n1 > n2 ? n1 : n2);

        final Double dist = 6.0;

        final EarthquakeCalculator ec =
                new EarthquakeCalculator(aveMg,dist);

        System.out.println("INTENSITY: " + ec.getIntensity());
        System.out.println("ETA: " + ec.getETA());
    }
}
