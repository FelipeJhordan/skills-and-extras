interface Impressora {
  copiarDocumento();
  imprimirDocumento(documento: Documento);
  grampearDocumento(documento: Documento, grampo: Grampo);
}

class ImpressoraSimples implements Impressora {
  public copiarDocumento() {
    // implementação ...
  }

  public imprimirDocumento(documento: Documento) {
    // implementação ...
  }

  public grampearDocumento(documento: Documento, grampo: Grampo) {
    // implementação ...
  }
}
