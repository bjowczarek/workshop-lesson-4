/**
 * TamagotchiSimulator
 */
public class TamagotchiSimulator {

    public static void main(String[] args) {

        /*
         * Tom has place for two cats.
         */
        Keeper tom = new Keeper("Tom", 2);

        /*
         * There were 3 cats running around.... ex 1. instantiate 3 cats
         */
        Cat firstCat = new Cat(1, "Black");
        Cat secondCat = new Cat(4, "White");
        Cat unluckyCat = new Cat(3, "Gray");
        
        /*
         * Tom really wanted to take 3 of them home ex 2.look to Keeper class, add use
         * method to add all cats to Tom's possesion.
         */
        tom.addCat(firstCat, "Kitty");
        tom.addCat(secondCat, "Witty");
        tom.addCat(unluckyCat, "Zitty");

        /*
         * Tom has lots of fun and resposibilities because of his decision ex 3. look to
         * Keeper class. How instruct Tom to play and take care of cats? write as many
         * actions as you want.
         */
        tom.playWithCats();
        tom.waterCats();
        tom.playWithCats();
        tom.feedCats();
        tom.playWithCats();
        tom.listCats();

        /*
         * Cats are really independent. ex 4. look to Cat class and try to play with
         * cats directly, ommiting Tom. Maybe you could do sth for alone one? write as
         * many actions as you want.
         */
        unluckyCat.eat();
        unluckyCat.drink();
        unluckyCat.play();
        firstCat.play();
        firstCat.eat();

    }
}