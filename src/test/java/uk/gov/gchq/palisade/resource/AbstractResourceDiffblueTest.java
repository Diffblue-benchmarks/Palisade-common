package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;
import uk.gov.gchq.palisade.resource.impl.DirectoryResourceFactory;
import uk.gov.gchq.palisade.resource.impl.FileResourceFactory;

class AbstractResourceDiffblueTest {
  /**
   * Test {@link AbstractResource#compareTo(Resource)} with {@code Resource}.
   *
   * <ul>
   *   <li>Given createDirectoryResource.
   *   <li>Then return minus eight.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#compareTo(Resource)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Resource) with 'Resource'; given createDirectoryResource; then return minus eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractResource.compareTo(Resource)"})
  void testCompareToWithResource_givenCreateDirectoryResource_thenReturnMinusEight() {
    // Arrange
    DirectoryResource createDirectoryResourceResult =
        DirectoryResourceFactory.createDirectoryResource();

    // Act and Assert
    assertEquals(
        -8, createDirectoryResourceResult.compareTo(FileResourceFactory.createFileResource()));
  }
}
