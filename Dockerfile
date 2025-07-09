###############################################
# GIAI ĐOẠN 1: BUILD APP VỚI MAVEN WRAPPER
###############################################

# Sử dụng base image nhẹ có JDK để build (không cần full Ubuntu)
FROM openjdk:17-jdk AS build

# Đặt thư mục làm việc trong container là /app
WORKDIR /app

# Copy file pom.xml (file cấu hình Maven) vào container
COPY pom.xml .

# Copy thư mục .mvn (chứa wrapper config) và script mvnw vào
COPY .mvn .mvn
COPY mvnw .

# Copy mã nguồn vào container
COPY src ./src

# Cấp quyền thực thi cho file mvnw, rồi chạy lệnh build (bỏ qua test để nhanh hơn)
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests


# Sau bước này, file JAR sẽ được tạo ra trong thư mục /app/target/

###############################################
# GIAI ĐOẠN 2: CHẠY ỨNG DỤNG (RUNTIME)
###############################################

# Sử dụng image nhẹ chỉ có JRE (để chạy app, không cần build nữa)

FROM eclipse-temurin:17-jre

# Đặt thư mục làm việc cho container
WORKDIR /app

# Copy file JAR từ giai đoạn build vào container
# Nếu bạn chắc tên file JAR: COPY --from=build /app/target/ten-app.jar app.jar
# Ở đây dùng wildcard để linh hoạt hơn
COPY --from=build /app/target/*.jar app.jar

# Mở cổng 8080 (cổng mặc định Spring Boot)
EXPOSE 8080

# Lệnh khởi chạy ứng dụng khi container được run
ENTRYPOINT ["java", "-jar", "app.jar"]
