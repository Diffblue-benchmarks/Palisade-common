package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;
import uk.gov.gchq.palisade.resource.impl.DirectoryResourceFactory;
import uk.gov.gchq.palisade.resource.impl.FileResource;
import uk.gov.gchq.palisade.resource.impl.FileResourceFactory;

class AbstractResourceDiffblueTest {
  /**
   * Test {@link AbstractResource#id(String)}.
   *
   * <p>Method under test: {@link AbstractResource#id(String)}
   */
  @Test
  @DisplayName("Test id(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractResource AbstractResource.id(String)"})
  void testId() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualIdResult =
        createFileResourceResult.id("\"resource-1234-abc-5678-def-91011-ghi\"");

    // Assert
    assertEquals("\"resource-1234-abc-5678-def-91011-ghi\"", createFileResourceResult.getId());
    assertSame(createFileResourceResult, actualIdResult);
  }

  /**
   * Test {@link AbstractResource#getId()}.
   *
   * <p>Method under test: {@link AbstractResource#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AbstractResource.getId()"})
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals(
        "file:///test/directory/", DirectoryResourceFactory.createDirectoryResource().getId());
  }

  /**
   * Test {@link AbstractResource#setId(String)}.
   *
   * <ul>
   *   <li>Then createDirectoryResource Id is {@code "resource-1234567890-abcdefg"}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#setId(String)}
   */
  @Test
  @DisplayName(
      "Test setId(String); then createDirectoryResource Id is '\"resource-1234567890-abcdefg\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractResource.setId(String)"})
  void testSetId_thenCreateDirectoryResourceIdIsResource1234567890Abcdefg() {
    // Arrange
    DirectoryResource createDirectoryResourceResult =
        DirectoryResourceFactory.createDirectoryResource();

    // Act
    createDirectoryResourceResult.setId("\"resource-1234567890-abcdefg\"");

    // Assert
    assertEquals("\"resource-1234567890-abcdefg\"", createDirectoryResourceResult.getId());
  }

  /**
   * Test {@link AbstractResource#equals(Object)}, and {@link AbstractResource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    FileResource createFileResourceResult2 = FileResourceFactory.createFileResource();

    // Act and Assert
    assertEquals(createFileResourceResult, createFileResourceResult2);
    assertEquals(createFileResourceResult.hashCode(), createFileResourceResult2.hashCode());
  }

  /**
   * Test {@link AbstractResource#equals(Object)}, and {@link AbstractResource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act and Assert
    assertEquals(createFileResourceResult, createFileResourceResult);
    int expectedHashCodeResult = createFileResourceResult.hashCode();
    assertEquals(expectedHashCodeResult, createFileResourceResult.hashCode());
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    FileResource fileResource = mock(FileResource.class);
    when(fileResource.getId()).thenReturn("\"resource-1234567890\"");

    // Act and Assert
    assertNotEquals(createFileResourceResult, fileResource);
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FileResourceFactory.createFileResource(), null);
  }

  /**
   * Test {@link AbstractResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResource.equals(Object)", "int AbstractResource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FileResourceFactory.createFileResource(), "Different type to AbstractResource");
  }

  /**
   * Test {@link AbstractResource#compareTo(Resource)} with {@code Resource}.
   *
   * <ul>
   *   <li>Given createDirectoryResource.
   *   <li>Then return minus twelve.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResource#compareTo(Resource)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Resource) with 'Resource'; given createDirectoryResource; then return minus twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractResource.compareTo(Resource)"})
  void testCompareToWithResource_givenCreateDirectoryResource_thenReturnMinusTwelve() {
    // Arrange
    DirectoryResource createDirectoryResourceResult =
        DirectoryResourceFactory.createDirectoryResource();

    // Act and Assert
    assertEquals(
        -12, createDirectoryResourceResult.compareTo(FileResourceFactory.createFileResource()));
  }
}
