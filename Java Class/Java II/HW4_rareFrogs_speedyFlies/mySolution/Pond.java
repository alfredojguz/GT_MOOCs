public class Pond {
    // Main Driver for encapsulated Frog and Fly Classes 
    public static void main(String args[]) {
        // Instantiating Frogs 
        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15);
        Frog Peepaw = new Frog("Peepaw", 4.6, 5);
        Frog Froakie = new Frog("Froakie", 3.3, 3); // frog of my liking

        // Instantiating Flies
        Fly fly1 = new Fly(1,3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly(4, 3); // fly of my liking

        // set species of frog
        Froakie.species = "1331 Frogs"; // * (1) no need for static on others because we're not changing for every instance
        System.out.println(Peepo.toString()); // (2) print statement works for floating points
        Peepo.eat(fly2); // (3)
        System.out.println(fly2.toString()); // (4)
        Peepo.grow(8); // (5)
        Peepo.eat(fly2); // (6)
        System.out.println(fly2.toString());// ! (7) should be the growing fly because speeds are equal
        System.out.println(Peepo.toString()); // (8)
        System.out.println(Froakie.toString()); // (9)
        Peepaw.grow(4); // (10)
        System.out.println(Peepaw.toString()); // (11)
        System.out.println(Pepe.toString()); // (12)
        
    }
}
