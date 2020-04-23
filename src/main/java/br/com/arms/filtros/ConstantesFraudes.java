package br.com.arms.filtros;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConstantesFraudes {
    public static final BigDecimal SALDO_ALTO_SUSPEITO = new BigDecimal("500000");
    public static final BigDecimal SALDO_BAIXO_SUSPEITO = new BigDecimal("100");
    public static final LocalDate UM_MES_ATRAS_SUSPEITO = LocalDate.now().minusMonths(1);
}