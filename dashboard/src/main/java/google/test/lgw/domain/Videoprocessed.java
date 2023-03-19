package google.test.lgw.domain;

import google.test.lgw.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Videoprocessed extends AbstractEvent {

    private Long id;
    private Long field;
    private String url;
}
