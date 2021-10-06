select * from emp2;
select * from professor;

-- 문제 1] 사원번호, 이름, 급여, 직급 필드만 출력(별칭을 준다) 부장이면서 일지매인 사람 검색
select empno as "사원번호", name as "이름", pay as "급여", position as "직급"
  from emp2
 where position = '부장'
   and name = '일지매';

-- 문제 2] 필드 출력은 위와 같고, 조건이 과장이거나 김문호인 사람 검색
select empno as "사원번호", name as "이름", pay as "급여", position as "직급"
  from emp2
 where position = '과장'
    or name = '김문호';

-- 문제 3] 급여가 500 이상이고, 보너스가 60 이상 받는 교수는?
select *
  from professor
 where pay >= 500
   and bonus >= 60;

-- 문제 4] 이름에서 '김용조' 사람들을 보여주세요.
select *
  from professor
 where name = '김영조';

-- 문제 5] 이름에서 '김'씨 성을 가진 사람들을 보여주세요.
select *
  from emp2
 where name like '김%';

-- 문제 6] 이름이 두 글자인 사람 보여주세요.
select *
  from professor
 where name like '__';

-- 문제 7] id에 s or a 글자가 들어가는 사람 찾기
select *
  from professor
 where id like '%a%'
    or id like '%s%';

-- 문제 8] 전임강사 찾아주세요
select *
  from professor
 where position = '전임강사';

-- 문제 9] 이름이 '나한라'를 '너한나'로 변경하세요
update emp2
   set name = '너한나'
 where name = '나한라';

-- 문제 10] 취미가 등산인 사람들만 찾아서 '수영'으로 변경
update emp2
   set hobby = '수영'
 where hobby = '등산';
 
-- 문제 11] 계약직 직원 찾아서 삭제하기
delete
  from emp2
 where emp_type = '계약직';

-- 문제 12] pay(or bonus)가 50 이상인 사람만 출력
select *
  from professor
 where pay >= 50
    or bonus >= 50;

-- 문제 13] 정규직이면서 '백원만' 찾기
select *
  from emp2
 where emp_type = '정규직'
   and name = '백원만';

-- 문제 14] 정규직이거나 '유도봉' 찾기
select *
  from emp2
 where emp_type = '정규직'
    or name = '유도봉';

-- 문제 15] 수습직이거나 김씨성을 가진 사람 찾기
select *
  from emp2
 where emp_type = '수습직'
    or name like '김%';

-- 문제 16] 김씨가 아닌 수습직원 찾기
select *
  from emp2
 where emp_type = '수습직'
   and name not like '김%';

-- 문제 17] 교수테이블에서 교수들의 이름을 조회하여 성씨 부분에 'ㅈ'이 포함된 사람의 명단을 출력하세요
select *
  from professor
 where name >= '자'
   and name < '차';