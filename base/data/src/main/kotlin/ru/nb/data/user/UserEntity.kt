package ru.nb.data.user

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Suppress("JpaDataSourceORMInspection")
@Entity
@Table(name = "user_data", schema = "test", catalog = "test")
class UserEntity(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long? = null,

	var name: String = "",

	) : Serializable {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other == null || javaClass != other.javaClass) return false
		val user = other as UserEntity
		return id == user.id
	}

	override fun hashCode(): Int {
		return Objects.hash(name, id)
	}

	override fun toString(): String {
		return "\nUser: {$id: $name}"
	}

}