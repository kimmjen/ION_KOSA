-- ���� ������ ���̺� ��� ��ȸ
select * from tab;


-- emp2 ���̺��� ��ü ������ ��ȸ
select * from emp2;


-- dual : ���� ���̺�
select sysdate from dual;


-- ���̺� ����
/*
create table [���̺��](
    [�÷���] datatype [ null | not null ] [ constraint ��Ī �������� ] ,
    [�÷���] datatype [ null | not null ] [ constraint ��Ī �������� ] ,
    ...
)
*/

create table test(
    name varchar2(10),
    age number(3)
);
select * from test;


-- insert
-- INSERT INTO [���̺��] VALUES([��ü COLUMN�� ���� VALUE_LIST]);
insert into test values('aa', 10);
-- INSERT INTO [���̺��]([COLUMN_LIST]) VALUES([COLUMN_LIST�� ���� VALUE_LIST]);
insert into test(age, name) values(22, 'bb');

insert into test(name) values('cc');
insert into test(age) values(33);


-- ���̺� ����
drop table test;
select * from test;


-- not null ���� ����
create table test(
    name varchar2(10) not null,
    age number(3)
);
insert into test(name) values('dd');
insert into test(age) values(33); -- ���� �߻�


-- select ��ɾ�
select * from emp2;
select empno, name, deptno from emp2;

select *
  from emp2
 where name = '�����';

-- % : ���� ���� ��ü
select *
  from emp2
 where name like '��%';

-- _ : �� ���� ��ü
select *
  from emp2
 where name like '%��%';

-- �̸��� �� ������ ��� �˻�
select *
  from professor
 where name like '__';

-- ����
-- �������� : asc(���� ����), �������� : desc
select *
  from professor
 order by name;

select *
  from professor
 order by name desc, pay desc, position;

select *
  from professor
 order by 2 desc, 5 desc, 4;

select *
  from professor
 where deptno like '20%'
 order by 2 desc, 5 desc, 4;

select name, empno
  from emp2
 where position = '����';

select *
  from professor
 where pay >= 350;

select *
  from professor
 where pay > 350 or pay >= 580;

select *
  from emp2
 where hobby = '����' or hobby = '���';

select *
  from emp2
 where hobby = '����' and emp_type = '������';

select empno as "�����ȣ", name as "�� ��", position as "����", pay as "�� ��"
  from emp2;

select name || position || '��'
  from professor;

-- distinct : �ߺ� ����
select distinct emp_type from emp2;
select distinct position from professor;