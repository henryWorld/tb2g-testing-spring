package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

//@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = {HearingInterpreterTest.TestConfig.class})
class HearingInterpreterTest {
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class TestConfig{
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    //@Disabled
    @Test
    void whatIHeardLaurel() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("Laurel", word);
    }

   @Disabled
    @Test
    void whatIHeardYanny() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("Yanny", word);
    }
}