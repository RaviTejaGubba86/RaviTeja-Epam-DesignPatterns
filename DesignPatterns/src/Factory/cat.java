package Factory;

public class cat extends Animal {

    @Override
    String getSound() {
return "Meow";
    }

    @Override
    String getFoodType() {
return "Omnivore";
    }

    @Override
   String getSize() {
return "Small";
    }
}
