package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import static com.company.Statistics.*;

public class Gra extends JPanel implements KeyListener, ActionListener {

    public Gra(){
        time = new Timer(1,this);
        time.start();
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }
    public void paint(Graphics g){
        if(level==0){
            g.setColor(Color.black);
            g.fillRect(0,0,700,600);
            //punkty
            g.setColor(Color.WHITE);
            g.fillRect(startX,400,140,70);
            g.fillRect(quitX,400,140,70);
            g.setFont(new Font("serif", Font.BOLD, 50));
            g.drawString("DONT TOUCH",170, 100);
            g.drawString("GAME",260, 150);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.setColor(Color.black);
            g.fillRect(140,410,120,50);
            g.fillRect(430,410,120,50);
            g.setColor(Color.WHITE);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("START",150, 445);
            g.drawString("QUIT",450, 445);
//            g.drawString("Level: " +level,570, 40);
        }
        if(level == 1){
            g.setColor(Color.black);
            g.fillRect(0,0,700,600);
            //Gracz
            g.setColor(Color.ORANGE);
            g.fillRect(x,475,60,60);
            //Wróg
            g.setColor(Color.red);
            g.fillRect(enemyX1,ey,50,50);
            g.fillRect(enemyX2,ey,50,50);
            //punkty
            g.setColor(Color.WHITE);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Punkty: " +punkty,570, 20);
            g.drawString("Level: " +level,570, 40);
        }
        if(punkty >= 10 && punkty <=20){
            g.setColor(Color.black);
            g.fillRect(0,0,700,600);
            //Gracz
            g.setColor(Color.ORANGE);
            g.fillRect(x,475,60,60);
            //Wróg
            g.setColor(Color.pink);
            g.fillRect(enemyX1,ey,52,52);
            g.fillRect(enemyX2,ey,52,52);
            g.fillRect(enemyX3,ey,52,52);
            //punkty
            g.setColor(Color.WHITE);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Punkty: " +punkty,570, 20);
            g.drawString("Level: " +level,570, 40);
        }
        if(punkty >= 20 && punkty <=30){
            g.setColor(Color.black);
            g.fillRect(0,0,700,600);
            //Gracz
            g.setColor(Color.ORANGE);
            g.fillRect(x,475,60,60);
            //Wróg
            g.setColor(Color.GREEN);
            g.fillRect(enemyX1,ey,54,54);
            g.fillRect(enemyX2,ey,54,54);
            g.fillRect(enemyX3,ey,54,54);
            g.fillRect(enemyX4,ey,54,54);
            //punkty
            g.setColor(Color.WHITE);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Punkty: " +punkty,570, 20);
            g.drawString("Level: " +level,570, 40);
        }
        if(punkty >=30){
            g.setColor(Color.black);
            g.fillRect(0,0,700,600);
            //Gracz
            g.setColor(Color.ORANGE);
            g.fillRect(x,475,60,60);
            //Wróg

            //punkty
            g.setColor(Color.WHITE);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Punkty: " +punkty,570, 20);
            g.drawString("Level: " +level,570, 40);
            g.setFont(new Font("serif", Font.BOLD, 100));
            g.drawString("WYGRANA",75, 300);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(level == 0){

            Rectangle start = new Rectangle(startX,ey,140,70);
            Rectangle quit = new Rectangle(quitX,ey,140,70);
        }
        if(level == 1){
            ey+=eyspeed;
            repaint();
            if(ey >= 580){
                punkty++;
                eyspeed++;
                ey = 6;
                enemyX1 = liczba.nextInt(6)*100;
                enemyX2 = liczba.nextInt(6)*100;
                //enemyX3 = liczba.nextInt(6)*100;
            }
            Rectangle gracz = new Rectangle(x,475,60,60);
            Rectangle wrog1 = new Rectangle(enemyX1,ey,50,50);
            Rectangle wrog2 = new Rectangle(enemyX2,ey,50,50);
            //Rectangle wrog3 = new Rectangle(enemyX3,ey,50,50);
            if(gracz.intersects(wrog1) || gracz.intersects(wrog2)){
                time.stop();
            }
        }
        if(punkty == 10){
            eyspeed=1;

        }
        if (punkty >= 10 && punkty <=20){
            level=2;
            ey+=eyspeed;
            repaint();
            if(ey >= 580){
                punkty++;
                eyspeed++;
                ey = 5;
                enemyX1 = liczba.nextInt(6)*100;
                enemyX2 = liczba.nextInt(6)*100;
                enemyX3 = liczba.nextInt(6)*100;
            }
            Rectangle gracz = new Rectangle(x,475,60,60);
            Rectangle wrog1 = new Rectangle(enemyX1,ey,52,52);
            Rectangle wrog2 = new Rectangle(enemyX2,ey,52,52);
            Rectangle wrog3 = new Rectangle(enemyX3,ey,52,52);
            if(gracz.intersects(wrog1) || gracz.intersects(wrog2) || gracz.intersects(wrog3)){
                time.stop();
            }
        }
        if(punkty == 20){
            eyspeed=1;

        }
        if (punkty >= 20 && punkty <=30){
            level=3;
            ey+=eyspeed;
            repaint();
            if(ey >= 580){
                punkty++;
                eyspeed++;
                ey = 5;
                enemyX1 = liczba.nextInt(6)*100;
                enemyX2 = liczba.nextInt(6)*100;
                enemyX3 = liczba.nextInt(6)*100;
                enemyX3 = liczba.nextInt(6)*100;
            }
            Rectangle gracz = new Rectangle(x,475,60,60);
            Rectangle wrog1 = new Rectangle(enemyX1,ey,54,54);
            Rectangle wrog2 = new Rectangle(enemyX2,ey,54,54);
            Rectangle wrog3 = new Rectangle(enemyX3,ey,54,54);
            Rectangle wrog4 = new Rectangle(enemyX3,ey,54,54);
            if(gracz.intersects(wrog1) || gracz.intersects(wrog2) || gracz.intersects(wrog3)|| gracz.intersects(wrog4)){
                time.stop();
            }
        }
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(x == 0){
                x=0;
            }else {
                x -= speed;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(x == 625){
                x = 625;
            }else{
                x+=speed;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            reset();
        }
    }

    private void reset() {
        ey = 10;
        eyspeed = 1;
        enemyX1 = liczba.nextInt(6)*100;
        enemyX2 = liczba.nextInt(6)*100;
        //enemyX3 = liczba.nextInt(6)*100;
        x = 300;
        punkty = 0;
        time.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}