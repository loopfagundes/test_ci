package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testcases.GoogleTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	GoogleTestCase.class,
	GoogleTestCase.class
	})
public class AllTests {

}
