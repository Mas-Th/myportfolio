package com.kham_pha_web.api.newsapi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/news")

public class NewsApiController {

    @GetMapping(produces = "application/json")
    public List<NewsDtoResponse> getNews() throws InterruptedException {
        List<NewsDtoResponse> newsList = new ArrayList<>();

        TimeUnit.MILLISECONDS.sleep(100);

        // Thêm 10 phần tử tin tức vào danh sách
        newsList.add(new NewsDtoResponse("1", "Khám phá khoa học vũ trụ", "Nguyễn Văn A", "Khoa học", "url_hinh_anh_1", "Nội dung tóm tắt về khám phá mới.", "2024-05-15", 1500));
        newsList.add(new NewsDtoResponse("2", "Phân tích thị trường công nghệ", "Trần Thị B", "Công nghệ", "url_hinh_anh_2", "Các xu hướng công nghệ nổi bật năm nay.", "2024-05-14", 2100));
        newsList.add(new NewsDtoResponse("3", "Bí quyết du lịch tiết kiệm", "Lê Văn C", "Du lịch", "url_hinh_anh_3", "Những mẹo hay để có chuyến đi đáng nhớ.", "2024-05-13", 950));
        newsList.add(new NewsDtoResponse("4", "Phát triển bền vững trong nông nghiệp", "Phạm Thị D", "Xã hội", "url_hinh_anh_4", "Giải pháp mới cho nông dân.", "2024-05-12", 1800));
        newsList.add(new NewsDtoResponse("5", "Bóng đá: Kết quả trận đấu", "Vũ Đình E", "Thể thao", "url_hinh_anh_5", "Diễn biến chính và tỷ số.", "2024-05-11", 5000));
        newsList.add(new NewsDtoResponse("6", "Đánh giá phim mới: Kẻ săn bóng tối", "Đinh Hữu G", "Giải trí", "url_hinh_anh_6", "Phân tích chi tiết về cốt truyện.", "2024-05-10", 3500));
        newsList.add(new NewsDtoResponse("7", "Mẹo nấu ăn nhanh cho người bận rộn", "Hoàng Kim H", "Đời sống", "url_hinh_anh_7", "Các công thức đơn giản.", "2024-05-09", 1200));
        newsList.add(new NewsDtoResponse("8", "Tài chính cá nhân: 5 sai lầm cần tránh", "Bùi Duy K", "Tài chính", "url_hinh_anh_8", "Lời khuyên từ chuyên gia.", "2024-05-08", 2700));
        newsList.add(new NewsDtoResponse("9", "Giáo dục 4.0: Thách thức và cơ hội", "Ngô Thị L", "Giáo dục", "url_hinh_anh_9", "Vai trò của công nghệ trong giáo dục.", "2024-05-07", 1950));
        newsList.add(new NewsDtoResponse("10", "Khám phá di sản văn hóa thế giới", "Phan Tấn M", "Văn hóa", "url_hinh_anh_10", "Hành trình tới những vùng đất cổ xưa.", "2024-05-06", 800));

        return newsList;
    }
}
