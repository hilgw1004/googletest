package google.test.lgw.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import google.test.lgw.config.kafka.KafkaProcessor;
import google.test.lgw.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Videoprocessed'"
    )
    public void wheneverVideoprocessed_NotifyToUser(
        @Payload Videoprocessed videoprocessed
    ) {
        Videoprocessed event = videoprocessed;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + videoprocessed + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Fileuploaded'"
    )
    public void wheneverFileuploaded_NotifyToUser(
        @Payload Fileuploaded fileuploaded
    ) {
        Fileuploaded event = fileuploaded;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + fileuploaded + "\n\n"
        );
        // Sample Logic //

    }
}
