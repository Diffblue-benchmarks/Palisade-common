package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SystemResourceDiffblueTest {
  /**
   * Test new {@link SystemResource} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link SystemResource}
   */
  @Test
  @DisplayName("Test new SystemResource (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SystemResource.<init>()"})
  void testNewSystemResource() {
    // Arrange, Act and Assert
    assertNull(new SystemResource().getId());
  }

  /**
   * Test {@link SystemResource#id(String)}.
   *
   * <ul>
   *   <li>Then {@link SystemResource} (default constructor) Id is {@code
   *       "file:/usr/local/palisade/data/resource1.txt"/}.
   * </ul>
   *
   * <p>Method under test: {@link SystemResource#id(String)}
   */
  @Test
  @DisplayName(
      "Test id(String); then SystemResource (default constructor) Id is '\"file:/usr/local/palisade/data/resource1.txt\"/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SystemResource SystemResource.id(String)"})
  void testId_thenSystemResourceIdIsFileUsrLocalPalisadeDataResource1Txt() {
    // Arrange
    SystemResource systemResource = new SystemResource();

    // Act
    SystemResource actualIdResult =
        systemResource.id("\"file:/usr/local/palisade/data/resource1.txt\"");

    // Assert
    assertEquals("\"file:/usr/local/palisade/data/resource1.txt\"/", systemResource.getId());
    assertSame(systemResource, actualIdResult);
  }

  /**
   * Test {@link SystemResource#id(String)}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then {@link SystemResource} (default constructor) Id is {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link SystemResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String); when '/'; then SystemResource (default constructor) Id is '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SystemResource SystemResource.id(String)"})
  void testId_whenSlash_thenSystemResourceIdIsSlash() {
    // Arrange
    SystemResource systemResource = new SystemResource();

    // Act
    SystemResource actualIdResult = systemResource.id("/");

    // Assert
    assertEquals("/", systemResource.getId());
    assertSame(systemResource, actualIdResult);
  }
}
