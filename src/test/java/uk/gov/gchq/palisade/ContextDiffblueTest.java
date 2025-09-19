package uk.gov.gchq.palisade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ContextDiffblueTest {
  /**
   * Test {@link Context#Context()}.
   *
   * <p>Method under test: {@link Context#Context()}
   */
  @Test
  @DisplayName("Test new Context()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Context.<init>()"})
  void testNewContext() {
    // Arrange and Act
    Context actualContext = new Context();

    // Assert
    assertNull(actualContext.getPurpose());
    assertTrue(actualContext.getContents().isEmpty());
    assertTrue(actualContext.getContentsCopy().isEmpty());
  }

  /**
   * Test {@link Context#Context(Map)}.
   *
   * <p>Method under test: {@link Context#Context(Map)}
   */
  @Test
  @DisplayName("Test new Context(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Context.<init>(Map)"})
  void testNewContext2() {
    // Arrange and Act
    Context actualContext = new Context(new HashMap<>());

    // Assert
    assertNull(actualContext.getPurpose());
    assertTrue(actualContext.getContents().isEmpty());
    assertTrue(actualContext.getContentsCopy().isEmpty());
  }

  /**
   * Test {@link Context#contents(Map)}.
   *
   * <p>Method under test: {@link Context#contents(Map)}
   */
  @Test
  @DisplayName("Test contents(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Context Context.contents(Map)"})
  void testContents() {
    // Arrange
    Context context = new Context();
    HashMap<String, Object> contents = new HashMap<>();

    // Act
    Context actualContentsResult = context.contents(contents);

    // Assert
    assertSame(contents, context.getContents());
    assertSame(context, actualContentsResult);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Context#setContents(Map)}
   *   <li>{@link Context#toString()}
   *   <li>{@link Context#getContents()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Map Context.getContents()",
    "void Context.setContents(Map)",
    "String Context.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Context context = new Context();
    HashMap<String, Object> contents = new HashMap<>();

    // Act
    context.setContents(contents);
    String actualToStringResult = context.toString();
    Map<String, Object> actualContents = context.getContents();

    // Assert
    assertEquals("Context[contents={}]", actualToStringResult);
    assertTrue(actualContents.isEmpty());
    assertSame(contents, actualContents);
  }

  /**
   * Test {@link Context#getContentsCopy()}.
   *
   * <p>Method under test: {@link Context#getContentsCopy()}
   */
  @Test
  @DisplayName("Test getContentsCopy()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Context.getContentsCopy()"})
  void testGetContentsCopy() {
    // Arrange, Act and Assert
    assertTrue(new Context().getContentsCopy().isEmpty());
  }

  /**
   * Test {@link Context#purpose(String)}.
   *
   * <p>Method under test: {@link Context#purpose(String)}
   */
  @Test
  @DisplayName("Test purpose(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Context Context.purpose(String)"})
  void testPurpose() {
    // Arrange
    Context context = new Context();

    // Act
    Context actualPurposeResult = context.purpose("Purpose");

    // Assert
    assertEquals("Purpose", context.getPurpose());
    Map<String, Object> contentsCopy = context.getContentsCopy();
    assertEquals(1, contentsCopy.size());
    assertEquals("Purpose", contentsCopy.get("purpose"));
    assertSame(context, actualPurposeResult);
  }

  /**
   * Test {@link Context#getPurpose()}.
   *
   * <ul>
   *   <li>Given {@link Context#Context()} {@code purpose} is forty-two.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link Context#getPurpose()}
   */
  @Test
  @DisplayName(
      "Test getPurpose(); given Context() 'purpose' is forty-two; then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Context.getPurpose()"})
  void testGetPurpose_givenContextPurposeIsFortyTwo_thenThrowRuntimeException() {
    // Arrange
    Context context = new Context();
    context.put("purpose", 42);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> context.getPurpose());
  }

  /**
   * Test {@link Context#getPurpose()}.
   *
   * <ul>
   *   <li>Given {@link Context#Context()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Context#getPurpose()}
   */
  @Test
  @DisplayName("Test getPurpose(); given Context(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Context.getPurpose()"})
  void testGetPurpose_givenContext_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Context().getPurpose());
  }

  /**
   * Test {@link Context#get(String)}.
   *
   * <p>Method under test: {@link Context#get(String)}
   */
  @Test
  @DisplayName("Test get(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Context.get(String)"})
  void testGet() {
    // Arrange, Act and Assert
    assertNull(new Context().get("Key"));
  }

  /**
   * Test {@link Context#put(String, Object)}.
   *
   * <p>Method under test: {@link Context#put(String, Object)}
   */
  @Test
  @DisplayName("Test put(String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Context Context.put(String, Object)"})
  void testPut() {
    // Arrange
    Context context = new Context();

    // Act
    Context actualPutResult = context.put("Key", "Value");

    // Assert
    Map<String, Object> contentsCopy = context.getContentsCopy();
    assertEquals(1, contentsCopy.size());
    assertEquals("Value", contentsCopy.get("Key"));
    assertSame(context, actualPutResult);
  }

  /**
   * Test {@link Context#putIfAbsent(String, Object)}.
   *
   * <p>Method under test: {@link Context#putIfAbsent(String, Object)}
   */
  @Test
  @DisplayName("Test putIfAbsent(String, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Context Context.putIfAbsent(String, Object)"})
  void testPutIfAbsent() {
    // Arrange
    Context context = new Context();

    // Act
    Context actualPutIfAbsentResult = context.putIfAbsent("Key", "Value");

    // Assert
    Map<String, Object> contentsCopy = context.getContentsCopy();
    assertEquals(1, contentsCopy.size());
    assertEquals("Value", contentsCopy.get("Key"));
    assertSame(context, actualPutIfAbsentResult);
  }

  /**
   * Test {@link Context#equals(Object)}, and {@link Context#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Context#equals(Object)}
   *   <li>{@link Context#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Context.equals(Object)", "int Context.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Context context = new Context();
    Context context2 = new Context();

    // Act and Assert
    assertEquals(context, context2);
    assertEquals(context.hashCode(), context2.hashCode());
  }

  /**
   * Test {@link Context#equals(Object)}, and {@link Context#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Context#equals(Object)}
   *   <li>{@link Context#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Context.equals(Object)", "int Context.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertEquals(context, context);
    int expectedHashCodeResult = context.hashCode();
    assertEquals(expectedHashCodeResult, context.hashCode());
  }

  /**
   * Test {@link Context#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Context#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Context.equals(Object)", "int Context.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Context context = new Context();
    context.put("Key", "Value");

    // Act and Assert
    assertNotEquals(context, new Context());
  }

  /**
   * Test {@link Context#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Context#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Context.equals(Object)", "int Context.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Context(), null);
  }

  /**
   * Test {@link Context#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Context#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Context.equals(Object)", "int Context.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Context(), "Different type to Context");
  }
}
