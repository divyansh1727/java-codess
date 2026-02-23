package oops.oops3inh;
public class boxweight extends box{
    double w;

    public boxweight(double w) {
        this.w = w;
    }
public boxweight(double l,double h,double b,double weight){
        super(l,b,h);
        this.w=-1;
}

    public boxweight(int i, int i1, int i2) {
    }
}
