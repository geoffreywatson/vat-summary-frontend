/*
 * Copyright 2018 HM Revenue & Customs
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

package models.payments

import play.api.libs.json.{Format, Json}

case class PaymentDetailsModel(taxType: String,
                               taxReference: String,
                               amountInPence: Long,
                               taxPeriodMonth: String,
                               taxPeriodYear: String,
                               returnUrl: String)

object PaymentDetailsModel {
  implicit val format: Format[PaymentDetailsModel] = Json.format[PaymentDetailsModel]
}

case class PaymentDetailsErrorModel(code: Int, message: String)

object PaymentDetailsErrorModel {
  implicit val format: Format[PaymentDetailsErrorModel] = Json.format[PaymentDetailsErrorModel]
}