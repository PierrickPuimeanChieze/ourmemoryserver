package org.ourmemory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Pierrick on 21-05-16.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GameNotFoundException extends RuntimeException{
    private final String gameId;

    public GameNotFoundException(String gameId) {
        super();
        this.gameId = gameId;
    }
}
