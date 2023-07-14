# Trabalho Prático 1 - _Test-Driven Development_

Faculdade: Universidade de Brasília      
Campus: FGA - Faculdade do Gama      
Disciplina: Técnicas de Programação para Plataformas Emergentes    
Aluna: Brenda Vitória dos Santos     
Matrícula: 18/0041444    
Paradigma: Funcional       

O programa foi desenvolvido de forma que cada publicação listada no JSON seja avaliada como tendo de 0% a 100% de completude. De acordo com o esquema, os campos estão dispostos logicamente da seguinte forma:

### Atômicos
- title 
- publicationDate
- language

### Aninhados OR exclusivo
- author.identifier.lattes
- author.identifier.orcid

### Aninhados OR inclusivo
- author.nationality
- author.birthCountry
- author.birthCity
- author.birthState

Cada publicação é composta por:   

1 título (vale 25% da completude total);   
1 lingua (vale 25% da completude total);   
1 data de publicação (vale 25% da completude total), e    
X autores (vale 25% da completude total).   

Cada autor afeta a completude geral, dos 25% destinados à completude dos autores, de acordo com seus campos **identificador** (lattes ou orcid), **nacionalidade**, **país de nascença**, **estado de nascença** e **cidade de nascença**. Ou seja, para a publicação alcançar 100% de completude, precisa que TODOS os campos atômicos sejam preenchidos e que TODOS os seus autores tenham os dados necessários preenchidos corretamente (de acordo com as regras OR).

> A regra OU EXCLUSIVO estabelece que o campo raiz é considerado
> completo quando apenas um dos campos filhos está presente, qualquer um dos
> campos filhos agregados. A regra OU INCLUSIVO estabelece que o campo raiz é
> considerado preenchido quando pelo menos um campo filho está presente. O caso
> especial em que nenhum campo filho está presente é considerado como
> não-preenchido. Para o campo raiz ser considerado completo, todos os campos
> filhos devem estar presente. 
> 
> Para o caso de campo atômico, ele é considerado completo se há um valor
> atribuído a ele. 

> O trabalho deverá apresentar o emprego das três técnicas de TDD 
> (falsificação,
> duplicação e triangulação) em, pelo menos, nas duas seguintes 
> situações: 

> * Cálculo da completude de campos OR EXCLUSIVO; 
> * Cálculo da completude de registros multi-campos.

### Requisitos

- bash
- curl 
- rlwrap
- Java
- [Clojure](https://clojure.org/guides/install_clojure)
- [Leiningen](https://leiningen.org/)
- VSCode, extensão [calva](https://calva.io/connect/)

### Execução

```
git clone https://github.com/brendavsantos/emergentes

```

```
cd emergentes
```

```
code .
```

1. Abrir o documento que está no caminho src/emergentes/core.clj

2. Com CTRL+shift+p , escolher a opção "Calva: Start a project and Connect..." pra usar o jack-in

3. Escolher como project type o Leiningen

4. Pra carregar/recarregar/"compilar" o projeto, pode usar o atalho CTRL+alt+c. Se quiser rodar uma função específica ou só parte do código, pode clicar depois do ultimo parenteses da função e apertar alt+enter ou chamar a função no proprio console do calva (o que fica aberto na direita)...pra isso é colar a chamada da função (funcao argumento), colocar o cursor depois do ultimo parenteses dela e apertar enter.

Obs: Deixei umas funções já chamadas pra ajudar rodar fácil, estão no final de cada arquivo. Pra rodar cada uma é só clicar depois do ultimo parenteses que chama a função e apertar alt+enter...Se eu tiver esquecido de algo na instalação desculpa, já tenho um costume em usar enão não lembro bem desse inicio :( 

![validacao funcionando](https://media.discordapp.net/attachments/750707734910992535/1129188939606007818/validacao-funcionando.png?width=956&height=577)

