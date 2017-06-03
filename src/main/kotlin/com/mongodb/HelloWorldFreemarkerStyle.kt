package com.mongodb

import freemarker.template.Configuration
import java.io.StringWriter

class HelloWorldFreemarkerStyle {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val configuration: Configuration = Configuration()
            configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.javaClass, "/")

            try {
                val writer = StringWriter()
                val template = configuration.getTemplate("hello.ftl")
                val params = mapOf(Pair("name", "Freemarker"))

                template.process(params, writer)

                println(writer)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
