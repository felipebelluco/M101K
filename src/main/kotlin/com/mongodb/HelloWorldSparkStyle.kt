package com.mongodb

import spark.kotlin.*

fun main(args: Array<String>) {
    val http: Http = ignite()

    http.get("/") {
        "Hello World from Spark"
    }

}
