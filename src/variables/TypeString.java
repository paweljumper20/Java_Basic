package variables;

public class TypeString {
    public static void main(String[] args) {
        String name = "Dowolny napis 1@$%^";
        System.out.println(name);

        System.out.println("Pierwszy znak napisu: " + name.charAt(0));
        System.out.println("Ostatni znak napisu: " + name.charAt(name.length() -1));


        System.out.println("y znajduje się na indeksie: " + name.indexOf('y'));
        System.out.println("  znajduje się na indeksie: " + name.indexOf(' '));
        System.out.println("napis  znajduje się na indeksie: " + name.indexOf("napis"));
        System.out.println("długość napisu w zmiennej name: " + name.length());

        // Jak wydobyć słowo napis ze zmiennej name

        String napis = name.substring(8,13);
        System.out.println(napis);


        String cite = "Być albo nie być";
         String updatedCite = cite.replaceAll("ć","c");
        System.out.println(updatedCite);



        String name1 = "Ala";
        String name2 = "ala";
        System.out.println(name1.equals(name2));
    }
}
