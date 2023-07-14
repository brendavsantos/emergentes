## Uma descrição da característica, mostrando claramente quais são os seus efeitos no código (em termo de estrutura, claridade, coesão, acoplamento dentre outros efeitos aplicáveis):

A simplicidade de código é caracterizada pela criação de códigos simples, fáceis de ler, de visualizar e de entender. Em relação às características impactadas pela simplicidade, podem ser destacadas a reafirmação de que cada parte do código tem uma única função, relacionada a coesão; a facilidade em motificar e alterar qualquer coisa que se torne necessária com o tempo, impactando positivamente na manutenção; a estrutura simples e bem escrita do código, que permite visualizar facilmente as divisões internas do código e ientificar inicio e fim de estruturas através da identação, e a facilidade de entender o código, já que é claro o objetivo e o funcionamento de cada parte dele.

## Uma relação da característica com os maus-cheiros de código definidos por Fowler:

A simplicidade pode ser relacionada com diversos aspectos destacados pelos maus-cheiros, alguns deles de fácil visualização são classes muito grandes e nomes de váriaveis e métodos confusos. Ao utilizar classes muito grandes, provavelmente ela terá muitas funções que poderiam ser delegadas de forma mais adequada, o que implica em problemas relacionados à coesão, e ao utilizar nomes confusos ou inapropriados, pode causar grandes impactos na compreensão das funcionalidades desenvolvidas no código, bem como atrapalhar futuras manutenções.

## Pelo menos uma operação de refatoração capaz de levar o projeto de código a ter a característica em análise:

Através do [material](https://docs.google.com/presentation/d/1BG1DVjtOZeG-j3Fmj1cY1gz-4AW9FphX/edit?pli=1#slide=id.p11), é possível perceber que longas listas de parâmetros podem causar grandes problemas relacionados à simplicidade do código, pois tornam o código de difícil compreensão e utilização. Uma das primeiras operações indicadas seria **substituir parâmetro por método**, que permitiria o acesso direto às propriedades necessárias atraves do objeto e cessaria a necessidade de alterar continuamente a composição da lista utilizada anteriormente. 

Na seguinte imagem, é possível ver um código qe pode ser considerado simples em questão de visualização, entendimento e leitura:

![exemplo simplicidade](https://media.discordapp.net/attachments/750707734910992535/1129251477613977671/CapturadeTela2014-03-06aCC80s13.png)