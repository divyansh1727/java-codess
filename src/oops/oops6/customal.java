package oops.oops6;

import java.util.ArrayList;
import java.util.Arrays;

public class customal {
    private static int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public customal(){
        this.data=new int[DEFAULT_SIZE];
    }
    public  void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];

        }
        data=temp;
    }
    private boolean isfull() {
        return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, int value) {
        data[index]=value;
    }

    @Override
    public String toString() {
        return "customal{" +
                "data=" + Arrays.toString(data)+ "size"+size +
                '}';
    }

    public static void main(String[] args) {
       customal list=new customal();
       list.add(5);
       list.add(4);
       list.add(41);
       list.add(14);
        System.out.println(list);

        //generics--- in below lines only integer is allowsd
        //generic called as parameterised type
//        ArrayList<String > arrayList=new ArrayList<>();
//        arrayList.add("Wdf");
//        System.out.println(arrayList);
        //---for integer
//        ArrayList<Integer > arrayList=new ArrayList<>();
//        arrayList.add(1);

//        list.add(2);
//        list.remove(1);
//        list.get(0);
//        list.set(1,4);

    }
}
