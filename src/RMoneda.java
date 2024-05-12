import java.util.List;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RMoneda(
        @JsonAlias("base_code") String moneda_base,
        @JsonAlias("target_code") String moneda_convertir,
        @JsonAlias("conversion_result") double resultado
) {
}
