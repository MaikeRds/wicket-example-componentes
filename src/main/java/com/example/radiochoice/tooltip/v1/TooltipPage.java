package com.example.radiochoice.tooltip.v1;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebPage;

import org.apache.wicket.markup.html.form.AbstractChoice;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Arrays;
import java.util.List;

public class TooltipPage extends WebPage {

    private FormComponent<TipoEstudoTecnicoPreliminar> tipoField;

    public TooltipPage(final PageParameters parameters) {
        super(parameters);
        addTipo();
    }

    private void addTipo() {

        List<TipoEstudoTecnicoPreliminar> tipos = Arrays.asList(TipoEstudoTecnicoPreliminar.values());


        tipoField = new RadioChoice<>("tipo", new PropertyModel(null, "tipo"), tipos);

       ((RadioChoice<?>) tipoField).setLabelPosition(AbstractChoice.LabelPosition.WRAP_AFTER);
       ((RadioChoice<?>) tipoField).add(
               AttributeModifier.append("class", "row")
       );

        tipoField.
//        tipoField.add(AttributeModifier.append("class", "text-primary"));

       // ((RadioChoice<?>) tipoField).setSuffix(TipoEstudoTecnicoPreliminar.TooltipsEtp.ANEXO_ETP.getTooltipText());

      // tipoField.add(new TipoBehavior());
        add(tipoField);
    }
}


