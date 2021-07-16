package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DynamicBeat extends JFrame{
    private Image screenImage;
    private Graphics screenGraphics;

    private ImageIcon exitButtonEnterdImage=new ImageIcon(Main.class.getResource ("/images/exitButtonEnterd.png"));
    private ImageIcon exitButtonBasicImage=new ImageIcon(Main.class.getResource ("/images/exitButtonBasic.png"));

    private ImageIcon startButtonEnterdImage=new ImageIcon(Main.class.getResource ("/images/startButtonEnterd.png"));
    private ImageIcon startButtonBasicImage=new ImageIcon(Main.class.getResource ("/images/startButtonBasic.png"));

    private ImageIcon quitButtonEnterdImage=new ImageIcon(Main.class.getResource ("/images/quitButtonEnterd.png"));
    private ImageIcon quitButtonBasicImage=new ImageIcon(Main.class.getResource ("/images/quitButtonBasic.png"));

    private  Image background =new ImageIcon(Main.class.getResource ("/images/배경화면.jpg")).getImage();
    private  JLabel menuBar =new JLabel(new ImageIcon(Main.class.getResource ("/images/menuBar.png")));

    private  JButton exitButton=new JButton(exitButtonBasicImage);
    private  JButton startButton=new JButton(startButtonBasicImage);
    private  JButton quitButton=new JButton(quitButtonBasicImage);

    /*현재 마우스의  (x)와(y)의 좌표를 알려준다*/
    private int mouseX,mouseY;

    public DynamicBeat(){
        setUndecorated(true);
        setTitle("Dynamic Beat");
        /*전체 화면의 크기를 1280*720으로 만들어 주는 함수*/
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        /*한 번 만들어진 화면창은 사용자가 임이적으로 줄이거나 크게 할 수 없다*/
        setResizable(false);
        /*게임창이 정 중앙에 뜨게 하는 함수*/
        setLocationRelativeTo(null);
        /*게임 창 종료시 프로그램 전체 종료*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*게임 창이 정상적으로 화면에 출력해주는 것*/
        setVisible(true);
        setBackground(new Color(0,0,0,0));
        setLayout(null);

        exitButton.setBounds(1245,0,30,30);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setIcon(exitButtonEnterdImage);
            }
            @Override
            public void mouseExited(MouseEvent e){
                exitButton.setIcon(exitButtonBasicImage);
            }
            @Override
            public void mousePressed(MouseEvent e){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.exit(0);
            }
        });
        add(exitButton);

        startButton.setBounds(525,550,200,50);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                startButton.setIcon(startButtonEnterdImage);
            }
            @Override
            public void mouseExited(MouseEvent e){
                startButton.setIcon(startButtonBasicImage);
            }
            @Override
            public void mousePressed(MouseEvent e){
                startButton.setVisible(false);
                quitButton.setVisible(false);
                background =new ImageIcon(Main.class.getResource("/images/mainBackground.png")).getImage();
            }
        });
        add(startButton);

        quitButton.setBounds(525,625,200,50);
        quitButton.setBorderPainted(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setFocusPainted(false);
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                quitButton.setIcon(quitButtonEnterdImage);
            }
            @Override
            public void mouseExited(MouseEvent e){
                quitButton.setIcon(quitButtonBasicImage);
            }
            @Override
            public void mousePressed(MouseEvent e){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.exit(0);
            }
        });
        add(quitButton);

        menuBar.setBounds(0,0,1280,30);
        menuBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX=e.getX();
                mouseY=e.getY();
            }
        });

        menuBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                int x=e.getXOnScreen();
                int y=e.getYOnScreen();
                setLocation(x-mouseX,y-mouseY);
            }
        });
        add(menuBar);

        Music introMusic=new Music("배경음악.mp3",true);
        introMusic.start();
    }
    public void paint(Graphics g)
    {
        screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        screenGraphics = screenImage.getGraphics();
        screenDraw(screenGraphics);
        g.drawImage(screenImage,0,0,null);
    }
    public void screenDraw(Graphics g){
        g.drawImage(background,0,0,null);
        paintComponents(g);
        this.repaint();
    }
}