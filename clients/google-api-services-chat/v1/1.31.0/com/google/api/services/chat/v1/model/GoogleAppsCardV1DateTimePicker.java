/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chat.v1.model;

/**
 * The widget that lets users to specify a date and time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1DateTimePicker extends com.google.api.client.json.GenericJson {

  /**
   * The label for the field that displays to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The name of the text input that's used in formInput, and uniquely identifies this input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Triggered when the user clicks Save or Clear from the date/time picker dialog. This is only
   * triggered if the value changed as a result of the Save/Clear operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1Action onChangeAction;

  /**
   * The number representing the time zone offset from UTC, in minutes. If set, the `value_ms_epoch`
   * is displayed in the specified time zone. If not set, it uses the user's time zone setting on
   * the client side.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timezoneOffsetDate;

  /**
   * The type of the date/time picker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value to display as the default value before user input or previous user input. It is
   * represented in milliseconds (Epoch time). For `DATE_AND_TIME` type, the full epoch value is
   * used. For `DATE_ONLY` type, only date of the epoch time is used. For `TIME_ONLY` type, only
   * time of the epoch time is used. For example, you can set epoch time to `3 * 60 * 60 * 1000` to
   * represent 3am.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long valueMsEpoch;

  /**
   * The label for the field that displays to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * The label for the field that displays to the user.
   * @param label label or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * The name of the text input that's used in formInput, and uniquely identifies this input.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the text input that's used in formInput, and uniquely identifies this input.
   * @param name name or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Triggered when the user clicks Save or Clear from the date/time picker dialog. This is only
   * triggered if the value changed as a result of the Save/Clear operation.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1Action getOnChangeAction() {
    return onChangeAction;
  }

  /**
   * Triggered when the user clicks Save or Clear from the date/time picker dialog. This is only
   * triggered if the value changed as a result of the Save/Clear operation.
   * @param onChangeAction onChangeAction or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setOnChangeAction(GoogleAppsCardV1Action onChangeAction) {
    this.onChangeAction = onChangeAction;
    return this;
  }

  /**
   * The number representing the time zone offset from UTC, in minutes. If set, the `value_ms_epoch`
   * is displayed in the specified time zone. If not set, it uses the user's time zone setting on
   * the client side.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimezoneOffsetDate() {
    return timezoneOffsetDate;
  }

  /**
   * The number representing the time zone offset from UTC, in minutes. If set, the `value_ms_epoch`
   * is displayed in the specified time zone. If not set, it uses the user's time zone setting on
   * the client side.
   * @param timezoneOffsetDate timezoneOffsetDate or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setTimezoneOffsetDate(java.lang.Integer timezoneOffsetDate) {
    this.timezoneOffsetDate = timezoneOffsetDate;
    return this;
  }

  /**
   * The type of the date/time picker.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the date/time picker.
   * @param type type or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The value to display as the default value before user input or previous user input. It is
   * represented in milliseconds (Epoch time). For `DATE_AND_TIME` type, the full epoch value is
   * used. For `DATE_ONLY` type, only date of the epoch time is used. For `TIME_ONLY` type, only
   * time of the epoch time is used. For example, you can set epoch time to `3 * 60 * 60 * 1000` to
   * represent 3am.
   * @return value or {@code null} for none
   */
  public java.lang.Long getValueMsEpoch() {
    return valueMsEpoch;
  }

  /**
   * The value to display as the default value before user input or previous user input. It is
   * represented in milliseconds (Epoch time). For `DATE_AND_TIME` type, the full epoch value is
   * used. For `DATE_ONLY` type, only date of the epoch time is used. For `TIME_ONLY` type, only
   * time of the epoch time is used. For example, you can set epoch time to `3 * 60 * 60 * 1000` to
   * represent 3am.
   * @param valueMsEpoch valueMsEpoch or {@code null} for none
   */
  public GoogleAppsCardV1DateTimePicker setValueMsEpoch(java.lang.Long valueMsEpoch) {
    this.valueMsEpoch = valueMsEpoch;
    return this;
  }

  @Override
  public GoogleAppsCardV1DateTimePicker set(String fieldName, Object value) {
    return (GoogleAppsCardV1DateTimePicker) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1DateTimePicker clone() {
    return (GoogleAppsCardV1DateTimePicker) super.clone();
  }

}
