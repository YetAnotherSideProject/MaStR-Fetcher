package dev.yasp.mastrfetcher;

import org.junit.jupiter.api.Test;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CLIParserTest {

    private final CLIParser cliParser;

    public CLIParserTest() {
        this.cliParser = new CLIParser();
    }

    @Test
    void testEmptyArgs() {
        assertThrows(IllegalArgumentException.class,
                () -> this.cliParser.parseCLIArgs(new DefaultApplicationArguments()));
    }

    @Test
    void testHelpArg() {
        // Aufruf mit --help
        assertEquals(Optional.empty(), this.cliParser.parseCLIArgs(new DefaultApplicationArguments("--help")));
        // Aufruf mit -h
        assertEquals(Optional.empty(), this.cliParser.parseCLIArgs(new DefaultApplicationArguments("--h")));
    }

    @Test
    void testFirstArgumentNonNumeric() {
        assertThrows(IllegalArgumentException.class,
                () -> this.cliParser.parseCLIArgs(new DefaultApplicationArguments("EinsZweiDrei")));
    }

    @Test
    void testFirstArgumentNot8Numbers() {
        assertThrows(IllegalArgumentException.class,
                () -> this.cliParser.parseCLIArgs(new DefaultApplicationArguments("12345")));
        assertThrows(IllegalArgumentException.class,
                () -> this.cliParser.parseCLIArgs(new DefaultApplicationArguments("123456789")));
    }

    @Test
    void testCorrectArgument() {
        assertEquals("12345678",
                this.cliParser.parseCLIArgs(new DefaultApplicationArguments("12345678")).orElseThrow());
        assertEquals("01234567",
                this.cliParser.parseCLIArgs(new DefaultApplicationArguments("01234567")).orElseThrow());
    }
}