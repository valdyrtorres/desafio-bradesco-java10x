Banco exemplo para criar na origem e destino

Levantar docker em devcode\databases\postgres-dev

create table funcionarios(
id BIGSERIAL PRIMARY KEY,
nome VARCHAR(150) NOT NULL,
cpf VARCHAR(14) NOT NULL UNIQUE,
ativo BOOLEAN NOT NULL DEFAULT TRUE,
create_at TIMESTAMP NOT NULL DEFAULT NOW(),
updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);

create table clientes(
id BIGSERIAL PRIMARY KEY,
nome VARCHAR(150) NOT NULL,
documento VARCHAR(20) NOT NULL,
create_at TIMESTAMP NOT NULL DEFAULT NOW(),
updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);


create table bombas(
id BIGSERIAL PRIMARY KEY,
identificador VARCHAR(50) NOT NULL,
tipo_combustivel VARCHAR(50) NOT NULL,
ativo BOOLEAN NOT NULL DEFAULT TRUE,
create_at TIMESTAMP NOT NULL DEFAULT NOW(),
updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);


create table abastecimentos(
id BIGSERIAL PRIMARY KEY,
funcionario_id BIGINT NOT NULL,
cliente_id BIGINT,
bomba_id BIGINT NOT NULL,
litros NUMERIC(10, 3) NOT NULL,
valor_total NUMERIC(10, 3) NOT NULL,
data_hora TIMESTAMP NOT NULL,
create_at TIMESTAMP NOT NULL DEFAULT NOW(),
updated_at TIMESTAMP NOT NULL DEFAULT NOW(),

CONSTRAINT fk_abastecimentos_funcionario
FOREIGN KEY (funcionario_id)
REFERENCES funcionarios(id),

CONSTRAINT fk_abastecimentos_cliente
FOREIGN KEY (cliente_id)
REFERENCES clientes(id),

CONSTRAINT fk_abastecimentos_bomba
FOREIGN KEY (bomba_id)
REFERENCES bombas(id)

);
---------------

Banco controle
create table tb_replicacao_processo(
id BIGSERIAL PRIMARY KEY,
processo VARCHAR(100) NOT NULL,
descricao VARCHAR(300),
habilitado BOOLEAN default true
);

create table tb_replicacao_processo_tabela(
id BIGSERIAL PRIMARY KEY,
processo_id BIGINT NOT NULL,
tabela_origem VARCHAR(150) NOT NULL,
tabela_destino VARCHAR(150) NOT NULL,
ordem INTEGER NOT NULL,
habilitado boolean default true,
ds_where VARCHAR(500) NOT NULL
);

create table tb_replicacao_direcao(
id BIGSERIAL PRIMARY KEY,
direcao_origem VARCHAR(150) NOT NULL,
direcao_destino VARCHAR(150) NOT NULL,
usuario_origem VARCHAR(45) NOT NULL,
usuario_destino VARCHAR(45) NOT NULL,
senha_origem VARCHAR(45) NOT NULL,
senha_destino VARCHAR(45) NOT NULL,
habilitado boolean default true,
processo_iD BIGSERIAL NOT NULL
);

ALTER TABLE tb_replicacao_direcao
ADD CONSTRAINT tb_replicacao_direcao_fk
FOREIGN KEY (processo_id) REFERENCES tb_replicacao_processo(id);

ALTER TABLE tb_replicacao_processo_tabela
ADD CONSTRAINT tb_replicacao_processo_tabela_fk
FOREIGN KEY (processo_id) REFERENCES tb_replicacao_processo(id);