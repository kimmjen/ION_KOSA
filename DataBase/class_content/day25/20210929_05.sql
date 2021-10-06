create table de_test (
                         name varchar2(10) not null,
                         addr varchar2(10) default '서울'
);

alter table de_test add phone varchar2(15);
alter table de_test add (age number, idNumber varchar2(13), reg_date date);
update de_test set phone = ' ';

-- 컬럼삭제
-- alter table 테이블이름 drop column 컬럼이름;
alter table de_test drop column age;
alter table de_test drop column (addr, phone));

-- dataTpye 변경 : 데이터가 없는 경우에만 사용
-- alter table 테이블이름 modify 컬럼이름 변경자료형;
alter table de_test modify idNumber number;

desc de_test;
--

-- 컬럼 이름 변경
alter table 테이블이름 rename column 기존 컬럼명 to 변경 컬럼명;

alter table de_test rename name to irum;

-- 구조 확인
desc de_test;

-- 테이블 삭제
drop table 테이블이름;

-- 집계함수 사용시 Group by
select sum(height), sum(weight) from student;
-- 학년별
select sum(height), sum(weight) from student group by grade;

-- 일반 필드는 그룹(집합) 필드와 같이 쓸 수 없다.
select grade, sum(height), sum(weightm)
from student
group by grade;

-- emp_type 별로 pay 합, 평균, 최고급여, 최하급여 구하기
select emp_type, sum(pay), avg(pay), max(pay), min(pay)
from emp2
group by emp_type;

-- 조건 : where, having 절 이용
select grade, sum(height), avg(height)
from student
group by grade
having avg(height) > 173;


select deptno as "학 과", round(avg(nvl(pay, 0)), 0) "평균급여"
from professor
group by deptno;

select detno as "학 과". avg(nvl(pay, 0)) "평균 급여"
from professor
group by deptno;
having avg(pay) > 400;

-- 문제1] emp2 테이블에서 deptno(부서)별로 pay 합과 평균구하기
select deptno, sum(pay), avg(pay)
from emp2
group by(deptno);
-- 문제2] emp2 테이블에서 emp_type별로 pay 합과 평균구하기
select emp_type, sum(pay), avg(pay)
from emp2
group by emp_type;
-- 문제3] emp2 테이블에서 직급별(position)별로 급여의 합, 평균
select position, sum(pay), round(avg(pay), 0)
from emp2
where position is not null
group by position;
-- 문제4] emp2 테이블에서 직급별(position)별로 급여의 합, 평균 구하는데, 직급이 과장인 사람들만 출력하기
select position, sum(pay), avg(pay)
from emp2
group by position
having position='과장';




select name, rtrim(REGEP_replace(name, '(.)', '\-1', '-') "변경 후"
from student
where deptno1 = 103;

select emp.ename, emp.job, sal, dname, loc, dept.deptno
from emp, dept;


select ename, job, sal, loc, d.deptno, danme
from emp e inner join dept d
                      on e.deptno = d.deptno;

select * from emp;

insert into emp values(0202, 'test', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);

-- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만, ...
select ename, job, sal, loc, d.deptno, dname
from dept d left join emp e
                      on d.deptno = e.deptno;

-- right outer join: 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만
select ename, job, sal, loc, d.deptno, dname
from dept d right join emp e
                       on d.deptno = e.deptno;

inner join =
left outer join *=
right outer join =*

select * from professor; -- row profno, deptno, name
select * from student; -- deptno1, deptno2, profno, name
select * from department; -- deptno, dname

select s.name || '학생의 담당교수는 ' || p.name || ' 교수님이고 담당학과는 ' || d.dname
from professor p join student s
                      on p.deptno = s.deptno1 join department d
                                                   on d.deptno = s.deptno1
--    where d.dname = '컴퓨터공학과';
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

select rownum, ename rowid from emp; -- 게시판 에 페이징 처리할 때 사용 rownum df) mysql - limit

select from emp;

---------sequence

--create sequence 시퀸스 이름
--[start with 시작값]
--[increment by 증가치]
--[maxvalue 최대값]
--[minvalue 최소값]
--[cycle | nocycle]
--[cache | nocache]

drop sequence autonum;
create sequence autonum; -- 1부터 시작해서 1씩 증가한다.
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