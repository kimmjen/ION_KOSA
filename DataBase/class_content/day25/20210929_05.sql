create table de_test (
                         name varchar2(10) not null,
                         addr varchar2(10) default '����'
);

alter table de_test add phone varchar2(15);
alter table de_test add (age number, idNumber varchar2(13), reg_date date);
update de_test set phone = ' ';

-- �÷�����
-- alter table ���̺��̸� drop column �÷��̸�;
alter table de_test drop column age;
alter table de_test drop column (addr, phone));

-- dataTpye ���� : �����Ͱ� ���� ��쿡�� ���
-- alter table ���̺��̸� modify �÷��̸� �����ڷ���;
alter table de_test modify idNumber number;

desc de_test;
--

-- �÷� �̸� ����
alter table ���̺��̸� rename column ���� �÷��� to ���� �÷���;

alter table de_test rename name to irum;

-- ���� Ȯ��
desc de_test;

-- ���̺� ����
drop table ���̺��̸�;

-- �����Լ� ���� Group by
select sum(height), sum(weight) from student;
-- �г⺰
select sum(height), sum(weight) from student group by grade;

-- �Ϲ� �ʵ�� �׷�(����) �ʵ�� ���� �� �� ����.
select grade, sum(height), sum(weightm)
from student
group by grade;

-- emp_type ���� pay ��, ���, �ְ�޿�, ���ϱ޿� ���ϱ�
select emp_type, sum(pay), avg(pay), max(pay), min(pay)
from emp2
group by emp_type;

-- ���� : where, having �� �̿�
select grade, sum(height), avg(height)
from student
group by grade
having avg(height) > 173;


select deptno as "�� ��", round(avg(nvl(pay, 0)), 0) "��ձ޿�"
from professor
group by deptno;

select detno as "�� ��". avg(nvl(pay, 0)) "��� �޿�"
from professor
group by deptno;
having avg(pay) > 400;

-- ����1] emp2 ���̺��� deptno(�μ�)���� pay �հ� ��ձ��ϱ�
select deptno, sum(pay), avg(pay)
from emp2
group by(deptno);
-- ����2] emp2 ���̺��� emp_type���� pay �հ� ��ձ��ϱ�
select emp_type, sum(pay), avg(pay)
from emp2
group by emp_type;
-- ����3] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ���
select position, sum(pay), round(avg(pay), 0)
from emp2
where position is not null
group by position;
-- ����4] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ��� ���ϴµ�, ������ ������ ����鸸 ����ϱ�
select position, sum(pay), avg(pay)
from emp2
group by position
having position='����';




select name, rtrim(REGEP_replace(name, '(.)', '\-1', '-') "���� ��"
from student
where deptno1 = 103;

select emp.ename, emp.job, sal, dname, loc, dept.deptno
from emp, dept;


select ename, job, sal, loc, d.deptno, danme
from emp e inner join dept d
                      on e.deptno = d.deptno;

select * from emp;

insert into emp values(0202, 'test', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);

-- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸�, ...
select ename, job, sal, loc, d.deptno, dname
from dept d left join emp e
                      on d.deptno = e.deptno;

-- right outer join: �����ʿ� �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�
select ename, job, sal, loc, d.deptno, dname
from dept d right join emp e
                       on d.deptno = e.deptno;

inner join =
left outer join *=
right outer join =*

select * from professor; -- row profno, deptno, name
select * from student; -- deptno1, deptno2, profno, name
select * from department; -- deptno, dname

select s.name || '�л��� ��米���� ' || p.name || ' �������̰� ����а��� ' || d.dname
from professor p join student s
                      on p.deptno = s.deptno1 join department d
                                                   on d.deptno = s.deptno1
--    where d.dname = '��ǻ�Ͱ��а�';
where s.deptno1 = 103;

-- full outer join
select ename, job, sal, loc, d.deptno, dname
--from dept d full outer join emp e
from empe e full outer join dept d
--on d.deptno = e.deptno;
                            on e.deptno = d.deptno;

---rownum / rowid

select rownum, ename, sal from emp;
select rownum, ename, sal from emp where rownum = 1;

select rownum, ename rowid from emp; -- �Խ��� �� ����¡ ó���� �� ��� rownum df) mysql - limit

select from emp;

---------sequence

--create sequence ������ �̸�
--[start with ���۰�]
--[increment by ����ġ]
--[maxvalue �ִ밪]
--[minvalue �ּҰ�]
--[cycle | nocycle]
--[cache | nocache]

drop sequence autonum;
create sequence autonum; -- 1���� �����ؼ� 1�� �����Ѵ�.
select autonum.nextval from dual;
select autonum.currval from dual;

delete kosa_tab;
create table kosa_tab ( no number, name varchar2(10));

insert into kosa_tab values(autonum.nextval, 'aa');
insert into kosa_tab values(autonum.nextval, 'bb');
insert into kosa_tab values(autonum.nextval, 'cc');
insert into kosa_tab values(autonum.nextval, 'dd');

select * from kosa_tab;
drop sequence seq_board;
create sequence seq_board
    start with 10
    increment by 10
    maxvalue 50;
drop table kosa_tab2;
create table kosa_tab2 ( num number, name varchar2(10));
insert into kosa_tab2 values(seq_board.nextval, 'aa');
insert into kosa_tab2 values(seq_board.nextval, 'bb');
insert into kosa_tab2 values(seq_board.nextval, 'cc');
insert into kosa_tab2 values(seq_board.nextval, 'dd');
insert into kosa_tab2 values(seq_board.nextval, 'ee');
insert into kosa_tab2 values(seq_board.nextval, 'ff');

select * from kosa_tab2;

create sequence seq_board2
    start with 10
    increment by 10
    minvalue 10
    maxvalue 50
    cycle
    nocache;

create table kosa_tab3 (num number, name varchar2(10));

insert into kosa_tab3 values(seq_board2.nextval, 'aa');
insert into kosa_tab3 values(seq_board2.nextval, 'bb');
insert into kosa_tab3 values(seq_board2.nextval, 'cc');
insert into kosa_tab3 values(seq_board2.nextval, 'dd');
insert into kosa_tab3 values(seq_board2.nextval, 'ee');
insert into kosa_tab3 values(seq_board2.nextval, 'ff');

insert into kosa_tab3 values(seq_board2.nextval, 'gg');
insert into kosa_tab3 values(seq_board2.nextval, 'hh');
insert into kosa_tab3 values(seq_board2.nextval, 'ii');
insert into kosa_tab3 values(seq_board2.nextval, 'jj');
insert into kosa_tab3 values(seq_board2.nextval, 'kk');
insert into kosa_tab3 values(seq_board2.nextval, 'll');

select * from kosa_tab3;

create sequence seq_board3
    start with 10
    increment by 10
    minvalue 10
    maxvalue 50
    cycle
    nocache;

create table kosa_tab4 (num number, name varchar2(10));

insert into kosa_tab4 values(seq_board3.nextval, 'aa');
insert into kosa_tab4 values(seq_board3.nextval, 'bb');
insert into kosa_tab4 values(seq_board3.nextval, 'cc');
insert into kosa_tab4 values(seq_board3.nextval, 'dd');
insert into kosa_tab4 values(seq_board3.nextval, 'ee');
insert into kosa_tab4 values(seq_board3.nextval, 'ff');

insert into kosa_tab4 values(seq_board2.nextval, 'gg');
insert into kosa_tab4 values(seq_board2.nextval, 'hh');
insert into kosa_tab4 values(seq_board2.nextval, 'ii');
insert into kosa_tab4 values(seq_board2.nextval, 'jj');
insert into kosa_tab4 values(seq_board2.nextval, 'kk');
insert into kosa_tab4 values(seq_board2.nextval, 'll');

select * from kosa_tab3;