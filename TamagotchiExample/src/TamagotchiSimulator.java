/**
 * TamagotchiSimulator
 */
public class TamagotchiSimulator {

    public static void main(String[] args) {
        Cat firstCat = new Cat(1, "Black");
        Cat secondCat = new Cat(4, "White");
        Cat unluckyCat = new Cat(3, "Gray");
        Keeper tom = new Keeper("Tom", 2);

        tom.addCat(firstCat, "Kitty");
        tom.addCat(secondCat, "Witty");
        tom.addCat(unluckyCat, "Zitty");

        tom.playWithCats();
        tom.waterCats();
        tom.playWithCats();
        tom.feedCats();
        tom.playWithCats();
        tom.listCats();

    }
}