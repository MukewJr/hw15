public class Main {
    public static void main(String[] args) {
        Animal shark=new Shark("Blue wolf", "black",18, 1000,"white Shark", "male");

        Animal turtle=new Turtle("Flippy","gray", 100, 76);

        Animal eagle=new Eagle("Alp KaraKush", "white", 5, 17, "Ak Shumkar.");

        Animal[] animals={shark, turtle, eagle};
        for (Animal animal : animals) {
            if (animal instanceof Shark)
            {
                System.out.println(animal);
                animal.getEat();
                ((Shark) animal).getAttack();
            }
            if (animal instanceof Turtle)
            {
                System.out.println(animal);
                animal.getEat();
                ((Turtle) animal).getSwim();
            }
            if (animal instanceof Eagle)
            {
                System.out.println(animal);
                animal.getEat();
                ((Eagle)animal).getFly();
            }
        }
    }

}