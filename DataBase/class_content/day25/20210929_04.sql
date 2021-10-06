---------view---------------------
/*
create or replace view 뷰이름
    as select ~
*/

select * from emp;

create or replace view a_emp
    as select empno, ename,deptno from emp;

-- emp 테이블 제거하면 v_emp ? 0 (제거됨)
-- v_emp 테이블 삭제되면 emp ? X (제거안됨)

create view a_emp_30
    as select job, ename, sal from emp where deptno = 30;

select * from v_emp_30;

-- 1)
-- 2)
-- 3)
create view v_emp_3 as (
select  deptno as 부서번호, round(avg(sal), 2) as 평균급여 from EMP
group by deptno having avg(sal) > 2000);
                       )
-- 4)
create or replace view v_emp_50
    as select job, sum(sal) as "총월급"
from emp
where job != 'MANAGER'
group by job having sum(sal) >= 3000;