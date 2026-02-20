package oops.oops3;
//inheritance example
public class box {
    double l;
    double h;
    double b;
    box(){
        this.l=-1;
        this.h=-1;
        this.b=-1;

    }
    //cube
    box(double side){
        this.b=side;
        this.h=side;
        this.l=side;
    }
    box(double l, double b, double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    box( box old ){
        this.l= old.l;
        this.b= old.b;
        this.h= old.h;
    }
    public void displayinfo(){
        System.out.println("rumming box");

    }

}
