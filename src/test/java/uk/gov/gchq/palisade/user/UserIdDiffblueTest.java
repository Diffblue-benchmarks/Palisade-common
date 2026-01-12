package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserIdDiffblueTest {
  /**
   * Test {@link UserId#UserId()}.
   *
   * <p>Method under test: {@link UserId#UserId()}
   */
  @Test
  @DisplayName("Test new UserId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserId.<init>()"})
  void testNewUserId() {
    // Arrange, Act and Assert
    assertNull(new UserId().getId());
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
}
