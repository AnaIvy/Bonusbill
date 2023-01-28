public class Main {
    public static void main(String[] args) {
        int bill=100;
        int amount=8000;
        int bonus;
        int finalbill;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        finalbill = bill + amount + bonus;
        System.out.println("Клиент пополнил счёт на " + amount);
        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счет = " + finalbill);
    }
}