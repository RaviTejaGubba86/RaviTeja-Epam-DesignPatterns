package BuilderPattern;

public class BuilderDemo {

    public static void main(String args[]){
       ChocolateBuilder chocolateBuilder=new ChocolateBuilder();
        chocolateType chocolateType1=chocolateBuilder.buildCadburyChocolate();
        chocolateType1.showItems();

       chocolateType chocolateType2=chocolateBuilder.buildNestleChocolate();
        chocolateType2.showItems();
    }
}
