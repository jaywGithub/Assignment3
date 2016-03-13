package za.ac.cput;

/**
 * Created by JAYSON on 2016-03-13.
 */
public class DetermineAgeTest {
    private DetermineAgeService service;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAge.class);
        service = (DetermineAgeService)ctx.getBean("age");
    }

    @Test
    public void testAge()throws Exception
    {
        DetermineAgeData data = service.getAge();
        Assert.assertEquals(data.getAge(), 36);
    }
}
