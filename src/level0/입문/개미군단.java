package level0.입문;

public class 개미군단 {

    //개미 군단이 사냥을 나가려고 합니다.
    // 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
    // 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
    // 예를 들어 체력 23의 여치를 사냥하려고 할 때,
    // 일개미 23마리를 데리고 가도 되지만,
    // 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
    // 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면
    // 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.

    public int solution(int hp) {
        int answer = 0;
        answer += hp/5;
        hp %= 5;
        answer += hp/3;
        hp %= 3;
        answer += hp;

        return answer;
    }

    public int solution2(int hp) {
        int answer = 0;
        int[] attack = {5, 3, 1}; // 공격력 배열 (큰 수부터)

        for (int atk : attack) {
            answer += hp / atk; // 해당 공격으로 가능한 횟수 추가
            hp %= atk; // 남은 HP 계산
        }

        return answer;
    }

    public int solution3(int hp) {
        if (hp == 0) return 0;
        if (hp >= 5) return hp / 5 + solution(hp % 5);
        if (hp >= 3) return hp / 3 + solution(hp % 3);
        return hp; // 남은 HP가 1 또는 0일 경우 그대로 반환
    }
}
