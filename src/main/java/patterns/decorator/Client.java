package patterns.decorator;

/**
 * @author Ghost
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 点一份炒饭
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDescription() + "  " + friedRice.cost());

        System.out.println("==============");
        // 点一份炒饭加蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDescription() + "  " + friedRice.cost());

        // 再加一个蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDescription() + "  " + friedRice.cost());

        // 加培根
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDescription() + "  " + friedRice.cost());
    }

}
