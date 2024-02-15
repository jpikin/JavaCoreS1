FROM openjdk:latest

WORKDIR /usr/src/program/

COPY ./src .

RUN javac -sourcepath . -d out ./Program/App.java

WORKDIR /usr/src/program/out

ENTRYPOINT ["java", "Program.App"]