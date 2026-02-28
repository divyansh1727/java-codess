package oops.oops6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//here T shpuld be num or its subclases like longfloat,shortfloat etc
public class wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public wildcard(){
        data=new Object[DEFAULT_SIZE];

    }
    //if want to place number type in subclass do this (?)
    public void getlist(List<? extends Number> list){

    }
    public  void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isfull() {
        return size==data.length;
    }
    public T remove(){
        //here casting done coz we need to add smaller type parm.
        T removed=(T)data[--size];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, T value) {
        data[index]=value;
    }

    @Override
    public String toString() {
        return "customgenral{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list2=new ArrayList<>();
        wildcard<Integer> list3=new wildcard<>();
        for (int i = 0; i <12; i++) {
            list3.add(2 * i);
        }
            System.out.println(list3);

    }
}
