-- ���� �Լ�
select round(12.345678935, 0), round(12.345678935, 2), round(12.345678935, 3) from dual;

select ceil(12.34), ceil(-12.34) from dual; -- �ø��� �� ���� ��ȯ
select floor(12.34), floor(-12.34) from dual; -- ������ �� ���� ��ȯ

select trunc(12.3456, 2), trunc(12.3768, 2), trunc(12.7456, 0) from dual;


-- ���ڿ� �Լ�
select instr('abcd', 'b') from dual;
select instr('abcdefghijboy', 'b', -1) from dual;
select instr(id, 'a') from professor;
select instr(id, 'a', -1) from professor;
select * from professor;

select lpad('abcd', 20, '#') from dual;
select rpad('abcd', 20, '@') from dual;
select rpad(email, 20, '%') from professor;
select rpad(dname, 10, '*') from dept2;

select length('CANDIDE') from dual;
select dname, length(dname), lengthb(dname) from dept2;

select substr('1234567890', 3) from dual;
select substr('1234567890', 3, 2) from dual;
select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 3) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname) + 1)) "RPAD ����" from dept2;
select * from student where deptno1 = 103;

select name, rtrim(regexp_replace(name, '(.)', '\-1'), '-')
  from student
 where deptno1 = 103;

select birthday, rtrim(regexp_replace(birthday, '(/)', '\\'), '-')
  from student
 where deptno1 = 103;


-- ��¥ �Լ�
select sysdate from dual;
select months_between(to_date('20210101', 'YYYYMMDD'), to_date('19990101', 'YYYYMMDD')) from dual;
select name, hiredate, months_between(sysdate, hiredate) from professor;
select name, hiredate, add_months(hiredate, 3) from professor;

select next_day(sysdate, 3) from dual;
select hiredate, last_day(hiredate) from professor;


-- ����ȯ �Լ�
select sysdate, to_char(sysdate, 'YYYY-MM-DD') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual;


-- Oracle SQL_PLSQL_PPT > 2, 3�� �ǽ�
/*
    ���� �Լ� ���� 1)
    Student ���̺��� �����ؼ� �Ʒ� ȭ��� ���� 1 ������(deptno1 �÷�) 
    101���� �л��� �̸��� ��ȭ��ȣ�� ������ȣ�� ����ϼ���. 
    �� ������ȣ�� ���ڸ� ���;� �մϴ�.
*/
select tel, instr(tel, ')') 
  from student -- index string
 where deptno1 = 101;

--substr(tel, ������ġ, ��������);
--substr(tel, ������ġ);

select name, tel, substr(tel, 1, instr(tel, ')') - 1) "������ȣ"
  from student
 where deptno1 =101;

/*
    ���� �Լ� ���� 3)
    Dept2 ���̺��� ����Ͽ� dname �� �������� ����� �������� ������ �ۼ��ϼ���. <2�� 23������>
    -- ����Ŭ ������ ���� �ѱ� ���� �ٸ�
*/
select rpad(dname, 10, substr('1234567890', lengthb(dname)-2)) "RPAD����"
  from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1)) "RPAD����"
  from dept2;