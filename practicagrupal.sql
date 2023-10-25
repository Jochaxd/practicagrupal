/*Se crea la base de datos */
drop schema if exists practica;
drop user if exists usuario_practica;
CREATE SCHEMA practica ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_practica'@'%' identified by 'la_Clave';

/*Se asignan los prvilegios sobre la base de datos practica al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/* la tabla de arbol contiene tipos de arboles, se crea la tabla*/
create table practica.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(30) NOT NULL,
  tipo_flor VARCHAR(30) NOT NULL,
  dureza_madera INT NOT NULL,
  ruta_imagen VARCHAR(1024) NOT NULL,
  PRIMARY KEY (id_arbol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*Se insertan 10 arboles como ejemplo a la tabla arbol*/
INSERT INTO practica.arbol (id_arbol, nombre_comun, tipo_flor, dureza_madera, ruta_imagen) VALUES 
(1, 'Pino', 'Conífera', 4, "https://www.tijuana.gob.mx/webpanel/catalogoPlantas/categorias/202181811332789.jpg"),
(2, 'Roble', 'Caducifolio', 6, "https://cdn0.bioenciclopedia.com/es/posts/8/2/5/roble_comun_528_600.jpg"),
(3, 'Cedro', 'Conífera', 5, "https://www.reddearboles.org/nwlib6/includes/phpthumb/phpThumb.php?src=/imagenes/Cedro.jpg&w=550&f=jpg"),
(4, 'Arce', 'Caducifolio', 3, "https://inaturalist-open-data.s3.amazonaws.com/photos/104519575/large.jpeg"),
(5, 'Abeto', 'Conífera', 4, "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Sapin_lure.jpg/800px-Sapin_lure.jpg"),
(6, 'Nogal', 'Caducifolio', 7, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/20110802Walnussbaum_Plankstadt2.jpg/1024px-20110802Walnussbaum_Plankstadt2.jpg"),
(7, 'Peral', 'Frutal', 2, "https://herbario.istmas.edu.ec/wp-content/uploads/2022/05/PERAL.jpg"),
(8, 'Palo de Rosa', 'Exótico', 6, "https://potosinoticias.com/wp-content/uploads/2023/04/palo-rosa-slp-huasteca-arboles-primavera-960x592.jpg"),
(9, 'Pino de Oregón', 'Conífera', 5, "https://upload.wikimedia.org/wikipedia/commons/f/f7/Handroanthus_serratifolius.jpg"),
(10, 'Caoba', 'Exótico', 8, "https://upload.wikimedia.org/wikipedia/commons/6/6c/Swietenia_humilis_en_una_cerca.jpg");