package POO.ex2;

public class Rectangle {
    private int hauteur = 4;
    private int largeur = 7;

    public Rectangle() {
    }

    public Rectangle(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public int perimetre() {
//        System.out.println((this.hauteur + this.largeur) * 2);
        return (this.hauteur + this.largeur) * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.perimetre());

    }
}
