package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class DirectoryResourceDiffblueTest {
  /**
   * Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  void testId() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    DirectoryResource actualIdResult = directoryResource.id("42");

    // Assert
    assertEquals("42/", directoryResource.getId());
    assertEquals("42/", actualIdResult.getId());
    assertSame(directoryResource, actualIdResult);
  }

  /**
   * Method under test: {@link DirectoryResource#id(String)}
   */
  @Test
  void testId2() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    DirectoryResource actualIdResult = directoryResource.id("/");

    // Assert
    assertEquals("/", directoryResource.getId());
    assertEquals("/", actualIdResult.getId());
    assertSame(directoryResource, actualIdResult);
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link DirectoryResource}
   */
  @Test
  void testNewDirectoryResource() {
    // Arrange, Act and Assert
    assertNull((new DirectoryResource()).getId());
  }
}
