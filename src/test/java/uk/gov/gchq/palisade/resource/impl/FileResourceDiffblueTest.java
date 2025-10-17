package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.ConnectionDetail;
import uk.gov.gchq.palisade.resource.ParentResource;

class FileResourceDiffblueTest {
  /**
   * Test new {@link FileResource} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link FileResource}
   */
  @Test
  @DisplayName("Test new FileResource (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileResource.<init>()"})
  void testNewFileResource() {
    // Arrange and Act
    FileResource actualFileResource = new FileResource();

    // Assert
    assertNull(actualFileResource.getSerialisedFormat());
    assertNull(actualFileResource.getType());
    assertNull(actualFileResource.getId());
    assertNull(actualFileResource.getConnectionDetail());
    Map<String, String> attributes = actualFileResource.getAttributes();
    assertTrue(attributes.isEmpty());
    assertSame(attributes, actualFileResource.getAttributesMap());
  }

  /**
   * Test {@link FileResource#id(String)}.
   *
   * <p>Method under test: {@link FileResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.id(String)"})
  void testId() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualIdResult = createFileResourceResult.id("42");

    // Assert
    assertEquals("42", createFileResourceResult.getId());
    assertSame(createFileResourceResult, actualIdResult);
  }

  /**
   * Test {@link FileResource#type(String)}.
   *
   * <p>Method under test: {@link FileResource#type(String)}
   */
  @Test
  @DisplayName("Test type(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.type(String)"})
  void testType() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualTypeResult = createFileResourceResult.type("Type");

    // Assert
    assertEquals("Type", createFileResourceResult.getType());
    assertSame(createFileResourceResult, actualTypeResult);
  }

  /**
   * Test {@link FileResource#serialisedFormat(String)}.
   *
   * <p>Method under test: {@link FileResource#serialisedFormat(String)}
   */
  @Test
  @DisplayName("Test serialisedFormat(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.serialisedFormat(String)"})
  void testSerialisedFormat() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualSerialisedFormatResult =
        createFileResourceResult.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", createFileResourceResult.getSerialisedFormat());
    assertSame(createFileResourceResult, actualSerialisedFormatResult);
  }

  /**
   * Test {@link FileResource#connectionDetail(ConnectionDetail)}.
   *
   * <ul>
   *   <li>Given createFileResource.
   *   <li>Then return createFileResource.
   * </ul>
   *
   * <p>Method under test: {@link FileResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName(
      "Test connectionDetail(ConnectionDetail); given createFileResource; then return createFileResource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.connectionDetail(ConnectionDetail)"})
  void testConnectionDetail_givenCreateFileResource_thenReturnCreateFileResource() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act
    FileResource actualConnectionDetailResult =
        createFileResourceResult.connectionDetail(connectionDetail);

    // Assert
    assertSame(createFileResourceResult, actualConnectionDetailResult);
    assertSame(connectionDetail, createFileResourceResult.getConnectionDetail());
  }

  /**
   * Test {@link FileResource#attributes(Map)}.
   *
   * <p>Method under test: {@link FileResource#attributes(Map)}
   */
  @Test
  @DisplayName("Test attributes(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.attributes(Map)"})
  void testAttributes() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualAttributesResult = createFileResourceResult.attributes(new HashMap<>());

    // Assert
    assertSame(createFileResourceResult, actualAttributesResult);
  }

  /**
   * Test {@link FileResource#attribute(String, String)}.
   *
   * <p>Method under test: {@link FileResource#attribute(String, String)}
   */
  @Test
  @DisplayName("Test attribute(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileResource FileResource.attribute(String, String)"})
  void testAttribute() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualAttributeResult = createFileResourceResult.attribute("Attribute Key", "42");

    // Assert
    assertSame(createFileResourceResult, actualAttributeResult);
  }

  /**
   * Test {@link FileResource#getParent()}.
   *
   * <ul>
   *   <li>Given createFileResource.
   *   <li>Then Parent return {@link DirectoryResource}.
   * </ul>
   *
   * <p>Method under test: {@link FileResource#getParent()}
   */
  @Test
  @DisplayName("Test getParent(); given createFileResource; then Parent return DirectoryResource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParentResource FileResource.getParent()"})
  void testGetParent_givenCreateFileResource_thenParentReturnDirectoryResource() {
    // Arrange and Act
    ParentResource actualParent = FileResourceFactory.createFileResource().getParent();

    // Assert
    ParentResource parent = ((DirectoryResource) actualParent).getParent();
    assertTrue(parent instanceof DirectoryResource);
    assertTrue(actualParent instanceof DirectoryResource);
    ParentResource parent2 = ((DirectoryResource) parent).getParent();
    assertTrue(parent2 instanceof SystemResource);
    assertEquals("file:/", parent2.getId());
    assertEquals("file:/test/", parent.getId());
    assertEquals("file:/test/directory/", actualParent.getId());
  }
}
