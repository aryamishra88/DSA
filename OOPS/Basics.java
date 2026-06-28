package OOPS;

public class Basics {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setTip(5);
        p1.setColor("blue");
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
    
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;

    }
    void setTip(int newTip){
        tip=newTip;
    }

}
