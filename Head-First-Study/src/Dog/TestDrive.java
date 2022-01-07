package Dog;

public class TestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();

        PoorDog three = new PoorDog();
        System.out.println("Dog three size is " + three.getSize()); // 0
        System.out.println("Dog three name is " + three.getName()); // null
    }
}
