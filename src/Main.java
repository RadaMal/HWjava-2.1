
public class Main {
    public static void main(String[] args) {
        int bill = 500; //сумма на счете
        int ruble = 1200; // cумма пополнения
        int bonus;


        if (ruble > 1000) {
            bonus = ruble / 100; //если сумма пополнения большк 1000, начисление бонусов, 1 р за каждые 100 р
        } else {
            bonus = 0;
        }

        int balance = bill + ruble + bonus;
        //Нужно создать приложение, выводящее итоговый счёт и количество бонусных рублей.
        System.out.println("Итоговый счет: " + balance);// сумма на счету
        System.out.println("Бонусные рубли: " + bonus);// сумма бонусов

    }
}