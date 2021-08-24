# Introdução #

A solução para o desafio proposto consiste em duas aplicações distintas (FanateeConsole e FanateeAPI), ambas desenvolvidas em Scala.
Para compilar e rodar localmente as duas aplicações, é necessário ter instalado:
- JDK 11
- SBT 1.5.5 ou superior (https://www.scala-sbt.org/1.x/docs/Setup.html)

## FanateeConsole ##

Navegar ao diretório raiz da pasta "FanateeConsole" e rodar os comandos conforme exemplos abaixo.

Exemplo de navegação ao diretório raiz:
```shell
$ cd C:\Users\Alvim\FanateeConsole
```

Inicialização do SBT:
```shell
$ sbt
```

Para rodar os testes unitários:
```shell
$ test
```

Para compilar e rodar a aplicação, passando como parâmetro o nome do arquivo .csv com os custos das rotas (este arquivo deve estar na pasta raiz):
```shell
$ run "exemplo.csv"
```

## Interagindo com o sistema via console ##

Inicialmente o sistema irá solicitar uma rota a ser calculada, no formato "TER-MAR":
```shell
Please enter the route:
```

Após fornecida uma rota de entrada, o sistema retorna a rota de menor custo (com o respectivo custo):
```shell
Best route: TER - MAR - Cost: 10
```

Em seguida, o usuário pode fazer uma nova consulta ou sair do sistema, através de uma interação intuitiva com o console.
