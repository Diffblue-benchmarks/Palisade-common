package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DirectoryResourceDiffblueTest {
  /**
   * Test new {@link DirectoryResource} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link DirectoryResource}
   */
  @Test
  @DisplayName("Test new DirectoryResource (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DirectoryResource.<init>()"})
  void testNewDirectoryResource() {
    // Arrange, Act and Assert
    assertNull(new DirectoryResource().getId());
  }

  /**
   * Test {@link DirectoryResource#id(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then {@link DirectoryResource} (default constructor) Id is {@code 42/}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  @DisplayName(
      "Test id(String); when '42'; then DirectoryResource (default constructor) Id is '42/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DirectoryResource DirectoryResource.id(String)"})
  void testId_when42_thenDirectoryResourceIdIs42() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    DirectoryResource actualIdResult = directoryResource.id("42");

    // Assert
    assertEquals("42/", directoryResource.getId());
    assertSame(directoryResource, actualIdResult);
  }

  /**
   * Test {@link DirectoryResource#id(String)}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then {@link DirectoryResource} (default constructor) Id is {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String); when '/'; then DirectoryResource (default constructor) Id is '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DirectoryResource DirectoryResource.id(String)"})
  void testId_whenSlash_thenDirectoryResourceIdIsSlash() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    DirectoryResource actualIdResult = directoryResource.id("/");

    // Assert
    assertEquals("/", directoryResource.getId());
    assertSame(directoryResource, actualIdResult);
  }
}
