package google.test.lgw.domain;

import google.test.lgw.DriveApplication;
import google.test.lgw.domain.Fileuploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long size;

    private Date createTime;

    private String type;

    private String userid;

    @PostPersist
    public void onPostPersist() {
        Fileuploaded fileuploaded = new Fileuploaded(this);
        fileuploaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
