package fc.java.model2;

import java.util.Arrays;

// IntArray 에서 cmd+C , cmd+V
public class ObjectArray {  // 현재 Book 이 들어간 코드를 다른 클래스 명으로 대체 가능
    private final int DEFAULT_CAPACITY=5;
    private  Object[] elements;  // 다형성 배열
    private int size = 0; // 배열 안의 숫자 개수를 초기화

    public ObjectArray(){
        // 수정불가(final) 불변의 상수값 : 현재 저장공간의 크기
        //int DEFAULT_CAPACITY = 5;
        // elements=new Object[DEFAULT_CAPACITY];   // 5개크기배열
        this(5); // this(5) : 생성자 안에서 다른 생성자를 호출할 때 사용 (여기선 바로 아래 생성자를 호출했음)
    }
    public ObjectArray(int capacity){  // 생성자를 추가 (원하는크기의 배열을 생성한다. ) -> 제어권이 이쪽으로 넘어옴
        elements=new Object[capacity];
    }
    // 저장하는 동작
    public void add(Object element){
        if (size == elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2; // 배열이 5개 -> 10개로 늘어남
       elements = Arrays.copyOf(elements, newCapacity); // 원래 배열에 있는 숫자를 증가된 부분으로 옮김(복사)
    }

    //얻는동작
    public Object get(int index){  // -1, 5~ 제외
        if(index<0 || index>=size){
            throw  new IndexOutOfBoundsException("인덱스의 범위를 벗어남");  //JVM이 예외를 처리함
        }
        return elements[index];

    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
}
