package ir.seefa.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 7/29/22 T 19:14
 */
@Configuration
public class ChuckBasedJob {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    public ChuckBasedJob(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    public ItemReader<String> itemReader() {
        return new SimpleItemReader();
    }

    @Bean
    public Step chunkBasedStep() {
        return this.stepBuilderFactory.get("chunkBasedStep")
                .<String, String>chunk(10)
                .reader(itemReader())
                .writer(items -> {
                    System.out.printf("Received list of item size %d%n", items.size());
                    items.forEach(System.out::println);
                })
                .build();
    }

    @Bean
    public Job chuckOrientedJob() {
        return this.jobBuilderFactory.get("chunkOrientedJob")
                .start(chunkBasedStep())
                .build();

    }
}
