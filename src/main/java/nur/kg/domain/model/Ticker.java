package nur.kg.domain.model;

import nur.kg.domain.enums.Symbol;

import java.math.BigDecimal;
import java.time.Instant;

public record Ticker(Symbol symbol, BigDecimal last, Instant ts) {

}
