import java.util.*;

public class lottery {
    public static void main(String[] args) {
        int[] arr = new int[0];  // 배열 초기화
        
        System.out.println("lottery start!");
        int num;

        my_loop:
        while (true) {
            num = lottery_number();  // 무작위 로또 번호 생성

            for (int v : arr) {
                if (v == num) {
                    continue my_loop;  // 중복된 번호는 다시 생성
                }
            }
            arr = Arrays.copyOf(arr, arr.length + 1);  // 배열 크기 증가
            arr[arr.length - 1] = num;  // 새로운 번호 추가

            if (arr.length == 5) {  // 5개의 번호가 선택되면 종료
                break;
            }
        }
        Arrays.sort(arr);  // 번호를 정렬
        System.out.println(Arrays.toString(arr));  // 결과 출력
    }

    // 무작위 로또 번호 생성 함수 (1~45 사이)
    public static int lottery_number() {
        return (int)(Math.random() * 45) + 1;
    }
}
