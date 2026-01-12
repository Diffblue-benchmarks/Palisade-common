package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.ParentResource;

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
   * Test {@link DirectoryResource#getParent()}.
   *
   * <ul>
   *   <li>Given createDirectoryResource.
   *   <li>Then return {@link DirectoryResource}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryResource#getParent()}
   */
  @Test
  @DisplayName("Test getParent(); given createDirectoryResource; then return DirectoryResource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParentResource DirectoryResource.getParent()"})
  void testGetParent_givenCreateDirectoryResource_thenReturnDirectoryResource() {
    // Arrange and Act
    ParentResource actualParent = DirectoryResourceFactory.createDirectoryResource().getParent();

    // Assert
    assertTrue(actualParent instanceof DirectoryResource);
    assertEquals("file:/test/", actualParent.getId());
  }

  /**
   * Test {@link DirectoryResource#id(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then createDirectoryResource Id is {@code 42/}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String); when '42'; then createDirectoryResource Id is '42/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DirectoryResource DirectoryResource.id(String)"})
  void testId_when42_thenCreateDirectoryResourceIdIs42() {
    // Arrange
    DirectoryResource createDirectoryResourceResult =
        DirectoryResourceFactory.createDirectoryResource();

    // Act
    DirectoryResource actualIdResult = createDirectoryResourceResult.id("42");

    // Assert
    assertEquals("42/", createDirectoryResourceResult.getId());
    assertSame(createDirectoryResourceResult, actualIdResult);
  }

  /**
   * Test {@link DirectoryResource#id(String)}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then createDirectoryResource Id is {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String); when '/'; then createDirectoryResource Id is '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DirectoryResource DirectoryResource.id(String)"})
  void testId_whenSlash_thenCreateDirectoryResourceIdIsSlash() {
    // Arrange
    DirectoryResource createDirectoryResourceResult =
        DirectoryResourceFactory.createDirectoryResource();

    // Act
    DirectoryResource actualIdResult = createDirectoryResourceResult.id("/");

    // Assert
    assertEquals("/", createDirectoryResourceResult.getId());
    assertSame(createDirectoryResourceResult, actualIdResult);
  }
}
