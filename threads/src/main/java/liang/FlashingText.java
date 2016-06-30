package liang;

import javax.swing.*;

/**
 * Created by ilyarudyak on 6/30/16.
 */
public class FlashingText extends JApplet {

    private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);

    public FlashingText() {
        add(jlblText);
        new Thread( () -> {
            try {
                while (true) {
                    if (jlblText.getText() == null)
                        jlblText.setText("Welcome");
                    else
                        jlblText.setText(null);

                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException ex) {
            }
        } ).start();
    }

    private static void setupFrame() {
        JFrame frame = new JFrame("FlashingText");
        frame.add(new FlashingText());
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> setupFrame() );
    }

}
