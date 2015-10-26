package javaone;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationPropertiesTest {

	@Test
	public void testsThatAppVersionIsReadFromFile() {
		ApplicationProperties appProperties = ApplicationProperties.forApp("testapp");
		Assert.assertEquals("1.2.3", appProperties.getVersion());
	}
}