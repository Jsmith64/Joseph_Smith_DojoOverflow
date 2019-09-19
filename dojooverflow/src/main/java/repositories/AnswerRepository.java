package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{

}