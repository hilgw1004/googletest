package google.test.lgw.domain;

import google.test.lgw.VideoProcessingApplication;
import google.test.lgw.domain.Videoprocessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long field;

    private String url;

    @PostPersist
    public void onPostPersist() {
        Videoprocessed videoprocessed = new Videoprocessed(this);
        videoprocessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }
}
