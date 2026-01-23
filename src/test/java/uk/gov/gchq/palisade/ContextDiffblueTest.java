package uk.gov.gchq.palisade;

import static org.junit.jupiter.api.Assertions.assertNull;
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
  @MethodsUnderTest({"java.lang.String Context.getPurpose()"})
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
  @MethodsUnderTest({"java.lang.String Context.getPurpose()"})
  void testGetPurpose_givenContext_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Context().getPurpose());
  }
}
