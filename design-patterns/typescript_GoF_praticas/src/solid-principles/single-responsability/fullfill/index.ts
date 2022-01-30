class Atividade {
  constructor(private nome: string, private prazo: Date) { }

  obterNome() {
    return this.nome + '(' + this.prazo + ')';
  }
}

class RepositorioAtividade {
  private baseDados: Database;

  constructor() {
    this.baseDados = Database.connect('admin:password@database-name', [
      'atividades',
    ]);
  }

  salvar() {
    this.baseDados.atividades.save({ title: this.nome, date: this.prazo });
  }
}
