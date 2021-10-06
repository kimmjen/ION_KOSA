select * from emp;

--------------------PL(Procedural Language)/ SQL
/*
Declare - 선언(선택)
Begin
    실행(필수)
End;

예)

Begin
    DBMS_output.put_line('heejung'); -- 출력
End;
*/
Begin
    DBMS_output.put_line('test03'); -- 출력
End;

-- 1. 변수선언
/*
* 변수선언방법
DECLARE 변수이름 데이터타입;
ex)DECLARE NAME varchar2(10);
DECLARE 변수이름 데이터타입:=값;
ex)DECLARE NAME varchar2(10):=‘이도연’;
DECLARE 변수이름 데이터타입 DEFAULT 기본값;
ex)DECLARE NAME varchar2(10) DEFAULT ' 이도연 ';

* 변수를 한번에 여러개 선언방법
DECLARE NAME VARCHAR2(20) ; age NUMBER(2) ;
ddr VARCHAR2(50);


* 데이터타입의 종류
- number(), varchar2(), char(), int, date,....
- 테이블이름.필드명%TYPE => 필드명과 같은 타입 선언
ex) DECLARE NAME emp.ename%TYPE ;
-테이블이름%RowType => 테이블의 전체열을 갖는 타입(한 레코드 )
ex) DECLARE data emp%ROWTYPE ;

* 변수 선언하여 사용하는 방법
DECLARE NAME VARCHAR2(20) :='이효리';
BEGIN
DBMS_OUTPUT.PUT_LINE('이름은 ' || name); --화면에 출력
END;
=> PLSQL문장은 반드시 BEGIN ~ end;안에서 사용함.
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
    DBMS_OUTPUT.PUT_LINE('입력 값: ' || vno || ' <---> ' || vname);
end;

-- -----------------------------------------------
select * from emp2;

create procedure p_test
    is
    begin
        DBMS_OUTPUT.PUT_LINE('김연아');
        DBMS_OUTPUT.PUT_LINE('김태연');
        DBMS_OUTPUT.PUT_LINE('김우주');
    end;

begin
    p_test;
end;

-----------------------------------

create or replace procedure p_test(name in varchar2)
    is
begin
    DBMS_OUTPUT.PUT_LINE(name || '님 시험 합격');

end;

begin
    p_test('김연아');
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
        DBMS_OUTPUT.PUT_LINE('insert 정보는 ' || id || name || age || addr);
    end;
-- ---------------------------------
begin
    p_userlist('yuna', '강가찬', 20, '서울');
    p_userlist(); -- defualt data input
end;

-- ---------------------------------------
-- 문제1) PL/SQL 문제
select s.name, p.name, d.dname
from PROFESSOR p join student s on p.DEPTNO = s.DEPTNO1 join DEPARTMENT d
on d.DEPTNO = s.DEPTNO1
where d.DNAME = '컴퓨터공학과';

-- 2. 제어문

-- 3. 프로시져(input, output, cusrsor)


-----------------------------------------------------------
select * from gift;