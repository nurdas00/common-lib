package nur.kg.domain.request;

import lombok.Builder;
import nur.kg.domain.enums.Exchange;
import nur.kg.domain.enums.OrderType;
import nur.kg.domain.enums.Side;
import nur.kg.domain.enums.Symbol;

import java.math.BigDecimal;

@Builder
public record OrderRequest(String id, Symbol symbol, Side side, OrderType type,
                           BigDecimal qty, BigDecimal limitPrice, String reason,
                           Exchange exchange, String botId, BigDecimal tp, BigDecimal sl) {}