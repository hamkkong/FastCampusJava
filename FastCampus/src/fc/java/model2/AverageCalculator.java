package fc.java.model2;

public class AverageCalculator <T extends Number>{
    private T[] numbers;

    public AverageCalculator(T[] numbers){   // 생성자 메서드
        this.numbers=numbers;
    }

    public double calculateAverage(){  // 총점 결과 : double 타입으로 보냄
        double sum = 0.0;
        for(T number:numbers){
            sum+=number.doubleValue();
        }
        return sum/numbers.length;
    }
}
