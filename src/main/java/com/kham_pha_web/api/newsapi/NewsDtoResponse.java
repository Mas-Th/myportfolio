package com.kham_pha_web.api.newsapi;


public record NewsDtoResponse(
        String id,
        String title,
        String author,
        String category,
        String imageUrl,
        String summary,
        String publicationDate,
        int views
) {}
