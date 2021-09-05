## day 07. OOP 심화
> 과제
1. Trans 추상 클래스
    - 추상 메소드 strat()/ stop()
    - name()
    - public String name() {
        return "기차";
    }
    - sub Class: Subway/ Bus/ Bicycle/ Plain
    - 하위 클래스에서 start랑 stop에 대한 출발 멈춤에 대해 출력

-> 폴더 p_01_tran_cla

2. 과제1을 인터페이스로 바꾸기
    - Bus/ Plane class 구현하기

-> 폴더 p_02_tran-inter

3. Employee(직원) class 구현하기
    - 이름, 연락처, 부서, 직급, // 급여
    - Emp <- Regular
    - Regular <- Sales
    - Enp <- Parttime(시간 * 일수 * 8500)

-> 폴더 p_03_emp_inherit