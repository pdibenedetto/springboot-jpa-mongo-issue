package io.spring.mongo.jpa.issue.mongo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "events")
public class Event {

    @Indexed
    private Long sequenceId;

    private String eventName;

}
