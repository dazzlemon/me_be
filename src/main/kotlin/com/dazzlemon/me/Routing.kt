package com.dazzlemon.me

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/themes") {
            call.respond(
                ThemesResponse(
                    listOf(
                        Theme(
                            "black",
                            4278190080,
                            4280558628,
                            4278206322,
                            4294967295,
                        ),
                        Theme(
                            "dark",
                            4281874488,
                            4285821811,
                            4278216635,
                            4294967295,
                        ),
                        Theme(
                            "white",
                            4294967295,
                            4291282887,
                            4280391411,
                            4278190080,
                        ),
                        Theme(
                            "light",
                            4293984187,
                            4290624921,
                            4294163233,
                            4278190080,
                        ),
                    ),
                ),
            )
        }
    }
}




