package name.legkodymov.spring.artemis.simpleproducer.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SimpleMessage implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String source;
    private String content;
}
