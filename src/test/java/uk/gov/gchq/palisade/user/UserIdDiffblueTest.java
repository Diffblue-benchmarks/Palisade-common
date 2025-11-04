package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class UserIdDiffblueTest {
  /**
   * Method under test: {@link UserId#id(String)}
   */
  @Test
  void testId() {
    // Arrange
    UserId userId = new UserId();

    // Act
    UserId actualIdResult = userId.id("42");

    // Assert
    assertEquals("42", userId.getId());
    assertEquals("42", actualIdResult.getId());
    assertSame(userId, actualIdResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();
    userId.setId("42");

    UserId userId2 = new UserId();
    userId2.setId("42");

    // Act and Assert
    assertEquals(userId, userId2);
    int expectedHashCodeResult = userId.hashCode();
    assertEquals(expectedHashCodeResult, userId2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();

    // Act and Assert
    assertEquals(userId, userId);
    int expectedHashCodeResult = userId.hashCode();
    assertEquals(expectedHashCodeResult, userId.hashCode());
  }

  /**
   * Method under test: {@link UserId#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserId userId = new UserId();
    userId.setId("42");

    // Act and Assert
    assertNotEquals(userId, new UserId());
  }

  /**
   * Method under test: {@link UserId#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), null);
  }

  /**
   * Method under test: {@link UserId#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), "Different type to UserId");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link UserId#UserId()}
   *   <li>{@link UserId#setId(String)}
   *   <li>{@link UserId#toString()}
   *   <li>{@link UserId#getId()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    UserId actualUserId = new UserId();
    actualUserId.setId("42");
    String actualToStringResult = actualUserId.toString();

    // Assert that nothing has changed
    assertEquals("42", actualUserId.getId());
    assertEquals("UserId[id='42']", actualToStringResult);
  }

  /**
   * Method under test: {@link UserId#UserId(UserId)}
   */
  @Test
  void testNewUserId() {
    // Arrange, Act and Assert
    assertNull((new UserId(new UserId())).getId());
  }
}
