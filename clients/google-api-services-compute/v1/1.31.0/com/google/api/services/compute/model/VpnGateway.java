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

package com.google.api.services.compute.model;

/**
 * Represents a HA VPN gateway. HA VPN is a high-availability (HA) Cloud VPN solution that lets you
 * securely connect your on-premises network to your Google Cloud Virtual Private Cloud network
 * through an IPsec VPN connection in a single region. For more information about Cloud HA VPN
 * solutions, see Cloud VPN topologies .
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpnGateway extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve an VpnGateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * [Output Only] URL of the region where the VPN gateway resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The list of VPN interfaces associated with this VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VpnGatewayVpnGatewayInterface> vpnInterfaces;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public VpnGateway setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public VpnGateway setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public VpnGateway setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * @param kind kind or {@code null} for none
   */
  public VpnGateway setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve an VpnGateway.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve an VpnGateway.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve an VpnGateway.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public VpnGateway setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve an VpnGateway.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public VpnGateway encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public VpnGateway setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public VpnGateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * @param network network or {@code null} for none
   */
  public VpnGateway setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * [Output Only] URL of the region where the VPN gateway resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the VPN gateway resides.
   * @param region region or {@code null} for none
   */
  public VpnGateway setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public VpnGateway setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The list of VPN interfaces associated with this VPN gateway.
   * @return value or {@code null} for none
   */
  public java.util.List<VpnGatewayVpnGatewayInterface> getVpnInterfaces() {
    return vpnInterfaces;
  }

  /**
   * The list of VPN interfaces associated with this VPN gateway.
   * @param vpnInterfaces vpnInterfaces or {@code null} for none
   */
  public VpnGateway setVpnInterfaces(java.util.List<VpnGatewayVpnGatewayInterface> vpnInterfaces) {
    this.vpnInterfaces = vpnInterfaces;
    return this;
  }

  @Override
  public VpnGateway set(String fieldName, Object value) {
    return (VpnGateway) super.set(fieldName, value);
  }

  @Override
  public VpnGateway clone() {
    return (VpnGateway) super.clone();
  }

}
