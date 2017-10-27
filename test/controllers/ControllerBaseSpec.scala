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

package controllers

import mocks.MockAppConfig
import org.scalamock.scalatest.MockFactory
import play.api.i18n.MessagesApi
import play.api.inject.Injector
import services.AuthService
import uk.gov.hmrc.auth.core.AuthConnector
import uk.gov.hmrc.play.test.{UnitSpec, WithFakeApplication}

trait ControllerBaseSpec extends UnitSpec with WithFakeApplication with MockFactory {

  val injector: Injector = fakeApplication.injector
  val messages: MessagesApi = injector.instanceOf[MessagesApi]
  implicit val mockAppConfig: MockAppConfig = new MockAppConfig
  val mockAuthConnector: AuthConnector = mock[AuthConnector]
  val mockAuthService: AuthService = new AuthService(mockAuthConnector)
}