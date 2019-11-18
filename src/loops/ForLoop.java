package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
        // ala ma kota
        // 012345678910
        //wypisz w pętli wszystkie znaki napisu pojedynczo
        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, sentence.charAt(i));
            }
        }
        //tablica - zmienna przechowująca zestaw wartości uporzadkowanych po indeksach
        int numbers[] = {2,4,6,8};
        int index = 0;
        for (int number:numbers) {
            System.out.printf("indeks: %d wartość: %d\n",index ,number);
            index++;
        }


    }


}
