package uk.gov.gchq.palisade.rule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.Serializable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RulesDiffblueTest {
  /**
   * Test new {@link Rules} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link Rules}
   */
  @Test
  @DisplayName("Test new Rules (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Rules.<init>()"})
  void testNewRules() {
    // Arrange and Act
    Rules<Serializable> actualRules = new Rules<>();

    // Assert
    assertTrue(actualRules.getRules().isEmpty());
    assertEquals(Rules.NO_RULES_SET, actualRules.getMessage());
  }

  /**
   * Test {@link Rules#containsRules()}.
   *
   * <ul>
   *   <li>Given {@link Rules} (default constructor) addRule {@code 42} and {@link Rule}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Rules#containsRules()}
   */
  @Test
  @DisplayName(
      "Test containsRules(); given Rules (default constructor) addRule '42' and Rule; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.containsRules()"})
  void testContainsRules_givenRulesAddRule42AndRule_thenReturnTrue() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();
    rules.addRule("42", mock(Rule.class));

    // Act and Assert
    assertTrue(rules.containsRules());
  }

  /**
   * Test {@link Rules#containsRules()}.
   *
   * <ul>
   *   <li>Given {@link Rules} (default constructor).
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Rules#containsRules()}
   */
  @Test
  @DisplayName("Test containsRules(); given Rules (default constructor); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.containsRules()"})
  void testContainsRules_givenRules_thenReturnFalse() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act and Assert
    assertFalse(rules.containsRules());
  }

  /**
   * Test {@link Rules#equals(Object)}, and {@link Rules#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();
    Rules<Serializable> rules2 = new Rules<>();

    // Act and Assert
    assertEquals(rules, rules2);
    assertEquals(rules.hashCode(), rules2.hashCode());
  }

  /**
   * Test {@link Rules#equals(Object)}, and {@link Rules#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act and Assert
    assertEquals(rules, rules);
    int expectedHashCodeResult = rules.hashCode();
    assertEquals(expectedHashCodeResult, rules.hashCode());
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();
    rules.addRule("42", mock(Rule.class));

    // Act and Assert
    assertNotEquals(rules, new Rules<>());
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();
    rules.addRule("Id", mock(Rule.class));
    rules.addRule("42", mock(Rule.class));

    // Act and Assert
    assertNotEquals(rules, new Rules<>());
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    Rules<Serializable> rules2 = new Rules<>();
    rules2.addRule("42", mock(Rule.class));

    // Act and Assert
    assertNotEquals(rules, rules2);
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    Rules<Serializable> rules2 = new Rules<>();
    rules2.addRule("Id", mock(Rule.class));
    rules2.addRule("42", mock(Rule.class));

    // Act and Assert
    assertNotEquals(rules, rules2);
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act and Assert
    assertNotEquals(rules, null);
  }

  /**
   * Test {@link Rules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Rules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act and Assert
    assertNotEquals(rules, "Different type to Rules");
  }
}
