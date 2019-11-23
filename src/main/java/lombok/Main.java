package lombok;

import JavaBeans.RGB;

public class Main {
    public static void main(String[] args) {
        Annotationslombok annotationslombok = new Annotationslombok("Michał","123", "MK");
        System.out.println(annotationslombok.getLogin());
        System.out.println(annotationslombok);

        RGB rgb = new RGB(12 ,2,5);
        System.out.println(rgb);
    }
}
