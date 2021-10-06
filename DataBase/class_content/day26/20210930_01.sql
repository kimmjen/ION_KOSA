select * from emp;

--------------------PL(Procedural Language)/ SQL
/*
Declare - ����(����)
Begin
    ����(�ʼ�)
End;

��)

Begin
    DBMS_output.put_line('heejung'); -- ���
End;
*/
Begin
    DBMS_output.put_line('test03'); -- ���
End;

-- 1. ��������
/*
* ����������
DECLARE �����̸� ������Ÿ��;
ex)DECLARE NAME varchar2(10);
DECLARE �����̸� ������Ÿ��:=��;
ex)DECLARE NAME varchar2(10):=���̵�����;
DECLARE �����̸� ������Ÿ�� DEFAULT �⺻��;
ex)DECLARE NAME varchar2(10) DEFAULT ' �̵��� ';

* ������ �ѹ��� ������ ������
DECLARE NAME VARCHAR2(20) ; age NUMBER(2) ;
ddr VARCHAR2(50);


* ������Ÿ���� ����
- number(), varchar2(), char(), int, date,....
- ���̺��̸�.�ʵ��%TYPE => �ʵ��� ���� Ÿ�� ����
ex) DECLARE NAME emp.ename%TYPE ;
-���̺��̸�%RowType => ���̺��� ��ü���� ���� Ÿ��(�� ���ڵ� )
ex) DECLARE data emp%ROWTYPE ;

* ���� �����Ͽ� ����ϴ� ���
DECLARE NAME VARCHAR2(20) :='��ȿ��';
BEGIN
DBMS_OUTPUT.PUT_LINE('�̸��� ' || name); --ȭ�鿡 ���
END;
=> PLSQL������ �ݵ�� BEGIN ~ end;�ȿ��� �����.
*/
-- ----------------------------------------------
declare
    vno number(4);
    vname varchar2(20);
begin
    select empno, name
        into vno, vname
    from EMP2
        where empno = &empno;
    DBMS_OUTPUT.PUT_LINE('�Է� ��: ' || vno || ' <---> ' || vname);
end;

-- -----------------------------------------------
select * from emp2;

create procedure p_test
    is
    begin
        DBMS_OUTPUT.PUT_LINE('�迬��');
        DBMS_OUTPUT.PUT_LINE('���¿�');
        DBMS_OUTPUT.PUT_LINE('�����');
    end;

begin
    p_test;
end;

-----------------------------------

create or replace procedure p_test(name in varchar2)
    is
begin
    DBMS_OUTPUT.PUT_LINE(name || '�� ���� �հ�');

end;

begin
    p_test('�迬��');
end;

-- -------------------------------------------
select * from userlist;
drop table userlist;

create table userlist (
    id varchar2(10),
    name varchar2(20),
    age number,
    addr varchar2(50)
);

create or replace procedure p_userlist (
    id in userlist.id%TYPE:='test01',
    name in userlist.name%TYPE := 'test01',
    age in userlist.age%TYPE := '30',
    addr in userlist.addr%TYPE := 'null'
) is
    begin
        insert into userlist values(id, name, age, addr);
        DBMS_OUTPUT.PUT_LINE('insert ������ ' || id || name || age || addr);
    end;
-- ---------------------------------
begin
    p_userlist('yuna', '������', 20, '����');
    p_userlist(); -- defualt data input
end;

-- ---------------------------------------
-- ����1) PL/SQL ����
select s.name, p.name, d.dname
from PROFESSOR p join student s on p.DEPTNO = s.DEPTNO1 join DEPARTMENT d
on d.DEPTNO = s.DEPTNO1
where d.DNAME = '��ǻ�Ͱ��а�';

-- 2. ���

-- 3. ���ν���(input, output, cusrsor)


-----------------------------------------------------------
select * from gift;