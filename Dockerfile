FROM openjdk:latest

WORKDIR /usr/src/program/

COPY . .

RUN javac -sourcepath ./src -d out src/Program/App.java

WORKDIR /usr/src/program/out

ENTRYPOINT ["java", "Program.App"]