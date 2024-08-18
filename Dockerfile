# Используем базовый образ Java 17
FROM openjdk:17

# Устанавливаем рабочую директорию
WORKDIR /adoption

# Копируем файлы проекта в контейнер
COPY target/*.jar microserviceAdoption-0.0.1-SNAPSHOT.jar

# Устанавливаем ENTRYPOINT
ENTRYPOINT ["java", "-jar", "microserviceAdoption-0.0.1-SNAPSHOT.jar"]