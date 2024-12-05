package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OldApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //랜덤 스캐너를 넣을 경우 반복문 안에 넣게 되면 반복을 돌릴 때 마다 새로운 랜덤을 만든다

        boolean isCorrect = false; // 정답 여부

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

//        int computerNumber1 = 1; //변수 이름은 최대한 자세히
//        int computerNumber2 = 2;
//        int computerNumber3 = 3;
        List<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(3);
        computerNumbers.add(6);
        computerNumbers.add(9);

        while (!isCorrect) {

            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요
            int strike = 0;           // 스트라이크 개수
            int ball = 0;            // 볼 개수



            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
                System.out.println(strike + " strike " + ball + " ball");

                // TODO: 3 스트라이크인 경우 게임을 끝내세요

                if (strike == 3) {
                    break;
                }
            }System.out.println("축하합니다! 정답을 맞추셨습니다.");

        }

    }

