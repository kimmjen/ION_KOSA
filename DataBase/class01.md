# ⭐ 사용자 계정 만들기

- 최고 관리자인 system 계정으로 접속하여 만듦.

## 1. 계정 만들기 및 만들어질 계정의 lock 해제

```sql
create user [유저명] identified by [비밀번호] account unlock;
```

## 2. 기본 권한 설정

```sql
grant connect, resource to [유저명];
```

## 3. 특정 권한 부여

- 세션, 테이블, 뷰, 시퀀스, 프로시저 생성 권한 부여

```sql
grant create session, create table, create view, create sequence, create procedure to [유저명];
```

## 4. ORA-01950 오류 해결

- 참고 : [https://hozeroa.tistory.com/11?category=1228847](https://hozeroa.tistory.com/11?category=1228847)

```sql
alter user [유저명] default tablespace users quota unlimited on users;
```

---

---

# ⭐ 계정 및 접속 관련 명령

## 1. 계정 비밀번호 변경

```sql
alter user [유저명] identified by [비밀번호];
```

## 2. system 비밀번호 모를 경우 접속 방법

1. cmd창 열어서 sqlplus /nolog; 입력.
2. conn /as sysdba; 입력.

## 3. 접근 가능한 table 목록 조회

```sql
select * from tab;
```

## 4. 특정 테이블 컬럼에 대한 정보

```sql
desc [테이블명];
```

## 5. 다른 계정으로 접속을 변경

```sql
conn [유저명]/[비밀번호];
```

## 6. 현재 접속된 user 조회

```sql
show user;
```

---

---

# ⭐ SQL의 종류

## 1. DQL (Data Query Language)

- 데이터 검색
- DML에 속한다고 보기도 함
- select

## 2. DML (Data Manipulation Language)

- 데이터 변경/추가
- insert, update, delete

## 3. DDL (Data Definition Language)

- DataBase 구조 정의
- create, alter, drop

## 4. DCL (Data Control Language)

- 권한 지정/제거
- grant, revoke

---

---

# ⭐ DQL

## 1. SELECT

- **기본 문법**

    ```sql
    select [필드명, ...]
      from [테이블명, ...]
    [where 조건];
    ```

- **DISTINCT** : 중복 값 제거

    ```sql
    select distinct [필드명], ...
      from [테이블명]
    [where 조건];
    ```

- **ORDER BY** : 정렬

    ```sql
    select [필드명, ...]
      from [테이블명, ...]
    [where 조건]
    [order by [필드명] [ASC(오름차순, 생략 가능) or DESC(내림차순)], ...];
    ```

- **ALIAS** : 별칭

    ```sql
    select [필드명] [AS "[별칭]"]
      from [테이블명, ...]
    [where 조건];
    ```


---

---

# ⭐ DML

## 1. INSERT

- **기본 문법**

    ```sql
    1.
    insert into [테이블명]
    values (데이터1, 데이터2, ...);
    
    2.
    insert into [테이블명] (필드명1, 필드명2, ...)
    values (데이터1, 데이터2, ...);
    ```


## 2. UPDATE

- **기본 문법**

    ```sql
    update [테이블명]
       set [필드명] = [데이터]
    [where 조건];
    ```


## 3. DELETE

- **기본 문법**

    ```sql
    delete from [테이블명]
    [where 조건];
    ```


---

---

# ⭐ DDL

## 1. CREATE

### 1-1. CREATE DATABASE

- **기본 문법**

    ```sql
    create database [데이터베이스명];
    ```


### 1-2. CREATE TABLE

- **기본 문법**

    ```sql
    create table [테이블명] (
    	필드명1 필드타입1 [제약조건1],
    	필드명1 필드타입2 [제약조건2],
    	...
    );
    ```

- **제약조건**
    1. **NOT NULL** : 해당 필드는 NULL 값을 저장할 수 없게 된다.
    2. **UNIQUE** : 해당 필드는 서로 다른 값을 가져야만 한다. (NULL 허용)
    3. **PRIMARY KEY** : 해당 필드는 NOT NULL과 UNIQUE 제약 조건의 특징을 모두 가진다.
    4. **FOREIGN KEY** : 하나의 테이블을 다른 테이블에 의존하게 만든다.
    5. **DEFAULT** : 해당 필드의 기본값을 설정한다.

---

---