package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.util.UriBuilder.AuthorityBuilder;

class UriBuilderDiffblueTest {
  /**
   * Test AuthorityBuilder {@link AuthorityBuilder#getBaseUri()}.
   *
   * <p>Method under test: {@link AuthorityBuilder#getBaseUri()}
   */
  @Test
  @DisplayName("Test AuthorityBuilder getBaseUri()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional AuthorityBuilder.getBaseUri()"})
  void testAuthorityBuilderGetBaseUri() {
    // Arrange, Act and Assert
    assertFalse(new AuthorityBuilder().getBaseUri().isPresent());
  }

  /**
   * Test AuthorityBuilder new {@link AuthorityBuilder} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link AuthorityBuilder}
   */
  @Test
  @DisplayName("Test AuthorityBuilder new AuthorityBuilder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthorityBuilder.<init>()"})
  void testAuthorityBuilderNewAuthorityBuilder() {
    // Arrange, Act and Assert
    assertFalse(new AuthorityBuilder().getBaseUri().isPresent());
  }

  /**
   * Test {@link UriBuilder#getBaseUri()}.
   *
   * <p>Method under test: {@link UriBuilder#getBaseUri()}
   */
  @Test
  @DisplayName("Test getBaseUri()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional UriBuilder.getBaseUri()"})
  void testGetBaseUri() {
    // Arrange, Act and Assert
    assertFalse(new UriBuilder().getBaseUri().isPresent());
  }

  /**
   * Test new {@link UriBuilder} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link UriBuilder}
   */
  @Test
  @DisplayName("Test new UriBuilder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UriBuilder.<init>()"})
  void testNewUriBuilder() {
    // Arrange, Act and Assert
    assertFalse(new UriBuilder().getBaseUri().isPresent());
  }
}
