package com.example.radiochoice.tooltip.v2;

public enum TipoEstudoTecnicoPreliminar {

    ANEXAR(
            "Anexar o Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Arts. 2º e 3º)",
            "O ETP deve ser enviado ao Comitê de Contratações por meio do SENiC simultaneamente à solicitação de contratação e é, em regra, obrigatório nas contratações do Senado Federal."
    ),
    SOLICITAR_ELABORACAO(
            "Solicitar elaboração diferida do Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Art. 2º, § 1º)",
            "Em casos excepcionais, devido à complexidade da contratação, o Comitê de Contratações pode aceitar a solicitação de contratação com a indicação de que o ETP será elaborado de forma diferida."
    ),
    SOLICITAR_DISPENSA(
            "Solicitar a dispensa do Estudo Técnico Preliminar (ADG n. 14/2022, Anexo II, Art. 3º, § 1º)",
            "A elaboração do Estudo Técnico Preliminar pode ser dispensada, desde que justificada pelo Órgão Técnico, nas hipóteses em que a sua realização se mostrar incompatível sob o ponto de vista da eficiência e economicidade, quando restar evidenciada de forma inquestionável a melhor solução para o atendimento da necessidade da Administração ou se a melhor solução para o atendimento da necessidade for previamente identificada a partir de processos de padronização."
    ),
    REGISTRAR_DISPENSA(
            "Registrar que o Comitê autorizou a dispensa de ETP para o objeto (ADG n. 14/2022, Anexo II, Art. 3º, § 3º)",
            "A opção refere-se às dispensas de elaboração de ETP já deferidas pelo Comitê de Contratações e publicadas em atas de reuniões anteriores."
    ),
    HIPOTESE_DISPENSA(
            "Registrar a hipótese de dispensa do ETP já prevista no ADG nº 14/2022 (Anexo II, Art. 3º, § 4º)",
            "Pelo próprio ADG nº 14/2022, a elaboração do ETP é dispensável, mediante justificativa do Órgão Técnico, nas seguintes situações: </br>" +
                    "a) Dispensa de licitação com base nos incisos I, II, III, VII, VIII, IX, XI, XIII, XIV e XV, e nas alíneas \'a\', \'b\', \'c\', \'d\', \'j\' e \'k\' do inciso IV, todos do art. 75 da Lei nº 14.133/2021; e </br>" +
                    "b) Contratação remanescente conforme o §7º do art. 90 da Lei nº 14.133/2021."
    );

    private String titulo;
    private String tooltip;

    private TipoEstudoTecnicoPreliminar(String titulo) {
        this.titulo = titulo;
    }

    TipoEstudoTecnicoPreliminar(String titulo, String tooltip) {
        this.titulo = titulo;
        this.tooltip = tooltip;
    }

    @Override
    public String toString() {
        return titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTooltip() {
        return tooltip;
    }
}