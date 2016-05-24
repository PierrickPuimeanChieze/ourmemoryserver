package org.ourmemory;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

/**
 * @author Pierrick on 17-04-16.
 */
public class Game {

    @Id
    private String id;

    @JsonProperty("firstname")
    private String firstName;
    private String name;
    @JsonProperty("birthdate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate birthDate;
    private int age;
    private String classe;
    private Sex sex;
    private GameVersion version;
    @JsonProperty("date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDate gameDate;
    private int preGameVisibilityDuration;
    private String gameLimit;
    private int triesBeforeGameLimit;
    private int pairsfoundBeforGameLimit;
    private int totalTries;
    private int totalDuration;
    private String seed;
    private String likeQuestion;
    private String funQuestion;
    private String replayQuestion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public GameVersion getVersion() {
        return version;
    }

    public void setVersion(GameVersion version) {
        this.version = version;
    }

    public LocalDate getGameDate() {
        return gameDate;
    }

    public void setGameDate(LocalDate gameDate) {
        this.gameDate = gameDate;
    }

    public int getPreGameVisibilityDuration() {
        return preGameVisibilityDuration;
    }

    public void setPreGameVisibilityDuration(int preGameVisibilityDuration) {
        this.preGameVisibilityDuration = preGameVisibilityDuration;
    }

    public String getGameLimit() {
        return gameLimit;
    }

    public void setGameLimit(String gameLimit) {
        this.gameLimit = gameLimit;
    }

    public int getTriesBeforeGameLimit() {
        return triesBeforeGameLimit;
    }

    public void setTriesBeforeGameLimit(int triesBeforeGameLimit) {
        this.triesBeforeGameLimit = triesBeforeGameLimit;
    }

    public int getPairsfoundBeforGameLimit() {
        return pairsfoundBeforGameLimit;
    }

    public void setPairsfoundBeforGameLimit(int pairsfoundBeforGameLimit) {
        this.pairsfoundBeforGameLimit = pairsfoundBeforGameLimit;
    }

    public int getTotalTries() {
        return totalTries;
    }

    public void setTotalTries(int totalTries) {
        this.totalTries = totalTries;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getLikeQuestion() {
        return likeQuestion;
    }

    public void setLikeQuestion(String likeQuestion) {
        this.likeQuestion = likeQuestion;
    }

    public String getFunQuestion() {
        return funQuestion;
    }

    public void setFunQuestion(String funQuestion) {
        this.funQuestion = funQuestion;
    }

    public String getReplayQuestion() {
        return replayQuestion;
    }

    public void setReplayQuestion(String replayQuestion) {
        this.replayQuestion = replayQuestion;
    }
}
