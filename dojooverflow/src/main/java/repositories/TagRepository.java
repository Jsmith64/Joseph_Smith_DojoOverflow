package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

}
