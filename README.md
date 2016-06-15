#lolPix API

### Prerequisites:
- MongoDB
- Maven
- Java 8

### Running

```
$ cd dir/to/proj

$ mkdir -p data/db log

$ mongod --config mongodb.conf
about to fork child process, waiting until server is ready for connections.
forked process: 12148
child process started successfully, parent exiting

$ mvn clean install -DskipTests=true

   [...]

$ DEVMODE=true java -jar target/lolpix-api-0.0.1-SNAPSHOT.jar
```

### Notes

If you don't add `DEVMODE=true`, the application will launch listeners on ports 80 & 443 (which requires root and a valid keystore) instead on port 8080.