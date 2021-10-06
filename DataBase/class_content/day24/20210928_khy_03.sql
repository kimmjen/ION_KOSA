-- join 
-- pk-fk ������ �� ���
select * from emp;
select * from dept;
select * from salgrade;
select * from emp, dept;

/*
    select �÷���, ...
      from ���̺�� ��Ī [inner] join ���̺�� ��Ī
        on ��Ī.�÷��� = ��Ī.�÷���
*/
select emp.ename, emp.job, sal from emp;

select emp.ename, emp.job, sal, dname, loc, dept.deptno
  from emp, dept
 where emp.deptno = dept.deptno;

select ename, job, sal, loc, d.deptno "�μ� ��ȣ", dname
  from emp e inner join dept d
    on e.deptno = d.deptno;

desc emp;
insert into emp values(202, 'hozero', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);
select * from emp;

-- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸�
select ename, job, sal, loc, d.deptno, dname
  from dept d left join emp e
    on d.deptno = e.deptno;
    
-- right outer join : �����ʿ� �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�
select ename, job, sal, loc, d.deptno, dname
  from dept d right join emp e
    on d.deptno = e.deptno;

/*
    �������� ���̺� ����
    select �÷���, ...
      from ���̺��̸� ��Ī [inner] join ���̺��̸� ��Ī
        on ��Ī.�÷��� = ��Ī.�÷��� [inner] join ���̺��̸� ��Ī
        on ��Ī.�÷��� = ��Ī.�÷���
*/
select * from professor; -- 16 row - profno, deptno, name
select * from student; -- 20 row - deptno1, deptno2, profno, name
select * from department; -- 12 row - deptno, dname

select s.name || '�л��� ��米���� ' || p.name || '�������̰� �а��� ' || d.dname
  from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno = s.deptno1
 where d.dname = '��ǻ�Ͱ��а�';

--ex)
select s.name, p.name, d.dname
from professor p join student s
on p.deptno = s.DEPTNO1 join DEPARTMENT d
on d.DEPTNO = s.DEPTNO1
where d.dname='��ǻ�Ͱ��а�';

-- full outer join
select ename, job, sal, loc, d.deptno, dname
  from dept d full join emp e
    on d.deptno = e.deptno;


-- ����
desc emp;
desc dept;
desc salgrade;
select * from emp;
select * from dept;
select * from salgrade;

-- 1. ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.(emp, dept table)
select ename, e.deptno, d.dname
  from emp e left join dept d
    on e.deptno = d.deptno;

-- 2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ���(dept table)
select ename, job, e.deptno, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where loc = 'DALLAS';

-- 3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.(emp, dept)
select ename, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where ename like '%A%';

-- 4. ��� �̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ ����ϴµ� ������ 3000 �̻��� ����� ����϶�.(emp, dept)
select ename, dname, sal
  from emp e left join dept d
    on e.deptno = d.deptno
 where sal >= 3000;

-- 5. ������ 'SALESMAN'�� ������� ������ �� ����̸�, �׸��� �� ����� ���� �μ� �̸��� ����϶�.(emp, dept)
select job, ename, dname
  from emp e left join dept d
    on e.deptno = d.deptno
 where job = 'SALESMAN';

-- 6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ���� + Ŀ�̼�, �޿� ����� ����ϵ�,
--    ������ �÷����� '�����ȣ', '����̸�', '����', '�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.(emp, salgrade)
select empno as "�����ȣ", ename as "����̸�", sal as "����", (sal + nvl(comm, 0)) as "�Ǳ޿�", grade as "�޿����"
  from emp e left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal;

-- 7. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�.(emp, dept, salgrade)
select e.deptno, dname, ename, sal, grade
  from emp e left join dept d
    on e.deptno = d.deptno left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal
 where e.deptno = 10;

-- 8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�.
--    �׸��� �� ��µ� ������� �μ���ȣ�� ���� ������, ������ ���� ������ �����϶�.(emp, dept, salgrade)
select e.deptno, dname, ename, sal, grade
  from emp e left join dept d
    on e.deptno = d.deptno left join salgrade s
    on (sal + nvl(comm, 0)) between losal and hisal
 where e.deptno in (10, 20)
 order by e.deptno, sal desc;

-- 9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� �����ȣ�� ����̸��� ����ϵ�
--    ������ �÷����� '�����ȣ', '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.(emp)
select e1.empno as "�����ȣ", e1.ename as "����̸�", e2.empno as "�����ڹ�ȣ", e2.ename as "�������̸�"
  from emp e1 left join emp e2
    on e1.mgr = e2.empno;