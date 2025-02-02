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

package com.google.api.services.notebooks.v1.model;

/**
 * Request for switching a Managed Notebook Runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SwitchRuntimeRequest extends com.google.api.client.json.GenericJson {

  /**
   * accelerator config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RuntimeAcceleratorConfig acceleratorConfig;

  /**
   * machine type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * accelerator config.
   * @return value or {@code null} for none
   */
  public RuntimeAcceleratorConfig getAcceleratorConfig() {
    return acceleratorConfig;
  }

  /**
   * accelerator config.
   * @param acceleratorConfig acceleratorConfig or {@code null} for none
   */
  public SwitchRuntimeRequest setAcceleratorConfig(RuntimeAcceleratorConfig acceleratorConfig) {
    this.acceleratorConfig = acceleratorConfig;
    return this;
  }

  /**
   * machine type.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * machine type.
   * @param machineType machineType or {@code null} for none
   */
  public SwitchRuntimeRequest setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  @Override
  public SwitchRuntimeRequest set(String fieldName, Object value) {
    return (SwitchRuntimeRequest) super.set(fieldName, value);
  }

  @Override
  public SwitchRuntimeRequest clone() {
    return (SwitchRuntimeRequest) super.clone();
  }

}
