package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;

class AbstractResourceDiffblueTest {
  /**
   * Test {@link AbstractResource#compareTo(Resource)} with {@code Resource}.
   *
   * <ul>
   *   <li>Given {@link DirectoryResource} (default constructor) Id is {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#compareTo(Resource)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Resource) with 'Resource'; given DirectoryResource (default constructor) Id is '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractResource.compareTo(Resource)"})
  void testCompareToWithResource_givenDirectoryResourceIdIs42_thenReturnZero() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();
    directoryResource.setId("42");

    DirectoryResource o = new DirectoryResource();
    o.setId("42");

    // Act and Assert
    assertEquals(0, directoryResource.compareTo(o));
  }
}
