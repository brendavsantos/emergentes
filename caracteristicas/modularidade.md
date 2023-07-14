## Uma descrição da característica, mostrando claramente quais são os seus efeitos no código (em termo de estrutura, claridade, coesão, acoplamento dentre outros efeitos aplicáveis):

A modularidade pode ser descrita como a característica de um código que não possui dependências internas desnecessárias, ou seja, qualquer parte do código deve ser independente e, consequentemente, pode ser alterada sem prejudicar as demais. Isso é feito através do agrupamento, em módulos, de funções e métodos semelhantes, mas não diretamente relacionados. Um código modularizado tem grandes impactos na coesão, por fazer com que seja mais intuitiva a forma com que o código é organizado e dividido, e no acoplamento, que mantém o mínimo de dependência entre cada uma das coisas contidas no módulo. Além disso, torna o código estruturalmente coerente e de fácil compreensão, pois é possível visualizar como estão agrupados os métodos e funções de acordo com seus objetivos.

## Uma relação da característica com os maus-cheiros de código definidos por Fowler:

A modularidade, ou a falta dela, tem relação direta com o mau-cheiro causado pelo acomplamento excessivo. Quando um código não é modularizado corretamente, é muito provável que os itens que seriam agrupados em um único módulo fiquem soltos e sejam desenvolvidos com muitos pontos interligados. Com a dependência entre várias partes do código ou funções/métodos que realizam muitas atividades ao invés de serem fragmentadas e agrupadas em módulo, qualquer alteração ou evolução fica muito trabalhosa e pode quebrar o projeto. 

## Pelo menos uma operação de refatoração capaz de levar o projeto de código a ter a característica em análise:

As operações de **extrair método**, **substituir método por método-objeto** e **decompor condicional** podem ser grandes aliadas na modularização de um código. Ao criar vários métodos cada vez mais específicos e agrupá-los em um módulo, é garantido que as funcionalidades serão construidas com maior coesão e baixo acoplamento, já que serão específicas e não vão depender umas das outras para alterações. 

No esquema abaixo, é possível observar a criação de modularidade pois, futuramente, mais formas de calculo de figuras poderão ser adicionadas no arquivo e só serão chamadas quando necessário no arquivo principal.

![exemplo modularização](https://media.discordapp.net/attachments/750707734910992535/1129248954882736178/Frame_2.png?width=867&height=577)