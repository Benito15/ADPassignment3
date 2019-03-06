package ac.za.cput;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Benito Kriel--215271319
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private Person newperson;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Before
    public void setUp() throws Exception {
        newperson = new Person();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void equalityNameTest()
    {
       Person person = new Person(15, "Jan");
       Person person1 = new Person(20,"Jan");

       int id =  15;
       String name = "jan";
       newperson.setId(id);
       newperson.setName(name);

        Assert.assertEquals("Jan", person.getName());
        Assert.assertEquals("Jan", person1.getName());
        Assert.assertEquals("Equality---jan", "jan", newperson.getName());
    }

    @Test
    public void checkSameReferenceTest()
    {
        Person person = new Person(15, "Jan");
        Person person1 = new Person(20,"Jan");
        Person person3 = new Person(20,"Jan");

        int id =  15;
        String name = "Jan";
        newperson.setId(id);
        newperson.setName(name);

        Assert.assertSame("Identity",person.getName(), person1.getName());
        Assert.assertSame("Identity",person.getName(), person3.getName());
        Assert.assertSame("IDENTITY---jan",newperson.getName(), person3.getName());
    }

    @Test(timeout =  1)
    public void timeOutTest()
    {

//       Assert.assertTrue(true);

    }

    @Test
    public void failTest()
    {

        Person person = new Person(15, "Jan");
        Assert.assertSame("failing","Janpiere", person.getName());
       // Assert.assertSame("failing","Jan", person.getName());
    }


    @Ignore("When will woman stop blaming man")
    @Test
    public void ignoreTest()
    {
        Assert.assertFalse(false);

    }


}
