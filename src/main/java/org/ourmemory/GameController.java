package org.ourmemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Pierrick on 21-05-16.
 */
@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Game> getGames(@RequestParam(value = "excludedIds", required = false) String excludedIds) {
        if (StringUtils.isEmpty(excludedIds)) {
            return gameRepository.findAll();
        }
        else {
            return gameRepository.findByIdNotIn(excludedIds.split(","));
        }
    }
    @RequestMapping(method = RequestMethod.POST)
    public Game postGame(@RequestBody Game game) {
        if (!StringUtils.isEmpty(game.getId())) {
            throw new IllegalArgumentException("a new game should not have an id");
        }
        gameRepository.save(game);
        return game;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{gameId}")
    public Game putGame(@RequestBody Game game, @PathVariable("gameId")  String gameId) {
        if (!gameRepository.exists(gameId)) {
            throw new GameNotFoundException(gameId);
        }
        gameRepository.save(game);
        return game;
    }
}
