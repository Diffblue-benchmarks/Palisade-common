package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class SystemResourceDiffblueTest {
  /**
   * Method under test: {@link SystemResource#id(String)}
   */
  @Test
  void testId() {
    // Arrange
    SystemResource systemResource = new SystemResource();

    // Act
    SystemResource actualIdResult = systemResource.id("42");

    // Assert
    assertEquals("42/", systemResource.getId());
    assertEquals("42/", actualIdResult.getId());
    assertSame(systemResource, actualIdResult);
  }

  /**
   * Method under test: {@link SystemResource#id(String)}
   */
  @Test
  void testId2() {
    // Arrange
    SystemResource systemResource = new SystemResource();

    // Act
    SystemResource actualIdResult = systemResource.id("/");

    // Assert
    assertEquals("/", systemResource.getId());
    assertEquals("/", actualIdResult.getId());
    assertSame(systemResource, actualIdResult);
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link SystemResource}
   */
  @Test
  void testNewSystemResource() {
    // Arrange, Act and Assert
    assertNull((new SystemResource()).getId());
  }
}
