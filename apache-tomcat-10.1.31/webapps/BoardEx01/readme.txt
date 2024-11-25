=> ERD

MariaDB [(none)]> create database board;
MariaDB [(none)]> grant all privileges on board.* to board@'%' identified by '123456';
C:\WINDOWS\System32>mysql -u board -p board

create table board1 (
seq         int                   not null     primary key auto_increment,
subject     varchar(150)          not null,
writer      varchar(12)           not null,
mail        varchar(50),
password    varchar(42)           not null,
content     varchar(2000),
hit         int                   not null,
wip         varchar(15)           not null,
wdate       date                  not null
);

insert into board1 values ( 0, '제목', '이름', 'test@test.com', password( '1234' ), '내용', 0, '000.000.000.000', now() );

=> DFD

board_list1.jsp(목록)
     (X)
     board_write1.jsp(쓰기)
          (입력 내용)
          board_write1_ok.jsp(DB) - (X) -> board_list1.jsp
     (seq)
     board_view1.jsp(보기)
          (seq)
          board_modify1.jsp(폼)
               (seq, 비밀번호 / 수정 내용)
               board_modify1_ok.jsp(DB) - (seq) -> board_view1.jsp
          (seq)
          board_delete1.jsp(폼)
               (seq, 비밀번호)
               board_delete1_ok.jsp(DB) - (X) -> board_list1.jsp