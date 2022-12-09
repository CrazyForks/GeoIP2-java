package com.maxmind.geoip2.record;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.maxmind.db.MaxMindDbConstructor;
import com.maxmind.db.MaxMindDbParameter;
import com.maxmind.db.Network;
import com.maxmind.geoip2.NetworkDeserializer;
import com.maxmind.geoip2.model.ConnectionTypeResponse.ConnectionType;

/**
 * Contains data for the traits record associated with an IP address.
 */
public final class Traits extends AbstractRecord {

    private final Long autonomousSystemNumber;
    private final String autonomousSystemOrganization;
    private final ConnectionType connectionType;
    private final String domain;
    private final String ipAddress;
    private final boolean isAnonymous;
    private final boolean isAnonymousProxy;
    private final boolean isAnonymousVpn;
    private final boolean isHostingProvider;
    private final boolean isLegitimateProxy;
    private final boolean isPublicProxy;
    private final boolean isResidentialProxy;
    private final boolean isSatelliteProvider;
    private final boolean isTorExitNode;
    private final String isp;
    private final String mobileCountryCode;
    private final String mobileNetworkCode;
    private final Network network;
    private final String organization;
    private final String userType;
    private final Integer userCount;
    private final Double staticIpScore;

    public Traits() {
        this(null, null, null, null,
            null, false, false, false, false,
            false, false, false, false, false, null,
            null, null, null, null, null, null, null);
    }

    public Traits(String ipAddress, Network network) {
        this(null, null, null, null,
            ipAddress, false, false, false, false,
            false, false, false, false, false, null,
            null, null, network, null, null, null, null);
    }

    public Traits(
        @JsonProperty("autonomous_system_number") Long autonomousSystemNumber,
        @JsonProperty("autonomous_system_organization") String autonomousSystemOrganization,
        @JsonProperty("connection_type") ConnectionType connectionType,
        @JsonProperty("domain") String domain,
        @JacksonInject("ip_address") @JsonProperty("ip_address") String ipAddress,
        @JsonProperty("is_anonymous") boolean isAnonymous,
        @JsonProperty("is_anonymous_proxy") boolean isAnonymousProxy,
        @JsonProperty("is_anonymous_vpn") boolean isAnonymousVpn,
        @JsonProperty("is_hosting_provider") boolean isHostingProvider,
        @JsonProperty("is_legitimate_proxy") boolean isLegitimateProxy,
        @JsonProperty("is_public_proxy") boolean isPublicProxy,
        @JsonProperty("is_residential_proxy") boolean isResidentialProxy,
        @JsonProperty("is_satellite_provider") boolean isSatelliteProvider,
        @JsonProperty("is_tor_exit_node") boolean isTorExitNode,
        @JsonProperty("isp") String isp,
        @JsonProperty("mobile_country_code") String mobileCountryCode,
        @JsonProperty("mobile_network_code") String mobileNetworkCode,
        @JacksonInject("network") @JsonProperty("network")
        @JsonDeserialize(using = NetworkDeserializer.class) Network network,
        @JsonProperty("organization") String organization,
        @JsonProperty("user_type") String userType,
        @JsonProperty("user_count") Integer userCount,
        @JsonProperty("static_ip_score") Double staticIpScore
    ) {
        this.autonomousSystemNumber = autonomousSystemNumber;
        this.autonomousSystemOrganization = autonomousSystemOrganization;
        this.connectionType = connectionType;
        this.domain = domain;
        this.ipAddress = ipAddress;
        this.isAnonymous = isAnonymous;
        this.isAnonymousProxy = isAnonymousProxy;
        this.isAnonymousVpn = isAnonymousVpn;
        this.isHostingProvider = isHostingProvider;
        this.isLegitimateProxy = isLegitimateProxy;
        this.isPublicProxy = isPublicProxy;
        this.isResidentialProxy = isResidentialProxy;
        this.isSatelliteProvider = isSatelliteProvider;
        this.isTorExitNode = isTorExitNode;
        this.isp = isp;
        this.mobileCountryCode = mobileCountryCode;
        this.mobileNetworkCode = mobileNetworkCode;
        this.network = network;
        this.organization = organization;
        this.userType = userType;
        this.userCount = userCount;
        this.staticIpScore = staticIpScore;
    }

    @MaxMindDbConstructor
    public Traits(
        @MaxMindDbParameter(name = "autonomous_system_number") Long autonomousSystemNumber,
        @MaxMindDbParameter(name = "autonomous_system_organization")
        String autonomousSystemOrganization,
        @MaxMindDbParameter(name = "connection_type") String connectionType,
        @MaxMindDbParameter(name = "domain") String domain,
        @MaxMindDbParameter(name = "ip_address") String ipAddress,
        @MaxMindDbParameter(name = "is_anonymous") Boolean isAnonymous,
        @MaxMindDbParameter(name = "is_anonymous_proxy") Boolean isAnonymousProxy,
        @MaxMindDbParameter(name = "is_anonymous_vpn") Boolean isAnonymousVpn,
        @MaxMindDbParameter(name = "is_hosting_provider") Boolean isHostingProvider,
        @MaxMindDbParameter(name = "is_legitimate_proxy") Boolean isLegitimateProxy,
        @MaxMindDbParameter(name = "is_public_proxy") Boolean isPublicProxy,
        @MaxMindDbParameter(name = "is_residential_proxy") Boolean isResidentialProxy,
        @MaxMindDbParameter(name = "is_satellite_provider") Boolean isSatelliteProvider,
        @MaxMindDbParameter(name = "is_tor_exit_node") Boolean isTorExitNode,
        @MaxMindDbParameter(name = "isp") String isp,
        @MaxMindDbParameter(name = "mobile_country_code") String mobileCountryCode,
        @MaxMindDbParameter(name = "mobile_network_code") String mobileNetworkCode,
        @MaxMindDbParameter(name = "network") Network network,
        @MaxMindDbParameter(name = "organization") String organization,
        @MaxMindDbParameter(name = "user_type") String userType,
        @MaxMindDbParameter(name = "user_count") Integer userCount,
        @MaxMindDbParameter(name = "static_ip_score") Double staticIpScore
    ) {
        this.autonomousSystemNumber = autonomousSystemNumber;
        this.autonomousSystemOrganization = autonomousSystemOrganization;
        this.connectionType = ConnectionType.fromString(connectionType);
        this.domain = domain;
        this.ipAddress = ipAddress;
        this.isAnonymous = isAnonymous != null ? isAnonymous : false;
        this.isAnonymousProxy = isAnonymousProxy != null ? isAnonymousProxy : false;
        this.isAnonymousVpn = isAnonymousVpn != null ? isAnonymousVpn : false;
        this.isHostingProvider = isHostingProvider != null ? isHostingProvider : false;
        this.isLegitimateProxy = isLegitimateProxy != null ? isLegitimateProxy : false;
        this.isPublicProxy = isPublicProxy != null ? isPublicProxy : false;
        this.isResidentialProxy = isResidentialProxy != null ? isResidentialProxy : false;
        this.isSatelliteProvider = isSatelliteProvider != null ? isSatelliteProvider : false;
        this.isTorExitNode = isTorExitNode != null ? isTorExitNode : false;
        this.isp = isp;
        this.mobileCountryCode = mobileCountryCode;
        this.mobileNetworkCode = mobileNetworkCode;
        this.network = network;
        this.organization = organization;
        this.userType = userType;
        this.userCount = userCount;
        this.staticIpScore = staticIpScore;
    }

    public Traits(
        Traits traits,
        String ipAddress,
        Network network
    ) {
        this(
            traits.getAutonomousSystemNumber(),
            traits.getAutonomousSystemOrganization(),
            traits.getConnectionType(),
            traits.getDomain(),
            ipAddress,
            traits.isAnonymous(),
            traits.isAnonymousProxy(),
            traits.isAnonymousVpn(),
            traits.isHostingProvider(),
            traits.isLegitimateProxy(),
            traits.isPublicProxy(),
            traits.isResidentialProxy(),
            traits.isSatelliteProvider(),
            traits.isTorExitNode(),
            traits.getIsp(),
            traits.getMobileCountryCode(),
            traits.getMobileNetworkCode(),
            network,
            traits.getOrganization(),
            traits.getUserType(),
            traits.getUserCount(),
            traits.getStaticIpScore()
        );
    }

    /**
     * @return The <a
     * href="https://en.wikipedia.org/wiki/Autonomous_system_(Internet)"
     * >autonomous system number</a> associated with the IP address. This
     * is only available from the City Plus and Insights web services and
     * the Enterprise database.
     */
    @JsonProperty("autonomous_system_number")
    public Long getAutonomousSystemNumber() {
        return this.autonomousSystemNumber;
    }

    /**
     * @return The organization associated with the registered <a
     * href="https://en.wikipedia.org/wiki/Autonomous_system_(Internet)"
     * >autonomous system number</a> for the IP address. This is only
     * available from the City Plus and Insights web services and the
     * Enterprise database.
     */
    @JsonProperty("autonomous_system_organization")
    public String getAutonomousSystemOrganization() {
        return this.autonomousSystemOrganization;
    }

    /**
     * @return The connection type of the IP address. This is only
     * available in the Enterprise database.
     */
    @JsonProperty("connection_type")
    public ConnectionType getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return The static IP score of the IP address. This is an indicator of
     * how static or dynamic an IP address is. This is only available from
     * the Insights web service.
     */
    @JsonProperty("static_ip_score")
    public Double getStaticIpScore() {
        return this.staticIpScore;
    }

    /**
     * @return The estimated number of users sharing the IP address/network
     * during the past 24 hours. For IPv4, the count is for the individual
     * IP address. For IPv6, the count is for the /64 network. This is only
     * available from the Insights web service.
     */
    @JsonProperty("user_count")
    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * @return The second level domain associated with the IP address. This
     * will be something like "example.com" or "example.co.uk", not
     * "foo.example.com". This is only available from the City Plus and
     * Insights web services and the Enterprise database.
     */
    @JsonProperty
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return The IP address that the data in the model is for. If you
     * performed a "me" lookup against the web service, this will be the
     * externally routable IP address for the system the code is running
     * on. If the system is behind a NAT, this may differ from the IP
     * address locally assigned to it. This is available from all web
     * services and databases.
     */
    @JsonProperty("ip_address")
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return The name of the ISP associated with the IP address. This
     * is only available from the City Plus and Insights web services and
     * the Enterprise database.
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return This is true if the IP address belongs to any sort of anonymous
     * network. This is only available from the Insights web service.
     */
    @JsonProperty("is_anonymous")
    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    /**
     * @return This is true if the IP is an anonymous proxy. This is available
     * from all web services and databases.
     * @deprecated Use our
     * <a href="https://www.maxmind.com/en/geoip2-anonymous-ip-database">GeoIP2
     * Anonymous IP database</a> instead.
     */
    @Deprecated
    @JsonProperty("is_anonymous_proxy")
    public boolean isAnonymousProxy() {
        return this.isAnonymousProxy;
    }

    /**
     * @return This is true if the IP address is registered to an anonymous
     * VPN provider. If a VPN provider does not register subnets under names
     * associated with them, we will likely only flag their IP ranges using
     * isHostingProvider. This is only available from the Insights web
     * service.
     */
    @JsonProperty("is_anonymous_vpn")
    public boolean isAnonymousVpn() {
        return this.isAnonymousVpn;
    }

    /**
     * @return This is true if the IP address belongs to a hosting or
     * VPN provider (see description of isAnonymousVpn). This is only
     * available from the Insights web service.
     */
    @JsonProperty("is_hosting_provider")
    public boolean isHostingProvider() {
        return this.isHostingProvider;
    }

    /**
     * @return This is true if MaxMind believes this IP address to be a
     * legitimate proxy, such as an internal VPN used by a corporation. This is
     * only available in the Enterprise database.
     */
    @JsonProperty("is_legitimate_proxy")
    public boolean isLegitimateProxy() {
        return this.isLegitimateProxy;
    }

    /**
     * @return This is true if the IP address belongs to a public proxy.
     * This is only available from the Insights web service.
     */
    @JsonProperty("is_public_proxy")
    public boolean isPublicProxy() {
        return this.isPublicProxy;
    }

    /**
     * @return This is true if the IP address is on a suspected anonymizing
     * network and belongs to a residential ISP. This is only available from
     * the Insights web service.
     */
    @JsonProperty("is_residential_proxy")
    public boolean isResidentialProxy() {
        return this.isResidentialProxy;
    }

    /**
     * @return This is true if the IP belong to a satellite Internet provider.
     * This is available from all web services and databases.
     * @deprecated Due to increased mobile usage, we have insufficient data to
     * maintain this field.
     */
    @Deprecated
    @JsonProperty("is_satellite_provider")
    public boolean isSatelliteProvider() {
        return this.isSatelliteProvider;
    }

    /**
     * @return This is true if the IP address belongs to a Tor exit node.
     * This is only available from the Insights web service.
     */
    @JsonProperty("is_tor_exit_node")
    public boolean isTorExitNode() {
        return this.isTorExitNode;
    }

    /**
     * @return The <a href="https://en.wikipedia.org/wiki/Mobile_country_code">
     * mobile country code (MCC)</a> associated with the IP address and ISP.
     * This is available from the City Plus and Insights web services and the
     * Enterprise database.
     */
    @JsonProperty("mobile_country_code")
    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    /**
     * @return The <a href="https://en.wikipedia.org/wiki/Mobile_country_code">
     * mobile network code (MNC)</a> associated with the IP address and ISP.
     * This is available from the City Plus and Insights web services and the
     * Enterprise database.
     */
    @JsonProperty("mobile_network_code")
    public String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    /**
     * @return The network associated with the record. In particular, this is
     * the largest network where all the fields besides IP address have the
     * same value.
     */
    @JsonProperty
    @JsonSerialize(using = ToStringSerializer.class)
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return The name of the organization associated with the IP address.
     * This is only available from the City Plus and Insights web services and
     * the Enterprise database.
     */
    @JsonProperty
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return <p>
     * The user type associated with the IP address. This can be one of
     * the following values:
     * </p>
     * <ul>
     * <li>business
     * <li>cafe
     * <li>cellular
     * <li>college
     * <li>consumer_privacy_network
     * <li>content_delivery_network
     * <li>dialup
     * <li>government
     * <li>hosting
     * <li>library
     * <li>military
     * <li>residential
     * <li>router
     * <li>school
     * <li>search_engine_spider
     * <li>traveler
     * </ul>
     * <p>
     * This is only available from the Insights web service and the Enterprise
     * database.
     * </p>
     */
    @JsonProperty("user_type")
    public String getUserType() {
        return this.userType;
    }
}
