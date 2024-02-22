## Virtual threads

```bash
git clone https://github.com/festuskerich/Java-virtual-Threads.git
cd virtual-threads/restapi
mvn spring-boot:run

cd ../applicarion
mvn spring-boot:run

```

### Run

```bash
ab -n 100 -c 100  http://localhost:8065/virtual-thread
```

