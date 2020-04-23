package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class ICCC extends Imposto{

    public ICCC(){}

    public ICCC(Imposto outroImposto){
        super(outroImposto);
    }

    //i = 5%*M      se M < 1000
    //i = 7%*M      se 1000 < M <= 3000
    //i = 8%*M + 30 se M > 3000
    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal valor = orcamento.getValor();

        if (valor.compareTo(new BigDecimal("1000")) < 0 ) 
            return valor.multiply(new BigDecimal("0.05")).add(addProximoImposto(orcamento));

        if (valor.compareTo(new BigDecimal("3000")) <= 0 ) 
            return valor.multiply(new BigDecimal("0.07")).add(addProximoImposto(orcamento));
            
        if (valor.compareTo(new BigDecimal("3000")) > 0 )
            return valor.multiply(new BigDecimal("0.08")).add(new BigDecimal("30")).add(addProximoImposto(orcamento));
        
        return null;
    }
}