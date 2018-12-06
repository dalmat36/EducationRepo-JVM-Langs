  //Call API using Scalaj-http lib
  def callSmnEndPoint(token: String, url: String): HttpResponse[String] = {
    val headers = Seq(("Content-Type", "application/json"), ("Accept", "application/json"), ("Authorization", "JWT " + token))
    val response: HttpResponse[String] = Http(url)
      .option(HttpOptions.allowUnsafeSSL)
      .headers(headers).asString
    log.trace("Received API response. Code: " + response.code)
    response
  }