package org.ourmemory;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Pierrick on 17-04-16.
 */
public enum Sex {
    F("girl"), M("boy");

    private String clientRepresentation;

    Sex(String clientRepresentation) {
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
