package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class AbstractResourceDiffblueTest {
  /**
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), 1);
  }

  /**
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), null);
  }

  /**
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), "Different type to AbstractResource");
  }

  /**
   * Method under test: {@link AbstractResource#id(String)}
   */
  @Test
  void testId() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    DirectoryResource actualIdResult = directoryResource.id("42");

    // Assert
    assertTrue(actualIdResult instanceof DirectoryResource);
    assertEquals("42/", directoryResource.getId());
    assertEquals("42/", actualIdResult.getId());
    assertSame(directoryResource, actualIdResult);
  }

  /**
   * Method under test: {@link AbstractResource#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertNull((new DirectoryResource()).getId());
  }

  /**
   * Method under test: {@link AbstractResource#setId(String)}
   */
  @Test
  void testSetId() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    directoryResource.setId("42");

    // Assert
    assertEquals("42", directoryResource.getId());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractResource#equals(Object)}
   *   <li>{@link AbstractResource#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();
    directoryResource.setId("42");
    FileResource fileResource = mock(FileResource.class);
    when(fileResource.getId()).thenReturn("42");

    // Act and Assert
    assertEquals(directoryResource, fileResource);
    int notExpectedHashCodeResult = directoryResource.hashCode();
    assertNotEquals(notExpectedHashCodeResult, fileResource.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractResource#equals(Object)}
   *   <li>{@link AbstractResource#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act and Assert
    assertEquals(directoryResource, directoryResource);
    int expectedHashCodeResult = directoryResource.hashCode();
    assertEquals(expectedHashCodeResult, directoryResource.hashCode());
  }

  /**
   * Method under test: {@link AbstractResource#compareTo(Resource)}
   */
  @Test
  void testCompareTo() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();
    directoryResource.setId("42");

    DirectoryResource o = new DirectoryResource();
    o.setId("42");

    // Act and Assert
    assertEquals(0, directoryResource.compareTo(o));
  }
}
