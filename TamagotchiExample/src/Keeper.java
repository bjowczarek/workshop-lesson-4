/**
 * Keeper
 */
public class Keeper {
    private String name;
    private Cat[] myCats;

    public Keeper(String name, int numberOfCats) {
        this.name = name;
        this.myCats = new Cat[numberOfCats];
    }

    public boolean addCat(Cat newCat, String catName ){
        boolean catAdded = false;
        for (int i = 0; i < this.myCats.length; i++) {
            if(this.myCats[i] != null){
                continue;
            }
            this.myCats[i] = newCat;
            this.myCats[i].setName(catName);
            this.myCats[i].setKeeper(this);;
            catAdded = true;
            break;
        }
        if (catAdded){
            System.out.printf("Cat %s added to keeper %s \n", catName, this.name);
        }
        else {
            System.out.printf("I don't have space :( I'll find %s better place :)\n", catName);
        }
        return catAdded;
    }

    public void playWithCats() {
        for (Cat cat : this.myCats) {
            cat.play();
        }
    }

    public void feedCats() {
        for (Cat cat : this.myCats) {
            cat.eat();
        }
    }

    public void waterCats() {
        for (Cat cat : this.myCats) {
            cat.drink();
        }
    }

    public void listCats() {
        for (Cat cat : this.myCats) {
            //toString() is automatically called
            System.out.println(cat);
        }
    }



}