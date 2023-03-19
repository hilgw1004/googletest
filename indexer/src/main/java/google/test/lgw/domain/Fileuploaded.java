package google.test.lgw.domain;

import google.test.lgw.domain.*;
import google.test.lgw.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Fileuploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createTime;
    private String type;
    private String userid;
}
