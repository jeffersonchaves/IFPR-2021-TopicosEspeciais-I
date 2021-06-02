## Aula 8

# Revisão de OO e SQL

## Nesta aula vamos revisar
- Chave primária, chave estrangeira
- DDL (create table, alter table)
- SQL
  - INSERT
  - SELECT
  - INNER JOIN
- Classes e objetos
- Encapsulamento, get/set
- Tipos enumerados
- Composição de objetos
- Coleções (list, map)
- Acessar dados em BD relacional e instanciar objetos correspondentes

## Pré-requisitos
- Mysql
- MysqlWorkBench

[Guia de instalação para Windows](https://github.com/devsuperior/sds1/tree/master/ferramentas/windows)

[Guia de instalação para Linux](https://github.com/devsuperior/sds1/tree/master/ferramentas/linux)

[Guia de instalação para Mac](https://github.com/devsuperior/sds1/tree/master/ferramentas/mac)


## Criação e instanciação da base de dados
```sql
CREATE TABLE `tb_product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` text,
  `image_uri` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tb_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `moment` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tb_order_product` (
  `order_id` int NOT NULL,
  `product_id` int NOT NULL,
  PRIMARY KEY (`order_id`,`product_id`)
);


INSERT INTO `tb_product` VALUES 
(1,'Pizza calabresa com queijo, molho e massa especial','1.png','Pizza de Calabresa',50),
(2,'Pizza quatro queijos muito boa','2.png','Pizza Quatro Queijos',40),
(3,'Pizza escarola muito boa','3.png','Pizza de Escarola',60);


INSERT INTO `tb_order` VALUES 
(1,213123,12323,'2021-06-02 03:43:59',0),
(2,3453453,3534534,'2021-06-02 03:43:59',1);

INSERT INTO `tb_order_product` VALUES 
(1,1),
(1,2),
(2,2),
(2,3);
```

## Consulta para recuperar os pedidos com seus produtos
```sql
SELECT * FROM tb_order
INNER JOIN tb_order_product ON tb_order.id = tb_order_product.order_id
INNER JOIN tb_product ON tb_product.id = tb_order_product.product_id
```

