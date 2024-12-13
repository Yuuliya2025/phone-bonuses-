public class Main {

    public static void main(String[] args) {

        int currentBalance = 19;
        int amount = 1749;

        int bonus;
        if (amount > 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }

        int finalBalance = currentBalance + amount + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }


}



