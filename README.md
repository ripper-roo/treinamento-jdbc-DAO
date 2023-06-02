# DATA ACCESS OBJECT

O DAO é um padrão para que um software intereja com um banco de dados, ou outro sistema de persistência, através de uma interface abstrata, escondendo a implementação e as tecnologias usadas para isso.

Em Java e outras linguagens OO, costuma-se definir, para cada entidade, uma interface contendo seus atributos, no estilo EntidadeDAO, além de uma classe auxiliar DAOFactory, que instanciará uma implementação da interface com a tecnologia escolhida.

Por exemplo:

![Diagrama DAO para Java](./diagramaDAO.png "Diagrama DAO para Java")
