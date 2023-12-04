# Maven과 JDK를 포함하는 베이스 이미지 사용
FROM maven:3.8.1-openjdk-17 as build

# 작업 디렉토리 설정
WORKDIR /app

# pom.xml 및 소스 코드 복사
COPY pom.xml .
COPY src ./src

# Maven을 사용하여 애플리케이션 빌드
RUN mvn package -DskipTests

# 최종 이미지 준비
FROM openjdk:17-oracle
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


