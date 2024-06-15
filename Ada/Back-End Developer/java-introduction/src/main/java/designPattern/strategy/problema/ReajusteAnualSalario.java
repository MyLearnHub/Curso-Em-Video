package designPattern.strategy.problema;

import designPattern.strategy.Funcionario;
import designPattern.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {
    public void calculaRejusteAnual(Funcionario funcionario) {
        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
