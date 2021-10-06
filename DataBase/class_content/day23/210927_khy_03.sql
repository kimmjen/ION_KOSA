-- 집계(그룹) 함수
select sum(height), sum(weight) from student;
select avg(height) as "평균키", avg(weight), max(height) as "최고키", min(height) from student;

select count(*) from professor;
select count(bonus), count(name) from professor;
select * from professor;

select rank(68000000) within group(order by pay desc)
  from emp2;

select rank(490) within group(order by pay desc)
  from professor
 where bonus is not null;

-- oracle은 null값이 우선순위가 높다. mysql은 null값이 우선순위가 낮다.
select name, pay, bonus from professor order by bonus desc;

-- 문제 1] 키가 168인 사람은 몇 번째로 큰지 확인
select rank(168) within group(order by height desc)
  from student;

-- 문제 2] 몸무게가 58인 사람은 몇 번째인지 등수 구하기
select rank(58) within group(order by weight desc)
  from student;

-- 문제 3] g_end가 200000, 600000보다 작은 값 출력(any 사용할 것)
select *
  from gift
 where g_end < any(200000, 600000);


-- 제약조건 종류
-- constraint [별칭] primary key, 별칭 : 테이블명_필드명_성격 예) board_id_pk
create table userlist(
    id varchar2(10) constraint userlist_id_pk primary key,
    name varchar2(10)
);
insert into userlist values('khy', 'hoyoung');
insert into userlist(id) values('gildong');
select * from userlist;