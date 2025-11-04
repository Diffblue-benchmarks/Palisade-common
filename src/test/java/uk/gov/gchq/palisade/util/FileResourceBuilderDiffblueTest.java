package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.net.URI;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class FileResourceBuilderDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FileResourceBuilder#build(URI)}
   *   <li>default or parameterless constructor of {@link FileResourceBuilder}
   * </ul>
   */
  @Test
  void testBuild() {
    // Arrange, Act and Assert
    assertTrue((new FileResourceBuilder())
        .build(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()) instanceof FileResource);
  }

  /**
   * Method under test: {@link FileResourceBuilder#accepts(URI)}
   */
  @Test
  void testAccepts() {
    // Arrange, Act and Assert
    assertTrue(
        (new FileResourceBuilder()).accepts(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()));
  }
}
