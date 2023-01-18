import hs.aspectj.Rabbit;
import org.junit.Test;

public class AspectJTest {
    @Test
    public void aspectjAnnotationBaseExample() {
        Rabbit rabbit = new Rabbit();

        rabbit.drink();
        System.out.println();
        rabbit.eat();
    }
}
