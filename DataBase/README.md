# DATABASE (Oracle)
- Database(테이블베이스): 저장소에 구분되는 가장 큰 단위
- Table(테이블): 데이터베이스에 뭔가를 저장하기 위해 첫 단계에서 만드는 테이블
- Column(컬럼): 관계형데이터 베이스에서 행(레코드)를 분류하는 기준
- Row(행): 데이터를 저장하는 값으로 컬럼(필드) 내의 단 하나의 값
- 같은 의미의 용어
  - Table(테이블)과 Relation(릴레이션)는 같은 의미
  - column(컬럼)과 Filed(필드), Attribute(어트리부트)는 같은 의미
  - Row(행)과 Record(레코드), Tuple(튜플)는 같은 의미

데이터베이스 관리 권한으로 접속<br>
sqlplus<br>
splplus/ as sysdba<br>
sqlplus system/1234 <- 비밀번호 노출로 인해서 권장하지 않는 방법
<br>
sql 접속 후 다른 계정으로 접속하기(로그리인한 상태에서 다른 계정으로 로그인 하는 것) <br>
conn scott/tiger<br>
connect sys/ as sysdba
<br>

sql 화면 지우기 <br>
clear screen
<br>
포트번호 알아보기<br>
select dbms_xdb.gethttpport() from dual;<br>

포트번호 바꾸기<br>
exec dbms_xdb.sethttpport(9090);
<br>
auto commit을 켤 경우,<br>
set autocommit on;
<br>

auto commit을 끌 경우,<br>
set autocommit off;
<br>

auto commit의 상태를 확인할 경우,<br>
show autocommit;
<br>

1. 쿼리문
##### 오라클 시퀸스 명령어
- 시퀸스의 현재 값을 확인<br>
  SELECT LAST_NUMBER FROM USER_SEQUENCES WHERE SEQUENCE_NAME = 'seq_board';
- 시퀸스의 INCREMENT 를 현재 값만큼 빼도록 설정(아래는 현재값이 999999일 경우)<br>
  ALTER SEQUENCE seq_board INCREMENT BY -999999;
- 시퀸스에서 다음 값을 가져오기
SELECT seq_board.NEXTVAL FROM DUAL;
- 현재 값을 확인해보기
SELECT seq_board.CURRVAL FROM DUAL;
- 시퀸스의 INCREMENT를 1로 설정한다.
ALTER SEQUENCE seq_board INCREMENT BY 1;
- 오라클 시퀸스 조회(검색)
select * from user_sequence;
- ==시퀸스 검색(현재 계정의 모든 시퀸스를 보여줌)==
SELECT SEQUENCE_NAME, MIN_VALUE, MAX_VALUE, INCREMENT_BY, CYCLE_FLAG FROM USER_SEQUENCE;
- 시퀸스 삭제
DROP SEQUENCE seq_board;
- 시퀸스 생성
CREATE SEQUENCE seq_board;
START WITH 1
INCREMENT BY 1
MAXVALUE 10000
MINVALUE 1
NOCYCLE;

- 시작값은 말 그래돌 시퀸스의 시작값, 만약 1을 쓰면 1부터 순차적으로 증가할 것이고 10을 쓴다면 10부터 순차적으로 증가, 증가값은 시퀸스가 얼마씩 증가할 건지를 지정하는 값,
- 최대값은 시퀸스의 최대값을 의미하며, 최소값은 시퀸스의 최소값을 의미
- 순환여부는 시퀸스가 최대 값이 됐을 때 다시 시작값으로 돌아갈것인지에대해 설정, 순환한다면 CYCLE, 그렇지 않다면 NOCYCLE
- 캐시여부는 시퀸스 값을 메모리에 할당 할 것인지에 대해 설정, CACHE에 할당한다면 원하는 값을 넣고 기본값은 20, 할당하지 않으면 NOCACHE로 지정

#### DCL(사용자계정 관련, 데이터 제어어 SQL 쿼리문)
- 오라클 계정 변경
conn 계정명/ 비밀번호 ex) conn scott/tiger
- 오라클 사용자 계정 만들기
create user 아이디 identified by 비번 ex) create user scott identified by 1234
- 오라클 계정 비밀번호 변경
alter user 유저명 identified by 변경할 비밀번호; ex) alter user scott identified by 1234;
- 오라클 계정 삭제 방법
drop user 계정명 cascade;
- 오라클 계정 권한 주기
grant 권한 to 아이디;<br>
connect <- 로그인 권한<br>
resource <- 자원을 사용할 수 있는 권한<br>
dba <- db 관리자 권한<br> ex) grant connect, resource, dba to scott;
- 사용자에게 부여된 시트템 권한 확인
select * from dba_sys_privx where grantee = '사용자명';
- 계정에 권한 조회하기
select * from user_tab_privs_made;<br>
select * from user_tab_privs_recd;
- 계정에 권한 삭제하기
revoke 권한명 from 계정명; ex) revoke connect, resource, dba from java;
-------------
- 
- 아래부터는 샘플계정 hr로 설명
- 사용자 계정 잠김 풀기(언락)
alter user 사용자명 account unlock; ex) alter user hr account unlock;
- 사용자 계정 암호 부여하기
alter user 사용자명 identified by 비밀번호; ex) alter user hr identified by hr;
- 사용자 계정 잠김 풀기 및 암호부여
alter user 사용자명 identified by 원하는 비밀번호 account unlock; ex) alter user hr identified by hr account unlock;
- 현재 생성된 계정 확인하기
select * from all_users;
- 현재 접속한 사용자(계정) 조회하기
select user from dual;


#### DDL(테이블 관련, 데이터 정의어 SQL 쿼리문)
- 테이블 스페이스(테이블저장공간) 만들기
create tablespace 테이블스페이스이름<br>
datafile '데이터파일경로' size 초기사이즈<br>
autoextend on <- 자동증가<br>
next 자동증가사이즈;<br>
maxsize 최대사이즈;<br>
ex) create tablespace java, datafile 'd:\java.db' size 50m, autoextend on, next 10m, maxsize ulimited;<br>
: 초기사이즈 50메가, 용량이 꽉 차면 10메가씩 자동증가해서 무제한으로 증가시키겠다는 의미(루트 디렉터리에는 사용하지 않는게 좋음, 사용하게된다면 따로 폴더를 만들어서 사용)
- 만든 테이블을 사용하겠다는 sql문
default tablespace 테이블스페이스이름;
- 테이블의 필드 목록 조회(확인)하기
desc member;
- 현재 계정의 테이블 목록 보기
select * from tab;
- 테이블의 데이터(내용)보기
select * from 테이블명; ex) select * from member;
- 모든 계정의 테이블 목록보기
select * from all_tables where OWNER = 'scott';
- 테이블 이름 변경하기
rename 변경 전 테이블명 to 변경 후 테이블명; ex) rename emember to member_user;
- 테이블 삭제하기
drop table 테이블명; ex) drop table member;
- 테이블 컬럼 추가하기
alter table 테이블명 add(컬럼명 데이터타입(사이즈)); ex) alter table member add(age varchar2(5));
- 테이블 컬럼 수정하기
alter table 테이블명 modify(컬럼명 데이터타입(사이즈)); ex) alter table member modify(userid varchar2(50));
<br>해설: user라는 테이블의 userid라는 컬럼을 타입을 varchar2(50)으로 수정
- 테이블 컬럼 삭제하기
alter table 테이블명 drop column 컬럼명 ex) alter table member drop column age;
- 테이블 컬럼 이름 변경하기
alter table 테이블명 rename column 원래컬럼명 to 바꿀컬럼명; ex) alter table member rename column age to AGE;


#### DML(추가, 수정, 삭제, 목록, 데이터 조작어 SQL 쿼리문)
- 추가(insert)
insert into 테이블명 values('해당하는 컬럼/필드 값', '해당하는 컬럼/필드 값')
<br>**꼭 작은 따옴표를 사용해야함**<br>
ex) insert into member values('june', '123', '네임');
- 수정(update)
update 테이블명 set 컬럼명='컬럼명에 해당하는 값' where 컬럼명='조건에 해당되는 값';<br>
ex) update member set password='1111' where userid='kim';
<br>해설: member테이블에 where 조건에 kim이라는 사람의 비밀번호를 1111로 수정할 것이다.
<br>주의: update member set password='2222'; where 조건문 없이 실행시키면 member의 모든 비밀번호가 2222로 바뀐다. 위 처럼 테이블의 모든 데이터가 동일한 값으로 바뀌어 버리면 rollback;을 하면 된다.
- 삭제(delete, 레코드 삭제)
delete from 테이블명 where 컬럼명='row값';<br>
ex) delete from member where userid = 'kim';
- 테이블 컬럼 여러개 삭제하기(in, or 이용하기)
delete from 테이블명 where 컬럼명 in (값, 값);<br>
delete from 테이블명 where 컬럼명='값' or 컬럼명='값';
<br>ex) delete from TBL_BOARD where bno in (27, 28);
<br>ex) delete from tbl_board where bno='22' or bno='36';


#### DQL(검색할 때, 데이터 질의어 SQL 쿼리문)
select 컬럼명1, 컬렴명2, ... from 테이블명 where 조건절 order by 정렬의 기준 컬렴명 [asc/desc];
<br>**asc: 오름차순, desc: 내림차순**

데이터베이스에서 원하는 데이터를 검색, 추출
SELECT [ALL|DISTINCT] 열리스트 <br>
[FROM 테이블_리스트]<br>
[WHERE 조건]           <br>
[GROUP BY 열_리스트 [HAVING 조건]]<br>
[ORDER BY 열_리스트 [ASC|SESC]];

기능<br>
Projection: 원하는 컬럼 선택<br>
Selection: 원하는 튜플 선택<br>
Join: 두 개의 테이블 결합<br>
기타: 각종 계산, 정렬, 요약<br>

**`* <- 별표의 의미는 모든 필드를 의미`**<br>

테이블의 모든 데이터 조회하기<br>
select * from emp;

특정 테이블의 모든 데이터 검색하기<br>
select * from 테이블명 order by 컬럼명;

특정 필드를 지정해서 조회하기(insert한 순서대로 나옴)<br>
select 컬렴명, 컬렴명 from 테이블명;

특정 필드 목록의 데이터 검색하기(오름차순: asc, 내림차순: desc)<br>
select 컬렴명, 컬럼명 from 테이블명 order by asc;<br>
select empno, ename from emp order by ename asc;           <br>

`asc를 안써도 기본적으로 가나다순의 오름차순으로 나온다. asc는 기본값`

테이블에서 특정 컬럼의 데이터 보기
select * from 테이블명 where 컬렴명 = 'row값';<br>

---

### 컬럼명 설명
https://jjunii486.tistory.com/80






2. 예제

게시판에 필요한 테이블과 시퀸스 생성
```sql
create table myBoard (
    bno number not null,
    title varchar2(30) not null,
    content varchar2(2000) not null,
    writer varchar2(30) not null,
    regDate date default sysdate,
    viewCnt number default 0,
    primary key(bno)
);

create sequence myBoard_seq;
```

글쓰기<br>
```sql
insert into myBoard(bno, title, content, writer)
values (myBoard_seq.nextval, '글 제목', '글 내용', '작성자');
```
글조회<br>
```sql
select
    bno, title, content, writer, regDate, viewCnt
from myBoard
where bno = 1;

select
    bno, title, content, writer, regDate, viewCnt
from myBoard
```
글수정<br>
```sql
update myBoard
set 
    title = '글 제목_수정',
    content = '글 내용_수정'
where bno = 1;
```
글삭제<br>
```sql
delete from myBoard
where bno = 1;
```

