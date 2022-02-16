package br.com.aws.dynamodb.executavel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.aws.dynamodb.main")
public class SpringBootAwsDynamdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsDynamdbApplication.class, args);
    }

}
