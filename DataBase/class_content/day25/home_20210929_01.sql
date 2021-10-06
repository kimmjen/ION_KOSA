select * from emp;
select * from dept;
--1)
select ename "�̸�", e.deptno"�μ���ȣ", d.dname "�μ��̸�"
from emp  e left join dept d
                      on e.deptno = d.deptno;

--2)
select ename "����̸�", job "����", e.deptno "�μ���ȣ", dname "�μ��̸�"
from emp e left join dept d
                     on e.deptno = d.deptno
where loc='DALLAS';

--3)
select ename "����̸�", dname "�μ��̸�"
from emp e left join dept d
                     on e.deptno = d.deptno
where ename like '%A%';

--4)
select ename "����̸�", dname"�μ��̸�", sal "����"
from emp e left join dept d
                     on e.deptno = d.deptno
where sal >= 3000;

--5)
select job "����", ename "����̸�", dname "�μ��̸�"
from emp e left join dept d
                     on e.deptno = d.deptno
where job = 'SALESMAN';

--6)
select empno "�����ȣ", ename "����̸�", sal "����", (sal + nvl(comm, 0)) "�Ǳ޿�", grade "�޿�"
from emp e left join salgrade s
                     on (sal + nvl(comm, 0)) between losal and hisal;

-- 7)
select empno "�����ȣ", ename "����̸�", sal "����", (sal + nvl(comm, 0)) "�Ǳ޿�", grade "�޿�", deptno "�μ���ȣ"
from emp e left join salgrade s
                     on (sal + nvl(comm, 0)) between losal and hisal
where e.deptno = 10;

-- 8)
select e.deptno "�μ���ȣ",dname "�μ���ȣ", ename "����̸�", sal "����", grade "�޿�"
from emp e left join dept d
                     on e.deptno = d.deptno left join salgrade s
                                                      on (sal + nvl(comm, 0)) between losal and hisal
where e.deptno in (10, 20)
order by e.deptno, sal desc;

select e.deptno, dname, ename, sal, grade
from emp e left join dept d
                     on e.deptno = d.deptno left join salgrade s
                                                      on (sal + nvl(comm, 0)) between losal and hisal
where e.deptno in (10, 20)
order by e.deptno, sal desc;

--9)
select e1.empno as "�����ȣ", e1.ename as "����̸�", e2.empno as "�����ڹ�ȣ", e2.ename as "�������̸�"
from emp e1 left join emp e2
                      on e1.mgr = e2.empno;