package strategy1;

import strategy1.estrategias.IEstrategia;

abstract public class Inimigo {
     protected IEstrategia estrategia;

     public void iniciar() {
         estrategia.iniciar();
     }

     public void concluir() {
         estrategia.concluir();
     }

 }
