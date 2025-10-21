package uk.gov.gchq.palisade.data.serialise;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SerialiserDiffblueTest {
  /**
   * Test {@link Serialiser#create(Class, Class)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Serialiser#create(Class, Class)}
   */
  @Test
  @DisplayName("Test create(Class, Class); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Serialiser Serialiser.create(Class, Class)"})
  void testCreate_thenThrowIllegalArgumentException() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;
    Class<Object> domainClass = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Serialiser.create((Class<Serialiser<?>>) (Class) forNameResult, domainClass));
  }

  /**
   * Test {@link Serialiser#tryCreate(Class, String)}.
   *
   * <ul>
   *   <li>When {@code "Serialiser"}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Serialiser#tryCreate(Class, String)}
   */
  @Test
  @DisplayName(
      "Test tryCreate(Class, String); when '\"uk.gov.gchq.palisade.data.serialise.Serialiser\"'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Serialiser.tryCreate(Class, String)"})
  void testTryCreate_whenUkGovGchqPalisadeDataSerialiseSerialiser_thenReturnNotPresent() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;

    // Act
    Optional<Serialiser<Object>> actualTryCreateResult =
        Serialiser.tryCreate(
            (Class<Serialiser<?>>) (Class) forNameResult,
            "\"uk.gov.gchq.palisade.data.serialise.Serialiser\"");

    // Assert
    assertFalse(actualTryCreateResult.isPresent());
  }

  /**
   * Test {@link Serialiser#tryCreate(Class, String)}.
   *
   * <ul>
   *   <li>When {@code Serialiser}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Serialiser#tryCreate(Class, String)}
   */
  @Test
  @DisplayName(
      "Test tryCreate(Class, String); when 'uk.gov.gchq.palisade.data.serialise.Serialiser'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Serialiser.tryCreate(Class, String)"})
  void testTryCreate_whenUkGovGchqPalisadeDataSerialiseSerialiser_thenReturnNotPresent2() {
    // Arrange
    Class<Serialiser> forNameResult = Serialiser.class;

    // Act
    Optional<Serialiser<Object>> actualTryCreateResult =
        Serialiser.tryCreate((Class<Serialiser<?>>) (Class) forNameResult, "java.io.InputStream");

    // Assert
    assertFalse(actualTryCreateResult.isPresent());
  }
}
