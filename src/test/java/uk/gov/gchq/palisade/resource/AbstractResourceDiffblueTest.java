package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class AbstractResourceDiffblueTest {
  /**
   * Test {@link AbstractResource#id(String)}.
   * <p>
   * Method under test: {@link AbstractResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractResource AbstractResource.id(String)"})
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
   * Test {@link AbstractResource#getId()}.
   * <p>
   * Method under test: {@link AbstractResource#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String AbstractResource.getId()"})
  void testGetId() {
    // Arrange, Act and Assert
    assertNull((new DirectoryResource()).getId());
  }

  /**
   * Test {@link AbstractResource#setId(String)}.
   * <p>
   * Method under test: {@link AbstractResource#setId(String)}
   */
  @Test
  @DisplayName("Test setId(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractResource.setId(String)"})
  void testSetId() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act
    directoryResource.setId("42");

    // Assert
    assertEquals("42", directoryResource.getId());
  }

  /**
   * Test {@link AbstractResource#equals(Object)}, and {@link AbstractResource#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractResource#equals(Object)}
   *   <li>{@link AbstractResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
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
   * Test {@link AbstractResource#equals(Object)}, and {@link AbstractResource#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractResource#equals(Object)}
   *   <li>{@link AbstractResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DirectoryResource directoryResource = new DirectoryResource();

    // Act and Assert
    assertEquals(directoryResource, directoryResource);
    int expectedHashCodeResult = directoryResource.hashCode();
    assertEquals(expectedHashCodeResult, directoryResource.hashCode());
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), 1);
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), null);
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DirectoryResource(), "Different type to AbstractResource");
  }

  /**
   * Test {@link AbstractResource#compareTo(Resource)} with {@code Resource}.
   * <ul>
   *   <li>Given {@link DirectoryResource} (default constructor) Id is {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractResource#compareTo(Resource)}
   */
  @Test
  @DisplayName("Test compareTo(Resource) with 'Resource'; given DirectoryResource (default constructor) Id is '42'; then return zero")
  @Tag("MaintainedByDiffblue")
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
