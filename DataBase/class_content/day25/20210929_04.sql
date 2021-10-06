---------view---------------------
/*
create or replace view ���̸�
    as select ~
*/

select * from emp;

create or replace view a_emp
    as select empno, ename,deptno from emp;

-- emp ���̺� �����ϸ� v_emp ? 0 (���ŵ�)
-- v_emp ���̺� �����Ǹ� emp ? X (���žȵ�)

create view a_emp_30
    as select job, ename, sal from emp where deptno = 30;

select * from v_emp_30;

-- 1)
-- 2)
-- 3)
create view v_emp_3 as (
select  deptno as �μ���ȣ, round(avg(sal), 2) as ��ձ޿� from EMP
group by deptno having avg(sal) > 2000);
                       )
-- 4)
create or replace view v_emp_50
    as select job, sum(sal) as "�ѿ���"
from emp
where job != 'MANAGER'
group by job having sum(sal) >= 3000;