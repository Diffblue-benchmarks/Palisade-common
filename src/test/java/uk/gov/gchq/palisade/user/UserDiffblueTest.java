package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link User#User()}
   *   <li>{@link User#setUserId(UserId)}
   *   <li>{@link User#toString()}
   *   <li>{@link User#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void User.<init>()",
    "UserId User.getUserId()",
    "void User.setUserId(UserId)",
    "String User.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    User actualUser = new User();
    UserId userId = new UserId();
    actualUser.setUserId(userId);
    actualUser.toString();
    UserId actualUserId = actualUser.getUserId();

    // Assert
    assertNull(actualUserId.getId());
    assertSame(userId, actualUserId);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link User#User()}
   *   <li>{@link User#setUserId(UserId)}
   *   <li>{@link User#toString()}
   *   <li>{@link User#getUserId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void User.<init>()",
    "UserId User.getUserId()",
    "void User.setUserId(UserId)",
    "String User.toString()"
  })
  void testGettersAndSetters2() {
    // Arrange and Act
    User actualUser = new User();
    UserId userId = new UserId();
    actualUser.setUserId(userId);
    actualUser.toString();
    UserId actualUserId = actualUser.getUserId();

    // Assert
    assertNull(actualUserId.getId());
    assertSame(userId, actualUserId);
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
  void testNewUser_whenUser_thenReturnUserIdIsNull2() {
    // Arrange and Act
    User actualUser = new User(new User());

    // Assert
    assertNull(actualUser.getUserId());
    assertTrue(actualUser.getAuths().isEmpty());
    assertTrue(actualUser.getRoles().isEmpty());
  }

  /**
   * Test {@link User#userId(String)} with {@code String}.
   *
   * <p>Method under test: {@link User#userId(String)}
   */
  @Test
  @DisplayName("Test userId(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.userId(String)"})
  void testUserIdWithString() {
    // Arrange
    User user = new User();

    // Act
    User actualUserIdResult = user.userId("42");

    // Assert
    assertSame(user, actualUserIdResult);
  }

  /**
   * Test {@link User#userId(UserId)} with {@code UserId}.
   *
   * <ul>
   *   <li>When {@link UserId#UserId()}.
   *   <li>Then return {@link User#User()}.
   * </ul>
   *
   * <p>Method under test: {@link User#userId(UserId)}
   */
  @Test
  @DisplayName("Test userId(UserId) with 'UserId'; when UserId(); then return User()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.userId(UserId)"})
  void testUserIdWithUserId_whenUserId_thenReturnUser() {
    // Arrange
    User user = new User();
    UserId userId = new UserId();

    // Act
    User actualUserIdResult = user.userId(userId);

    // Assert
    assertSame(user, actualUserIdResult);
    assertSame(userId, user.getUserId());
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_given42_whenHashSetAdd42() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("42");
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_given42_whenHashSetAdd422() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("42");
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; given 'foo'; when HashSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_givenFoo_whenHashSetAddFoo() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; given 'foo'; when HashSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_givenFoo_whenHashSetAddFoo2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_whenHashSet() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new HashSet<>());

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#auths(Set)}
   */
  @Test
  @DisplayName("Test auths(Set) with 'Set'; when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(Set)"})
  void testAuthsWithSet_whenHashSet2() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new HashSet<>());

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(String[])} with {@code String[]}.
   *
   * <p>Method under test: {@link User#auths(String[])}
   */
  @Test
  @DisplayName("Test auths(String[]) with 'String[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(String[])"})
  void testAuthsWithString() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new String[] {"Auths"});

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#auths(String[])} with {@code String[]}.
   *
   * <p>Method under test: {@link User#auths(String[])}
   */
  @Test
  @DisplayName("Test auths(String[]) with 'String[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.auths(String[])"})
  void testAuthsWithString2() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new String[] {"Auths"});

    // Assert
    assertSame(user, actualAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code Cannot add null auths.}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName("Test addAuths(Set); given 'Cannot add null auths.'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenCannotAddNullAuths_thenUserAuthsIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("Cannot add null auths.");

    // Act
    User actualAddAuthsResult = user.addAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code Cannot add null auths.}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName("Test addAuths(Set); given 'Cannot add null auths.'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenCannotAddNullAuths_thenUserAuthsIsHashSet2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("Cannot add null auths.");

    // Act
    User actualAddAuthsResult = user.addAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName(
      "Test addAuths(Set); given 'foo'; when HashSet() add 'foo'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenFoo_whenHashSetAddFoo_thenUserAuthsIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");
    auths.add("Cannot add null auths.");

    // Act
    User actualAddAuthsResult = user.addAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName(
      "Test addAuths(Set); given 'foo'; when HashSet() add 'foo'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenFoo_whenHashSetAddFoo_thenUserAuthsIsHashSet2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");
    auths.add("Cannot add null auths.");

    // Act
    User actualAddAuthsResult = user.addAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@link User#User()}.
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Auths Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName("Test addAuths(Set); given User(); when HashSet(); then User() Auths Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenUser_whenHashSet_thenUserAuthsEmpty() {
    // Arrange
    User user = new User();

    // Act
    User actualAddAuthsResult = user.addAuths(new HashSet<>());

    // Assert
    assertTrue(user.getAuths().isEmpty());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#addAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@link User#User()}.
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Auths Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#addAuths(Set)}
   */
  @Test
  @DisplayName("Test addAuths(Set); given User(); when HashSet(); then User() Auths Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addAuths(Set)"})
  void testAddAuths_givenUser_whenHashSet_thenUserAuthsEmpty2() {
    // Arrange
    User user = new User();

    // Act
    User actualAddAuthsResult = user.addAuths(new HashSet<>());

    // Assert
    assertTrue(user.getAuths().isEmpty());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_given42_whenHashSetAdd42() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("42");
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_given42_whenHashSetAdd422() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("42");
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; given 'foo'; when HashSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_givenFoo_whenHashSetAddFoo() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; given 'foo'; when HashSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_givenFoo_whenHashSetAddFoo2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_whenHashSet() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new HashSet<>());

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#roles(Set)}
   */
  @Test
  @DisplayName("Test roles(Set) with 'Set'; when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(Set)"})
  void testRolesWithSet_whenHashSet2() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new HashSet<>());

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(String[])} with {@code String[]}.
   *
   * <p>Method under test: {@link User#roles(String[])}
   */
  @Test
  @DisplayName("Test roles(String[]) with 'String[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(String[])"})
  void testRolesWithString() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new String[] {"Roles"});

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#roles(String[])} with {@code String[]}.
   *
   * <p>Method under test: {@link User#roles(String[])}
   */
  @Test
  @DisplayName("Test roles(String[]) with 'String[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.roles(String[])"})
  void testRolesWithString2() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new String[] {"Roles"});

    // Assert
    assertSame(user, actualRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code Cannot add null roles.}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName("Test addRoles(Set); given 'Cannot add null roles.'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenCannotAddNullRoles_thenUserRolesIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("Cannot add null roles.");

    // Act
    User actualAddRolesResult = user.addRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code Cannot add null roles.}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName("Test addRoles(Set); given 'Cannot add null roles.'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenCannotAddNullRoles_thenUserRolesIsHashSet2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("Cannot add null roles.");

    // Act
    User actualAddRolesResult = user.addRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName(
      "Test addRoles(Set); given 'foo'; when HashSet() add 'foo'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenFoo_whenHashSetAddFoo_thenUserRolesIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");
    roles.add("Cannot add null roles.");

    // Act
    User actualAddRolesResult = user.addRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName(
      "Test addRoles(Set); given 'foo'; when HashSet() add 'foo'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenFoo_whenHashSetAddFoo_thenUserRolesIsHashSet2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");
    roles.add("Cannot add null roles.");

    // Act
    User actualAddRolesResult = user.addRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@link User#User()}.
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Roles Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName("Test addRoles(Set); given User(); when HashSet(); then User() Roles Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenUser_whenHashSet_thenUserRolesEmpty() {
    // Arrange
    User user = new User();

    // Act
    User actualAddRolesResult = user.addRoles(new HashSet<>());

    // Assert
    assertTrue(user.getRoles().isEmpty());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#addRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@link User#User()}.
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Roles Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#addRoles(Set)}
   */
  @Test
  @DisplayName("Test addRoles(Set); given User(); when HashSet(); then User() Roles Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"User User.addRoles(Set)"})
  void testAddRoles_givenUser_whenHashSet_thenUserRolesEmpty2() {
    // Arrange
    User user = new User();

    // Act
    User actualAddRolesResult = user.addRoles(new HashSet<>());

    // Assert
    assertTrue(user.getRoles().isEmpty());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Test {@link User#getRoles()}.
   *
   * <p>Method under test: {@link User#getRoles()}
   */
  @Test
  @DisplayName("Test getRoles()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set User.getRoles()"})
  void testGetRoles() {
    // Arrange, Act and Assert
    assertTrue(new User().getRoles().isEmpty());
  }

  /**
   * Test {@link User#getRoles()}.
   *
   * <p>Method under test: {@link User#getRoles()}
   */
  @Test
  @DisplayName("Test getRoles()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set User.getRoles()"})
  void testGetRoles2() {
    // Arrange, Act and Assert
    assertTrue(new User().getRoles().isEmpty());
  }

  /**
   * Test {@link User#setRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#setRoles(Set)}
   */
  @Test
  @DisplayName(
      "Test setRoles(Set); given '42'; when HashSet() add '42'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setRoles(Set)"})
  void testSetRoles_given42_whenHashSetAdd42_thenUserRolesIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("42");
    roles.add("foo");

    // Act
    user.setRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
  }

  /**
   * Test {@link User#setRoles(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Roles is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#setRoles(Set)}
   */
  @Test
  @DisplayName(
      "Test setRoles(Set); given 'foo'; when HashSet() add 'foo'; then User() Roles is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setRoles(Set)"})
  void testSetRoles_givenFoo_whenHashSetAddFoo_thenUserRolesIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");

    // Act
    user.setRoles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
  }

  /**
   * Test {@link User#setRoles(Set)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Roles Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#setRoles(Set)}
   */
  @Test
  @DisplayName("Test setRoles(Set); when HashSet(); then User() Roles Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setRoles(Set)"})
  void testSetRoles_whenHashSet_thenUserRolesEmpty() {
    // Arrange
    User user = new User();

    // Act
    user.setRoles(new HashSet<>());

    // Assert that nothing has changed
    assertTrue(user.getRoles().isEmpty());
  }

  /**
   * Test {@link User#getAuths()}.
   *
   * <p>Method under test: {@link User#getAuths()}
   */
  @Test
  @DisplayName("Test getAuths()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set User.getAuths()"})
  void testGetAuths() {
    // Arrange, Act and Assert
    assertTrue(new User().getAuths().isEmpty());
  }

  /**
   * Test {@link User#getAuths()}.
   *
   * <p>Method under test: {@link User#getAuths()}
   */
  @Test
  @DisplayName("Test getAuths()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set User.getAuths()"})
  void testGetAuths2() {
    // Arrange, Act and Assert
    assertTrue(new User().getAuths().isEmpty());
  }

  /**
   * Test {@link User#setAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#setAuths(Set)}
   */
  @Test
  @DisplayName(
      "Test setAuths(Set); given '42'; when HashSet() add '42'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setAuths(Set)"})
  void testSetAuths_given42_whenHashSetAdd42_thenUserAuthsIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("42");
    auths.add("foo");

    // Act
    user.setAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
  }

  /**
   * Test {@link User#setAuths(Set)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then {@link User#User()} Auths is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link User#setAuths(Set)}
   */
  @Test
  @DisplayName(
      "Test setAuths(Set); given 'foo'; when HashSet() add 'foo'; then User() Auths is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setAuths(Set)"})
  void testSetAuths_givenFoo_whenHashSetAddFoo_thenUserAuthsIsHashSet() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");

    // Act
    user.setAuths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
  }

  /**
   * Test {@link User#setAuths(Set)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link User#User()} Auths Empty.
   * </ul>
   *
   * <p>Method under test: {@link User#setAuths(Set)}
   */
  @Test
  @DisplayName("Test setAuths(Set); when HashSet(); then User() Auths Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void User.setAuths(Set)"})
  void testSetAuths_whenHashSet_thenUserAuthsEmpty() {
    // Arrange
    User user = new User();

    // Act
    user.setAuths(new HashSet<>());

    // Assert that nothing has changed
    assertTrue(user.getAuths().isEmpty());
  }

  /**
   * Test {@link User#equals(Object)}, and {@link User#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link User#equals(Object)}
   *   <li>{@link User#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    User user = new User();

    // Act and Assert
    assertEquals(user, user);
    int expectedHashCodeResult = user.hashCode();
    assertEquals(expectedHashCodeResult, user.hashCode());
  }

  /**
   * Test {@link User#equals(Object)}, and {@link User#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link User#equals(Object)}
   *   <li>{@link User#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual2() {
    // Arrange
    User user = new User();

    // Act and Assert
    assertEquals(user, user);
    int expectedHashCodeResult = user.hashCode();
    assertEquals(expectedHashCodeResult, user.hashCode());
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    User user = new User();
    user.setUserId(new UserId());

    // Act and Assert
    assertNotEquals(user, new User());
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    User user = new User();
    user.setUserId(new UserId());

    // Act and Assert
    assertNotEquals(user, new User());
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), null);
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), null);
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), "Different type to User");
  }

  /**
   * Test {@link User#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link User#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean User.equals(Object)", "int User.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), "Different type to User");
  }
}
