-- join 
-- pk-fk 관계일 때 사용
select * from emp;
select * from dept;
select * from salgrade;
select * from emp, dept;

/*
    select 컬럼명, ...
      from 테이블명 별칭 [inner] join 테이블명 별칭
        on 별칭.컬럼명 = 별칭.컬럼명
*/
select emp.ename, emp.job, sal from emp;

select emp.ename, emp.job, sal, dname, loc, dept.deptno
  from emp, dept
 where emp.deptno = dept.deptno;

select ename, job, sal, loc, d.deptno "부서 번호", dname
  from emp e inner join dept d
    on e.deptno = d.deptno;

desc emp;
insert into emp values(202, 'hozero', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);
select * from emp;

-- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만
select ename, job, sal, loc, d.deptno, dname
  from dept d left join emp e
    on d.deptno = e.deptno;
    
-- right outer join : 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만
select ename, job, sal, loc, d.deptno, dname
  from dept d right join emp e
    on d.deptno = e.deptno;

/*
    여러개의 테이블 조인
    select 컬럼명, ...
      from 테이블이름 별칭 [inner] join 테이블이름 별칭
        on 별칭.컬럼명 = 별칭.컬럼명 [inner] join 테이블이름 별칭
        on 별칭.컬럼명 = 별칭.컬럼명
*/
select * from professor; -- 16 row - profno, deptno, name
select * from student; -- 20 row - deptno1, deptno2, profno, name
select * from department; -- 12 row - deptno, dname

select s.name || '학생의 담당교수는 ' || p.name || '교수님이고 학과는 ' || d.dname
  from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno = s.deptno1
 where d.dname = '컴퓨터공학과';

--ex)
select s.name, p.name, d.dname
from professor p join student s
on p.deptno = s.DEPTNO1 join DEPARTMENT d
on d.DEPTNO = s.DEPTNO1
where d.dname='컴퓨터공학과';

-- full outer join
select ename, job, sal, loc, d.deptno, dname
  from dept d full join emp e
    on d.deptno = e.deptno;


-- 과제
desc emp;
desc dept;
desc salgrade;
select * from emp;
select * from dept;
select * from salgrade;

-- 1. 사원들의 이름, 부서번호, 부서이름을 출력하라.(emp, dept table)
select ename, e.deptno, d.dname
  from emp e left join dept d
    on e.deptno = d.deptno;

-- 2. DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력(dept table)
select ename, job, e.deptno, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where loc = 'DALLAS';

-- 3. 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하라.(emp, dept)
select ename, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where ename like '%A%';

-- 4. 사원 이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 출력하는데 월급이 3000 이상인 사원을 출력하라.(emp, dept)
select ename, dname, sal
  from emp e left join dept d
    on e.deptno = d.deptno
 where sal >= 3000;

-- 5. 직위가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고 그 사원이 속한 부서 이름을 출력하라.(emp, dept)
select job, ename, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where job = 'SALESMAN';

-- 6. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉 + 커미션, 급여 등급을 출력하되,
--    각각의 컬럼명을 '사원번호', '사원이름', '연봉', '실급여', '급여등급'으로 하여 출력하라.(emp, salgrade)
select empno as "사원번호", ename as "사원이름", sal as "연봉", (sal + nvl(comm, 0)) as "실급여", grade as "급여등급"
  from emp e left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal;

-- 7. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라.(emp, dept, salgrade)
select e.deptno, dname, ename, sal, grade
  from emp e left join dept d
    on e.deptno = d.deptno left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal
 where e.deptno = 10;

-- 8. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라.
--    그리고 그 출력된 결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하라.(emp, dept, salgrade)
select e.deptno, dname, ename, sal, grade
  from emp e left join dept d
    on e.deptno = d.deptno left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal
 where e.deptno in (10, 20)
 order by e.deptno, sal desc;

-- 9. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 사원번호와 사원이름을 출력하되
--    각각의 컬럼명을 '사원번호', '사원이름', '관리자번호', '관리자이름'으로 하여 출력하라.(emp)
select e1.empno as "사원번호", e1.ename as "사원이름", e2.empno as "관리자번호", e2.ename as "관리자이름"
  from emp e1 left join emp e2
    on e1.mgr = e2.empno;