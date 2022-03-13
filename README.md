## Main Features
Each module can test individually. The trick is using `microprofile-config.properties`, 
just because the officially recommend configuration file (`applicaton-module.properties`) not worked in multiple modules, 
the file is in the `resources/META_INF`. Now we can just write code like spring-boot multiple modules.

## Notes
This demo use mybatis to persist data. The `Generator.java` file use for generate code.
If you use gradle, in other module (this demo is `persistenc` module) you must add an empty `beans.xml` file 
in the `resources/META_INF` directory, it used by `app` module to find the injected beans.

## Run by maven
```shell
./mvnw clean package -Dmaven.test.skip=true
./mvnw quarkus:dev -f app
```

## Run by gradle
```shell
./gradlew :app:quarkusDev
```

