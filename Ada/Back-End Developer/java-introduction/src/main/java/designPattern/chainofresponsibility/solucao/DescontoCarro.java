package designPattern.chainofresponsibility.solucao;

import designPattern.chainofresponsibility.Carro;

import java.math.BigDecimal;

public abstract class DescontoCarro {
    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
