/*
 * Copyright 2017 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package stubs

import com.github.tomakehurst.wiremock.stubbing.StubMapping
import helpers.WireMockMethods
import play.api.http.Status._

object BtaHeaderPartialStub extends WireMockMethods {

  private val btaPartialUri: String = "/business-account/partial/service-info"

  def successfulContent: StubMapping = {
    when(method = GET, uri = btaPartialUri).thenReturn(status = OK, body = partialContent)
  }

  def badRequest: StubMapping = {
    when(method = GET, uri = btaPartialUri).thenReturn(status = BAD_REQUEST)
  }

  def gatewayTimeout: StubMapping = {
    when(method = GET, uri = btaPartialUri).thenReturn(status = GATEWAY_TIMEOUT)
  }

  private val partialContent = "<div>example</div>"
}