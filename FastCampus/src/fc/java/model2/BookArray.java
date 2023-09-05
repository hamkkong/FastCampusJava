package fc.java.model2;

import java.util.Arrays;

// IntArray 에서 cmd+C , cmd+V
public class BookArray {  // 현재 Book 이 들어간 코드를 다른 클래스 명으로 대체 가능
    private  final int DEFAULT_CAPACITY = 5;  // 수정불가(final) 불변의 상수값 : 현재 저장공간의 크기
    private  Book[] elements;  // elements 라는 이름의 배열을 만듬
    private int size = 0; // 배열 안의 숫자 개수를 초기화

    public BookArray(){
        elements=new Book[DEFAULT_CAPACITY];   // 5개크기배열
    }
    // 저장하는 동작
    public void add(Book element){
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
    public Book get(int index){  // -1, 5~ 제외
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
