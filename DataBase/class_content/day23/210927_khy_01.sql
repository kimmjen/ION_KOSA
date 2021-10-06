-- 접근 가능한 테이블 목록 조회
select * from tab;


-- emp2 테이블의 전체 데이터 조회
select * from emp2;


-- dual : 가상 테이블
select sysdate from dual;


-- 테이블 생성
/*
create table [테이블명](
    [컬럼명] datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    [컬럼명] datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    ...
)
*/

create table test(
    name varchar2(10),
    age number(3)
);
select * from test;


-- insert
-- INSERT INTO [테이블명] VALUES([전체 COLUMN에 넣을 VALUE_LIST]);
insert into test values('aa', 10);
-- INSERT INTO [테이블명]([COLUMN_LIST]) VALUES([COLUMN_LIST에 넣을 VALUE_LIST]);
insert into test(age, name) values(22, 'bb');

insert into test(name) values('cc');
insert into test(age) values(33);


-- 테이블 제거
drop table test;
select * from test;


-- not null 제약 조건
create table test(
    name varchar2(10) not null,
    age number(3)
);
insert into test(name) values('dd');
insert into test(age) values(33); -- 오류 발생


-- select 명령어
select * from emp2;
select empno, name, deptno from emp2;

select *
  from emp2
 where name = '백원만';

-- % : 여러 문자 대체
select *
  from emp2
 where name like '이%';

-- _ : 한 문자 대체
select *
  from emp2
 where name like '%정%';

-- 이름이 두 글자인 사람 검색
select *
  from professor
 where name like '__';

-- 정렬
-- 오름차순 : asc(생략 가능), 내림차순 : desc
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
 where position = '부장';

select *
  from professor
 where pay >= 350;

select *
  from professor
 where pay > 350 or pay >= 580;

select *
  from emp2
 where hobby = '독서' or hobby = '등산';

select *
  from emp2
 where hobby = '독서' and emp_type = '정규직';

select empno as "사원번호", name as "성 명", position as "직급", pay as "급 여"
  from emp2;

select name || position || '님'
  from professor;

-- distinct : 중복 제거
select distinct emp_type from emp2;
select distinct position from professor;