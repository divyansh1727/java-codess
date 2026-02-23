package oops.oops4;

public class objectdemo {
    int num;
    float gpa;

    public objectdemo(int num,float gpa) {
        this.num=num;
        this.gpa=gpa;

    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((objectdemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        objectdemo obj=new objectdemo(34,45.5f);
        objectdemo obj2=new objectdemo(34,66.5f);
        //.equals checks for the contnet and == checks the comparsion
        if(obj.equals(obj2)){
            System.out.println("obj2 greater");
        }

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

    }
}
