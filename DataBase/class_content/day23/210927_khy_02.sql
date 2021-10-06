-- update 명령어
-- update [테이블명] set [컬럼명] = [데이터];

select * from professor where position = '정교수';

update professor set pay = pay + 100; -- 테이블 전체가 변경되어버림.
rollback;

update professor set pay = pay + 100 where position = '정교수'; -- 조건에 맞는 데이터만 변경


-- delete 명령어
-- delete from [테이블명];
delete from emp2; -- 레코드 전체 삭제
select * from emp2;
rollback;

select * from professor where position like '정%';
delete professor where position like '정%';

update emp2 set name = '너사장', hobby = '게임' where name = '나사장';
rollback;


-- 테이블 내 전체 데이터 삭제
-- truncate table [테이블명];
-- where절 사용 불가
-- rollback 불가능
truncate table emp2;


-- 연산자
-- mod
select mod(7, 3) as "나눈 나머지 값" from dual;
-- null 연산은 결과가 무조건 null이다.
select * from professor;
desc professor; -- 테이블 구조 확인
-- nvl 함수
update professor set bonus = bonus + 1000;
update professor set bonus = nvl(bonus, 0) + 1000;
select bonus, nvl(bonus, 0) from professor;
rollback;
-- in, not
select name, deptno from professor where deptno = 101 or deptno = 201 or deptno = 301;
select name, deptno from professor where deptno in (101, 202, 301);
select name, deptno from professor where deptno != 101 and deptno != 201 and deptno != 301;
select name, deptno from professor where deptno not in (101, 202, 301);
-- between
select * from professor where pay between 300 and 500;
select * from professor where deptno between 103 and 300;
-- 와일드카드 : %, _
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';
-- is
select * from professor where bonus is null;
select * from professor where hpage is not null;

