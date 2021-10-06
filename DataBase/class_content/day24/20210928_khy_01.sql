select sysdate from dual;

CREATE TABLE ck_test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL CHECK (age BETWEEN 20 AND 30), --age컬럼의 값은 20~30사이만 허용
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
    addr varchar2(10) default '서울'
);

select * from de_test;
insert into de_test values('tt', 'ss');
insert into de_test(name) values('gg');
insert into de_test values('kk', default);
insert into de_test values('tt', '부산');
insert into de_test(name) values('kbs');


-- 테이블 수정 / 삭제
/*
    1. 컬럼 추가
    alter table 테이블명 add (컬럼명 자료형 [제약조건], ...);
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
    2. 컬럼 삭제
    alter table 테이블명 drop column 컬럼명;
    alter table 테이블명 drop (컬럼명1, 컬럼명2, ...);
*/
alter table de_test drop column age;
alter table de_test drop (addr, phone);

/*
    3. datatype 변경
    alter table 테이블명 modify 컬럼명 자료형;
*/
desc de_test;
alter table de_test modify jumin number;
alter table de_test modify name number; -- 데이터 유형을 변경할 열은 비어 있어야 함.
delete from de_test;
select * from de_test;

/*
    4. 컬럼명 변경
    alter table 테이블명 rename column 기존컬럼명 to 변경컬럼명;
*/

alter table de_test rename column name to irum;

/*
    5. 테이블 삭제
    drop table 테이블명;
*/
drop table de_test;
drop table ck_test;


-- 집계함수 사용시 group by
select sum(height), sum(weight) from student;

select grade, sum(height), sum(weight)
  from student
 group by grade;


-- emp_type 별로 pay 합, 평균, 최고급여, 최하급여 구하기
select emp_type, sum(pay), avg(pay), max(pay), min(pay)
  from emp2
 group by emp_type;

select grade, sum(height), avg(height)
  from student
 group by grade
having avg(height) > 173;

select deptno as "학  과", round(avg(nvl(pay, 0)), 2) "평균 급여"
  from professor
 group by deptno
having avg(pay) > 400;

select * from department;

-- 문제 1] emp2 테이블에서 deptno(부서번호)별로 pay 합과 평균 구하기
select deptno, sum(pay), avg(pay)
  from emp2
 group by deptno;

-- 문제 2] emp2 테이블에서 emp_type별로 pay 합과 평균 구하기
select emp_type, sum(pay), avg(pay)
  from emp2
 group by emp_type;

-- 문제 3] emp2 테이블에서 직급별(position)별로 급여의 합, 평균
select position, sum(pay), round(avg(pay), 2)
  from emp2
 group by position;

-- 문제 4] emp2 테이블에서 직급별(position)별로 급여의 합, 평균 구하는데, 직급이 과장인 사람들만 출력
select position, sum(pay), round(avg(pay), 2)
  from emp2
 group by position
having position = '과장';