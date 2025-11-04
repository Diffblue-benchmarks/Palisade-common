package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.net.URI;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class FileResourceBuilderDiffblueTest {
  /**
   * Test {@link FileResourceBuilder#build(URI)}.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FileResourceBuilder#build(URI)}
   *   <li>default or parameterless constructor of {@link FileResourceBuilder}
   * </ul>
   */
  @Test
  @DisplayName("Test build(URI)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileResourceBuilder.<init>()",
      "uk.gov.gchq.palisade.resource.Resource FileResourceBuilder.build(URI)"})
  void testBuild() {
    // Arrange, Act and Assert
    assertTrue((new FileResourceBuilder())
        .build(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()) instanceof FileResource);
  }

  /**
   * Test {@link FileResourceBuilder#accepts(URI)}.
   * <p>
   * Method under test: {@link FileResourceBuilder#accepts(URI)}
   */
  @Test
  @DisplayName("Test accepts(URI)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FileResourceBuilder.accepts(URI)"})
  void testAccepts() {
    // Arrange, Act and Assert
    assertTrue(
        (new FileResourceBuilder()).accepts(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }
}
