-- 사용자 생성
create user khy identified by oracle account UNLOCK;

-- 권한 부여
grant connect, resource to khy;
grant create session, create table, create view, create sequence, create procedure to khy;

-- ora-01950 오류 해결
alter user khy default tablespace users quota unlimited on users;