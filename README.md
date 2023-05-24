# Trabalho Prático 1 - _Test-Driven Development_

Faculdade: Universidade de Brasília   
Campus: FGA - Faculdade do Gama   
Disciplina: Técnicas de Programação para Plataformas Emergentes   
Aluna: Brenda Vitória dos Santos   
Matrícula: 18/0041444    

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



