package configuration;

import systemProfile.DevProfile;
import systemProfile.SystemProfile;
import systemProfile.ProductionProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Configuration
public class JavaConfiguration {
    @Bean(name = "devProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {

        return new DevProfile();
    }

    @Bean(name = "prodProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}