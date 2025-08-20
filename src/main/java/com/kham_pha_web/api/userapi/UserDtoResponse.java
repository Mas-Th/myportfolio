package com.kham_pha_web.api.userapi;



public record UserDtoResponse(
        Long id,
        String username,
        String email,
        String registrationDate,
        int totalGamesPlayed,
        int level) {
}