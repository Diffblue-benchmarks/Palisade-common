package uk.gov.gchq.palisade.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class UserDiffblueTest {
  /**
   * Method under test: {@link User#userId(String)}
   */
  @Test
  void testUserId() {
    // Arrange
    User user = new User();

    // Act and Assert
    assertSame(user, user.userId("42"));
  }

  /**
   * Method under test: {@link User#userId(UserId)}
   */
  @Test
  void testUserId2() {
    // Arrange
    User user = new User();
    UserId userId = new UserId();

    // Act and Assert
    assertSame(user, user.userId(userId));
    assertSame(userId, user.getUserId());
  }

  /**
   * Method under test: {@link User#auths(Set)}
   */
  @Test
  void testAuths() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new HashSet<>());

    // Assert
    assertTrue(user.getAuths().isEmpty());
    assertSame(user, actualAuthsResult);
  }

  /**
   * Method under test: {@link User#auths(Set)}
   */
  @Test
  void testAuths2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    Set<String> auths2 = user.getAuths();
    assertEquals(1, auths2.size());
    assertTrue(auths2.contains("foo"));
    assertSame(user, actualAuthsResult);
  }

  /**
   * Method under test: {@link User#auths(Set)}
   */
  @Test
  void testAuths3() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("42");
    auths.add("foo");

    // Act
    User actualAuthsResult = user.auths(auths);

    // Assert
    assertEquals(auths, user.getAuths());
    assertSame(user, actualAuthsResult);
  }

  /**
   * Method under test: {@link User#auths(String[])}
   */
  @Test
  void testAuths4() {
    // Arrange
    User user = new User();

    // Act
    User actualAuthsResult = user.auths(new String[]{"Auths"});

    // Assert
    Set<String> auths = user.getAuths();
    assertEquals(1, auths.size());
    assertTrue(auths.contains("Auths"));
    assertSame(user, actualAuthsResult);
  }

  /**
   * Method under test: {@link User#addAuths(Set)}
   */
  @Test
  void testAddAuths() {
    // Arrange
    User user = new User();

    // Act
    User actualAddAuthsResult = user.addAuths(new HashSet<>());

    // Assert
    assertTrue(user.getAuths().isEmpty());
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Method under test: {@link User#addAuths(Set)}
   */
  @Test
  void testAddAuths2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("Cannot add null auths.");

    // Act
    User actualAddAuthsResult = user.addAuths(auths);

    // Assert
    Set<String> auths2 = user.getAuths();
    assertEquals(1, auths2.size());
    assertTrue(auths2.contains("Cannot add null auths."));
    assertSame(user, actualAddAuthsResult);
  }

  /**
   * Method under test: {@link User#addAuths(Set)}
   */
  @Test
  void testAddAuths3() {
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
   * Method under test: {@link User#roles(Set)}
   */
  @Test
  void testRoles() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new HashSet<>());

    // Assert
    assertTrue(user.getRoles().isEmpty());
    assertSame(user, actualRolesResult);
  }

  /**
   * Method under test: {@link User#roles(Set)}
   */
  @Test
  void testRoles2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    Set<String> roles2 = user.getRoles();
    assertEquals(1, roles2.size());
    assertTrue(roles2.contains("foo"));
    assertSame(user, actualRolesResult);
  }

  /**
   * Method under test: {@link User#roles(Set)}
   */
  @Test
  void testRoles3() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("42");
    roles.add("foo");

    // Act
    User actualRolesResult = user.roles(roles);

    // Assert
    assertEquals(roles, user.getRoles());
    assertSame(user, actualRolesResult);
  }

  /**
   * Method under test: {@link User#roles(String[])}
   */
  @Test
  void testRoles4() {
    // Arrange
    User user = new User();

    // Act
    User actualRolesResult = user.roles(new String[]{"Roles"});

    // Assert
    Set<String> roles = user.getRoles();
    assertEquals(1, roles.size());
    assertTrue(roles.contains("Roles"));
    assertSame(user, actualRolesResult);
  }

  /**
   * Method under test: {@link User#addRoles(Set)}
   */
  @Test
  void testAddRoles() {
    // Arrange
    User user = new User();

    // Act
    User actualAddRolesResult = user.addRoles(new HashSet<>());

    // Assert
    assertTrue(user.getRoles().isEmpty());
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Method under test: {@link User#addRoles(Set)}
   */
  @Test
  void testAddRoles2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("Cannot add null roles.");

    // Act
    User actualAddRolesResult = user.addRoles(roles);

    // Assert
    Set<String> roles2 = user.getRoles();
    assertEquals(1, roles2.size());
    assertTrue(roles2.contains("Cannot add null roles."));
    assertSame(user, actualAddRolesResult);
  }

  /**
   * Method under test: {@link User#addRoles(Set)}
   */
  @Test
  void testAddRoles3() {
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
   * Method under test: {@link User#getRoles()}
   */
  @Test
  void testGetRoles() {
    // Arrange, Act and Assert
    assertTrue((new User()).getRoles().isEmpty());
  }

  /**
   * Method under test: {@link User#setRoles(Set)}
   */
  @Test
  void testSetRoles() {
    // Arrange
    User user = new User();

    // Act
    user.setRoles(new HashSet<>());

    // Assert
    assertTrue(user.getRoles().isEmpty());
  }

  /**
   * Method under test: {@link User#setRoles(Set)}
   */
  @Test
  void testSetRoles2() {
    // Arrange
    User user = new User();

    HashSet<String> roles = new HashSet<>();
    roles.add("foo");

    // Act
    user.setRoles(roles);

    // Assert
    Set<String> roles2 = user.getRoles();
    assertEquals(1, roles2.size());
    assertTrue(roles2.contains("foo"));
  }

  /**
   * Method under test: {@link User#setRoles(Set)}
   */
  @Test
  void testSetRoles3() {
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
   * Method under test: {@link User#getAuths()}
   */
  @Test
  void testGetAuths() {
    // Arrange, Act and Assert
    assertTrue((new User()).getAuths().isEmpty());
  }

  /**
   * Method under test: {@link User#setAuths(Set)}
   */
  @Test
  void testSetAuths() {
    // Arrange
    User user = new User();

    // Act
    user.setAuths(new HashSet<>());

    // Assert
    assertTrue(user.getAuths().isEmpty());
  }

  /**
   * Method under test: {@link User#setAuths(Set)}
   */
  @Test
  void testSetAuths2() {
    // Arrange
    User user = new User();

    HashSet<String> auths = new HashSet<>();
    auths.add("foo");

    // Act
    user.setAuths(auths);

    // Assert
    Set<String> auths2 = user.getAuths();
    assertEquals(1, auths2.size());
    assertTrue(auths2.contains("foo"));
  }

  /**
   * Method under test: {@link User#setAuths(Set)}
   */
  @Test
  void testSetAuths3() {
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
   * Methods under test:
   * <ul>
   *   <li>{@link User#equals(Object)}
   *   <li>{@link User#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    User user = new User();

    // Act and Assert
    assertEquals(user, user);
    int expectedHashCodeResult = user.hashCode();
    assertEquals(expectedHashCodeResult, user.hashCode());
  }

  /**
   * Method under test: {@link User#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    User user = new User();
    user.setUserId(new UserId());

    // Act and Assert
    assertNotEquals(user, new User());
  }

  /**
   * Method under test: {@link User#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    User user = new User();
    user.setUserId(mock(UserId.class));

    // Act and Assert
    assertNotEquals(user, new User());
  }

  /**
   * Method under test: {@link User#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), null);
  }

  /**
   * Method under test: {@link User#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new User(), "Different type to User");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link User#User()}
   *   <li>{@link User#setUserId(UserId)}
   *   <li>{@link User#toString()}
   *   <li>{@link User#getUserId()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    User actualUser = new User();
    UserId userId = new UserId();
    actualUser.setUserId(userId);
    actualUser.toString();

    // Assert that nothing has changed
    assertSame(userId, actualUser.getUserId());
  }

  /**
   * Method under test: {@link User#User(User)}
   */
  @Test
  void testNewUser() {
    // Arrange and Act
    User actualUser = new User(new User());

    // Assert
    assertNull(actualUser.getUserId());
    assertTrue(actualUser.getAuths().isEmpty());
    assertTrue(actualUser.getRoles().isEmpty());
  }
}
