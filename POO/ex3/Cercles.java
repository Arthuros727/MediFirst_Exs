package POO.ex3;

import java.util.ArrayList;
import java.util.List;

public class Cercles implements Formes{
    private float rayon;
    final float pi = 3.14f;

    public Cercles(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public float surfaces() {
        return (float) (pi*Math.pow(rayon,2));
    }

    @Override
    public float perimetre() {
        return 2 * pi * rayon;
    }

    @Override
    public String toString() {
        return "cercle de rayon="+ this.rayon +" : perimetre=" + perimetre() + ", surface=" + surfaces();
    }

    public static void main(String[] args) {
        Formes cercle1 = new Cercles(3);
        Formes rectangle1 =  new RectangleButFamilly(4,7);
        List<Formes> liste= new ArrayList<Formes>();
        liste.add(cercle1);
        liste.add(rectangle1);
        System.out.println(cercle1);
        System.out.println(liste);

    }
}
