----------------------------------------------------------------------------------
--1) emp2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ ���� ����� �̸��� ����, ������ ���
--         ��, ���� ��� ����� �Ʒ��� ������ õ ���� ���б�ȣ�� �� ǥ��

select name, position, to_char(pay, 'L999,999,999') from emp2
    where pay > (select min(pay) from emp2 where position = '����');

-- 2) student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� ���� ���� ������ �л����� ���� �л��� �̸��� �г�� �����Ը� ���
select name, grade, weight from student
    where weight < (select min(weight) from student where grade = '4');

-- 3) student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���
select grade, name, HEIGHT
    from STUDENT
    where (grade, height) in (select grade, max(height) from student group by grade);

-- 4) professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. ��, �а�������� �������� ����
----------------------------------------------------------------------------------
select * from professor;
select * from student;

select profno, name, hiredate, dname
    from PROFESSOR p left join DEPARTMENT d
        on p.DEPTNO = d.DEPTNO
    where HIREDATE in (select min(HIREDATE) from PROFESSOR group by DEPTNO);