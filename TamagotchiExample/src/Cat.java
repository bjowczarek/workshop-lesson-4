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
        System.out.println("Meow!");
    }

    public void drink(){
        System.out.println("Mlask hlap hlap!");
        this.happy=true;
        this.meow();
    }

    public void eat() {
        System.out.println("Mlask mlask!");
        this.happy = true;
        this.hunger = false;
        this.meow();
    }

    public void play(){
        System.out.println("I'm running and say: ");
        this.showMood();
    }

    private void showMood(){
        if(this.happy && !this.hunger){
            System.out.println("Mrrrrrrrr");
        }
        else if (this.happy && this.hunger) {
            System.out.println("\"I love you but give me food!!!!\"");
        }
        else {
            System.out.println("\" Don't touch me!!!!\"");
        }
    }
    
    
    

}