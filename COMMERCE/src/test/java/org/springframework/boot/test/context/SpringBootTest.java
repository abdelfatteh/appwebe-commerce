package org.springframework.boot.test.context;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SpringBootTest {

}
