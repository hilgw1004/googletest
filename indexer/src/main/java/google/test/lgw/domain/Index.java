package google.test.lgw.domain;

import google.test.lgw.IndexerApplication;
import google.test.lgw.domain.Indexded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long field;

    private String url;

    @PostPersist
    public void onPostPersist() {
        Indexded indexded = new Indexded(this);
        indexded.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void index(Fileuploaded fileuploaded) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileuploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
}
