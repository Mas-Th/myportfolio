package com.kham_pha_web.Mas_Th;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNGTest {
    WebDriver driver;

    @Test(priority=1)
    public void test1() {
        // 1. Cấu hình và khởi động ChromeDriver
        WebDriverManager.chromedriver().setup(); // Tự động tải ChromeDriver phù hợp với OS
        driver = new ChromeDriver(); // Khởi tạo trình duyệt Chrome

        // 2. Cấu hình trình duyệt
        driver.manage().window().maximize(); // Phóng to cửa sổ trình duyệt
         // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Chờ tìm element tối đa 30s
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Chờ load page tối đa 30s

        // 3. Điều hướng đến trang Google
        driver.get("https://www.google.com");

        // 4. Kiểm tra tiêu đề trang (Test case 1)
        String title = driver.getTitle();
        System.out.println("Tiêu đề trang: " + title);
        assert title.contains("Google") : "❌ Trang không có tiêu đề 'Google'";

        // 5. Tìm ô tìm kiếm và nhập từ khóa (Test case 2)
        WebElement searchBox = driver.findElement(By.name("q")); // Tên ô tìm kiếm là "q"
        searchBox.sendKeys("TestNG with Selenium");

        // 6. Submit từ khóa tìm kiếm (Test case 3)
        searchBox.submit(); // Giống như nhấn Enter

        // 10. Đóng trình duyệt
        driver.quit();
    }
    @Test(priority=2)
    public void test2() {
        // 1. Cấu hình và khởi động ChromeDriver
        WebDriverManager.chromedriver().setup(); // Tự động tải ChromeDriver phù hợp với OS
        driver = new ChromeDriver(); // Khởi tạo trình duyệt Chrome

        // 2. Cấu hình trình duyệt
        driver.manage().window().maximize(); // Phóng to cửa sổ trình duyệt
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Chờ tìm element tối đa 30s
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Chờ load page tối đa 30s

        // 3. Điều hướng đến trang Google
        driver.get("https://www.google.com");

        // 4. Kiểm tra tiêu đề trang (Test case 1)
        String title = driver.getTitle();
        System.out.println("Tiêu đề trang: " + title);
        assert title.contains("Google") : "❌ Trang không có tiêu đề 'Google'";

        // 5. Tìm ô tìm kiếm và nhập từ khóa (Test case 2)
        WebElement searchBox = driver.findElement(By.name("q")); // Tên ô tìm kiếm là "q"
        searchBox.sendKeys("TestNG with Selenium");

        // 6. Submit từ khóa tìm kiếm (Test case 3)
        searchBox.submit(); // Giống như nhấn Enter

        // 7. Đợi vài giây để kết quả hiển thị (thô sơ, không dùng wait chính xác)
        try {
            Thread.sleep(3000); // Chờ 3s (chỉ để demo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 8. Kiểm tra kết quả tìm kiếm đầu tiên có tồn tại không (Test case 4)
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        assert firstResult.isDisplayed() : "❌ Không tìm thấy kết quả tìm kiếm";

        // 9. In kết quả đầu tiên ra log
        System.out.println("✅ Kết quả đầu tiên: " + firstResult.getText());

        // 10. Đóng trình duyệt
        driver.quit();
    }
}
