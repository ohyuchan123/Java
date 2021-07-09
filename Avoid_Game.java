import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*프레임 워크*/
class buttonSet extends JFrame{
    JButton button;
    int x;
    int y;
    int width;
    int height;
    public buttonSet(JButton button,int x,int y,int width,int height){
        this.button = button;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void setting(){
        add(button);
        button.setBounds(x,y,width,height);
        button.setVisible(true);
    }

}
public class Avoid_Game extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;
    /*이미지 출력 및 버튼*/
    private Image introBackground;
    private ImageIcon startButtonEnteredImage=new ImageIcon(Main.class.getResource("/images/시작하기.png"));
    private ImageIcon scoreButtonEnteredImage=new ImageIcon(Main.class.getResource("/images/기록.png"));
    private ImageIcon gameplayButtonEnteredImage=new ImageIcon(Main.class.getResource("/images/게임방법.png"));
    private ImageIcon ProducersButtonEnteredImage=new ImageIcon(Main.class.getResource("/images/제작자.png"));

    private ImageIcon start=new ImageIcon(Main.class.getResource("/images/시작화면.png"));
    private ImageIcon producer=new ImageIcon(Main.class.getResource("/images/제작자3.png"));
    private ImageIcon score=new ImageIcon(Main.class.getResource("/images/기록3.png"));
    private ImageIcon play=new ImageIcon(Main.class.getResource("/images/컨트롤창.png"));

    private JButton startButton= new JButton(startButtonEnteredImage);
    private JButton producerButton=new JButton(ProducersButtonEnteredImage);
    private JButton scoreButton=new JButton(scoreButtonEnteredImage);
    private JButton playButton=new JButton(ProducersButtonEnteredImage);

    public Avoid_Game() {
        /*버튼*/
        JFrame sfrm = new JFrame();
        JLabel lb = new JLabel(start);
        JFrame pfrm = new JFrame();
        JLabel lb1 = new JLabel(producer);
        JFrame plfrm=new JFrame();
        JLabel lb2=new JLabel(play);
        JFrame scfrm=new JFrame();
        JLabel lb3=new JLabel(score);
        /*버튼 화면 크기*/
        sfrm.add(lb);
        sfrm.setSize(1920,1080);
        pfrm.add(lb1);
        pfrm.setSize(1920,1080);
        plfrm.add(lb2);
        plfrm.setSize(1920,1080);
        scfrm.add(lb3);
        scfrm.setSize(1920,1080);

        setTitle("Avoid game");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        /*메인 화면*/
        introBackground = new ImageIcon(Main.class.getResource("/images/메인화면.png")).getImage();
        introBackground = introBackground.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        /*시작 버튼*/
        startButton.setBounds(753, 515, 120, 120);
        startButton.setBorderPainted(false);
        add(startButton);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pq");
                sfrm.setVisible(true);
            }
        });
        /*제작자 버튼*/
        producerButton.setBounds(1500, 900, 120, 120);
        producerButton.setBorderPainted(false);
        add(producerButton);
        producerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("fd");
                pfrm.setVisible(true);
            }
        });
        /*플레이 방법 버튼*/
        playButton.setBounds(100,250,120,120);
        playButton.setBorderPainted(false);
        add(playButton);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("jd");
                plfrm.setVisible(true);
            }
        });
        /*기록 버튼*/
        scoreButton.setBounds(200,880,120,120);
        scoreButton.setBorderPainted(false);
        add(scoreButton);
        scoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("dj");
                scfrm.setVisible(true);
            }
        });
        /*음악*/
        Music introMusic = new Music("introMusic.mp3", true);
        introBackground = introBackground.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        introMusic.start();
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
        /*버튼 위치 출력*/
        g.drawImage(introBackground, 0 , 0 ,null);
        g.drawImage(startButtonEnteredImage.getImage(),753,515,null);
        g.drawImage(ProducersButtonEnteredImage.getImage(),1500,900,null);
        g.drawImage(scoreButtonEnteredImage.getImage(),200,880,null);
        g.drawImage(gameplayButtonEnteredImage.getImage(),100,250,null);
        this.repaint();
    }
}
