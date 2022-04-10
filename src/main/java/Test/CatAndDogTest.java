package Test;

import classes.Cat;
import classes.Color;
import classes.Config;
import classes.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatAndDogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        /* CAT AND IT'S COLOR OBJECTS */
        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("Gray");
        color.setTexture_color("Grayish Black");
        c1.setCat_name("Kitty");
        c1.setBreed_name("Snow Shoe");
        c1.setOwner_name("Killana Gayatri Venkata Manikanta");
        c1.setColor(color);
        c1.catDisplay();

        /* DOG AND IT'S COLOR OBJECTS */
        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Brown");
        color1.setTexture_color("White");
        d1.setDog_name("Dummy");
        d1.setBreed_name("Boxer");
        d1.setOwner_name("Killana Gayatri Venkata Manikanta");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}