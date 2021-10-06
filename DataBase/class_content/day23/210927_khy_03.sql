-- ����(�׷�) �Լ�
select sum(height), sum(weight) from student;
select avg(height) as "���Ű", avg(weight), max(height) as "�ְ�Ű", min(height) from student;

select count(*) from professor;
select count(bonus), count(name) from professor;
select * from professor;

select rank(68000000) within group(order by pay desc)
  from emp2;

select rank(490) within group(order by pay desc)
  from professor
 where bonus is not null;

-- oracle�� null���� �켱������ ����. mysql�� null���� �켱������ ����.
select name, pay, bonus from professor order by bonus desc;

-- ���� 1] Ű�� 168�� ����� �� ��°�� ū�� Ȯ��
select rank(168) within group(order by height desc)
  from student;

-- ���� 2] �����԰� 58�� ����� �� ��°���� ��� ���ϱ�
select rank(58) within group(order by weight desc)
  from student;

-- ���� 3] g_end�� 200000, 600000���� ���� �� ���(any ����� ��)
select *
  from gift
 where g_end < any(200000, 600000);


-- �������� ����
-- constraint [��Ī] primary key, ��Ī : ���̺��_�ʵ��_���� ��) board_id_pk
create table userlist(
    id varchar2(10) constraint userlist_id_pk primary key,
    name varchar2(10)
);
insert into userlist values('khy', 'hoyoung');
insert into userlist(id) values('gildong');
select * from userlist;