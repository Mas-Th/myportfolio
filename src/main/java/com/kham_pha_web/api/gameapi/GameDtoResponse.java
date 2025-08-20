package com.kham_pha_web.api.gameapi;

import lombok.Getter;
import lombok.Setter;

public record GameDtoResponse(
        String id,
        String name,
        String genre,
        int releaseYear,
        double price,
        String developer
) {}
