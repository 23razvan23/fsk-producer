package com.github.fsk.producer.data

//todo extract model to separate artifact (and reused from consumer project)
class Flight(
		var origin: String = "",
		var destination: String = "",
		var operator: String = "") {

	override fun toString(): String {
		return "{\"origin\":\"$origin\", \"destination\":\"$destination\", \"operator\":\"$operator\"}"
	}
}
