package OPPs.lec6;

import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(Object num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }

        data = newData;

    }

    private boolean isFull() {
        return size == data.length;
    }

    public Object remove(){
        return data[--size];
    }

    public int get(int index){
        return (int) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {

        //  <Integer> -> This is Generic (parameterised type)
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.remove(1);
//        list.set(1,65);
//        int l = list.size();

        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(22);
        list.add(33);

        System.out.println(list);

        for(int i = 0; i < 13; i++){
            list.add(i);

        }

        System.out.println(list);

        CustomArrayList<Double> list2 = new CustomArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        System.out.println(list2.remove());
        System.out.println(list2);

    }
}
