# Princípio de responsabilidade única
“Uma classe deve ter um, e somente um motivo para existir.”
Este princípio indica que toda classe, todo método, função ou componente de seu código deve ter uma única e exclusiva responsabilidade. Uma classe que toma pra si muitas responsabilidades dentro da aplicação, trás baixa coesão ao seu código resultando em baixo nível de manutenabilidade.


## violation

// Está errado pois está unificando a parte de repository e da "entidade"
o papel de uma atividade não é de chamar o repositorio para salvar ela ou outra atividade


## solução

Para este exemplo a maneira correta é dividir as responsabilidades de obter o nome da tarefa e a de salvar um registro no Banco em duas classes distintas, classe Atividade e RepositorioAtividade respectivamente.
