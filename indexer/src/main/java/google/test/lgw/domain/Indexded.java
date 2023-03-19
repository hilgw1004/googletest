package google.test.lgw.domain;

import google.test.lgw.domain.*;
import google.test.lgw.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexded extends AbstractEvent {

    private Long id;
    private Long field;
    private String url;

    public Indexded(Index aggregate) {
        super(aggregate);
    }

    public Indexded() {
        super();
    }
}
