package accesSpecifier.animal;

import accesSpecifier.animal.mammal.Mammal;
import accesSpecifier.animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setAge(10);
        System.out.println(mammal);
        Reptile reptile = new Reptile();
        //System.out.println(reptile.name); protected nie jest widoczny poza pakietem reptile
        Animal animal = new Animal();
        //animal.speed; nie jest dostępny poza pakietem animal
//        animal.getSpeed();

    }
}
