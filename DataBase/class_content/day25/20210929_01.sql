select * from emp, dept;

/* Union -  pk/fk (x)
*/
-- 테이블 복사 / 레코드 복사 : 제약 조건(CONSTRAINT_TYPE)은 복사가 안된다.

/*
 형식> create table 새로운 테이블 이름
    as select * from 복사할 테이블;
 */

select * from emp;
create table c_emp2
    as select * from emp2;

select * from c_emp2;

create table c_emp_20
    as select * from emp where DEPTNO=20;

select * from c_emp_20;

create table c_emp_30
    as select empno 번호, ename 이름, job 직업, sal 급여
    from emp where DEPTNO=30;

SELECT * from c_emp_30;

-- 문제1) 교수 테이블에서 전임강사만 추출해서 테이블 생성하기
select * from professor;

select * from c_professor2;

create table c_professor2
    as select * from professor
    where position='전임강사';
-- 문제2) emp(직원) 테이블에서 mgr(매니저번호)가 7566번인 사람만 추출해서 새로운 테이블 생성하기
select * from emp;

create table c_emp_7566
    as select * from EMP
    where mgr='7566';

select * from c_emp_7566;

----------------------------------------------------------------------------------------------------
-- 전임강사 c_professor2
-- 7566(mgr) c_emp 7566
--
/*
insert 할 대 레코드를 다른 테이블에서 가져와서 삽입하기
형식>
insert into 테이블이름
    select 컬럼명, ... from 테이블이름
*/
select * from EMP;

create table c_emp3
    as select * from emp where 1=0;

create table c_emp4
as select * from emp
order by ename desc, sal desc, empno asc;
-- or

select * from c_emp4;

create table c_emp
    as select * from emp;

select * from c_emp; -- 전체복사
select * from c_emp_20; -- 조건(부서 번호가 20번인 레코드)에 맞게 테이블 생성
select * from c_emp3; -- 구조물만 복사 (레코드 복사 제외)
select * from c_emp_30; -- empno, ename, job, sal 원하는 필드만 복사

----------------------------------------------------------------------------------------------------
-- union pk/fk (x)아닌 상태 테이블 합치기
select * from EMP
    union -- 중복 레코드 제거하고 합ㅊ서 보여줌
select * from c_emp;

insert into c_emp(empno, ename, deptno) values(303, 'test', 40);

select * from EMP
union all -- 중복 레코드 포함해서 보여줌
select * from c_emp;

-- [42000][1789] ORA-01789: 질의 블록은 부정확한 수의 결과 열을 가지고 있습니다.
select * from emp -- 필드 갯수를 맞춰줘야함
union
select * from c_emp_30;

select empno, ename, job, sal from emp -- 필드 갯수, 데이터 타입이 일치해야함
union
select * from c_emp_30; --empno, ename, job, sal

--문제4] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
--    컬럼명을 New Salary로 지정하여 출력하시오.
select empno, ename, sal, round(sal * 1.15) "New Salary"
from emp;

select empno, ename, sal, round((sal * 1.15), 0) "New Salary"
from emp;

select empno, ename, sal, cast(sal * 1.15 as int) "New Salary"
from emp;

--문제5]각 사원의 이름을 표시하고, 근무 달 수를 계산하여 컬럼명을
--     Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터
--     정렬하여 출력하시오.
select ename, round(months_between(sysdate, hiredate)) "Months_Works"
from emp
order by hiredate;

select ename, hiredate, MONTHS_BETWEEN(SYSDATE, HIREDATE) "MONTHS_WORKS"
from emp order by HIREDATE desc;

select ename, hiredate, round(MONTHS_BETWEEN(SYSDATE, HIREDATE), 0) "MONTHS_WORKS"
from emp order by HIREDATE desc;

select ename, hiredate, trunc(MONTHS_BETWEEN(SYSDATE, HIREDATE), 0) "MONTHS_WORKS"
from emp order by "MONTHS_WORKS" desc;

--문제6]사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은
--    사원의 커미션은 'no commission'으로 출력하시오.
select ename, nvl(to_char(comm), 'no commission')
from emp;

select ename, Cast(comm as varchar2(20)) from emp where comm is null;

select ename, nvl(Cast(COMM as varchar2(20)), 'no commission') from emp;-- where comm is null;

------------------------------------------------
/*
insert 할 대 레코드를 다른 테이블에서 가져와서 삽입하기
    형식>
insert into 테이블이름
select 컬럼명, ... from 테이블이름
    */
select * from c_emp3;
insert into c_emp3
    select * from emp;

insert into c_emp3
    select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp;

create table c_emp5
    as select empno, ename, hiredate, sal from emp where 1=0;
drop table c_emp5;
select * from c_emp5;

-- desc emp2;

insert into c_emp5 -- 필드 갯수, 데이터 타입이 맞아야함
    select empno, name, birthday, pay from emp2;

------------------------------------------------------------------------------------------------