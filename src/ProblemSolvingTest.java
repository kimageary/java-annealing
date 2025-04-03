import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_OneElement() {
    // arrange
    Set<String> input = Set.of("Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testNoneStartWithA() {
    // arrange
    Set<String> input = Set.of("rmadillo", "utopia", "canine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_trueOneElement() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_EmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testMaxLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_firstWord() {
    // arrange
    Set<String> input = Set.of("commodius", "by", "a", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  @Test
  void testMaxLength_lastWord() {
    // arrange
    Set<String> input = Set.of("by", "a", "vicus", "orange");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(6, actual);
  }

  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  
  @Test
  void testMinLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_randomSpace() {
    // arrange
    Set<String> input = Set.of("by", "a", " ", "vicus");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_EmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_startSpace() {
    // arrange
    Set<String> input = Set.of(" ", "two", "five");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLength_LastWord() {
    // arrange
    Set<String> input = Set.of("by", "able", "commodius", "n");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

}
