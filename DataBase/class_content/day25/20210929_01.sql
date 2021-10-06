select * from emp, dept;

/* Union -  pk/fk (x)
*/
-- ���̺� ���� / ���ڵ� ���� : ���� ����(CONSTRAINT_TYPE)�� ���簡 �ȵȴ�.

/*
 ����> create table ���ο� ���̺� �̸�
    as select * from ������ ���̺�;
 */

select * from emp;
create table c_emp2
    as select * from emp2;

select * from c_emp2;

create table c_emp_20
    as select * from emp where DEPTNO=20;

select * from c_emp_20;

create table c_emp_30
    as select empno ��ȣ, ename �̸�, job ����, sal �޿�
    from emp where DEPTNO=30;

SELECT * from c_emp_30;

-- ����1) ���� ���̺��� ���Ӱ��縸 �����ؼ� ���̺� �����ϱ�
select * from professor;

select * from c_professor2;

create table c_professor2
    as select * from professor
    where position='���Ӱ���';
-- ����2) emp(����) ���̺��� mgr(�Ŵ�����ȣ)�� 7566���� ����� �����ؼ� ���ο� ���̺� �����ϱ�
select * from emp;

create table c_emp_7566
    as select * from EMP
    where mgr='7566';

select * from c_emp_7566;

----------------------------------------------------------------------------------------------------
-- ���Ӱ��� c_professor2
-- 7566(mgr) c_emp 7566
--
/*
insert �� �� ���ڵ带 �ٸ� ���̺��� �����ͼ� �����ϱ�
����>
insert into ���̺��̸�
    select �÷���, ... from ���̺��̸�
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

select * from c_emp; -- ��ü����
select * from c_emp_20; -- ����(�μ� ��ȣ�� 20���� ���ڵ�)�� �°� ���̺� ����
select * from c_emp3; -- �������� ���� (���ڵ� ���� ����)
select * from c_emp_30; -- empno, ename, job, sal ���ϴ� �ʵ常 ����

----------------------------------------------------------------------------------------------------
-- union pk/fk (x)�ƴ� ���� ���̺� ��ġ��
select * from EMP
    union -- �ߺ� ���ڵ� �����ϰ� �դ��� ������
select * from c_emp;

insert into c_emp(empno, ename, deptno) values(303, 'test', 40);

select * from EMP
union all -- �ߺ� ���ڵ� �����ؼ� ������
select * from c_emp;

-- [42000][1789] ORA-01789: ���� ����� ����Ȯ�� ���� ��� ���� ������ �ֽ��ϴ�.
select * from emp -- �ʵ� ������ ���������
union
select * from c_emp_30;

select empno, ename, job, sal from emp -- �ʵ� ����, ������ Ÿ���� ��ġ�ؾ���
union
select * from c_emp_30; --empno, ename, job, sal

--����4] �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ�
--    �÷����� New Salary�� �����Ͽ� ����Ͻÿ�.
select empno, ename, sal, round(sal * 1.15) "New Salary"
from emp;

select empno, ename, sal, round((sal * 1.15), 0) "New Salary"
from emp;

select empno, ename, sal, cast(sal * 1.15 as int) "New Salary"
from emp;

--����5]�� ����� �̸��� ǥ���ϰ�, �ٹ� �� ���� ����Ͽ� �÷�����
--     Months_Works�� �����ϰ�, �ٹ� �޼��� �������� ������ �������
--     �����Ͽ� ����Ͻÿ�.
select ename, round(months_between(sysdate, hiredate)) "Months_Works"
from emp
order by hiredate;

select ename, hiredate, MONTHS_BETWEEN(SYSDATE, HIREDATE) "MONTHS_WORKS"
from emp order by HIREDATE desc;

select ename, hiredate, round(MONTHS_BETWEEN(SYSDATE, HIREDATE), 0) "MONTHS_WORKS"
from emp order by HIREDATE desc;

select ename, hiredate, trunc(MONTHS_BETWEEN(SYSDATE, HIREDATE), 0) "MONTHS_WORKS"
from emp order by "MONTHS_WORKS" desc;

--����6]����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ����
--    ����� Ŀ�̼��� 'no commission'���� ����Ͻÿ�.
select ename, nvl(to_char(comm), 'no commission')
from emp;

select ename, Cast(comm as varchar2(20)) from emp where comm is null;

select ename, nvl(Cast(COMM as varchar2(20)), 'no commission') from emp;-- where comm is null;

------------------------------------------------
/*
insert �� �� ���ڵ带 �ٸ� ���̺��� �����ͼ� �����ϱ�
    ����>
insert into ���̺��̸�
select �÷���, ... from ���̺��̸�
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

insert into c_emp5 -- �ʵ� ����, ������ Ÿ���� �¾ƾ���
    select empno, name, birthday, pay from emp2;

------------------------------------------------------------------------------------------------