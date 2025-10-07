# Projeto Singleton - Basquete

## Descrição
Adaptação do projeto Singleton do professor para o contexto de basquete usando Maven.

## Estrutura do Projeto Maven
```
basquete/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── basquete/
│   │           └── singleton/
│   │               └── ConfiguracaoBasquete.java
│   └── test/
│       └── java/
│           └── basquete/
│               └── singleton/
│                   └── ConfiguracaoBasqueteTest.java
├── target/                                        ← Pasta gerada pelo Maven
│   ├── classes/                                   ← Classes compiladas
│   ├── test-classes/                              ← Testes compilados
│   └── surefire-reports/                          ← Relatórios de teste
├── pom.xml                                        ← Configuração Maven
└── README.md
```

## Classe ConfiguracaoBasquete
- Implementa padrão Singleton
- Atributos: nomeJogador e equipe
- Métodos getter e setter padrão

## Testes
- Teste para getNomeJogador/setNomeJogador
- Teste para getEquipe/setEquipe

## Comandos Maven

### Compilar o projeto:
```bash
mvn compile
```

### Executar os testes:
```bash
mvn test
```

### Limpar o projeto:
```bash
mvn clean
```

### Compilar e executar testes:
```bash
mvn clean test
```

## Como usar
```java
ConfiguracaoBasquete config = ConfiguracaoBasquete.getInstance();
config.setNomeJogador("LeBron James");
config.setEquipe("Lakers");
```
