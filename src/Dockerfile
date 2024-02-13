FROM openjdk:latest

WORKDIR /usr/src/programm

COPY . .

RUN javac -sourcepath . -d out ./Program/App.java

WORKDIR /usr/src/programm/out

ENTRYPOINT ["java", "program.App"]