package com.example.demostarterjoker;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties(prefix = "chuck")
@Data
public class ChuckNorris {
    private String quote;
}
