package com.Paint.Paint.services.shapes;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("triangle")
public class Triangle extends shape {
    private double radius;
    private int sides;
    public Triangle (ShapeDTO t){
        super(t);
        this.radius = t.radius ;
        this.sides = t.sides ;
    }
    public Triangle(Triangle t){
        super(t);
        this.radius = t.radius ;
        this.sides = t.sides ;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public shape clone(String cloneid) throws CloneNotSupportedException {
        Triangle clonesquare = new Triangle(this);
        clonesquare.setId(cloneid);
        return clonesquare;
    }
}
 