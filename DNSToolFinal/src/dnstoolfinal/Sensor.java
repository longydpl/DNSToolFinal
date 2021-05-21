/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnstoolfinal;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author longy
 */
public class Sensor {
    private int x,y,dx,dy;
    private double radius;
    private float angle, timeLife;
    private ArrayList<Integer> listADJ =  new ArrayList();
    public Sensor() {
    }

    public Sensor(int x, int y, int dx, int dy, double radius, float angle, float timeLife) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.angle = angle;
        this.timeLife = timeLife;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getTimeLife() {
        return timeLife;
    }

    public void setTimeLife(float timeLife) {
        this.timeLife = timeLife;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
    public boolean checkConnect(Sensor s)
    {
        double r = this.radius;
        double d =  Math.sqrt(Math.pow( (this.getX()-s.getX()) ,2 )+ Math.pow( (this.getY()-s.getY()) ,2));
        double d1 =  Math.sqrt(Math.pow( (this.getDx()-s.getX()) ,2 )+ Math.pow( (this.getDy()-s.getY()) ,2));
        double sD = d*r*((d*d + r*r - d1*d1)/(2*d*r));
        return d<=r && sD >= (d*Math.cos(angle));
    }
    public void addADJSensor(int key){
        listADJ.add(key);
    }
    public ArrayList getListADJ(){
        return listADJ;
    }
}
