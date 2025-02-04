class Pet{
    String name;
    String species;
    int age;

    Pet(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void display(){
        System.out.println("Name of the pet:" + name);
        System.out.println("Species" + species);
        System.out.println("Age of the pet" + pet);
    }

    public int human_age(){
        if(species=="dog"){
            return age*7;
        }else{
            return age;
        }
    }
}

class Dog extends Pet{
    String toy;
    Dog(String name, String species, int age, String toy){
        super(name, species, age);
        this.toy = toy;
    }

    public void display(){
        super.display();
        System.out.println("Favourite toy" + toy);
    }
}

class Bird extends Pet{
    double wing;
    Bird(String name, String species, int age, double wing){
        super(name, species, age);
        this.wing = wing;
    }

    public void display(){
        super.display();
        System.out.println("Wing span:" + wing);
    }
}

class program2{
    public static void main(String[] args) {
        Dog d = new Dog("Enzo", "husky", 5, "teddy");
        d.display();

        Bird b = new Bird("lily", "parrot", 1, 10);
        b.display();

        System.out.println("Dog's age in human years: " + d.human_age());
        System.out.println("Bird's age in human years: " + b.human_age());
    }
}