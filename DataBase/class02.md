# ⭐ 제약조건

## 1. NOT NULL

- NULL 값이 저장될 수 없음

```sql
create table 테이블명(
	컬럼명 데이터타입 not null,
	...
);
```

## 2. PRIMARY KEY

- 기본키, 중복 안되고 not null임

```sql
create table 테이블명(
	컬럼명 데이터타입 constraint 테이블명_컬럼명_pk primary key,
	...
);
```

## 3. FOREIGN KEY

- 다른 테이블의 기본키를 참조
- 중복 가능 / null 허용
- 참조되고 있는 테이블의 데이터 값 이외의 값은 삽입 불가능

```sql
create table 테이블명(
	컬럼명 데이터타입 constraint 테이블명_컬럼명_fk references 참조테이블명(참조테이블의 pk명),
	...
);
```

## 4. UNIQUE

- 중복 안됨(유일한 값)
- null 허용

```sql
create table 테이블명(
	컬럼명 데이터타입 constraint 테이블명_컬럼명_un unique,
	...
);
```

## 5. CHECK

- 조건을 주어 조건에 만족하는 값만 삽입 가능하도록 함

```sql
create table 테이블명(
	컬럼명 데이터타입 check (컬럼명 [조건]),
	...
);
```

## 6. DEFAULT

- 기본 값을 지정하여 값을 넣지 않아도 기본 값이 들어가도록 함
- null을 허용했을 때 default 컬럼의 값을 생략하면 무조건 default가 들어감
- null을 입력하고 싶을 때는 직접 null을 넣어야 함

```sql
create table 테이블명(
	컬럼명 데이터타입 default [기본 값],
	...
);
```

---

---

# ⭐ 테이블 수정 / 삭제

## 1. 컬럼 추가

```sql
alter table 테이블명 add (
	컬럼명 자료형 [제약조건],
	...
);
```

## 2. 컬럼 삭제

```sql
1. 컬럼 1개 삭제
alter table 테이블명 drop column 컬럼명;
2. 컬럼 여러개 삭제
alter table 테이블명 drop (컬럼명1, 컬럼명2, ...);
```

## 3. datatype 변경

```sql
alter table 테이블명 modify 컬럼명 자료형;
```

## 4. 컬럼명 변경

```sql
alter table 테이블명 rename column 기존컬럼명 to 변경컬럼명;
```

## 5. 테이블 삭제

```sql
drop table 테이블명;
```


---

---

# ⭐ 함수

## 1. 집계 함수

- **sum**(컬럼명) : 합계
- **avg**(컬럼명) : 평균(null은 제외)
- **max**(컬럼명) : 최대값
- **min**(컬럼명) : 최소값
- **count**(컬럼명) : 총 레코드 수(null은 제외)
- **count**(*) : null을 포함한 총 레코드 수
- **rank(expr) within group(order by 컬럼명 asc | desc)** : 전체 값을 대상으로 각 값의 순위 계산

### 1-1. GROUP BY

- 집계 함수를 이용할 때 group by에 없는 일반 컬럼명은 함께 검색할 수 없다.
- 특정 컬럼 기준으로 **group by**절을 통하여 각 그룹별 집계함수를 사용할 수 있다.
- **having**절을 통해 group에 대한 조건을 넣을 수 있다.

```sql
select 기준컬럼명, sum(컬럼명1), avg(컬럼명2)
  from 테이블명
 group by 기준컬럼명
[having 조건]
```

## 2. 숫자 함수

- **round**(숫자, 자리수) : 반올림
- **ceil**(숫자) : 올림한 후 정수 반환
- **floor**(숫자) : 내림한 후 정수 반환
- **mod**(숫자, 나눌 수) : 나머지
- **trunc**(숫자, 자리수) : 버림
- **power**(숫자, 승 수) : 숫자에서 승 수 만큼 제곱

## 3. 문자열 함수

- **upper**(문자열) : 모두 대문자
- **lower**(문자열) : 모두 소문자
- **initcap**(문자열) : 단어의 첫 글자 대문자로 표현
- **length**(문자열) : 문자열의 길이
- **substr**(문자열, 시작, 개수) : 문자의 일부분 추출
- **instr**(문자열, 찾을 문자열) : 찾을 문자열의 출현 위치 알려줌
- **lpad**(문자열, 전체자리수, 특정문자) : 오른쪽 정렬 후 왼쪽 빈 공백에 특정문자로 채움
- **rpad**(문자열, 전체자리수, 특정문자) : 왼쪽 정렬 후 오른쪽 빈 공백에 특정문자로 채움
- **ltrim**() : 왼쪽 공백제거
- **rtrim**() : 오른쪽 공백제거

## 4. 날짜 함수

- **sysdate** : 현재 날짜와 시간
- **month_between**(날짜, 날짜) : 두 날짜 사이의 개월 수를 구함
- **add_months**(날짜, 숫자) : 날짜에서 숫자만큼 월을 더함
- **next_day**(날짜, 요일) : 날짜에서 가장 가까운 요일의 날짜 구함
    - 요일 : 1 = 일요일, 2 = 월요일, ....
- **last_day**(날짜) : 날짜 달의 마지막 날짜를 구함

## 5. 형변환 함수

- **to_char**(datetime, format형식) : 날짜를 format 형식으로 변환

    ```sql
    select to_char(sysdate, 'YYYY-MM-DD') from dual;
    select to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual;
    select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual;
    ```

- **to_char**(number, format형식) : 숫자를 format 형식으로 변환

    ```sql
    select to_char(2000, '999,999') from dual; -- 2,000
    select to_char(2000, 'L999,999') from dual; -- \2,000 지역에 따른 화폐 표시
    select to_char(2000, '$999,999') from dual; -- $2,000
    ```

- **to_date**(문자열) : 문자를 날짜로 변환

    ```sql
    select to_date('2021-01-01', 'YYYY-MM-DD') from dual;
    ```

- **to_number**(문자열) : 문자를 숫자로 변환

    ```sql
    select to_number('123456') from dual;
    ```


⬆
---

---

# ⭐ JOIN

두 개 이상의 테이블을 하나의 테이블로 만들어 한 번의 검색으로 여러 컬럼의 정보를 확인할 때 사용함.

## 1. INNER JOIN

```sql
select 컬럼명1, 컬럼명2, ...
  from 테이블명1 별칭1 [inner] join 테이블명2 별칭2
    on 별칭1.컬럼명 = 별칭2.컬럼명;
```

## 2. OUTER JOIN

### 2-1. LEFT OUTER JOIN

```sql
select 컬럼명1, 컬럼명2, ...
  from 테이블명1 별칭1 left join 테이블명2 별칭2
    on 별칭1.컬럼명 = 별칭2.컬럼명;
```

### 2-2. RIGHT OUTER JOIN

```sql
select 컬럼명1, 컬럼명2, ...
  from 테이블명1 별칭1 right join 테이블명2 별칭2
    on 별칭1.컬럼명 = 별칭2.컬럼명;
```

### 2-3. FULL OUTER JOIN

```sql
select 컬럼명1, 컬럼명2, ...
  from 테이블명1 별칭1 full join 테이블명2 별칭2
    on 별칭1.컬럼명 = 별칭2.컬럼명
```