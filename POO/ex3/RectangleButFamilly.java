package POO.ex3;


public class RectangleButFamilly implements Formes {
    private int hauteur = 4;
    private int largeur = 7;

    @Override
    public float surfaces() {
        return hauteur * largeur;
    }

    @Override
    public float perimetre() {
        return (this.hauteur + this.largeur) * 2;
    }

    public RectangleButFamilly(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public RectangleButFamilly() {

    }

    @Override
    public String toString() {
        return "rectangle de largeur="+ this.largeur +" et de hauteur=" + this.hauteur +" : perimetre=" + perimetre() + ", surface=" + surfaces();
    }

    public static void main(String[] args) {
        Formes Rectangle = new RectangleButFamilly();
//        System.out.println(Rectangle.surfaces());
          System.out.println(Rectangle);
    }
}
