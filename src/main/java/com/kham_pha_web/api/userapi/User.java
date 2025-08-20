package com.kham_pha_web.api.userapi;

public record User(
        Long id,
        String username,
        String email,
        String registrationDate,
        int totalGamesPlayed,
        int level
) {
    // Không cần viết thêm bất kỳ code nào ở đây.
    // Java đã tự động tạo constructor, getters và các phương thức khác.
}