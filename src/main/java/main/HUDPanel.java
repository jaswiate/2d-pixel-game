//package main;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class HUDPanel extends JPanel implements Runnable {
//    GamePanel GP;
//    Vector2d posHP = new Vector2d(50, 30);
//
//    public HUDPanel(GamePanel GP) {
//        this.GP = GP;
//        this.setPreferredSize(new Dimension(GP.screenWidth, 100));
//        this.setBackground(Color.BLACK);
//        this.setDoubleBuffered(true);
//    }
//
//    public void update() {
//
//    }
////    public void paintComponent(Graphics g) {
////        super.paintComponent(g);
////        Graphics2D g2 = (Graphics2D) g;
////        switch(GP.player.getHP()) {
////            case 1 ->
////        }
////    }
//
//    @Override
//    public void run() {
//        while(GP.gameThread != null) {
//            update();
//            repaint();
//            try {
//                Thread.sleep(1000 / GP.FPS);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
