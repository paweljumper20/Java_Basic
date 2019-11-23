package loops;

public class OmmittingInstructions {
    public static void main(String[] args) {
        // program wszukujacy okreslony znak w napisie
        //-> jesli znaleziono -> wypisz pozycje tego znaku
        // -> jesli nie znaleziono wypisz komunikat

        String sentence = "Ala ma kota a kot ma Alę";
        char search = 'h';
        boolean isFound = false;
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println("Iteracja nr.  " + i);
            if (sentence.charAt(i) != search) {
                continue;
            } else {
                System.out.printf("Znaleziono %c znak na indeksie %d\n", sentence.charAt(i), i);
                isFound = true;
                //instrukcja przerywająca dzialanie petli
                break;
            }


        }
        if (!isFound) {
            System.out.printf("Nie znaleziono znaku %c w tekście %s \n", search, sentence);
        }


        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);

        }





    }

}
