package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserDiffblueTest {
  /**
   * Test {@link User#User()}.
   *
   * <p>Method under test: {@link User#User()}
   */
  @Test
  @DisplayName("Test new User()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.<init>()"})
  void testNewUser() {
    // Arrange, Act and Assert
    assertNull(new User().getUserId());
  }

  /**
   * Test {@link User#User(User)}.
   *
   * <ul>
   *   <li>When {@link User#User()}.
   *   <li>Then return UserId is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link User#User(User)}
   */
  @Test
  @DisplayName("Test new User(User); when User(); then return UserId is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.<init>(User)"})
  void testNewUser_whenUser_thenReturnUserIdIsNull() {
    // Arrange and Act
    User actualUser = new User(new User());

    // Assert
    assertNull(actualUser.getUserId());
    assertTrue(actualUser.getAuths().isEmpty());
    assertTrue(actualUser.getRoles().isEmpty());
  }
}
