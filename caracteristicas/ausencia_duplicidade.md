## Uma descrição da característica, mostrando claramente quais são os seus efeitos no código (em termo de estrutura, claridade, coesão, acoplamento dentre outros efeitos aplicáveis):

A duplicação de código acontece quando um código é usado de forma idêntica, ou com algumas variáveis ajustadas, em diversas partes do código, podendo interagir com variadas funcionalidades. Os principais problemas gerados pela existência de códigos duplicados em um projeto são a provável ocorrencia de muitas inconsistências, pois o código comum não foi centralizado e modificado permitindo reutilizações; a dificuldade em realizar manutenções, pois exige que muitas partes do código sejam readaptadas caso haja alguma mudança; a estrutura confusa em termos de organização e visualização de funcionalidades, e problemas de acoplamento devido à necessidade de alterar todas as cópias do código que foi duplicado caso algo precise mudar. Além disso um dos problemas é o aumento da quantidade de código armazenada, pois quando existe muito código duplicado, a dificuldade de entender 500 linhas que poderiam ser 200 é muito maior.

## Uma relação da característica com os maus-cheiros de código definidos por Fowler:

É diretamente ligada a duplicação de código descrita por Fowler, que indica como principal problema a dificuldade de manutenção e introdução de riscos ao precisar de muitas alterações simultâneas. A ausência de duplicidade deixa o código mais coeso e facilita manutenções posteriores.

## Pelo menos uma operação de refatoração capaz de levar o projeto de código a ter a característica em análise:

De acordo com o [material fornecido](https://docs.google.com/presentation/d/1BG1DVjtOZeG-j3Fmj1cY1gz-4AW9FphX/edit?pli=1#slide=id.p13), a extração de classes pode auxiliar na remoção de duplicidades no código. Através da **extração de classe**, elementos que antes estariam espalhados de forma duplicada pelo código com uma variação mínima nos parâmetros podem ser centralizados em um único lugar e adaptados para o uso. 

Na imagem abaixo, é possível ver duplicidade de código em duas classes diferentes que poderiam, por exemplo, ser extraídas, gerando apenas uma com os atributos comuns.

![exemplo de duplicidade](https://media.discordapp.net/attachments/750707734910992535/1129249991047782461/image.png)