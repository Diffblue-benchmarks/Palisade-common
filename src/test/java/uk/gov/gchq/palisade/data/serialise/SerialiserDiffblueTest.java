package uk.gov.gchq.palisade.data.serialise;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class SerialiserDiffblueTest {
  /**
   * Method under test: {@link Serialiser#create(Class, Class)}
   */
  @Test
  void testCreate() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;
    Class<Object> domainClass = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> Serialiser.create((Class<Serialiser<?>>) (Class) forNameResult, domainClass));
  }

  /**
   * Method under test: {@link Serialiser#tryCreate(Class, String)}
   */
  @Test
  void testTryCreate() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;

    // Act
    Optional<Serialiser<Object>> actualTryCreateResult = Serialiser
        .tryCreate((Class<Serialiser<?>>) (Class) forNameResult, "Domain Class Name");

    // Assert
    assertFalse(actualTryCreateResult.isPresent());
  }

  /**
   * Method under test: {@link Serialiser#tryCreate(Class, String)}
   */
  @Test
  void testTryCreate2() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;

    // Act
    Optional<Serialiser<Object>> actualTryCreateResult = Serialiser
        .tryCreate((Class<Serialiser<?>>) (Class) forNameResult, "java.io.InputStream");

    // Assert
    assertFalse(actualTryCreateResult.isPresent());
  }
}
