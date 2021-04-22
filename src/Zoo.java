public class Zoo {

    public static void main(String[] args) {
        var animal1 = new Animal(36,"male",87);
        var animal2 = new Animal(7,"female",24);
        var animal3 = new Animal(12,"female",55);

        var fish = new Fish();
        fish.swim();
        System.out.println("\n");

        var bird = new Bird();
        bird.fly();
        System.out.println("\n");

        animal1.eat();
        animal1.sleep();
        System.out.println("\n");

        animal2.eat();
        animal2.sleep();
        System.out.println("\n");

        animal3.eat();
        animal3.sleep();
        System.out.println("\n");
    }
}
