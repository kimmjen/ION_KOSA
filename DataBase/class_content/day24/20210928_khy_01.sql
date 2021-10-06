select sysdate from dual;

CREATE TABLE ck_test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL CHECK (age BETWEEN 20 AND 30), --age�÷��� ���� 20~30���̸� ���
    gender char(2) check (gender in('m', 'f'))
);
select * from ck_test;

insert into ck_test values('park', 22);
insert into ck_test values('kang', 30);
insert into ck_test values('kim', 50);
insert into ck_test values('lee', 35);

drop table ck_test;


create table de_test(
    name varchar2(10) not null,
    addr varchar2(10) default '����'
);

select * from de_test;
insert into de_test values('tt', 'ss');
insert into de_test(name) values('gg');
insert into de_test values('kk', default);
insert into de_test values('tt', '�λ�');
insert into de_test(name) values('kbs');


-- ���̺� ���� / ����
/*
    1. �÷� �߰�
    alter table ���̺�� add (�÷��� �ڷ��� [��������], ...);
*/

select * from de_test;

alter table de_test add (
    phone varchar2(15)
);
alter table de_test add (
    age number,
    jumin varchar(13),
    reg_date date
);

update de_test set phone = ' ';

/*
    2. �÷� ����
    alter table ���̺�� drop column �÷���;
    alter table ���̺�� drop (�÷���1, �÷���2, ...);
*/
alter table de_test drop column age;
alter table de_test drop (addr, phone);

/*
    3. datatype ����
    alter table ���̺�� modify �÷��� �ڷ���;
*/
desc de_test;
alter table de_test modify jumin number;
alter table de_test modify name number; -- ������ ������ ������ ���� ��� �־�� ��.
delete from de_test;
select * from de_test;

/*
    4. �÷��� ����
    alter table ���̺�� rename column �����÷��� to �����÷���;
*/

alter table de_test rename column name to irum;

/*
    5. ���̺� ����
    drop table ���̺��;
*/
drop table de_test;
drop table ck_test;


-- �����Լ� ���� group by
select sum(height), sum(weight) from student;

select grade, sum(height), sum(weight)
  from student
 group by grade;


-- emp_type ���� pay ��, ���, �ְ�޿�, ���ϱ޿� ���ϱ�
select emp_type, sum(pay), avg(pay), max(pay), min(pay)
  from emp2
 group by emp_type;

select grade, sum(height), avg(height)
  from student
 group by grade
having avg(height) > 173;

select deptno as "��  ��", round(avg(nvl(pay, 0)), 2) "��� �޿�"
  from professor
 group by deptno
having avg(pay) > 400;

select * from department;

-- ���� 1] emp2 ���̺��� deptno(�μ���ȣ)���� pay �հ� ��� ���ϱ�
select deptno, sum(pay), avg(pay)
  from emp2
 group by deptno;

-- ���� 2] emp2 ���̺��� emp_type���� pay �հ� ��� ���ϱ�
select emp_type, sum(pay), avg(pay)
  from emp2
 group by emp_type;

-- ���� 3] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ���
select position, sum(pay), round(avg(pay), 2)
  from emp2
 group by position;

-- ���� 4] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ��� ���ϴµ�, ������ ������ ����鸸 ���
select position, sum(pay), round(avg(pay), 2)
  from emp2
 group by position
having position = '����';