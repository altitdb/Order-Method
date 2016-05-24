package br.com.factoryPattern;

abstract class Decorador implements Factory{
      protected Factory decorador;
      
      public void decorando(Factory tipoDecoracao){
    	  this.decorador=tipoDecoracao;
      }
}
