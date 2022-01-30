interface Impressora {
  imprimirDocumento(documento: Documento);
}

interface Copiadora {
  copiarDocumento();
}

interface Grampeador {
  grampearDocumento(documento: Documento, grampo: Grampo);
}

class ImpressoraSimples implements Impressora {
  public imprimirDocumento(documento: Documento) {
    // implementação ...
  }
}

class ImpressoraMultifuncional implements Impressora, Copiadora {
  public imprimirDocumento(documento: Documento) {
    // implementação ...
  }

  public copiarDocumento() {
    // implementação ...
  }
}

class SuperImpressora implements Impressora, Copiadora, Grampeador {
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
