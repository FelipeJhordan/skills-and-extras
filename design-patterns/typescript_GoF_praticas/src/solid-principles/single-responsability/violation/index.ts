class Atividade {
  private baseDados: Database;

  constructor(private nome: string, private prazo: Date) {
    this.baseDados = Database.connect('admin:password@database-name', [
      'atividades',
    ]);
  }

  obterNome() {
    return this.nome + '(' + this.prazo + ')';
  }

  salvar() {
    this.baseDados.atividades.save({ title: this.nome, date: this.prazo });
  }
}
