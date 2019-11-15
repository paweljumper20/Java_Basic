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

        //sprawdzenie czy napis jest palindromem
        String txt = "KAJAK";
        System.out.println(txt);
        // utworzylismy obiekt klasy StringBuffer -> edytowalny String
        StringBuffer editabletxt = new StringBuffer(txt);
        // odwrócenie kolejności liter w napisie
        editabletxt.reverse();
        //przypisanie odwroconego napisu do zmiennej String -> nieedytowalnej
        System.out.println(editabletxt);


        System.out.println("Czy napis jest palindromem? " + txt.equals(editabletxt.toString()));



        String sentence = "Być albo nie być oto jest pytanie";

        // podziel zdanie na wyrazy

        String[] words =  sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);





    }
}
