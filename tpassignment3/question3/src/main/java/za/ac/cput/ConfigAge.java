package za.ac.cput;

/**
 * Created by JAYSON on 2016-03-13.
 */
@Configuration
public class ConfigAge {
    public DetermineAgeInterface getAge() throws Exception
    {
        @Bean(age = "determineAge")
        public DetermineAgeInterface getAgeService()
        {
            return new DetermineAgeServiceImpl();
        }
    }
}
