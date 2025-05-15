package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.ConnectionDetail;

class FileResourceDiffblueTest {
  /**
   * Test new {@link FileResource} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link FileResource}
   */
  @Test
  @DisplayName("Test new FileResource (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileResource.<init>()"})
  void testNewFileResource() {
    // Arrange and Act
    FileResource actualFileResource = new FileResource();

    // Assert
    assertNull(actualFileResource.getSerialisedFormat());
    assertNull(actualFileResource.getType());
    assertNull(actualFileResource.getId());
    assertNull(actualFileResource.getConnectionDetail());
    assertTrue(actualFileResource.getAttributes().isEmpty());
  }

  /**
   * Test {@link FileResource#id(String)}.
   * <p>
   * Method under test: {@link FileResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.id(String)"})
  void testId() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    FileResource actualIdResult = fileResource.id("42");

    // Assert
    assertEquals("42", fileResource.getId());
    assertSame(fileResource, actualIdResult);
  }

  /**
   * Test {@link FileResource#type(String)}.
   * <p>
   * Method under test: {@link FileResource#type(String)}
   */
  @Test
  @DisplayName("Test type(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.type(String)"})
  void testType() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    FileResource actualTypeResult = fileResource.type("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
    assertSame(fileResource, actualTypeResult);
  }

  /**
   * Test {@link FileResource#serialisedFormat(String)}.
   * <p>
   * Method under test: {@link FileResource#serialisedFormat(String)}
   */
  @Test
  @DisplayName("Test serialisedFormat(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.serialisedFormat(String)"})
  void testSerialisedFormat() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    FileResource actualSerialisedFormatResult = fileResource.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
    assertSame(fileResource, actualSerialisedFormatResult);
  }

  /**
   * Test {@link FileResource#connectionDetail(ConnectionDetail)}.
   * <ul>
   *   <li>Given {@link FileResource} (default constructor).</li>
   *   <li>Then return {@link FileResource} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link FileResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName("Test connectionDetail(ConnectionDetail); given FileResource (default constructor); then return FileResource (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.connectionDetail(ConnectionDetail)"})
  void testConnectionDetail_givenFileResource_thenReturnFileResource() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act and Assert
    assertSame(fileResource, fileResource.connectionDetail(connectionDetail));
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Test {@link FileResource#attributes(Map)}.
   * <p>
   * Method under test: {@link FileResource#attributes(Map)}
   */
  @Test
  @DisplayName("Test attributes(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.attributes(Map)"})
  void testAttributes() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Test {@link FileResource#attribute(String, String)}.
   * <p>
   * Method under test: {@link FileResource#attribute(String, String)}
   */
  @Test
  @DisplayName("Test attribute(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FileResource FileResource.attribute(String, String)"})
  void testAttribute() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }
}
