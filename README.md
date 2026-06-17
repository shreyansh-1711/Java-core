# Java Core

A small Java workspace for writing and running core Java examples with `javac`.

## Requirements

- Java JDK 22 is available on this machine.

## Compile

```powershell
javac -d out src/main/java/com/example/multithreading/thread.java
```

## Run

```powershell
java -cp out com.example.multithreading.thread
```

## Project Layout

```text
src/main/java/   Java source files
out/             Compiled classes, ignored by Git
```
