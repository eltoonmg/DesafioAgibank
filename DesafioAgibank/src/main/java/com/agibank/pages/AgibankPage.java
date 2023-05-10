package com.agibank.pages;

import com.agibank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AgibankPage extends BasePage{

    public void setClicarUsandoID (){
       clicar("id", "search-open");
   }

   public void preencherCampoDePesquisa(String texto){
       escrever("search-field", texto);
   }

   public void setClicarUsandoClasse(){
       clicar("class","search-submit");
   }

   public String obterMensagemPesquisa(String Seletor){
        return obterTexto(Seletor);
   }
}
