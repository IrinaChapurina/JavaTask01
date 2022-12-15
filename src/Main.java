public class Main {
    public static void main(String[] args) {
        int costTicket = 10_000;
        int costBonus = 20;
        int milesBonus = costTicket / costBonus;
        System.out.println("Количество бонусных миль: " + milesBonus);

    }
}
