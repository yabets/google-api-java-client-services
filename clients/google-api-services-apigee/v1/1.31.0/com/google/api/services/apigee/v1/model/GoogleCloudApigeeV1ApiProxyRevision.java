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

package com.google.api.services.apigee.v1.model;

/**
 * API proxy revision.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ApiProxyRevision extends com.google.api.client.json.GenericJson {

  /**
   * Base URL of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> basepaths;

  /**
   * Version of the API proxy configuration schema to which the API proxy conforms. Currently, the
   * only supported value is 4.0 (`majorVersion.minorVersion`). This setting may be used in the
   * future to track the evolution of the API proxy format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ConfigVersion configurationVersion;

  /**
   * Revision number, app name, and organization for the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contextInfo;

  /**
   * Time that the API proxy revision was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * Description of the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Human-readable name of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Metadata describing the API proxy revision as a key-value map.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> entityMetaDataAsProperties;

  /**
   * Time that the API proxy revision was last modified in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * Name of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of policy names included in the API proxy revision..
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> policies;

  /**
   * List of proxy names included in the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> proxies;

  /**
   * List of ProxyEndpoints in the `/proxies` directory of the API proxy. Typically, this element is
   * included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> proxyEndpoints;

  /**
   * List of resource files included in the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1ResourceFiles resourceFiles;

  /**
   * List of the resources included in the API proxy revision formatted as "{type}://{name}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resources;

  /**
   * API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * List of the shared flows included in the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sharedFlows;

  /**
   * OpenAPI Specification that is associated with the API proxy. The value is set to a URL or to a
   * path in the specification store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spec;

  /**
   * List of TargetEndpoints in the `/targets` directory of the API proxy. Typically, this element
   * is included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetEndpoints;

  /**
   * List of TargetServers referenced in any TargetEndpoint in the API proxy. Typically, you will
   * see this element only when the API proxy was created using the Edge UI. This is a 'manifest'
   * setting designed to provide visibility into the contents of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetServers;

  /**
   * List of the targets included in the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targets;

  /**
   * List of the teams included in the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> teams;

  /**
   * Type. Set to `Application`. Maintained for compatibility with the Apigee Edge API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Base URL of the API proxy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBasepaths() {
    return basepaths;
  }

  /**
   * Base URL of the API proxy.
   * @param basepaths basepaths or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setBasepaths(java.util.List<java.lang.String> basepaths) {
    this.basepaths = basepaths;
    return this;
  }

  /**
   * Version of the API proxy configuration schema to which the API proxy conforms. Currently, the
   * only supported value is 4.0 (`majorVersion.minorVersion`). This setting may be used in the
   * future to track the evolution of the API proxy format.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ConfigVersion getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Version of the API proxy configuration schema to which the API proxy conforms. Currently, the
   * only supported value is 4.0 (`majorVersion.minorVersion`). This setting may be used in the
   * future to track the evolution of the API proxy format.
   * @param configurationVersion configurationVersion or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setConfigurationVersion(GoogleCloudApigeeV1ConfigVersion configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }

  /**
   * Revision number, app name, and organization for the API proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getContextInfo() {
    return contextInfo;
  }

  /**
   * Revision number, app name, and organization for the API proxy.
   * @param contextInfo contextInfo or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setContextInfo(java.lang.String contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

  /**
   * Time that the API proxy revision was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Time that the API proxy revision was created in milliseconds since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Description of the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the API proxy revision.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable name of the API proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Human-readable name of the API proxy.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Metadata describing the API proxy revision as a key-value map.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEntityMetaDataAsProperties() {
    return entityMetaDataAsProperties;
  }

  /**
   * Metadata describing the API proxy revision as a key-value map.
   * @param entityMetaDataAsProperties entityMetaDataAsProperties or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setEntityMetaDataAsProperties(java.util.Map<String, java.lang.String> entityMetaDataAsProperties) {
    this.entityMetaDataAsProperties = entityMetaDataAsProperties;
    return this;
  }

  /**
   * Time that the API proxy revision was last modified in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Time that the API proxy revision was last modified in milliseconds since epoch.
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Name of the API proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the API proxy.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of policy names included in the API proxy revision..
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPolicies() {
    return policies;
  }

  /**
   * List of policy names included in the API proxy revision..
   * @param policies policies or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setPolicies(java.util.List<java.lang.String> policies) {
    this.policies = policies;
    return this;
  }

  /**
   * List of proxy names included in the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProxies() {
    return proxies;
  }

  /**
   * List of proxy names included in the API proxy revision.
   * @param proxies proxies or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setProxies(java.util.List<java.lang.String> proxies) {
    this.proxies = proxies;
    return this;
  }

  /**
   * List of ProxyEndpoints in the `/proxies` directory of the API proxy. Typically, this element is
   * included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProxyEndpoints() {
    return proxyEndpoints;
  }

  /**
   * List of ProxyEndpoints in the `/proxies` directory of the API proxy. Typically, this element is
   * included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * @param proxyEndpoints proxyEndpoints or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setProxyEndpoints(java.util.List<java.lang.String> proxyEndpoints) {
    this.proxyEndpoints = proxyEndpoints;
    return this;
  }

  /**
   * List of resource files included in the API proxy revision.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1ResourceFiles getResourceFiles() {
    return resourceFiles;
  }

  /**
   * List of resource files included in the API proxy revision.
   * @param resourceFiles resourceFiles or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setResourceFiles(GoogleCloudApigeeV1ResourceFiles resourceFiles) {
    this.resourceFiles = resourceFiles;
    return this;
  }

  /**
   * List of the resources included in the API proxy revision formatted as "{type}://{name}".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResources() {
    return resources;
  }

  /**
   * List of the resources included in the API proxy revision formatted as "{type}://{name}".
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setResources(java.util.List<java.lang.String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * API proxy revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * API proxy revision.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * List of the shared flows included in the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSharedFlows() {
    return sharedFlows;
  }

  /**
   * List of the shared flows included in the API proxy revision.
   * @param sharedFlows sharedFlows or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setSharedFlows(java.util.List<java.lang.String> sharedFlows) {
    this.sharedFlows = sharedFlows;
    return this;
  }

  /**
   * OpenAPI Specification that is associated with the API proxy. The value is set to a URL or to a
   * path in the specification store.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpec() {
    return spec;
  }

  /**
   * OpenAPI Specification that is associated with the API proxy. The value is set to a URL or to a
   * path in the specification store.
   * @param spec spec or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setSpec(java.lang.String spec) {
    this.spec = spec;
    return this;
  }

  /**
   * List of TargetEndpoints in the `/targets` directory of the API proxy. Typically, this element
   * is included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetEndpoints() {
    return targetEndpoints;
  }

  /**
   * List of TargetEndpoints in the `/targets` directory of the API proxy. Typically, this element
   * is included only when the API proxy was created using the Edge UI. This is a 'manifest' setting
   * designed to provide visibility into the contents of the API proxy.
   * @param targetEndpoints targetEndpoints or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setTargetEndpoints(java.util.List<java.lang.String> targetEndpoints) {
    this.targetEndpoints = targetEndpoints;
    return this;
  }

  /**
   * List of TargetServers referenced in any TargetEndpoint in the API proxy. Typically, you will
   * see this element only when the API proxy was created using the Edge UI. This is a 'manifest'
   * setting designed to provide visibility into the contents of the API proxy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetServers() {
    return targetServers;
  }

  /**
   * List of TargetServers referenced in any TargetEndpoint in the API proxy. Typically, you will
   * see this element only when the API proxy was created using the Edge UI. This is a 'manifest'
   * setting designed to provide visibility into the contents of the API proxy.
   * @param targetServers targetServers or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setTargetServers(java.util.List<java.lang.String> targetServers) {
    this.targetServers = targetServers;
    return this;
  }

  /**
   * List of the targets included in the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargets() {
    return targets;
  }

  /**
   * List of the targets included in the API proxy revision.
   * @param targets targets or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setTargets(java.util.List<java.lang.String> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * List of the teams included in the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTeams() {
    return teams;
  }

  /**
   * List of the teams included in the API proxy revision.
   * @param teams teams or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setTeams(java.util.List<java.lang.String> teams) {
    this.teams = teams;
    return this;
  }

  /**
   * Type. Set to `Application`. Maintained for compatibility with the Apigee Edge API.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type. Set to `Application`. Maintained for compatibility with the Apigee Edge API.
   * @param type type or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxyRevision setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ApiProxyRevision set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ApiProxyRevision) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ApiProxyRevision clone() {
    return (GoogleCloudApigeeV1ApiProxyRevision) super.clone();
  }

}
