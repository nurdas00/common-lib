package nur.kg.domain.request;

import nur.kg.domain.enums.Exchange;
import nur.kg.domain.enums.OrderType;
import nur.kg.domain.enums.Side;
import nur.kg.domain.enums.Symbol;

import java.math.BigDecimal;

public record OrderRequest(String id, Symbol symbol, Side side, OrderType type,
                           BigDecimal qty, BigDecimal limitPrice, String reason, Exchange exchange) {}