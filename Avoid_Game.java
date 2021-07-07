import java.awt.*;

import javax.swing.*;
/*프레임 워크*/

public class Avoid_Game extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;

    private Image introBackground;
    public Avoid_Game()
    {
        setTitle("Avoid game");
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        introBackground = new ImageIcon(Main.class.getResource("/images/메인화면.png")).getImage();
        introBackground=introBackground.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);

    }
    public void paint(Graphics g)
    {
        screenImage=createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        screenGraphic=screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage,0,0,null);
    }
    public void screenDraw(Graphics g)
    {
        g.drawImage(introBackground, 0 , 0 ,null);
        this.repaint();
    }
}
