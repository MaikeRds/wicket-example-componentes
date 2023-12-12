package com.example.radiochoice.tooltip.v2;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormChoiceComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioGroup;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Arrays;
import java.util.List;

public class TooltipPage extends WebPage {

    RadioGroup<TipoEstudoTecnicoPreliminar> group;
    Label selecionado;
    Model<String> selecionadoTexto;
    public TooltipPage(final PageParameters parameters) {
        super(parameters);
        addTipo();
    }

    private void addTipo() {
        // Implementação do RadioGroup
        List<TipoEstudoTecnicoPreliminar> tipoEstudoTecnicoPreliminars = Arrays.asList(TipoEstudoTecnicoPreliminar.values());
        group = new RadioGroup<>("group", new Model<>());

        ListView<TipoEstudoTecnicoPreliminar> opcoes = new ListView<>("opcoes", tipoEstudoTecnicoPreliminars) {
            protected void populateItem(ListItem item) {
                TipoEstudoTecnicoPreliminar op = (TipoEstudoTecnicoPreliminar) item.getModelObject();
                item.add(new Radio("radio", item.getModel()));
                item.add(new Label("titulo", op.getTitulo()));
                Label tooltip = new Label("tooltip", "<i class=\"fa fa-info-circle\"></i>");
                tooltip.setEscapeModelStrings(false);
                tooltip.add(AttributeModifier.append("title", op.getTooltip()));
                item.add(tooltip);
            }
        };

        group.add(opcoes);
        group.add(new AjaxFormChoiceComponentUpdatingBehavior() {
            private static final long serialVersionUID = 1L;
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                TipoEstudoTecnicoPreliminar op = (TipoEstudoTecnicoPreliminar) getComponent().getDefaultModelObject();
                System.out.println("Selected: " + op.getTitulo());
                selecionadoTexto.setObject(op.getTitulo());
                target.add(selecionado);
            }
        });
        add(group);

        // Texto selecionado
        selecionadoTexto = Model.of("Selecionado....");
        selecionado = new Label("selecionado", selecionadoTexto);
        selecionado.setOutputMarkupId(true);
        add(selecionado);

    }
}


