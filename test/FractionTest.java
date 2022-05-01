import com.company.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {
    @Test
    public void testSum() {
        Fraction f1 = new Fraction(1,4);
        f1.sum(new Fraction(1,4));
        Assert.assertEquals("Fraction sum numerator",1,f1.getNumerator());
        Assert.assertEquals("Fraction sum denumerator",2,f1.getDenumerator());

        Fraction f2 = new Fraction(3,5);
        f2.sum(new Fraction(1,4));
        Assert.assertEquals("Fraction sum numerator",17,f2.getNumerator());
        Assert.assertEquals("Fraction sum denumerator",20,f2.getDenumerator());
    }
}