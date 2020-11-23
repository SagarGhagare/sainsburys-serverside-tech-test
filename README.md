## Sainsbury’s groceries website scrapping application

### Task specification

Newest version of the task specification can be found [here](https://jsainsburyplc.github.io/serverside-test/).

## Building

### Running tests

To run all unit tests:

```bash
mvn clean test
```

### Packaging

To build an executable `.jar`:

```bash
mvn clean package
```

### Running

To run the `.jar`:

```bash
java -jar target/sainsburys-serverside-test-1.0-SNAPSHOT-jar-with-dependencies.jar
```