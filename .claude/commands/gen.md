GitHub Issue -> LeetCode(or 프로그래머스) 이동해서 소스코드와 테스트 코드를 코틀린으로 작성해줘
- https://github.com/antop-dev/algorithm/issues/$1

각각 P{문제번호}.kt P{문제번호}Test.kt 파일을 작성해줘.

- LeetCode 문제일 경우: {문제번호}는 LeetCode의 문제번호야 (GitHub Issue의 문제번호가 아니야!)
- 프로그래머스 문제일 경우: {문제번호}는 프로그래머스 URL의 마지막 숫자야
- 구현 코드가 없는 빈 메서드까지만 만들어줘
    ```kotlin
    class P0000 {
        fun x(): Int {
            return 0
        }
    }
    ```
- P{문제번호}.kt 클래스 위에 `// {github 이슈 링크}` 수적을 달아줘
- 테스트 코드는 만들어져 있는 테스트 파일 중 최신 것을 참고해서 패턴을 맞춰줘
- 문제 설명에 있는 테스트 케이스는 그대로 옮기고 추가로 30개까지 만들어줘 `example __` 숫자는 두자리.
    - 제시된 조건중 빈 예제 / 임계치에 가장 적은 예제 가장 많은 예제는 꼭 포함해줘
- 코드만 작성하고 빌드나 테스트는 할 필요 없어
    - 리턴 타입에 맞는 기본 값을 리턴까지만 해줘 (예: `return 0` / `return null` / `return ""` / return `intArrOf()` / return `arrayOf()`)
