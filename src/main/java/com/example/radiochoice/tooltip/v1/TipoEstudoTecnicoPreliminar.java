package com.example.radiochoice.tooltip.v1;

public enum TipoEstudoTecnicoPreliminar {

    ANEXAR("Anexar o Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Arts. 2º e 3º)"),
    SOLICITAR_ELABORACAO(
            "Solicitar elaboração diferida do Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Art. 2º, § 1º)"),
    SOLICITAR_DISPENSA("Solicitar a dispensa do Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Art. 3º, § 1º)"),
    REGISTRAR_DISPENSA(
            "Registrar que o Comitê autorizou a dispensa de ETP para o objeto (ADG n. 14/2022, Anexo II, Art. 3º, § 3º)"),
    HIPOTESE_DISPENSA("Registrar a hipótese de dispensa do ETP já prevista no ADG nº 14/2022 (Anexo II, Art. 3º, § 4º)");

    private String string;

    private TipoEstudoTecnicoPreliminar(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

    public enum TooltipsEtp {
        ANEXO_ETP("<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"O ETP deve ser enviado ao Comitê de Contratações por meio do SENiC simultaneamente à solicitação de contratação e é, em regra, obrigatório nas contratações do Senado Federal.\"><i class=\"fa fa-info-circle\"> </i></a>"),
        ELABORAR_ETP("<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Em casos excepcionais, devido à complexidade da contratação, o Comitê de Contratações pode aceitar a solicitação de contratação com a indicação de que o ETP será elaborado de forma diferida.\"><i class=\"fa fa-info-circle\"> </i></a>"),
        SOLICITAR_DISPENSA_ETP("<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"A elaboração do Estudo Técnico Preliminar pode ser dispensada, desde que justificada pelo Órgão Técnico, nas hipóteses em que a sua realização se mostrar incompatível sob o ponto de vista da eficiência e economicidade, quando restar evidenciada de forma inquestionável a melhor solução para o atendimento da necessidade da Administração ou se a melhor solução para o atendimento da necessidade for previamente identificada a partir de processos de padronização.\"><i class=\"fa fa-info-circle\"> </i></a>"),
        REGISTRAR_DISPENSA_ETP("<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"A opção refere-se às dispensas de elaboração de ETP já deferidas pelo Comitê de Contratações e publicadas em atas de reuniões anteriores.\"><i class=\"fa fa-info-circle\"> </i></a>"),
        HIPOTESE_DISPENSA_ETP("<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Pelo próprio ADG nº 14/2022, a elaboração do ETP é dispensável, mediante justificativa do Órgão Técnico, nas seguintes situações:\n" +
                "a) Dispensa de licitação com base nos incisos I, II, III, VII, VIII, IX, XI, XIII, XIV e XV, e nas alíneas \'a\', \'b\', \'c\', \'d\', \'j\' e \'k\' do inciso IV, todos do art. 75 da Lei nº 14.133/2021; e \n" +
                "b) Contratação remanescente conforme o §7º do art. 90 da Lei nº 14.133/2021.\n\"><i class=\"fa fa-info-circle\"> </i></a>");

        private final String tooltipText;

        TooltipsEtp(String tooltipText) {
            this.tooltipText = tooltipText;
        }

        public String getTooltipText() {
            return tooltipText;
        }
    }

}