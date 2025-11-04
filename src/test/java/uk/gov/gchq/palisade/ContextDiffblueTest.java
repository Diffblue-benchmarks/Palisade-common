package uk.gov.gchq.palisade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.junit.jupiter.api.Test;

class ContextDiffblueTest {
  /**
   * Method under test: {@link Context#contents(Map)}
   */
  @Test
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
   * Method under test: {@link Context#contents(Map)}
   */
  @Test
  void testContents2() {
    // Arrange
    Context context = new Context();

    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));

    // Act
    Context actualContentsResult = context.contents(contents);

    // Assert
    assertSame(contents, context.getContents());
    assertSame(context, actualContentsResult);
  }

  /**
   * Method under test: {@link Context#getContentsCopy()}
   */
  @Test
  void testGetContentsCopy() {
    // Arrange, Act and Assert
    assertTrue((new Context()).getContentsCopy().isEmpty());
  }

  /**
   * Method under test: {@link Context#getContentsCopy()}
   */
  @Test
  void testGetContentsCopy2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));

    // Act and Assert
    assertTrue((new Context(contents)).getContentsCopy().isEmpty());
  }

  /**
   * Method under test: {@link Context#purpose(String)}
   */
  @Test
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
   * Method under test: {@link Context#purpose(String)}
   */
  @Test
  void testPurpose2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));
    Context context = new Context(contents);

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
   * Method under test: {@link Context#getPurpose()}
   */
  @Test
  void testGetPurpose() {
    // Arrange, Act and Assert
    assertNull((new Context()).getPurpose());
  }

  /**
   * Method under test: {@link Context#getPurpose()}
   */
  @Test
  void testGetPurpose2() {
    // Arrange
    Context context = new Context();
    context.put("purpose", 42);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> context.getPurpose());
  }

  /**
   * Method under test: {@link Context#getPurpose()}
   */
  @Test
  void testGetPurpose3() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));

    // Act and Assert
    assertNull((new Context(contents)).getPurpose());
  }

  /**
   * Method under test: {@link Context#get(String)}
   */
  @Test
  void testGet() {
    // Arrange, Act and Assert
    assertNull((new Context()).get("Key"));
  }

  /**
   * Method under test: {@link Context#get(String)}
   */
  @Test
  void testGet2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));

    // Act and Assert
    assertNull((new Context(contents)).get("Key"));
  }

  /**
   * Method under test: {@link Context#put(String, Object)}
   */
  @Test
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
   * Method under test: {@link Context#put(String, Object)}
   */
  @Test
  void testPut2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));
    Context context = new Context(contents);

    // Act
    Context actualPutResult = context.put("Key", "Value");

    // Assert
    Map<String, Object> contentsCopy = context.getContentsCopy();
    assertEquals(1, contentsCopy.size());
    assertEquals("Value", contentsCopy.get("Key"));
    assertSame(context, actualPutResult);
  }

  /**
   * Method under test: {@link Context#putIfAbsent(String, Object)}
   */
  @Test
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
   * Method under test: {@link Context#putIfAbsent(String, Object)}
   */
  @Test
  void testPutIfAbsent2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));
    Context context = new Context(contents);

    // Act
    Context actualPutIfAbsentResult = context.putIfAbsent("Key", "Value");

    // Assert
    Map<String, Object> contentsCopy = context.getContentsCopy();
    assertEquals(1, contentsCopy.size());
    assertEquals("Value", contentsCopy.get("Key"));
    assertSame(context, actualPutIfAbsentResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Context#equals(Object)}
   *   <li>{@link Context#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Context context = new Context();
    Context context2 = new Context();

    // Act and Assert
    assertEquals(context, context2);
    int expectedHashCodeResult = context.hashCode();
    assertEquals(expectedHashCodeResult, context2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Context#equals(Object)}
   *   <li>{@link Context#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertEquals(context, context);
    int expectedHashCodeResult = context.hashCode();
    assertEquals(expectedHashCodeResult, context.hashCode());
  }

  /**
   * Method under test: {@link Context#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Context context = new Context();
    context.put("Key", "Value");

    // Act and Assert
    assertNotEquals(context, new Context());
  }

  /**
   * Method under test: {@link Context#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Context(), null);
  }

  /**
   * Method under test: {@link Context#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Context(), "Different type to Context");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Context#setContents(Map)}
   *   <li>{@link Context#toString()}
   *   <li>{@link Context#getContents()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange
    Context context = new Context();
    HashMap<String, Object> contents = new HashMap<>();

    // Act
    context.setContents(contents);
    String actualToStringResult = context.toString();
    Map<String, Object> actualContents = context.getContents();

    // Assert that nothing has changed
    assertEquals("Context[contents={}]", actualToStringResult);
    assertTrue(actualContents.isEmpty());
    assertSame(contents, actualContents);
  }

  /**
   * Method under test: {@link Context#Context()}
   */
  @Test
  void testNewContext() {
    // Arrange and Act
    Context actualContext = new Context();

    // Assert
    assertNull(actualContext.getPurpose());
    assertTrue(actualContext.getContents().isEmpty());
    assertTrue(actualContext.getContentsCopy().isEmpty());
  }

  /**
   * Method under test: {@link Context#Context(Map)}
   */
  @Test
  void testNewContext2() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();

    // Act
    Context actualContext = new Context(contents);

    // Assert
    assertNull(actualContext.getPurpose());
    Map<String, Object> contents2 = actualContext.getContents();
    assertTrue(contents2.isEmpty());
    assertTrue(actualContext.getContentsCopy().isEmpty());
    assertSame(contents, contents2);
  }

  /**
   * Method under test: {@link Context#Context(Map)}
   */
  @Test
  void testNewContext3() {
    // Arrange
    HashMap<String, Object> contents = new HashMap<>();
    contents.computeIfPresent("foo", mock(BiFunction.class));

    // Act
    Context actualContext = new Context(contents);

    // Assert
    assertNull(actualContext.getPurpose());
    Map<String, Object> contents2 = actualContext.getContents();
    assertTrue(contents2.isEmpty());
    assertTrue(actualContext.getContentsCopy().isEmpty());
    assertSame(contents, contents2);
  }
}
