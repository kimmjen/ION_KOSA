select * from emp;

------SUBQUERY------------------------------------------------------------------------------------------
-- ���� ���� �ȿ��� �� �ٸ� �������� �ִ� ��
-- �ݵ�� ���������� ��ȣ�� ���´�
-- �������� ���� ���������� ���� ���ؿ���� ����� ���� ������ �������� ���
-- ���������� ����� �� �� �̻� ��ȯ�ɶ��� in, any, all �����ڸ� ���
-- ���������� ����� �� ���� ���� �񱳿����� �����
-- ex) select * from emp where ename = (�������� ����);
select * from emp2;
select * from emp2 where name ='�����';
select * from emp2 where pay > 60000000;

select * from emp2 where pay > (select pay from emp2 where name ='�����');

-- ����1) emp2 ���̺��� ��� �޿����� �۰� �޴»��.
select * from emp2;


select * from emp2 where pay > (select avg(pay) from emp2);
-- ����2) �л� ���̺��� 1�г�(grade) ��� Ű���� ū ����� ���
select * from student;
select name, height from student
    group by height, name
    having avg(height) < HEIGHT;
select avg(height) from student;

select * from student where height > (select avg(height) from student where grade = 1);

-- ����3) �л� ���̺�, �а� ���̺��� ����Ͽ� ������ �л��� ����(deptno1)�� ������ �л����� �̸��� �а� �̸� ���
select * from student;
select name, dname from STUDENT left join DEPARTMENT on deptno1 = deptno where deptno1 = (select deptno1 from student where name = '������');

-- ����4) ���� ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸�, �Ի���, �а��� ���

select * from professor;

select name, hiredate, dname
from professor p left join department d
                           on p.deptno = d.deptno
where hiredate > (select hiredate
                  from professor
                  where name = '�۵���');

-- ����5) �л� ���̺��� ������ 101�� �а��� ��� ������ ���� �����԰� ���� �л����� �̸��� ������ ���ϱ�.

select * from student;

select name, weight
from student
where weight > (select avg(weight)
                from student
                where deptno1 = 101);

-- ���������� ����� �� �� �̻� ��ȯ�ɶ��� in, any, all �����ڸ� ���
select empno, name, DEPTNO
    from EMP2
    where deptno in(1000, 1001, 1002, 1010, 2000, 2021);

select dcode from dept2 where area = '��������';

select empno, name, DEPTNO
    from EMP2
    where deptno in (select dcode from dept2 where area = '��������');