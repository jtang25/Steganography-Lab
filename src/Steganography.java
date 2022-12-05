import java.awt.Color;

public class Steganography {
    /** * Clear the lower (rightmost) two bits in a pixel. */
    public static void clearLow( Pixel p ) {
        p.setColor(new Color((p.getRed()/4)*4,(p.getGreen()/4)*4,(p.getBlue()/4)*4));
    }
}