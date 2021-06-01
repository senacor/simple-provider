package com.senacor.ci.simpleprovider

@OpenAPIDefinition(
    info = Info(
        title = "Order API",
        version = "v2",
        description = "This app provides REST APIs for order entities",
        contact = Contact(name = "Raymond", email = "admin@orderapi.com", url = "http://orderapi.com/support")
    ),
) ,
servers = {
    @Server(url = "<dev url>", description = "DEV Server"),
    @Server(url = "<prod url>", description = "PROD Server")
}
)
class OpenApiConfig {
}