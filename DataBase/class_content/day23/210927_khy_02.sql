-- update ��ɾ�
-- update [���̺��] set [�÷���] = [������];

select * from professor where position = '������';

update professor set pay = pay + 100; -- ���̺� ��ü�� ����Ǿ����.
rollback;

update professor set pay = pay + 100 where position = '������'; -- ���ǿ� �´� �����͸� ����


-- delete ��ɾ�
-- delete from [���̺��];
delete from emp2; -- ���ڵ� ��ü ����
select * from emp2;
rollback;

select * from professor where position like '��%';
delete professor where position like '��%';

update emp2 set name = '�ʻ���', hobby = '����' where name = '������';
rollback;


-- ���̺� �� ��ü ������ ����
-- truncate table [���̺��];
-- where�� ��� �Ұ�
-- rollback �Ұ���
truncate table emp2;


-- ������
-- mod
select mod(7, 3) as "���� ������ ��" from dual;
-- null ������ ����� ������ null�̴�.
select * from professor;
desc professor; -- ���̺� ���� Ȯ��
-- nvl �Լ�
update professor set bonus = bonus + 1000;
update professor set bonus = nvl(bonus, 0) + 1000;
select bonus, nvl(bonus, 0) from professor;
rollback;
-- in, not
select name, deptno from professor where deptno = 101 or deptno = 201 or deptno = 301;
select name, deptno from professor where deptno in (101, 202, 301);
select name, deptno from professor where deptno != 101 and deptno != 201 and deptno != 301;
select name, deptno from professor where deptno not in (101, 202, 301);
-- between
select * from professor where pay between 300 and 500;
select * from professor where deptno between 103 and 300;
-- ���ϵ�ī�� : %, _
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';
-- is
select * from professor where bonus is null;
select * from professor where hpage is not null;

