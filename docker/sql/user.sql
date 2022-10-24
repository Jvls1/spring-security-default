create table usr (
	id SERIAL not null,
	username varchar(32) not null,
	password varchar(128) not null,
	role varchar(50) not null
)

alter table usr
    add constraint usr_pk primary key (id);

alter table usr
	add constraint username_unique unique (username);
	
insert into usr(id, username, password, role) 
    values(1, 'admin', '$2a$12$6ImgB5FqgYsvB4fOF1ByS.WeyNm0kiUrpDh82FFGkt3/eMWioJk8a', 'ADMIN');