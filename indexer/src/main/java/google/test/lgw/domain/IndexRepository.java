package google.test.lgw.domain;

import google.test.lgw.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "indices", path = "indices")
public interface IndexRepository
    extends PagingAndSortingRepository<Index, Long> {}
