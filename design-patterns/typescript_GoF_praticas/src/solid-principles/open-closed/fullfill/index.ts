class CartaoCredito {
  private Codigo: string;
  private Expiracao: Date;
  protected CustoMensal: number;

  constructor(codigo: string, expiracao: Date, custoMensal: number) {
    this.Codigo = codigo;
    this.Expiracao = expiracao;
    this.CustoMensal = custoMensal;
  }

  obterCodigo(): string {
    return this.Codigo;
  }

  obterExpiracao(): Date {
    return this.Expiracao;
  }

  descontoMensal(): number {
    return this.CustoMensal * 0.02;
  }
}

class CartaoCreditoGold extends CartaoCredito {
  descontoMensal(): number {
    return this.CustoMensal * 0.05;
  }
}

class CartaoCreditoSilver extends CartaoCredito {
  descontoMensal(): number {
    return this.CustoMensal * 0.03;
  }
}
