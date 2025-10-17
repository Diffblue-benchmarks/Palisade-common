package uk.gov.gchq.palisade.rule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RulesDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Rules}
   *   <li>{@link Rules#setMessage(String)}
   *   <li>{@link Rules#toString()}
   *   <li>{@link Rules#getMessage()}
   *   <li>{@link Rules#getRules()}
   *   <li>{@link Rules#getRulesMap()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Rules.<init>()",
    "String Rules.getMessage()",
    "Map Rules.getRules()",
    "LinkedHashMap Rules.getRulesMap()",
    "void Rules.setMessage(String)",
    "String Rules.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Rules<Serializable> actualRules = new Rules<>();
    actualRules.setMessage("Not all who wander are lost");
    String actualToStringResult = actualRules.toString();
    String actualMessage = actualRules.getMessage();
    Map<String, Rule<Serializable>> actualRules2 = actualRules.getRules();
    LinkedHashMap<String, Rule<Serializable>> actualRulesMap = actualRules.getRulesMap();

    // Assert
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals(
        "Rules[message='Not all who wander are lost', rulesHashMap={}]", actualToStringResult);
    assertTrue(actualRules2.isEmpty());
    assertSame(actualRules2, actualRulesMap);
  }

  /**
   * Test {@link Rules#rules(Map)}.
   *
   * <p>Method under test: {@link Rules#rules(Map)}
   */
  @Test
  @DisplayName("Test rules(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rules Rules.rules(Map)"})
  void testRules() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act
    Rules<Serializable> actualRulesResult = rules.rules(new HashMap<>());

    // Assert
    assertSame(rules, actualRulesResult);
  }

  /**
   * Test {@link Rules#addRules(Map)}.
   *
   * <p>Method under test: {@link Rules#addRules(Map)}
   */
  @Test
  @DisplayName("Test addRules(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rules Rules.addRules(Map)"})
  void testAddRules() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act
    Rules<Serializable> actualAddRulesResult = rules.addRules(new HashMap<>());

    // Assert
    assertSame(rules, actualAddRulesResult);
  }

  /**
   * Test {@link Rules#message(String)}.
   *
   * <p>Method under test: {@link Rules#message(String)}
   */
  @Test
  @DisplayName("Test message(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rules Rules.message(String)"})
  void testMessage() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act
    Rules<Serializable> actualMessageResult = rules.message("Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", rules.getMessage());
    assertSame(rules, actualMessageResult);
  }

  /**
   * Test {@link Rules#addRule(String, Rule)}.
   *
   * <p>Method under test: {@link Rules#addRule(String, Rule)}
   */
  @Test
  @DisplayName("Test addRule(String, Rule)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rules Rules.addRule(String, Rule)"})
  void testAddRule() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act
    Rules<Serializable> actualAddRuleResult = rules.addRule("42", mock(Rule.class));

    // Assert
    assertSame(rules, actualAddRuleResult);
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
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Rules#equals(Object)}
   *   <li>{@link Rules#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Rules#equals(Object)}
   *   <li>{@link Rules#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
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
  @MethodsUnderTest({"boolean Rules.equals(Object)", "int Rules.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Rules<Serializable> rules = new Rules<>();

    // Act and Assert
    assertNotEquals(rules, "Different type to Rules");
  }
}
