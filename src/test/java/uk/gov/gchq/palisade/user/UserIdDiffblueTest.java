package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserIdDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserId#UserId()}
   *   <li>{@link UserId#setId(String)}
   *   <li>{@link UserId#toString()}
   *   <li>{@link UserId#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserId.<init>()",
    "String UserId.getId()",
    "void UserId.setId(String)",
    "String UserId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    UserId actualUserId = new UserId();
    actualUserId.setId("42");
    String actualToStringResult = actualUserId.toString();

    // Assert
    assertEquals("42", actualUserId.getId());
    assertEquals("UserId[id='42']", actualToStringResult);
  }

  /**
   * Test {@link UserId#UserId(UserId)}.
   *
   * <ul>
   *   <li>When {@link UserId#UserId()}.
   *   <li>Then return Id is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UserId#UserId(UserId)}
   */
  @Test
  @DisplayName("Test new UserId(UserId); when UserId(); then return Id is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserId.<init>(UserId)"})
  void testNewUserId_whenUserId_thenReturnIdIsNull() {
    // Arrange, Act and Assert
    assertNull(new UserId(new UserId()).getId());
  }

  /**
   * Test {@link UserId#id(String)}.
   *
   * <p>Method under test: {@link UserId#id(String)}
   */
  @Test
  @DisplayName("Test id(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UserId UserId.id(String)"})
  void testId() {
    // Arrange
    UserId userId = new UserId();

    // Act
    UserId actualIdResult = userId.id("42");

    // Assert
    assertEquals("42", userId.getId());
    assertSame(userId, actualIdResult);
  }

  /**
   * Test {@link UserId#equals(Object)}, and {@link UserId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();
    userId.setId("42");

    UserId userId2 = new UserId();
    userId2.setId("42");

    // Act and Assert
    assertEquals(userId, userId2);
    assertEquals(userId.hashCode(), userId2.hashCode());
  }

  /**
   * Test {@link UserId#equals(Object)}, and {@link UserId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();

    // Act and Assert
    assertEquals(userId, userId);
    int expectedHashCodeResult = userId.hashCode();
    assertEquals(expectedHashCodeResult, userId.hashCode());
  }

  /**
   * Test {@link UserId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserId userId = new UserId();
    userId.setId("42");

    // Act and Assert
    assertNotEquals(userId, new UserId());
  }

  /**
   * Test {@link UserId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), null);
  }

  /**
   * Test {@link UserId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), "Different type to UserId");
  }
}
