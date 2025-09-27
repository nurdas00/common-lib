package nur.kg.domain.dto;

import nur.kg.domain.enums.Exchange;
import nur.kg.domain.enums.Symbol;

import java.math.BigDecimal;
import java.time.Instant;

public record TickerDto(
        Exchange exchange,
        Symbol symbol,
        BigDecimal last,
        Instant ts
) {}