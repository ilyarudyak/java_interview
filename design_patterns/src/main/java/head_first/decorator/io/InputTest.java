package head_first.decorator.io;

import java.io.*;

/**
 * Created by ilyarudyak on 6/30/16.
 */
public class InputTest {

    public static void main(String[] args) {

        int c;
        String fileName = "src/main/resources/decorator_io.txt";

        try ( InputStream in = new LowerCaseInputStream(
                new BufferedInputStream( new FileInputStream(fileName) ) )
        ) {
            while ( (c = in.read()) != -1 ) {
                System.out.print( (char) c );
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
