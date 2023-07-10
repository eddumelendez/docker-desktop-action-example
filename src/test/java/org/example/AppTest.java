package org.example;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

	@Test
	void test() {
		try (GenericContainer<?> container = new GenericContainer<>("redis:7")
				.withExposedPorts(6379)) {
			container.start();
			assertThat(container.isRunning()).isTrue();
		}
	}

}
