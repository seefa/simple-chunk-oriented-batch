package ir.seefa;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 7/29/22 T 19:09
 */
@SpringBootApplication
@EnableBatchProcessing
public class SimpleChuckBasedBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleChuckBasedBatchApplication.class, args);
    }
}
