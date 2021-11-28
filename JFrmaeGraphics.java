import java.awt.*;
import java.awt.image.BufferedImage;


class SimpleGraphics {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();



        String message = "Hello world";
        int width = 100;
        int height = 100;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);



        Graphics2D graphics = img.createGraphics();
        graphics.setColor(Color.black);
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 12));



        FontMetrics fontMetrics = graphics.getFontMetrics();
        int stringWidth = fontMetrics.stringWidth(message);
        int stringHeight = fontMetrics.getAscent();



        graphics.drawString(message, (width - stringWidth) / 2, height / 2 + stringHeight / 4);
        System.out.println(System.currentTimeMillis() - time); //consistently ~2 seconds
    }
}