import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string of numbers:");
        String input = br.readLine();

        Main main = new Main();
        int result = main.solution(input);

        System.out.println("The largest number that can be formed is: " + result);
    }


    /**
     * 각 자리가 숫자로만 이루어진 문자열 s가 주어졌을때 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에
     * 'X' 혹은 '+' 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요.
     * 단 + 보다 X 를 먼저 계산하는 일반적인 방식과 달리 모든 연산은 왼쪽부터 순서대로 이루어진다고 가정합니다
     * 
     * 예를들어 02984 라는 문자열이 주어지면 만들수 있는 가장큰수는 ((((0+2) X 9) X 8) X 4) = 576 이 됩니다.
     * 또한 만들어 질 수 있는 가장 큰수는 항상 20억 이하의 정수가 되도록 주어집니다다
     */
    public int solution(String s) {
        int result = 0;


        // 문자열 하나씩 자른다
        // 0, 1 이면 더한다
        // 그 외의 숫자면 곱한다

        char[] chars = s.toCharArray();

        for(char ch : chars){
            int num = Character.getNumericValue(ch);

            // result 가 0이나 1일때도 고려해야함
            if(num <= 1 || result <= 1){
                result += num;
            } else {
                result *= num;
            }

        }

    }
}