create table boards2 (
    bno number primary key,
    btitle varchar2(200) not null,
    bcontent clob  not null,
    bwriter varchar2(20) not null,
    bdate date not null,
    bhitcount number not null,
    bfilename varchar2(100) null,
    bsavedname varchar2(100) null,
    bfiletype varchar2(100) null
);

create sequence seq_boards2_bno;