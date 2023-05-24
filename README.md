# Trabalho Prático 1 - _Test-Driven Development_

Faculdade: Universidade de Brasília   
Campus: FGA - Faculdade do Gama   
Disciplina: Técnicas de Programação para Plataformas Emergentes   
Aluna: Brenda Vitória dos Santos 
Matrícula: 18/0041444 

Cálculo da completude de registros em JSON de acordo com os campos:

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
> 
> O cálculo da completude de um registro é feito de maneira recursiva, de modo
> que o valor da completude do campo pai de um registro é dado pelo valor da
> completude de seus filhos, considerando as regras apresentadas anteriormente. 

O trabalho deverá apresentar o emprego das três técnicas de TDD (falsificação,
duplicação e triangulação) em, pelo menos, nas três seguintes situações: 

* Cálculo da completude de campos OR EXCLUSIVO; 
* Cálculo da completude de registros multi-campos.

