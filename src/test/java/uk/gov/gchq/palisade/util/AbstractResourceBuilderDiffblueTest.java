package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractResourceBuilderDiffblueTest {
  /**
   * Test {@link AbstractResourceBuilder#loader()}.
   *
   * <p>Method under test: {@link AbstractResourceBuilder#loader()}
   */
  @Test
  @DisplayName("Test loader()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceLoader AbstractResourceBuilder.loader()"})
  void testLoader() {
    // Arrange and Act
    ServiceLoader<AbstractResourceBuilder> actualLoaderResult = AbstractResourceBuilder.loader();

    // Assert
    assertEquals(-1L, actualLoaderResult.spliterator().getExactSizeIfKnown());
  }

  /**
   * Test {@link AbstractResourceBuilder#create(String)} with {@code uriString}.
   *
   * <ul>
   *   <li>When {@code Uri String}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResourceBuilder#create(String)}
   */
  @Test
  @DisplayName(
      "Test create(String) with 'uriString'; when 'Uri String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "uk.gov.gchq.palisade.resource.Resource AbstractResourceBuilder.create(String)"
  })
  void testCreateWithUriString_whenUriString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> AbstractResourceBuilder.create("Uri String"));
  }

  /**
   * Test {@link AbstractResourceBuilder#createFile(String)}.
   *
   * <p>Method under test: {@link AbstractResourceBuilder#createFile(String)}
   */
  @Test
  @DisplayName("Test createFile(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File AbstractResourceBuilder.createFile(String)"})
  void testCreateFile() {
    // Arrange and Act
    File actualCreateFileResult = new FileResourceBuilder().createFile("Path");

    // Assert
    assertEquals("Path", actualCreateFileResult.getName());
    assertFalse(actualCreateFileResult.isAbsolute());
  }

  /**
   * Test {@link AbstractResourceBuilder#getCanonicalPath(File)}.
   *
   * <p>Method under test: {@link AbstractResourceBuilder#getCanonicalPath(File)}
   */
  @Test
  @DisplayName("Test getCanonicalPath(File)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AbstractResourceBuilder.getCanonicalPath(File)"})
  void testGetCanonicalPath() throws IOException {
    // Arrange and Act
    String actualCanonicalPath =
        new FileResourceBuilder()
            .getCanonicalPath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Assert
    assertEquals(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(),
        actualCanonicalPath);
  }

  /**
   * Test {@link AbstractResourceBuilder#getAbsolutePath(File)}.
   *
   * <p>Method under test: {@link AbstractResourceBuilder#getAbsolutePath(File)}
   */
  @Test
  @DisplayName("Test getAbsolutePath(File)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AbstractResourceBuilder.getAbsolutePath(File)"})
  void testGetAbsolutePath() {
    // Arrange and Act
    String actualAbsolutePath =
        new FileResourceBuilder()
            .getAbsolutePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Assert
    assertEquals(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), actualAbsolutePath);
  }

  /**
   * Test {@link AbstractResourceBuilder#isDirectory(File)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is empty string toFile.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResourceBuilder#isDirectory(File)}
   */
  @Test
  @DisplayName(
      "Test isDirectory(File); when Property is 'java.io.tmpdir' is empty string toFile; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResourceBuilder.isDirectory(File)"})
  void testIsDirectory_whenPropertyIsJavaIoTmpdirIsEmptyStringToFile_thenReturnTrue() {
    // Arrange and Act
    boolean actualIsDirectoryResult =
        new FileResourceBuilder()
            .isDirectory(Paths.get(System.getProperty("java.io.tmpdir"), "").toFile());

    // Assert
    assertTrue(actualIsDirectoryResult);
  }

  /**
   * Test {@link AbstractResourceBuilder#isDirectory(File)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt} toFile.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractResourceBuilder#isDirectory(File)}
   */
  @Test
  @DisplayName(
      "Test isDirectory(File); when Property is 'java.io.tmpdir' is 'test.txt' toFile; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractResourceBuilder.isDirectory(File)"})
  void testIsDirectory_whenPropertyIsJavaIoTmpdirIsTestTxtToFile_thenReturnFalse() {
    // Arrange and Act
    boolean actualIsDirectoryResult =
        new FileResourceBuilder()
            .isDirectory(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Assert
    assertFalse(actualIsDirectoryResult);
  }

  /**
   * Test {@link AbstractResourceBuilder#findBuilder(URI)}.
   *
   * <p>Method under test: {@link AbstractResourceBuilder#findBuilder(URI)}
   */
  @Test
  @DisplayName("Test findBuilder(URI)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractResourceBuilder AbstractResourceBuilder.findBuilder(URI)"})
  void testFindBuilder() {
    // Arrange and Act
    AbstractResourceBuilder actualFindBuilderResult =
        AbstractResourceBuilder.findBuilder(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    // Assert
    assertTrue(actualFindBuilderResult instanceof FileResourceBuilder);
    File createFileResult = actualFindBuilderResult.createFile("Path");
    assertEquals("Path", createFileResult.getName());
    assertFalse(createFileResult.isAbsolute());
  }
}
