public class Main {
    public static void main(String[] args) {
        int refill = 2500;
        int bonus = refill / 100;
        System.out.println("Бонус");
        System.out.println(refill / 100);
        int balance = 200;
        if (refill > 1000) {
            System.out.println("Баланс");
            System.out.println(refill + bonus + balance);
        } else {
            System.out.println(refill + balance);
        }
    }
}





