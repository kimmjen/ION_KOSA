-- ����� ����
create user khy identified by oracle account UNLOCK;

-- ���� �ο�
grant connect, resource to khy;
grant create session, create table, create view, create sequence, create procedure to khy;

-- ora-01950 ���� �ذ�
alter user khy default tablespace users quota unlimited on users;