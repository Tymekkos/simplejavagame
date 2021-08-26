package com.company;

import javax.swing.*;
import java.util.Random;

public class Statistics {
    public static int x =300;
    public static int punkty = 0;
    public static Timer time;
    public static int speed = 25;
    public static int ey = 10;
    public static int eyspeed = 1;
    public static int level = 1;
    public static Random liczba = new Random();
    public static int enemyX1 = liczba.nextInt(6)*100;
    public static int enemyX2 = liczba.nextInt(6)*100;
    public static int enemyX3 = liczba.nextInt(6)*100;
    public static int enemyX4 = liczba.nextInt(6)*100;
}
