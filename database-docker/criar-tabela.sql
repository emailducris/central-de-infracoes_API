CREATE TABLE records(
	 id bigserial not null
	,dt_hora date not null
	,velocidade float(8) not null
	,placa varchar(8) not null
	,classe_veiculo varchar(100) not null
	,primary key (id)
);

ALTER TABLE records ADD CONSTRAINT records_pk PRIMARY KEY (id);