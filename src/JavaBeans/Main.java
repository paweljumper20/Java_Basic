package JavaBeans;

public class Main {
    public static void main(String[] args) {
        RGB colour1 = new RGB(0,12,22);
        colour1.setR(100);
        colour1.setB(100);
        colour1.setG(100);
        System.out.println(colour1.getR());
        System.out.println(colour1.getG());
        System.out.println(colour1.getB());
        System.out.println(colour1);
    }
}
