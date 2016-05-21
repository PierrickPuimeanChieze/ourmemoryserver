package org.ourmemory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Pierrick on 17-04-16.
 */
public interface GameRepository extends CrudRepository<Game, String> {

    List<Game> findByIdNotIn(String... ids);
}
