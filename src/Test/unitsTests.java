package Test;

import Model.Units.Footman;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by zac on 12/10/2015.
 */
public class unitsTests {

    private Footman f1 = new Footman("gbjfdg");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void FootmanAttackTest()  throws Exception{
        assertEquals(1, f1.getStrength());
    }
}
