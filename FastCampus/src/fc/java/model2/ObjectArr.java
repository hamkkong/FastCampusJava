package fc.java.model2;

public class ObjectArr<T> {
   private T[] array;  // T는 아직 결정이 안된 상태
    private int size;
    public ObjectArr(int size){
        array=(T[])new Object[size];
    }

    public void set(int index, T value){
        array[index] = value;
    }

    public T get(int index){
        return  array[index];
    }

    public int size(){
        return array.length;
    }
}
