package test;

import main.Task_9;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Task_9 {

    private Task_9 task9;
    @BeforeEach
    public void setup(){
        task9 = new Task_9();
    }
    @ParameterizedTest
    @VariableSource("arguments_true")
    public void should_return_true(String firstWord, String secondWord) {
        assertTrue(task9.checkIfSameLetters(firstWord, secondWord));
    }

    @ParameterizedTest
    @VariableSource("arguments_false")
    public void should_return_false(String firstWord, String secondWord) {
        assertFalse(task9.checkIfSameLetters(firstWord, secondWord));
    }

    static Stream<Arguments> arguments_true = Stream.of(
                Arguments.of("abba", "baba"),
                Arguments.of("kebab", "babek"),
                Arguments.of("keson", "nosek"),
                Arguments.of("arak", "kara"),
                Arguments.of("mara", "rama"),
                Arguments.of("bark", "krab"),
                Arguments.of("bard", "drab"),
                Arguments.of("mors", "srom"),
                Arguments.of("", "")
        );

     static Stream<Arguments> arguments_false = Stream.of(
                Arguments.of("YES", "yes"),
                Arguments.of(null, "YYl"),
                Arguments.of("a", null),
                Arguments.of("B", "b"),
                Arguments.of("", "2"),
                Arguments.of("1", "a"),
                Arguments.of("Oleksandra", "Aleksandra"),
                Arguments.of("12", "a12"),
                Arguments.of("A", "a"),
                Arguments.of("Eryk", "eRYK")
        );
    }
