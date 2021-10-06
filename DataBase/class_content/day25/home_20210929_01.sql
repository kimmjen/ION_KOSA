select * from emp;
select * from dept;
--1)
select ename "이름", e.deptno"부서번호", d.dname "부서이름"
from emp  e left join dept d
                      on e.deptno = d.deptno;

--2)
select ename "사원이름", job "직위", e.deptno "부서번호", dname "부서이름"
from emp e left join dept d
                     on e.deptno = d.deptno
where loc='DALLAS';

--3)
select ename "사원이름", dname "부서이름"
from emp e left join dept d
                     on e.deptno = d.deptno
where ename like '%A%';

--4)
select ename "사원이름", dname"부서이름", sal "월급"
from emp e left join dept d
                     on e.deptno = d.deptno
where sal >= 3000;

--5)
select job "직위", ename "사원이름", dname "부서이름"
from emp e left join dept d
                     on e.deptno = d.deptno
where job = 'SALESMAN';

--6)
select empno "사원번호", ename "사원이름", sal "연봉", (sal + nvl(comm, 0)) "실급여", grade "급여"
from emp e left join salgrade s
                     on (sal + nvl(comm, 0)) between losal and hisal;

-- 7)
select empno "사원번호", ename "사원이름", sal "연봉", (sal + nvl(comm, 0)) "실급여", grade "급여", deptno "부서번호"
from emp e left join salgrade s
                     on (sal + nvl(comm, 0)) between losal and hisal
where e.deptno = 10;

-- 8)
select e.deptno "부서번호",dname "부서번호", ename "사원이름", sal "연봉", grade "급여"
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
select e1.empno as "사원번호", e1.ename as "사원이름", e2.empno as "관리자번호", e2.ename as "관리자이름"
from emp e1 left join emp e2
                      on e1.mgr = e2.empno;