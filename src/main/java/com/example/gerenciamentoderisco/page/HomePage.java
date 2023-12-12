package com.example.gerenciamentoderisco.page;

import com.example.gerenciamentoderisco.dto.GerenciamentoDeRisco;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;

import java.util.*;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;
    List<GerenciamentoDeRisco> gerenciamentoDeRiscos = new ArrayList<>();

    public HomePage(final PageParameters parameters) {
        super(parameters);

        iniciarDados();

        PropertyListView<GerenciamentoDeRisco> listaResultados = new PropertyListView<GerenciamentoDeRisco>("registros", gerenciamentoDeRiscos) {
            @Override
            protected void populateItem(ListItem<GerenciamentoDeRisco> item) {
                final var registro = item.getModelObject();

                item.add(
                        new Label("versao", registro.getVersao())
                                .setVisible(!registro.getVersaoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getVersaoRowspan()))
                );
                item.add(
                        new Label("dataDaAtualizacao", registro.getDataDaAtualizacao())
                                .setVisible(!registro.getVersaoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getVersaoRowspan()))
                );
                item.add(
                        new Label("usuarioResponsavelPorAtualizacao", registro.getUsuarioResponsavelPorAtualizacao())
                                .setVisible(!registro.getVersaoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getVersaoRowspan()))
                );
                item.add(
                        new Label("risco", registro.getRisco())
                                .setVisible(!registro.getRiscoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getRiscoRowspan()))
                );
                item.add(
                        new Label("danoASerSuportado", registro.getDanoASerSuportado())
                                .setVisible(!registro.getRiscoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getRiscoRowspan()))
                );
                item.add(
                        new Label("impactoParaOSenado", registro.getImpactoParaOSenado())
                                .setVisible(!registro.getRiscoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getRiscoRowspan()))
                );
                item.add(new Label("tipoDeAcao", registro.getTipoDeAcao()));
                item.add(new Label("acao", registro.getAcao()));
                item.add(new Label("unidadeResponsavel", registro.getUnidadeResponsavel()));
                item.add(
                        new Label("nupDoMapaDeRiscos", registro.getNupDoMapaDeRiscos())
                                .setVisible(!registro.getVersaoRowspan().equals(0))
                                .add(AttributeModifier.append("rowspan", registro.getVersaoRowspan()))
                );
            }
        };


        add(listaResultados);
    }


    void iniciarDados() {
        GerenciamentoDeRisco row1 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Médio",
                "Contingência",
                "Ação Preventiva 1",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row2 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Médio",
                "Preventiva",
                "Ação preventiva 2 (se houver)",
                "PRDSTI",
                "123456/2023"
        );

        GerenciamentoDeRisco row3 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Médio",
                "Preventiva",
                "Ação preventiva 3 (se houver)",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row4 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "2 - Descontinuidade do serviço",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Alto",
                "Contingência",
                "Descrição breve de uma ação preventiva para mitigar risco.",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row5 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "3 - Danificar equipamentos",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Baixo",
                "Preventiva",
                "Descrição breve de uma ação preventiva para mitigar risco.",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row6 = new GerenciamentoDeRisco(
                "1",
                "25/10/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "3 - Danificar equipamentos",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Baixo",
                "Contingência",
                "Descrição breve de uma ação de contingência para mitigar risco.",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row7 = new GerenciamentoDeRisco(
                "2",
                "16/11/2022 18:14",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Médio",
                "Preventiva",
                "Descrição breve de uma ação preventiva para mitigar risco.",
                "SINFRA",
                "Não juntado ao processo"
        );

        GerenciamentoDeRisco row8 = new GerenciamentoDeRisco(
                "3",
                "25/12/2022 18:46",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Médio",
                "Contingência",
                "Descrição breve de uma ação de contingência para mitigar risco.",
                "SINFRA",
                "123456/2023"
        );

        GerenciamentoDeRisco row9 = new GerenciamentoDeRisco(
                "4",
                "16/02/2023 18:14",
                "Nome completo do usuário (UNIDADE)",
                "1 - Não contratar",
                "Sem essa contratação a SINFRA ficará impossibilitada de atender as demandas para adequação de espaço físico dentro do CASF.",
                "Alto",
                "Preventiva",
                "Descrição breve de uma ação preventiva para mitigar risco.",
                "SINFRA",
                "123456/2023"
        );


        gerenciamentoDeRiscos.add(row1);
        gerenciamentoDeRiscos.add(row2);
        gerenciamentoDeRiscos.add(row3);
        gerenciamentoDeRiscos.add(row4);
        gerenciamentoDeRiscos.add(row5);
        gerenciamentoDeRiscos.add(row6);
        gerenciamentoDeRiscos.add(row7);
        gerenciamentoDeRiscos.add(row8);
        gerenciamentoDeRiscos.add(row9);

        agruparCampoVersao();
        agruparCampoRisco();

        gerenciamentoDeRiscos.forEach(System.out::println);
    }

    private void agruparCampoVersao() {
        // Variável para rastrear o item anterior
        GerenciamentoDeRisco itemAnterior = new GerenciamentoDeRisco();
        itemAnterior.setVersaoRowspan(0);
        itemAnterior.setVersao("");

        // Variável para mapear o rowspan
        var versaoRowspan = 0;

        Iterator<GerenciamentoDeRisco> iterator = gerenciamentoDeRiscos.iterator();
        while (iterator.hasNext()) {
            GerenciamentoDeRisco itemAtual = iterator.next();
            itemAtual.setVersaoRowspan(0);

            System.out.println("itemAtual : " + itemAtual.getVersao());
            System.out.println("itemAnterior : " + itemAnterior.getVersao());

            // Inserir rowspan do campo versão
            if (itemAnterior.getVersao().equals(itemAtual.getVersao())) {
                versaoRowspan++;
                itemAtual.setVersaoRowspan(0);
                itemAnterior.setVersaoRowspan(versaoRowspan);
            } else {
                versaoRowspan = 1;
                itemAtual.setVersaoRowspan(1);
                itemAnterior = itemAtual;
            }

            System.out.println("versaoRowspan : " + versaoRowspan);
            System.out.println("-------------------------------------");
        }
    }

    private void agruparCampoRisco() {
        // Variável para rastrear o item anterior
        GerenciamentoDeRisco itemAnterior = new GerenciamentoDeRisco();
        itemAnterior.setRiscoRowspan(0);
        itemAnterior.setRisco("");
        itemAnterior.setVersao("");

        // Variável para mapear o rowspan
        var riscoRowspan = 0;

        Iterator<GerenciamentoDeRisco> iterator = gerenciamentoDeRiscos.iterator();
        while (iterator.hasNext()) {
            GerenciamentoDeRisco itemAtual = iterator.next();
            itemAtual.setRiscoRowspan(0);

            System.out.println("itemAtual : " + itemAtual.getRisco());
            System.out.println("itemAnterior : " + itemAnterior.getRisco());

            // Inserir rowspan do campo versão
            if (
                    itemAnterior.getRisco().equals(itemAtual.getRisco())
                            && itemAnterior.getVersao().equals(itemAtual.getVersao())
            ) {
                riscoRowspan++;
                itemAtual.setRiscoRowspan(0);
                itemAnterior.setRiscoRowspan(riscoRowspan);
            } else {
                riscoRowspan = 1;
                itemAtual.setRiscoRowspan(1);
                itemAnterior = itemAtual;
            }

            System.out.println("riscoRowspan : " + riscoRowspan);
            System.out.println("-------------------------------------");
        }
    }
}
