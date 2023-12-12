package com.example.gerenciamentoderisco.dto;

import java.util.Objects;

public class GerenciamentoDeRisco {

    private String versao;
    private Integer versaoRowspan;
    private String dataDaAtualizacao;
    private String usuarioResponsavelPorAtualizacao;
    private String risco;
    private Integer riscoRowspan;
    private String danoASerSuportado;
    private String impactoParaOSenado;
    private String tipoDeAcao;
    private String acao;
    private String unidadeResponsavel;
    private String nupDoMapaDeRiscos;

    public GerenciamentoDeRisco(String versao, String dataDaAtualizacao, String usuarioResponsavelPorAtualizacao, String risco, String danoASerSuportado, String impactoParaOSenado, String tipoDeAcao, String acao, String unidadeResponsavel, String nupDoMapaDeRiscos) {
        this.versao = versao;
        this.dataDaAtualizacao = dataDaAtualizacao;
        this.usuarioResponsavelPorAtualizacao = usuarioResponsavelPorAtualizacao;
        this.risco = risco;
        this.danoASerSuportado = danoASerSuportado;
        this.impactoParaOSenado = impactoParaOSenado;
        this.tipoDeAcao = tipoDeAcao;
        this.acao = acao;
        this.unidadeResponsavel = unidadeResponsavel;
        this.nupDoMapaDeRiscos = nupDoMapaDeRiscos;
    }

    public GerenciamentoDeRisco() {
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getDataDaAtualizacao() {
        return dataDaAtualizacao;
    }

    public void setDataDaAtualizacao(String dataDaAtualizacao) {
        this.dataDaAtualizacao = dataDaAtualizacao;
    }

    public String getUsuarioResponsavelPorAtualizacao() {
        return usuarioResponsavelPorAtualizacao;
    }

    public void setUsuarioResponsavelPorAtualizacao(String usuarioResponsavelPorAtualizacao) {
        this.usuarioResponsavelPorAtualizacao = usuarioResponsavelPorAtualizacao;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public String getDanoASerSuportado() {
        return danoASerSuportado;
    }

    public void setDanoASerSuportado(String danoASerSuportado) {
        this.danoASerSuportado = danoASerSuportado;
    }

    public String getImpactoParaOSenado() {
        return impactoParaOSenado;
    }

    public void setImpactoParaOSenado(String impactoParaOSenado) {
        this.impactoParaOSenado = impactoParaOSenado;
    }

    public String getTipoDeAcao() {
        return tipoDeAcao;
    }

    public void setTipoDeAcao(String tipoDeAcao) {
        this.tipoDeAcao = tipoDeAcao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getUnidadeResponsavel() {
        return unidadeResponsavel;
    }

    public void setUnidadeResponsavel(String unidadeResponsavel) {
        this.unidadeResponsavel = unidadeResponsavel;
    }

    public String getNupDoMapaDeRiscos() {
        return nupDoMapaDeRiscos;
    }

    public void setNupDoMapaDeRiscos(String nupDoMapaDeRiscos) {
        this.nupDoMapaDeRiscos = nupDoMapaDeRiscos;
    }

    public Integer getVersaoRowspan() {
         return versaoRowspan;
    }

    public void setVersaoRowspan(Integer versaoRowspan) {
        this.versaoRowspan = versaoRowspan;
    }

    public Integer getRiscoRowspan() {
        return riscoRowspan;
    }

    public void setRiscoRowspan(Integer riscoRowspan) {
        this.riscoRowspan = riscoRowspan;
    }

    @Override
    public String toString() {
        return "GerenciamentoDeRisco{" +
                "versao='" + versao + '\'' +
                ", versaoRowspan=" + versaoRowspan +
                ", risco='" + risco + '\'' +
                ", riscoRowspan=" + riscoRowspan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GerenciamentoDeRisco that = (GerenciamentoDeRisco) o;
        return Objects.equals(versao, that.versao) && Objects.equals(versaoRowspan, that.versaoRowspan) && Objects.equals(dataDaAtualizacao, that.dataDaAtualizacao) && Objects.equals(usuarioResponsavelPorAtualizacao, that.usuarioResponsavelPorAtualizacao) && Objects.equals(risco, that.risco) && Objects.equals(danoASerSuportado, that.danoASerSuportado) && Objects.equals(impactoParaOSenado, that.impactoParaOSenado) && Objects.equals(tipoDeAcao, that.tipoDeAcao) && Objects.equals(acao, that.acao) && Objects.equals(unidadeResponsavel, that.unidadeResponsavel) && Objects.equals(nupDoMapaDeRiscos, that.nupDoMapaDeRiscos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versao, versaoRowspan, dataDaAtualizacao, usuarioResponsavelPorAtualizacao, risco, danoASerSuportado, impactoParaOSenado, tipoDeAcao, acao, unidadeResponsavel, nupDoMapaDeRiscos);
    }
}
