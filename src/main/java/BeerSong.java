public class BeerSong {
    private static String getWord(int beerNum) {
        int remainder = beerNum % 10;

        if (remainder == 1 && (beerNum != 11)) {
            return "бутылка";
        } else if (remainder >= 2 && remainder <= 4 && !(beerNum >= 12 && beerNum <= 14)) {
            return "бутылки";
        } else {
            return "бутылок";
        }
    }

    public static void main (String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {
            String word = getWord(beerNum);

            System.out.println(beerNum + " " + word + " пива на стене.");
            System.out.println(beerNum + " " + word + " пива!");
            System.out.println("Возьми одну, пусти по кругу!");

            beerNum = beerNum - 1;
        }

        System.out.println("Нет бутылок пива на стене!");
    }
}
