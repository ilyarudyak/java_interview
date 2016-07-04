package weather;

import org.apache.log4j.PropertyConfigurator;

import java.io.InputStream;

/**
 * Created by ilyarudyak on 7/4/16.
 */
public class App {

    private String zip;

    public App(String zip) {
        this.zip = zip;
    }

    public void start() throws Exception {

        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve( zip );

        // Parse Data
        Weather weather = new YahooParser().parse( dataIn );

        // Format (Print) Data
        System.out.print( new WeatherFormatter().format( weather ) );
    }

    public static void main(String[] args) throws Exception {

        // Configure Log4J
        PropertyConfigurator.configure(App.class.getClassLoader()
                .getResource("log4j.properties"));

        // Read the Zip Code from the Command-line (if none supplied, use 60202)
        String zipcode = "02101";
        try {
            zipcode = args[0];
        } catch( Exception e ) { }

        // Start the program
        new App(zipcode).start();
    }


}
