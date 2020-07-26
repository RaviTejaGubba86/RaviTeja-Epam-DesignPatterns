package Factory;
import java.util.*;
import java.io.*;
public class getAnimalCharacteristics {
    public static void main(String args[])throws IOException{
        getAnimalCharacteriticsFactory animalFactory = new getAnimalCharacteriticsFactory();
        Scanner in=new Scanner(System.in);
        System.out.print("Type elephant or cat or dog");
        String animalName=in.next();
        Animal p = animalFactory.getAnimal(animalName);
        System.out.println(animalName+" is a "+p.getFoodType()+" ,it is "+p.getSize()+" in size and it "+p.getSound());
    }
}
