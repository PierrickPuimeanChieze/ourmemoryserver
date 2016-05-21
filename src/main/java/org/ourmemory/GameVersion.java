package org.ourmemory;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by Pierrick on 17-04-16.
 */
public enum GameVersion {

    STANDARD("sad"),
    HUMOR("humors");

    private String clientRepresentation;

    GameVersion(String clientRepresentation) {
        this.clientRepresentation = clientRepresentation;
    }

    @JsonValue
    public String getClientRepresentation() {
        return clientRepresentation;
    }

    public void setClientRepresentation(String clientRepresentation) {
        this.clientRepresentation = clientRepresentation;
    }
}
