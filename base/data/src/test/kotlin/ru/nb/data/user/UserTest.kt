package ru.nb.data.user

import jakarta.transaction.Transactional
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.nb.data.TestBeans

@SpringBootTest(classes = [TestBeans::class])
class UserTest(
	@Autowired private val userRepository: UserRepository
) {

	@Test
	@Transactional
	fun mainUserTest() {
		val user1 = UserEntity(name = "user 1")
		userRepository.save(user1)
		val user2 = UserEntity(name = "user 2")
		userRepository.save(user2)

		val users = userRepository.findAll()
		println(users)

		assertEquals(2, users.size)
	}

}