select * from emp;

------SUBQUERY------------------------------------------------------------------------------------------
-- 메인 쿼리 안에서 또 다른 쿼리문이 있는 것
-- 반드시 서브쿼리를 괄호로 묶는다
-- 메인쿼리 보다 서브쿼리가 먼저 실해오디어 결과를 메인 쿼리의 조건으로 사용
-- 서브쿼리의 결과가 한 개 이상 반환될때는 in, any, all 연산자를 사용
-- 서브쿼리의 결과가 한 개일 때는 비교연산자 사용함
-- ex) select * from emp where ename = (서브쿼리 문자);
select * from emp2;
select * from emp2 where name ='백원만';
select * from emp2 where pay > 60000000;

select * from emp2 where pay > (select pay from emp2 where name ='백원만');

-- 문제1) emp2 테이블에서 평균 급여보다 작게 받는사람.
select * from emp2;


select * from emp2 where pay > (select avg(pay) from emp2);
-- 문제2) 학생 테이블에서 1학년(grade) 평균 키보다 큰 사람들 출력
select * from student;
select name, height from student
    group by height, name
    having avg(height) < HEIGHT;
select avg(height) from student;

select * from student where height > (select avg(height) from student where grade = 1);

-- 문제3) 학생 테이블, 학과 테이블을 사용하여 이윤나 학생과 전공(deptno1)이 동일한 학생들의 이름과 학과 이름 출력
select * from student;
select name, dname from STUDENT left join DEPARTMENT on deptno1 = deptno where deptno1 = (select deptno1 from student where name = '이윤나');

-- 문제4) 교수 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명 출력

select * from professor;

select name, hiredate, dname
from professor p left join department d
                           on p.deptno = d.deptno
where hiredate > (select hiredate
                  from professor
                  where name = '송도권');

-- 문제5) 학생 테이블에서 전공이 101인 학과의 평균 몸무게 보다 몸무게가 많은 학생들의 이름과 몸무게 구하기.

select * from student;

select name, weight
from student
where weight > (select avg(weight)
                from student
                where deptno1 = 101);

-- 서브쿼리의 결과가 한 개 이상 반환될때는 in, any, all 연산자를 사용
select empno, name, DEPTNO
    from EMP2
    where deptno in(1000, 1001, 1002, 1010, 2000, 2021);

select dcode from dept2 where area = '서울지사';

select empno, name, DEPTNO
    from EMP2
    where deptno in (select dcode from dept2 where area = '서울지사');