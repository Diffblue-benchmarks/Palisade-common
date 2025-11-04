package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.Context;
import uk.gov.gchq.palisade.rule.Rule;
import uk.gov.gchq.palisade.rule.Rules;
import uk.gov.gchq.palisade.user.User;

class RulesUtilDiffblueTest {
  /**
   * Method under test:
   * {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)}
   */
  @Test
  void testApplyRulesToStream() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();
    Rules<Serializable> rules = new Rules<>();
    AtomicLong recordsProcessed = new AtomicLong(1L);

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult = RulesUtil.applyRulesToStream(records, user, context, rules,
        recordsProcessed, new AtomicLong(1L));

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test:
   * {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)}
   */
  @Test
  void testApplyRulesToStream2() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();
    AtomicLong recordsProcessed = new AtomicLong(1L);

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult = RulesUtil.applyRulesToStream(records, user, context, null,
        recordsProcessed, new AtomicLong(1L));

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test:
   * {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)}
   */
  @Test
  void testApplyRulesToStream3() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();

    Rules<Serializable> rules = new Rules<>();
    rules.addRule("42", mock(Rule.class));
    AtomicLong recordsProcessed = new AtomicLong(1L);

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult = RulesUtil.applyRulesToStream(records, user, context, rules,
        recordsProcessed, new AtomicLong(1L));

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }
}
