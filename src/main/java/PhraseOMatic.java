public class PhraseOMatic {
    public static void main(String[] arg) {
        String[] wordListOne = {
                "лруглосуточный",
                "трех-звенный",
                "30000-фунтовый",
                "взаимный",
                "обоюдный выигрыш",
                "фронтэнд",
                "на основе веб-технологий",
                "проникающий",
                "умный",
                "шесть сигм",
                "метод критического пути",
                "динамичный"
        };

        String[] wordListTwo = {
                "уполномоченный",
                "трудный",
                "чистый продукт",
                "ориентированный",
                "центральный",
                "распределительный",
                "кластеризованный",
                "фирменный",
                "нестандартный ум",
                "позиционированный",
                "сетевой",
        };

        String[] wordListThree = {
                "процесс",
                "пункт разрузки",
                "выход из положения",
                "тип структуры",
                "талант",
                "подход",
                "портал",
                "период времени",
                "обзор",
                "образец",
                "пункт следования",
                "уровень внимания"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все что нам нужно, - это " + phrase);


    }
}
