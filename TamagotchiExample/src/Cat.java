/**
 * Cat
 */
public class Cat {
    //private -> we don't want to give other possibility to change variables "manually" ommiting interaction methods
    private String name;
    private int age;
    private String colour;
    private boolean happy;
    private boolean hunger;
    private Keeper myKeeper;

    @Override
    public String toString() {
        return "Cat's name is " + name + ", age is " + age + ", colour is" + colour + ", isHappy? " + happy + ", isHungry? " + hunger + ", myKeeper is" + myKeeper;
    }

    public Cat(int age, String colour) {
        this.age = age;
        this.colour = colour;
        this.happy = false;
        this.hunger = true;
    }

    public Cat(String name, int age, String colour, boolean happiness, boolean hunger, Keeper myKeeper) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.happy = happiness;
        this.hunger = hunger;
        this.myKeeper = myKeeper;
    }

    public void setKeeper(Keeper newKeeper) {
        this.myKeeper=newKeeper;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    private void meow(){
        System.out.println(this.name+ " says: Meow!");
    }

    public void drink(){
        System.out.println(this.name + " says: Mlask hlap hlap!");
        this.happy=true;
        this.meow();
    }

    public void eat() {
        System.out.println(this.name + " says: Mlask mlask!");
        this.happy = true;
        this.hunger = false;
        this.meow();
    }

    public void play(){
        double randHappines = Math.random();
        double randHunger = Math.random();
        this.happy = false;
        this.hunger = false;
        if(randHunger >= 0.5){
            this.hunger = true;
        }
        if (randHappines >= 0.5) {
            this.happy = true;
        }
        System.out.println(this.name + " is running and says... ");
        this.showMood();
    }

    private void showMood(){
        if(this.happy && !this.hunger){
            System.out.println(this.name + " says: Mrrrrrrrr");
        }
        else if (this.happy && this.hunger) {
            System.out.println(this.name + " says: \"I love you but give me food!!!!\"");
        }
        else {
            System.out.println(this.name + " says: \" Don't touch me!!!!\"");
        }
    }
    
    
    

}