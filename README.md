Aqui estão alguns exemplos de teste para o programa da árvore binária com a interface reorganizada. Eles ajudarão a garantir que todas as funcionalidades funcionem corretamente, desde a inserção de nós até a exibição dos percursos e a contagem de elementos (QE).

### Teste 1: Inserção Simples e Percurso Pré-Fixado à Esquerda
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17.
2. **Selecionar Percurso**: Pré-order Left.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {10,5,3,7,15,12,17}`.

   **Explicação**: O percurso pré-fixado à esquerda visita primeiro a raiz, depois a sub-árvore esquerda e por último a sub-árvore direita.

5. **Pressionar o botão "Calculate QE"**.
6. **Saída Esperada**: `QE: 7`.

   **Explicação**: O número total de nós inseridos na árvore é 7.

### Teste 2: Percurso Central à Esquerda
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17 (caso não tenha sido inserido no teste anterior).
2. **Selecionar Percurso**: In-order Left.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {3,5,7,10,12,15,17}`.

   **Explicação**: O percurso central à esquerda (in-order) visita primeiro a sub-árvore esquerda, depois a raiz, e finalmente a sub-árvore direita. Esta é a ordem de classificação dos nós.

### Teste 3: Percurso Pós-Fixado à Esquerda
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17.
2. **Selecionar Percurso**: Post-order Left.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {3,7,5,12,17,15,10}`.

   **Explicação**: O percurso pós-fixado à esquerda visita primeiro a sub-árvore esquerda, depois a sub-árvore direita, e por último a raiz.

### Teste 4: Percurso Pré-Fixado à Direita
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17.
2. **Selecionar Percurso**: Pre-order Right.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {10,15,17,12,5,7,3}`.

   **Explicação**: O percurso pré-fixado à direita visita primeiro a raiz, depois a sub-árvore direita e por último a sub-árvore esquerda.

### Teste 5: Percurso Central à Direita
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17.
2. **Selecionar Percurso**: In-order Right.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {17,15,12,10,7,5,3}`.

   **Explicação**: O percurso central à direita (in-order) visita primeiro a sub-árvore direita, depois a raiz, e por último a sub-árvore esquerda.

### Teste 6: Percurso Pós-Fixado à Direita
1. **Inserir os valores**: 10, 5, 15, 3, 7, 12, 17.
2. **Selecionar Percurso**: Post-order Right.
3. **Pressionar o botão "Show Tree"**.
4. **Saída Esperada**: `Arvore: {17,12,15,7,3,5,10}`.

   **Explicação**: O percurso pós-fixado à direita visita primeiro a sub-árvore direita, depois a sub-árvore esquerda, e por último a raiz.

### Teste 7: Inserção de Novos Valores e Verificação do QE
1. **Inserir os valores**: 25, 20, 30.
2. **Selecionar qualquer percurso e pressionar "Show Tree"** (o percurso não importa para este teste).
3. **Pressionar o botão "Calculate QE"**.
4. **Saída Esperada**: `QE: 10`.

   **Explicação**: Agora a árvore tem 10 nós, pois foram inseridos três novos valores além dos 7 anteriores.

### Teste 8: Verificação de Árvore Vazia
1. **Pressionar o botão "Show Tree"** sem inserir nenhum valor.
2. **Saída Esperada**: `Arvore: {}`.

   **Explicação**: Não há nós na árvore, então a saída deve ser uma árvore vazia.

3. **Pressionar o botão "Calculate QE"** sem inserir nenhum valor.
4. **Saída Esperada**: `QE: 0`.

   **Explicação**: Como não há nós, o QE deve ser 0.

### Teste 9: Inserção de Valores Repetidos
1. **Inserir os valores**: 10, 10, 5, 5, 15, 15.
2. **Selecionar qualquer percurso e pressionar "Show Tree"**.
3. **Saída Esperada**: A árvore deve ignorar valores repetidos, e o resultado será igual ao de inserir apenas os valores distintos.

   **Explicação**: A árvore binária de busca não permite valores duplicados, então, após a inserção, os valores duplicados devem ser ignorados. Portanto, a saída será:
   - Exemplo: Para o percurso pré-fixado à esquerda: `Arvore: {10,5,15}`.

4. **Pressionar o botão "Calculate QE"**.
5. **Saída Esperada**: `QE: 3`.

   **Explicação**: Apenas 3 nós distintos foram inseridos.

---

Esses exemplos de teste cobrem uma variedade de casos: desde percursos básicos até cenários com árvore vazia, valores repetidos e contagem de nós (QE). Você pode usá-los para verificar se a lógica de inserção e os diferentes percursos estão funcionando corretamente no seu programa.
