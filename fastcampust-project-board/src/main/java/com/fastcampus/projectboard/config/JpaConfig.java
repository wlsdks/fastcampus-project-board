package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

// jpa auditing설정
@Configuration
@EnableJpaAuditing
public class JpaConfig {

    // jpa auditing을 할때마다 사람 이름으로 wlsdks 이 들어간다. -> 인증기능을 하면 이름을 뽑아내야해서 추가한다.
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("wlsdks"); //TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정하자.
    }
}
