package fc.java.model2;
 // 제네릭을 사용하면 코드의 유연성, 재사용성 높아짐, 타입의 안전성 보장
public class Pair <K,V>{
    private K key;  // 타입이 결정되지 않음
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

     public K getKey() {
         return key;
     }

     public void setKey(K key) {
         this.key = key;
     }

     public V getValue() {
         return value;
     }

     public void setValue(V value) {
         this.value = value;
     }
 }
