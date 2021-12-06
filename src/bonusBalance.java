public class bonusBalance {
    public static void main(String[] args) {
        int initialBalance = 200;
        int topUpAmount = 1000;
        int bonusBalance = topUpAmount / 100;
        int totalBalanceNoBonus = initialBalance+topUpAmount;
        if (topUpAmount < 1000) {
            System.out.println("вы поплнили баланса на сумму:" + topUpAmount);
            System.out.println("Ваш баланс:" + totalBalanceNoBonus);
        } else {
            System.out.println("Ваш баланс составляет:" + (initialBalance + topUpAmount + bonusBalance));
        }
    }
}