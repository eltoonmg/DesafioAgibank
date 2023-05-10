package com.agibank.tests;

import com.agibank.core.BaseTest;
import com.agibank.core.BasePage;
import com.agibank.pages.AgibankPage;
import org.junit.Assert;
import org.junit.Test;

public class TesteAgibank extends BaseTest {

    private BasePage basePage;
    AgibankPage agiPage = new AgibankPage();

    @Test
    public void preencherCampoSemInformacao(){
        agiPage.setClicarUsandoID();
        agiPage.preencherCampoDePesquisa(" ");
        agiPage.setClicarUsandoClasse();
        Assert.assertEquals("Resultados da busca por:" , agiPage.obterMensagemPesquisa("archive-title"));
    }

    @Test
    public void buscaInvalida() {
        agiPage.setClicarUsandoID();
        agiPage.preencherCampoDePesquisa("xxxxx");
        agiPage.setClicarUsandoClasse();
        Assert.assertEquals("Nenhum resultado", agiPage.obterMensagemPesquisa("entry-title"));
    }

    @Test
    public void buscaValida(){
        agiPage.setClicarUsandoID();
        agiPage.preencherCampoDePesquisa("taxa selic");
        agiPage.setClicarUsandoClasse();
        Assert.assertEquals("Resultados da busca por: taxa selic", agiPage.obterMensagemPesquisa("archive-title"));
    }

}
