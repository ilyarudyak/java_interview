package weather;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class YahooParserTest {

    @Test
    public void testParse() throws Exception {
        InputStream nyData = getClass().getClassLoader().getResourceAsStream("ny_weather.xml");
        Weather weather = new YahooParser().parse( nyData );
        assertEquals( "New York", weather.getCity() );
        assertEquals( " NY", weather.getRegion() );
        assertEquals( "United States", weather.getCountry() );
        assertEquals( "78", weather.getTemp() );
        assertEquals( "Breezy", weather.getCondition() );
        assertEquals( "79", weather.getChill() );
        assertEquals( "60", weather.getHumidity() );
    }
}