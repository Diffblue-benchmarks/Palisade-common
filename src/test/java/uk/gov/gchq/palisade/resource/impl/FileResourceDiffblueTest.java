package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.ConnectionDetail;

class FileResourceDiffblueTest {
  /**
   * Method under test: {@link FileResource#id(String)}
   */
  @Test
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
   * Method under test: {@link FileResource#id(String)}
   */
  @Test
  void testId2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    FileResource actualIdResult = fileResource.id("42");

    // Assert
    assertEquals("42", fileResource.getId());
    assertSame(fileResource, actualIdResult);
  }

  /**
   * Method under test: {@link FileResource#type(String)}
   */
  @Test
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
   * Method under test: {@link FileResource#type(String)}
   */
  @Test
  void testType2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    FileResource actualTypeResult = fileResource.type("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
    assertSame(fileResource, actualTypeResult);
  }

  /**
   * Method under test: {@link FileResource#serialisedFormat(String)}
   */
  @Test
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
   * Method under test: {@link FileResource#serialisedFormat(String)}
   */
  @Test
  void testSerialisedFormat2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    FileResource actualSerialisedFormatResult = fileResource.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
    assertSame(fileResource, actualSerialisedFormatResult);
  }

  /**
   * Method under test: {@link FileResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  void testConnectionDetail() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act and Assert
    assertSame(fileResource, fileResource.connectionDetail(connectionDetail));
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Method under test: {@link FileResource#attributes(Map)}
   */
  @Test
  void testAttributes() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Method under test: {@link FileResource#attributes(Map)}
   */
  @Test
  void testAttributes2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Method under test: {@link FileResource#attribute(String, String)}
   */
  @Test
  void testAttribute() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }

  /**
   * Method under test: {@link FileResource#attribute(String, String)}
   */
  @Test
  void testAttribute2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link FileResource}
   */
  @Test
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
}
