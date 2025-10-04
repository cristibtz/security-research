package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final ApachedsLibraryAccessors laccForApachedsLibraryAccessors = new ApachedsLibraryAccessors(owner);
    private final DropwizardLibraryAccessors laccForDropwizardLibraryAccessors = new DropwizardLibraryAccessors(owner);
    private final JacksonLibraryAccessors laccForJacksonLibraryAccessors = new JacksonLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final JavaLibraryAccessors laccForJavaLibraryAccessors = new JavaLibraryAccessors(owner);
    private final JavaxLibraryAccessors laccForJavaxLibraryAccessors = new JavaxLibraryAccessors(owner);
    private final JettyLibraryAccessors laccForJettyLibraryAccessors = new JettyLibraryAccessors(owner);
    private final JsonLibraryAccessors laccForJsonLibraryAccessors = new JsonLibraryAccessors(owner);
    private final JwksLibraryAccessors laccForJwksLibraryAccessors = new JwksLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final LogbackLibraryAccessors laccForLogbackLibraryAccessors = new LogbackLibraryAccessors(owner);
    private final NettyLibraryAccessors laccForNettyLibraryAccessors = new NettyLibraryAccessors(owner);
    private final Slf4jLibraryAccessors laccForSlf4jLibraryAccessors = new Slf4jLibraryAccessors(owner);
    private final SwaggerLibraryAccessors laccForSwaggerLibraryAccessors = new SwaggerLibraryAccessors(owner);
    private final TomcatLibraryAccessors laccForTomcatLibraryAccessors = new TomcatLibraryAccessors(owner);
    private final TypesafeLibraryAccessors laccForTypesafeLibraryAccessors = new TypesafeLibraryAccessors(owner);
    private final VelocityLibraryAccessors laccForVelocityLibraryAccessors = new VelocityLibraryAccessors(owner);
    private final WebjarsLibraryAccessors laccForWebjarsLibraryAccessors = new WebjarsLibraryAccessors(owner);
    private final XmlutilLibraryAccessors laccForXmlutilLibraryAccessors = new XmlutilLibraryAccessors(owner);
    private final YamlktLibraryAccessors laccForYamlktLibraryAccessors = new YamlktLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for freemarker (org.freemarker:freemarker)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFreemarker() { return create("freemarker"); }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() { return create("gson"); }

        /**
         * Creates a dependency provider for jansi (org.fusesource.jansi:jansi)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJansi() { return create("jansi"); }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

        /**
         * Creates a dependency provider for micrometer (io.micrometer:micrometer-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMicrometer() { return create("micrometer"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

        /**
         * Creates a dependency provider for mustache (com.github.spullara.mustache.java:compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMustache() { return create("mustache"); }

        /**
         * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() { return create("okhttp"); }

        /**
         * Creates a dependency provider for okio (com.squareup.okio:okio)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkio() { return create("okio"); }

        /**
         * Creates a dependency provider for pebble (io.pebbletemplates:pebble)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPebble() { return create("pebble"); }

        /**
         * Creates a dependency provider for thymeleaf (org.thymeleaf:thymeleaf)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getThymeleaf() { return create("thymeleaf"); }

    /**
     * Returns the group of libraries at apache
     */
    public ApacheLibraryAccessors getApache() { return laccForApacheLibraryAccessors; }

    /**
     * Returns the group of libraries at apacheds
     */
    public ApachedsLibraryAccessors getApacheds() { return laccForApachedsLibraryAccessors; }

    /**
     * Returns the group of libraries at dropwizard
     */
    public DropwizardLibraryAccessors getDropwizard() { return laccForDropwizardLibraryAccessors; }

    /**
     * Returns the group of libraries at jackson
     */
    public JacksonLibraryAccessors getJackson() { return laccForJacksonLibraryAccessors; }

    /**
     * Returns the group of libraries at jakarta
     */
    public JakartaLibraryAccessors getJakarta() { return laccForJakartaLibraryAccessors; }

    /**
     * Returns the group of libraries at java
     */
    public JavaLibraryAccessors getJava() { return laccForJavaLibraryAccessors; }

    /**
     * Returns the group of libraries at javax
     */
    public JavaxLibraryAccessors getJavax() { return laccForJavaxLibraryAccessors; }

    /**
     * Returns the group of libraries at jetty
     */
    public JettyLibraryAccessors getJetty() { return laccForJettyLibraryAccessors; }

    /**
     * Returns the group of libraries at json
     */
    public JsonLibraryAccessors getJson() { return laccForJsonLibraryAccessors; }

    /**
     * Returns the group of libraries at jwks
     */
    public JwksLibraryAccessors getJwks() { return laccForJwksLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at logback
     */
    public LogbackLibraryAccessors getLogback() { return laccForLogbackLibraryAccessors; }

    /**
     * Returns the group of libraries at netty
     */
    public NettyLibraryAccessors getNetty() { return laccForNettyLibraryAccessors; }

    /**
     * Returns the group of libraries at slf4j
     */
    public Slf4jLibraryAccessors getSlf4j() { return laccForSlf4jLibraryAccessors; }

    /**
     * Returns the group of libraries at swagger
     */
    public SwaggerLibraryAccessors getSwagger() { return laccForSwaggerLibraryAccessors; }

    /**
     * Returns the group of libraries at tomcat
     */
    public TomcatLibraryAccessors getTomcat() { return laccForTomcatLibraryAccessors; }

    /**
     * Returns the group of libraries at typesafe
     */
    public TypesafeLibraryAccessors getTypesafe() { return laccForTypesafeLibraryAccessors; }

    /**
     * Returns the group of libraries at velocity
     */
    public VelocityLibraryAccessors getVelocity() { return laccForVelocityLibraryAccessors; }

    /**
     * Returns the group of libraries at webjars
     */
    public WebjarsLibraryAccessors getWebjars() { return laccForWebjarsLibraryAccessors; }

    /**
     * Returns the group of libraries at xmlutil
     */
    public XmlutilLibraryAccessors getXmlutil() { return laccForXmlutilLibraryAccessors; }

    /**
     * Returns the group of libraries at yamlkt
     */
    public YamlktLibraryAccessors getYamlkt() { return laccForYamlktLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client5 (org.apache.httpcomponents.client5:httpclient5)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient5() { return create("apache.client5"); }

            /**
             * Creates a dependency provider for httpasyncclient (org.apache.httpcomponents:httpasyncclient)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHttpasyncclient() { return create("apache.httpasyncclient"); }

    }

    public static class ApachedsLibraryAccessors extends SubDependencyFactory {

        public ApachedsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.apache.directory.server:apacheds-core-integ)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("apacheds.core"); }

            /**
             * Creates a dependency provider for server (org.apache.directory.server:apacheds-server-integ)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServer() { return create("apacheds.server"); }

    }

    public static class DropwizardLibraryAccessors extends SubDependencyFactory {

        public DropwizardLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.dropwizard.metrics:metrics-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("dropwizard.core"); }

            /**
             * Creates a dependency provider for jvm (io.dropwizard.metrics:metrics-jvm)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJvm() { return create("dropwizard.jvm"); }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {
        private final JacksonModuleLibraryAccessors laccForJacksonModuleLibraryAccessors = new JacksonModuleLibraryAccessors(owner);

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.fasterxml.jackson.core:jackson-annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("jackson.annotations"); }

            /**
             * Creates a dependency provider for databind (com.fasterxml.jackson.core:jackson-databind)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabind() { return create("jackson.databind"); }

        /**
         * Returns the group of libraries at jackson.module
         */
        public JacksonModuleLibraryAccessors getModule() { return laccForJacksonModuleLibraryAccessors; }

    }

    public static class JacksonModuleLibraryAccessors extends SubDependencyFactory {

        public JacksonModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kotlin (com.fasterxml.jackson.module:jackson-module-kotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("jackson.module.kotlin"); }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for servlet (jakarta.servlet:jakarta.servlet-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServlet() { return create("jakarta.servlet"); }

    }

    public static class JavaLibraryAccessors extends SubDependencyFactory {

        public JavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jwt (com.auth0:java-jwt)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJwt() { return create("java.jwt"); }

    }

    public static class JavaxLibraryAccessors extends SubDependencyFactory {

        public JavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for servlet (javax.servlet:javax.servlet-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServlet() { return create("javax.servlet"); }

    }

    public static class JettyLibraryAccessors extends SubDependencyFactory {
        private final JettyAlpnLibraryAccessors laccForJettyAlpnLibraryAccessors = new JettyAlpnLibraryAccessors(owner);
        private final JettyClientLibraryAccessors laccForJettyClientLibraryAccessors = new JettyClientLibraryAccessors(owner);
        private final JettyHttp2LibraryAccessors laccForJettyHttp2LibraryAccessors = new JettyHttp2LibraryAccessors(owner);
        private final JettyServerLibraryAccessors laccForJettyServerLibraryAccessors = new JettyServerLibraryAccessors(owner);
        private final JettyServletLibraryAccessors laccForJettyServletLibraryAccessors = new JettyServletLibraryAccessors(owner);
        private final JettyServletsLibraryAccessors laccForJettyServletsLibraryAccessors = new JettyServletsLibraryAccessors(owner);

        public JettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jetty.alpn
         */
        public JettyAlpnLibraryAccessors getAlpn() { return laccForJettyAlpnLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.client
         */
        public JettyClientLibraryAccessors getClient() { return laccForJettyClientLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.http2
         */
        public JettyHttp2LibraryAccessors getHttp2() { return laccForJettyHttp2LibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.server
         */
        public JettyServerLibraryAccessors getServer() { return laccForJettyServerLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.servlet
         */
        public JettyServletLibraryAccessors getServlet() { return laccForJettyServletLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.servlets
         */
        public JettyServletsLibraryAccessors getServlets() { return laccForJettyServletsLibraryAccessors; }

    }

    public static class JettyAlpnLibraryAccessors extends SubDependencyFactory {
        private final JettyAlpnJavaLibraryAccessors laccForJettyAlpnJavaLibraryAccessors = new JettyAlpnJavaLibraryAccessors(owner);
        private final JettyAlpnOpenjdk8LibraryAccessors laccForJettyAlpnOpenjdk8LibraryAccessors = new JettyAlpnOpenjdk8LibraryAccessors(owner);
        private final JettyAlpnServerLibraryAccessors laccForJettyAlpnServerLibraryAccessors = new JettyAlpnServerLibraryAccessors(owner);

        public JettyAlpnLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.eclipse.jetty.alpn:alpn-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("jetty.alpn.api"); }

            /**
             * Creates a dependency provider for boot (org.mortbay.jetty.alpn:alpn-boot)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBoot() { return create("jetty.alpn.boot"); }

        /**
         * Returns the group of libraries at jetty.alpn.java
         */
        public JettyAlpnJavaLibraryAccessors getJava() { return laccForJettyAlpnJavaLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.alpn.openjdk8
         */
        public JettyAlpnOpenjdk8LibraryAccessors getOpenjdk8() { return laccForJettyAlpnOpenjdk8LibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.alpn.server
         */
        public JettyAlpnServerLibraryAccessors getServer() { return laccForJettyAlpnServerLibraryAccessors; }

    }

    public static class JettyAlpnJavaLibraryAccessors extends SubDependencyFactory {
        private final JettyAlpnJavaClientLibraryAccessors laccForJettyAlpnJavaClientLibraryAccessors = new JettyAlpnJavaClientLibraryAccessors(owner);
        private final JettyAlpnJavaServerLibraryAccessors laccForJettyAlpnJavaServerLibraryAccessors = new JettyAlpnJavaServerLibraryAccessors(owner);

        public JettyAlpnJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jetty.alpn.java.client
         */
        public JettyAlpnJavaClientLibraryAccessors getClient() { return laccForJettyAlpnJavaClientLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.alpn.java.server
         */
        public JettyAlpnJavaServerLibraryAccessors getServer() { return laccForJettyAlpnJavaServerLibraryAccessors; }

    }

    public static class JettyAlpnJavaClientLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyAlpnJavaClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.eclipse.jetty:jetty-alpn-java-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.alpn.java.client"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-alpn-java-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.alpn.java.client.jakarta"); }

    }

    public static class JettyAlpnJavaServerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyAlpnJavaServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for server (org.eclipse.jetty:jetty-alpn-java-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.alpn.java.server"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-alpn-java-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.alpn.java.server.jakarta"); }

    }

    public static class JettyAlpnOpenjdk8LibraryAccessors extends SubDependencyFactory {

        public JettyAlpnOpenjdk8LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.eclipse.jetty:jetty-alpn-openjdk8-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient() { return create("jetty.alpn.openjdk8.client"); }

            /**
             * Creates a dependency provider for server (org.eclipse.jetty:jetty-alpn-openjdk8-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServer() { return create("jetty.alpn.openjdk8.server"); }

    }

    public static class JettyAlpnServerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyAlpnServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for server (org.eclipse.jetty:jetty-alpn-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.alpn.server"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-alpn-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.alpn.server.jakarta"); }

    }

    public static class JettyClientLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.eclipse.jetty:jetty-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.client"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.client.jakarta"); }

    }

    public static class JettyHttp2LibraryAccessors extends SubDependencyFactory {
        private final JettyHttp2ClientLibraryAccessors laccForJettyHttp2ClientLibraryAccessors = new JettyHttp2ClientLibraryAccessors(owner);
        private final JettyHttp2ServerLibraryAccessors laccForJettyHttp2ServerLibraryAccessors = new JettyHttp2ServerLibraryAccessors(owner);

        public JettyHttp2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jetty.http2.client
         */
        public JettyHttp2ClientLibraryAccessors getClient() { return laccForJettyHttp2ClientLibraryAccessors; }

        /**
         * Returns the group of libraries at jetty.http2.server
         */
        public JettyHttp2ServerLibraryAccessors getServer() { return laccForJettyHttp2ServerLibraryAccessors; }

    }

    public static class JettyHttp2ClientLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final JettyHttp2ClientTransportLibraryAccessors laccForJettyHttp2ClientTransportLibraryAccessors = new JettyHttp2ClientTransportLibraryAccessors(owner);

        public JettyHttp2ClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.eclipse.jetty.http2:http2-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.http2.client"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty.http2:http2-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.http2.client.jakarta"); }

        /**
         * Returns the group of libraries at jetty.http2.client.transport
         */
        public JettyHttp2ClientTransportLibraryAccessors getTransport() { return laccForJettyHttp2ClientTransportLibraryAccessors; }

    }

    public static class JettyHttp2ClientTransportLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyHttp2ClientTransportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for transport (org.eclipse.jetty.http2:http2-http-client-transport)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.http2.client.transport"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty.http2:http2-http-client-transport)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.http2.client.transport.jakarta"); }

    }

    public static class JettyHttp2ServerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyHttp2ServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for server (org.eclipse.jetty.http2:http2-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.http2.server"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty.http2:http2-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.http2.server.jakarta"); }

    }

    public static class JettyServerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for server (org.eclipse.jetty:jetty-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.server"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-server)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.server.jakarta"); }

    }

    public static class JettyServletLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for servlet (org.eclipse.jetty:jetty-servlet)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.servlet"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-servlet)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.servlet.jakarta"); }

    }

    public static class JettyServletsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JettyServletsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for servlets (org.eclipse.jetty:jetty-servlets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jetty.servlets"); }

            /**
             * Creates a dependency provider for jakarta (org.eclipse.jetty:jetty-servlets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("jetty.servlets.jakarta"); }

    }

    public static class JsonLibraryAccessors extends SubDependencyFactory {

        public JsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for simple (com.googlecode.json-simple:json-simple)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSimple() { return create("json.simple"); }

    }

    public static class JwksLibraryAccessors extends SubDependencyFactory {

        public JwksLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for rsa (com.auth0:jwks-rsa)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRsa() { return create("jwks.rsa"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinStdlibLibraryAccessors laccForKotlinStdlibLibraryAccessors = new KotlinStdlibLibraryAccessors(owner);
        private final KotlinTestLibraryAccessors laccForKotlinTestLibraryAccessors = new KotlinTestLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() { return create("kotlin.reflect"); }

        /**
         * Returns the group of libraries at kotlin.stdlib
         */
        public KotlinStdlibLibraryAccessors getStdlib() { return laccForKotlinStdlibLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlin.test
         */
        public KotlinTestLibraryAccessors getTest() { return laccForKotlinTestLibraryAccessors; }

    }

    public static class KotlinStdlibLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinStdlibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("kotlin.stdlib"); }

            /**
             * Creates a dependency provider for jdk7 (org.jetbrains.kotlin:kotlin-stdlib-jdk7)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk7() { return create("kotlin.stdlib.jdk7"); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("kotlin.stdlib.jdk8"); }

    }

    public static class KotlinTestLibraryAccessors extends SubDependencyFactory {

        public KotlinTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (org.jetbrains.kotlin:kotlin-test-junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("kotlin.test.junit"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for atomicfu (org.jetbrains.kotlinx:atomicfu)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAtomicfu() { return create("kotlinx.atomicfu"); }

            /**
             * Creates a dependency provider for html (org.jetbrains.kotlinx:kotlinx-html)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHtml() { return create("kotlinx.html"); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() { return laccForKotlinxSerializationLibraryAccessors; }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("kotlinx.coroutines.core"); }

            /**
             * Creates a dependency provider for debug (org.jetbrains.kotlinx:kotlinx-coroutines-debug)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDebug() { return create("kotlinx.coroutines.debug"); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlinx:kotlinx-coroutines-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("kotlinx.coroutines.jdk8"); }

            /**
             * Creates a dependency provider for slf4j (org.jetbrains.kotlinx:kotlinx-coroutines-slf4j)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("kotlinx.coroutines.slf4j"); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("kotlinx.coroutines.test"); }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cbor (org.jetbrains.kotlinx:kotlinx-serialization-cbor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCbor() { return create("kotlinx.serialization.cbor"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-serialization-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("kotlinx.serialization.core"); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() { return create("kotlinx.serialization.json"); }

            /**
             * Creates a dependency provider for protobuf (org.jetbrains.kotlinx:kotlinx-serialization-protobuf)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProtobuf() { return create("kotlinx.serialization.protobuf"); }

    }

    public static class LogbackLibraryAccessors extends SubDependencyFactory {

        public LogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for classic (ch.qos.logback:logback-classic)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClassic() { return create("logback.classic"); }

    }

    public static class NettyLibraryAccessors extends SubDependencyFactory {
        private final NettyCodecLibraryAccessors laccForNettyCodecLibraryAccessors = new NettyCodecLibraryAccessors(owner);
        private final NettyTcnativeLibraryAccessors laccForNettyTcnativeLibraryAccessors = new NettyTcnativeLibraryAccessors(owner);
        private final NettyTransportLibraryAccessors laccForNettyTransportLibraryAccessors = new NettyTransportLibraryAccessors(owner);

        public NettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for handler (io.netty:netty-handler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHandler() { return create("netty.handler"); }

        /**
         * Returns the group of libraries at netty.codec
         */
        public NettyCodecLibraryAccessors getCodec() { return laccForNettyCodecLibraryAccessors; }

        /**
         * Returns the group of libraries at netty.tcnative
         */
        public NettyTcnativeLibraryAccessors getTcnative() { return laccForNettyTcnativeLibraryAccessors; }

        /**
         * Returns the group of libraries at netty.transport
         */
        public NettyTransportLibraryAccessors getTransport() { return laccForNettyTransportLibraryAccessors; }

    }

    public static class NettyCodecLibraryAccessors extends SubDependencyFactory {

        public NettyCodecLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for http2 (io.netty:netty-codec-http2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHttp2() { return create("netty.codec.http2"); }

    }

    public static class NettyTcnativeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final NettyTcnativeBoringsslLibraryAccessors laccForNettyTcnativeBoringsslLibraryAccessors = new NettyTcnativeBoringsslLibraryAccessors(owner);

        public NettyTcnativeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tcnative (io.netty:netty-tcnative)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("netty.tcnative"); }

        /**
         * Returns the group of libraries at netty.tcnative.boringssl
         */
        public NettyTcnativeBoringsslLibraryAccessors getBoringssl() { return laccForNettyTcnativeBoringsslLibraryAccessors; }

    }

    public static class NettyTcnativeBoringsslLibraryAccessors extends SubDependencyFactory {

        public NettyTcnativeBoringsslLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for static (io.netty:netty-tcnative-boringssl-static)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStatic() { return create("netty.tcnative.boringssl.static"); }

    }

    public static class NettyTransportLibraryAccessors extends SubDependencyFactory {
        private final NettyTransportNativeLibraryAccessors laccForNettyTransportNativeLibraryAccessors = new NettyTransportNativeLibraryAccessors(owner);

        public NettyTransportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at netty.transport.native
         */
        public NettyTransportNativeLibraryAccessors getNative() { return laccForNettyTransportNativeLibraryAccessors; }

    }

    public static class NettyTransportNativeLibraryAccessors extends SubDependencyFactory {

        public NettyTransportNativeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for epoll (io.netty:netty-transport-native-epoll)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEpoll() { return create("netty.transport.native.epoll"); }

            /**
             * Creates a dependency provider for kqueue (io.netty:netty-transport-native-kqueue)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKqueue() { return create("netty.transport.native.kqueue"); }

    }

    public static class Slf4jLibraryAccessors extends SubDependencyFactory {

        public Slf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.slf4j:slf4j-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("slf4j.api"); }

            /**
             * Creates a dependency provider for simple (org.slf4j:slf4j-simple)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSimple() { return create("slf4j.simple"); }

    }

    public static class SwaggerLibraryAccessors extends SubDependencyFactory {
        private final SwaggerCodegenLibraryAccessors laccForSwaggerCodegenLibraryAccessors = new SwaggerCodegenLibraryAccessors(owner);

        public SwaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for parser (io.swagger.parser.v3:swagger-parser)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getParser() { return create("swagger.parser"); }

        /**
         * Returns the group of libraries at swagger.codegen
         */
        public SwaggerCodegenLibraryAccessors getCodegen() { return laccForSwaggerCodegenLibraryAccessors; }

    }

    public static class SwaggerCodegenLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SwaggerCodegenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for codegen (io.swagger.codegen.v3:swagger-codegen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("swagger.codegen"); }

            /**
             * Creates a dependency provider for generators (io.swagger.codegen.v3:swagger-codegen-generators)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGenerators() { return create("swagger.codegen.generators"); }

    }

    public static class TomcatLibraryAccessors extends SubDependencyFactory {
        private final TomcatCatalinaLibraryAccessors laccForTomcatCatalinaLibraryAccessors = new TomcatCatalinaLibraryAccessors(owner);
        private final TomcatEmbedLibraryAccessors laccForTomcatEmbedLibraryAccessors = new TomcatEmbedLibraryAccessors(owner);

        public TomcatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at tomcat.catalina
         */
        public TomcatCatalinaLibraryAccessors getCatalina() { return laccForTomcatCatalinaLibraryAccessors; }

        /**
         * Returns the group of libraries at tomcat.embed
         */
        public TomcatEmbedLibraryAccessors getEmbed() { return laccForTomcatEmbedLibraryAccessors; }

    }

    public static class TomcatCatalinaLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public TomcatCatalinaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for catalina (org.apache.tomcat:tomcat-catalina)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("tomcat.catalina"); }

            /**
             * Creates a dependency provider for jakarta (org.apache.tomcat:tomcat-catalina)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("tomcat.catalina.jakarta"); }

    }

    public static class TomcatEmbedLibraryAccessors extends SubDependencyFactory {
        private final TomcatEmbedCoreLibraryAccessors laccForTomcatEmbedCoreLibraryAccessors = new TomcatEmbedCoreLibraryAccessors(owner);

        public TomcatEmbedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at tomcat.embed.core
         */
        public TomcatEmbedCoreLibraryAccessors getCore() { return laccForTomcatEmbedCoreLibraryAccessors; }

    }

    public static class TomcatEmbedCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public TomcatEmbedCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.apache.tomcat.embed:tomcat-embed-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("tomcat.embed.core"); }

            /**
             * Creates a dependency provider for jakarta (org.apache.tomcat.embed:tomcat-embed-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJakarta() { return create("tomcat.embed.core.jakarta"); }

    }

    public static class TypesafeLibraryAccessors extends SubDependencyFactory {

        public TypesafeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for config (com.typesafe:config)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConfig() { return create("typesafe.config"); }

    }

    public static class VelocityLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public VelocityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for velocity (org.apache.velocity:velocity-engine-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("velocity"); }

            /**
             * Creates a dependency provider for tools (org.apache.velocity.tools:velocity-tools-generic)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTools() { return create("velocity.tools"); }

    }

    public static class WebjarsLibraryAccessors extends SubDependencyFactory {

        public WebjarsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jquery (org.webjars:jquery)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJquery() { return create("webjars.jquery"); }

            /**
             * Creates a dependency provider for locator (org.webjars:webjars-locator-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLocator() { return create("webjars.locator"); }

    }

    public static class XmlutilLibraryAccessors extends SubDependencyFactory {

        public XmlutilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for serialization (io.github.pdvrieze.xmlutil:serialization)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() { return create("xmlutil.serialization"); }

    }

    public static class YamlktLibraryAccessors extends SubDependencyFactory {

        public YamlktLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for serialization (net.mamoe.yamlkt:yamlkt)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() { return create("yamlkt.serialization"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AbortVersionAccessors vaccForAbortVersionAccessors = new AbortVersionAccessors(providers, config);
        private final ApacheVersionAccessors vaccForApacheVersionAccessors = new ApacheVersionAccessors(providers, config);
        private final Apache5VersionAccessors vaccForApache5VersionAccessors = new Apache5VersionAccessors(providers, config);
        private final ApachedsVersionAccessors vaccForApachedsVersionAccessors = new ApachedsVersionAccessors(providers, config);
        private final AtomicfuVersionAccessors vaccForAtomicfuVersionAccessors = new AtomicfuVersionAccessors(providers, config);
        private final CoroutinesVersionAccessors vaccForCoroutinesVersionAccessors = new CoroutinesVersionAccessors(providers, config);
        private final DropwizardVersionAccessors vaccForDropwizardVersionAccessors = new DropwizardVersionAccessors(providers, config);
        private final FreemarkerVersionAccessors vaccForFreemarkerVersionAccessors = new FreemarkerVersionAccessors(providers, config);
        private final GsonVersionAccessors vaccForGsonVersionAccessors = new GsonVersionAccessors(providers, config);
        private final JacksonVersionAccessors vaccForJacksonVersionAccessors = new JacksonVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final JansiVersionAccessors vaccForJansiVersionAccessors = new JansiVersionAccessors(providers, config);
        private final JavaVersionAccessors vaccForJavaVersionAccessors = new JavaVersionAccessors(providers, config);
        private final JavaxVersionAccessors vaccForJavaxVersionAccessors = new JavaxVersionAccessors(providers, config);
        private final JettyVersionAccessors vaccForJettyVersionAccessors = new JettyVersionAccessors(providers, config);
        private final JsonVersionAccessors vaccForJsonVersionAccessors = new JsonVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final JwksVersionAccessors vaccForJwksVersionAccessors = new JwksVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final KtlintVersionAccessors vaccForKtlintVersionAccessors = new KtlintVersionAccessors(providers, config);
        private final LogbackVersionAccessors vaccForLogbackVersionAccessors = new LogbackVersionAccessors(providers, config);
        private final MicrometerVersionAccessors vaccForMicrometerVersionAccessors = new MicrometerVersionAccessors(providers, config);
        private final MockkVersionAccessors vaccForMockkVersionAccessors = new MockkVersionAccessors(providers, config);
        private final MustacheVersionAccessors vaccForMustacheVersionAccessors = new MustacheVersionAccessors(providers, config);
        private final NettyVersionAccessors vaccForNettyVersionAccessors = new NettyVersionAccessors(providers, config);
        private final NodeVersionAccessors vaccForNodeVersionAccessors = new NodeVersionAccessors(providers, config);
        private final OkhttpVersionAccessors vaccForOkhttpVersionAccessors = new OkhttpVersionAccessors(providers, config);
        private final OkioVersionAccessors vaccForOkioVersionAccessors = new OkioVersionAccessors(providers, config);
        private final PebbleVersionAccessors vaccForPebbleVersionAccessors = new PebbleVersionAccessors(providers, config);
        private final SerializationVersionAccessors vaccForSerializationVersionAccessors = new SerializationVersionAccessors(providers, config);
        private final Slf4jVersionAccessors vaccForSlf4jVersionAccessors = new Slf4jVersionAccessors(providers, config);
        private final SwaggerVersionAccessors vaccForSwaggerVersionAccessors = new SwaggerVersionAccessors(providers, config);
        private final ThymeleafVersionAccessors vaccForThymeleafVersionAccessors = new ThymeleafVersionAccessors(providers, config);
        private final TomcatVersionAccessors vaccForTomcatVersionAccessors = new TomcatVersionAccessors(providers, config);
        private final TypesafeVersionAccessors vaccForTypesafeVersionAccessors = new TypesafeVersionAccessors(providers, config);
        private final ValidatorVersionAccessors vaccForValidatorVersionAccessors = new ValidatorVersionAccessors(providers, config);
        private final VelocityVersionAccessors vaccForVelocityVersionAccessors = new VelocityVersionAccessors(providers, config);
        private final WebjarsVersionAccessors vaccForWebjarsVersionAccessors = new WebjarsVersionAccessors(providers, config);
        private final WsVersionAccessors vaccForWsVersionAccessors = new WsVersionAccessors(providers, config);
        private final XmlutilVersionAccessors vaccForXmlutilVersionAccessors = new XmlutilVersionAccessors(providers, config);
        private final YamlktVersionAccessors vaccForYamlktVersionAccessors = new YamlktVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.abort
         */
        public AbortVersionAccessors getAbort() { return vaccForAbortVersionAccessors; }

        /**
         * Returns the group of versions at versions.apache
         */
        public ApacheVersionAccessors getApache() { return vaccForApacheVersionAccessors; }

        /**
         * Returns the group of versions at versions.apache5
         */
        public Apache5VersionAccessors getApache5() { return vaccForApache5VersionAccessors; }

        /**
         * Returns the group of versions at versions.apacheds
         */
        public ApachedsVersionAccessors getApacheds() { return vaccForApachedsVersionAccessors; }

        /**
         * Returns the group of versions at versions.atomicfu
         */
        public AtomicfuVersionAccessors getAtomicfu() { return vaccForAtomicfuVersionAccessors; }

        /**
         * Returns the group of versions at versions.coroutines
         */
        public CoroutinesVersionAccessors getCoroutines() { return vaccForCoroutinesVersionAccessors; }

        /**
         * Returns the group of versions at versions.dropwizard
         */
        public DropwizardVersionAccessors getDropwizard() { return vaccForDropwizardVersionAccessors; }

        /**
         * Returns the group of versions at versions.freemarker
         */
        public FreemarkerVersionAccessors getFreemarker() { return vaccForFreemarkerVersionAccessors; }

        /**
         * Returns the group of versions at versions.gson
         */
        public GsonVersionAccessors getGson() { return vaccForGsonVersionAccessors; }

        /**
         * Returns the group of versions at versions.jackson
         */
        public JacksonVersionAccessors getJackson() { return vaccForJacksonVersionAccessors; }

        /**
         * Returns the group of versions at versions.jakarta
         */
        public JakartaVersionAccessors getJakarta() { return vaccForJakartaVersionAccessors; }

        /**
         * Returns the group of versions at versions.jansi
         */
        public JansiVersionAccessors getJansi() { return vaccForJansiVersionAccessors; }

        /**
         * Returns the group of versions at versions.java
         */
        public JavaVersionAccessors getJava() { return vaccForJavaVersionAccessors; }

        /**
         * Returns the group of versions at versions.javax
         */
        public JavaxVersionAccessors getJavax() { return vaccForJavaxVersionAccessors; }

        /**
         * Returns the group of versions at versions.jetty
         */
        public JettyVersionAccessors getJetty() { return vaccForJettyVersionAccessors; }

        /**
         * Returns the group of versions at versions.json
         */
        public JsonVersionAccessors getJson() { return vaccForJsonVersionAccessors; }

        /**
         * Returns the group of versions at versions.junit
         */
        public JunitVersionAccessors getJunit() { return vaccForJunitVersionAccessors; }

        /**
         * Returns the group of versions at versions.jwks
         */
        public JwksVersionAccessors getJwks() { return vaccForJwksVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlin
         */
        public KotlinVersionAccessors getKotlin() { return vaccForKotlinVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() { return vaccForKotlinxVersionAccessors; }

        /**
         * Returns the group of versions at versions.ktlint
         */
        public KtlintVersionAccessors getKtlint() { return vaccForKtlintVersionAccessors; }

        /**
         * Returns the group of versions at versions.logback
         */
        public LogbackVersionAccessors getLogback() { return vaccForLogbackVersionAccessors; }

        /**
         * Returns the group of versions at versions.micrometer
         */
        public MicrometerVersionAccessors getMicrometer() { return vaccForMicrometerVersionAccessors; }

        /**
         * Returns the group of versions at versions.mockk
         */
        public MockkVersionAccessors getMockk() { return vaccForMockkVersionAccessors; }

        /**
         * Returns the group of versions at versions.mustache
         */
        public MustacheVersionAccessors getMustache() { return vaccForMustacheVersionAccessors; }

        /**
         * Returns the group of versions at versions.netty
         */
        public NettyVersionAccessors getNetty() { return vaccForNettyVersionAccessors; }

        /**
         * Returns the group of versions at versions.node
         */
        public NodeVersionAccessors getNode() { return vaccForNodeVersionAccessors; }

        /**
         * Returns the group of versions at versions.okhttp
         */
        public OkhttpVersionAccessors getOkhttp() { return vaccForOkhttpVersionAccessors; }

        /**
         * Returns the group of versions at versions.okio
         */
        public OkioVersionAccessors getOkio() { return vaccForOkioVersionAccessors; }

        /**
         * Returns the group of versions at versions.pebble
         */
        public PebbleVersionAccessors getPebble() { return vaccForPebbleVersionAccessors; }

        /**
         * Returns the group of versions at versions.serialization
         */
        public SerializationVersionAccessors getSerialization() { return vaccForSerializationVersionAccessors; }

        /**
         * Returns the group of versions at versions.slf4j
         */
        public Slf4jVersionAccessors getSlf4j() { return vaccForSlf4jVersionAccessors; }

        /**
         * Returns the group of versions at versions.swagger
         */
        public SwaggerVersionAccessors getSwagger() { return vaccForSwaggerVersionAccessors; }

        /**
         * Returns the group of versions at versions.thymeleaf
         */
        public ThymeleafVersionAccessors getThymeleaf() { return vaccForThymeleafVersionAccessors; }

        /**
         * Returns the group of versions at versions.tomcat
         */
        public TomcatVersionAccessors getTomcat() { return vaccForTomcatVersionAccessors; }

        /**
         * Returns the group of versions at versions.typesafe
         */
        public TypesafeVersionAccessors getTypesafe() { return vaccForTypesafeVersionAccessors; }

        /**
         * Returns the group of versions at versions.validator
         */
        public ValidatorVersionAccessors getValidator() { return vaccForValidatorVersionAccessors; }

        /**
         * Returns the group of versions at versions.velocity
         */
        public VelocityVersionAccessors getVelocity() { return vaccForVelocityVersionAccessors; }

        /**
         * Returns the group of versions at versions.webjars
         */
        public WebjarsVersionAccessors getWebjars() { return vaccForWebjarsVersionAccessors; }

        /**
         * Returns the group of versions at versions.ws
         */
        public WsVersionAccessors getWs() { return vaccForWsVersionAccessors; }

        /**
         * Returns the group of versions at versions.xmlutil
         */
        public XmlutilVersionAccessors getXmlutil() { return vaccForXmlutilVersionAccessors; }

        /**
         * Returns the group of versions at versions.yamlkt
         */
        public YamlktVersionAccessors getYamlkt() { return vaccForYamlktVersionAccessors; }

    }

    public static class AbortVersionAccessors extends VersionFactory  {

        private final AbortControllerVersionAccessors vaccForAbortControllerVersionAccessors = new AbortControllerVersionAccessors(providers, config);
        public AbortVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.abort.controller
         */
        public AbortControllerVersionAccessors getController() { return vaccForAbortControllerVersionAccessors; }

    }

    public static class AbortControllerVersionAccessors extends VersionFactory  {

        public AbortControllerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: abort.controller.version (3.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("abort.controller.version"); }

    }

    public static class ApacheVersionAccessors extends VersionFactory  {

        public ApacheVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: apache.version (4.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("apache.version"); }

    }

    public static class Apache5VersionAccessors extends VersionFactory  {

        public Apache5VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: apache5.version (5.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("apache5.version"); }

    }

    public static class ApachedsVersionAccessors extends VersionFactory  {

        public ApachedsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: apacheds.version (2.0.0-M24)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("apacheds.version"); }

    }

    public static class AtomicfuVersionAccessors extends VersionFactory  {

        public AtomicfuVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: atomicfu.version (0.20.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("atomicfu.version"); }

    }

    public static class CoroutinesVersionAccessors extends VersionFactory  {

        public CoroutinesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coroutines.version (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("coroutines.version"); }

    }

    public static class DropwizardVersionAccessors extends VersionFactory  {

        public DropwizardVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: dropwizard.version (4.2.18)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("dropwizard.version"); }

    }

    public static class FreemarkerVersionAccessors extends VersionFactory  {

        public FreemarkerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: freemarker.version (2.3.32)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("freemarker.version"); }

    }

    public static class GsonVersionAccessors extends VersionFactory  {

        public GsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gson.version (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("gson.version"); }

    }

    public static class JacksonVersionAccessors extends VersionFactory  {

        public JacksonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jackson.version (2.15.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jackson.version"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        private final JakartaServletVersionAccessors vaccForJakartaServletVersionAccessors = new JakartaServletVersionAccessors(providers, config);
        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jakarta.servlet
         */
        public JakartaServletVersionAccessors getServlet() { return vaccForJakartaServletVersionAccessors; }

    }

    public static class JakartaServletVersionAccessors extends VersionFactory  {

        public JakartaServletVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jakarta.servlet.version (5.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jakarta.servlet.version"); }

    }

    public static class JansiVersionAccessors extends VersionFactory  {

        public JansiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jansi.version (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jansi.version"); }

    }

    public static class JavaVersionAccessors extends VersionFactory  {

        private final JavaJwtVersionAccessors vaccForJavaJwtVersionAccessors = new JavaJwtVersionAccessors(providers, config);
        public JavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.java.jwt
         */
        public JavaJwtVersionAccessors getJwt() { return vaccForJavaJwtVersionAccessors; }

    }

    public static class JavaJwtVersionAccessors extends VersionFactory  {

        public JavaJwtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: java.jwt.version (4.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("java.jwt.version"); }

    }

    public static class JavaxVersionAccessors extends VersionFactory  {

        private final JavaxServletVersionAccessors vaccForJavaxServletVersionAccessors = new JavaxServletVersionAccessors(providers, config);
        public JavaxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.javax.servlet
         */
        public JavaxServletVersionAccessors getServlet() { return vaccForJavaxServletVersionAccessors; }

    }

    public static class JavaxServletVersionAccessors extends VersionFactory  {

        public JavaxServletVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: javax.servlet.version (4.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("javax.servlet.version"); }

    }

    public static class JettyVersionAccessors extends VersionFactory  {

        private final JettyAlpnVersionAccessors vaccForJettyAlpnVersionAccessors = new JettyAlpnVersionAccessors(providers, config);
        private final JettyJakartaVersionAccessors vaccForJettyJakartaVersionAccessors = new JettyJakartaVersionAccessors(providers, config);
        public JettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jetty.version (9.4.51.v20230217)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jetty.version"); }

        /**
         * Returns the group of versions at versions.jetty.alpn
         */
        public JettyAlpnVersionAccessors getAlpn() { return vaccForJettyAlpnVersionAccessors; }

        /**
         * Returns the group of versions at versions.jetty.jakarta
         */
        public JettyJakartaVersionAccessors getJakarta() { return vaccForJettyJakartaVersionAccessors; }

    }

    public static class JettyAlpnVersionAccessors extends VersionFactory  {

        private final JettyAlpnApiVersionAccessors vaccForJettyAlpnApiVersionAccessors = new JettyAlpnApiVersionAccessors(providers, config);
        private final JettyAlpnBootVersionAccessors vaccForJettyAlpnBootVersionAccessors = new JettyAlpnBootVersionAccessors(providers, config);
        public JettyAlpnVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jetty.alpn.openjdk8 (9.4.51.v20230217)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpenjdk8() { return getVersion("jetty.alpn.openjdk8"); }

        /**
         * Returns the group of versions at versions.jetty.alpn.api
         */
        public JettyAlpnApiVersionAccessors getApi() { return vaccForJettyAlpnApiVersionAccessors; }

        /**
         * Returns the group of versions at versions.jetty.alpn.boot
         */
        public JettyAlpnBootVersionAccessors getBoot() { return vaccForJettyAlpnBootVersionAccessors; }

    }

    public static class JettyAlpnApiVersionAccessors extends VersionFactory  {

        public JettyAlpnApiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jetty.alpn.api.version (1.1.3.v20160715)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jetty.alpn.api.version"); }

    }

    public static class JettyAlpnBootVersionAccessors extends VersionFactory  {

        public JettyAlpnBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jetty.alpn.boot.version (8.1.13.v20181017)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jetty.alpn.boot.version"); }

    }

    public static class JettyJakartaVersionAccessors extends VersionFactory  {

        public JettyJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jetty.jakarta.version (11.0.15)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jetty.jakarta.version"); }

    }

    public static class JsonVersionAccessors extends VersionFactory  {

        private final JsonSimpleVersionAccessors vaccForJsonSimpleVersionAccessors = new JsonSimpleVersionAccessors(providers, config);
        public JsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.json.simple
         */
        public JsonSimpleVersionAccessors getSimple() { return vaccForJsonSimpleVersionAccessors; }

    }

    public static class JsonSimpleVersionAccessors extends VersionFactory  {

        public JsonSimpleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: json.simple.version (1.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("json.simple.version"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: junit.version (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("junit.version"); }

    }

    public static class JwksVersionAccessors extends VersionFactory  {

        private final JwksRsaVersionAccessors vaccForJwksRsaVersionAccessors = new JwksRsaVersionAccessors(providers, config);
        public JwksVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.jwks.rsa
         */
        public JwksRsaVersionAccessors getRsa() { return vaccForJwksRsaVersionAccessors; }

    }

    public static class JwksRsaVersionAccessors extends VersionFactory  {

        public JwksRsaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jwks.rsa.version (0.22.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("jwks.rsa.version"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlin.version (1.8.22)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("kotlin.version"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        private final KotlinxHtmlVersionAccessors vaccForKotlinxHtmlVersionAccessors = new KotlinxHtmlVersionAccessors(providers, config);
        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.kotlinx.html
         */
        public KotlinxHtmlVersionAccessors getHtml() { return vaccForKotlinxHtmlVersionAccessors; }

    }

    public static class KotlinxHtmlVersionAccessors extends VersionFactory  {

        public KotlinxHtmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.html.version (0.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("kotlinx.html.version"); }

    }

    public static class KtlintVersionAccessors extends VersionFactory  {

        public KtlintVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: ktlint.version (3.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("ktlint.version"); }

    }

    public static class LogbackVersionAccessors extends VersionFactory  {

        public LogbackVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: logback.version (1.3.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("logback.version"); }

    }

    public static class MicrometerVersionAccessors extends VersionFactory  {

        public MicrometerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: micrometer.version (1.11.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("micrometer.version"); }

    }

    public static class MockkVersionAccessors extends VersionFactory  {

        public MockkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mockk.version (1.13.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("mockk.version"); }

    }

    public static class MustacheVersionAccessors extends VersionFactory  {

        public MustacheVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mustache.version (0.9.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("mustache.version"); }

    }

    public static class NettyVersionAccessors extends VersionFactory  {

        private final NettyTcnativeVersionAccessors vaccForNettyTcnativeVersionAccessors = new NettyTcnativeVersionAccessors(providers, config);
        public NettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: netty.version (4.1.92.Final)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("netty.version"); }

        /**
         * Returns the group of versions at versions.netty.tcnative
         */
        public NettyTcnativeVersionAccessors getTcnative() { return vaccForNettyTcnativeVersionAccessors; }

    }

    public static class NettyTcnativeVersionAccessors extends VersionFactory  {

        public NettyTcnativeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: netty.tcnative.version (2.0.61.Final)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("netty.tcnative.version"); }

    }

    public static class NodeVersionAccessors extends VersionFactory  {

        private final NodeFetchVersionAccessors vaccForNodeFetchVersionAccessors = new NodeFetchVersionAccessors(providers, config);
        public NodeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.node.fetch
         */
        public NodeFetchVersionAccessors getFetch() { return vaccForNodeFetchVersionAccessors; }

    }

    public static class NodeFetchVersionAccessors extends VersionFactory  {

        public NodeFetchVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: node.fetch.version (2.6.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("node.fetch.version"); }

    }

    public static class OkhttpVersionAccessors extends VersionFactory  {

        public OkhttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: okhttp.version (4.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("okhttp.version"); }

    }

    public static class OkioVersionAccessors extends VersionFactory  {

        public OkioVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: okio.version (3.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("okio.version"); }

    }

    public static class PebbleVersionAccessors extends VersionFactory  {

        public PebbleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: pebble.version (3.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("pebble.version"); }

    }

    public static class SerializationVersionAccessors extends VersionFactory  {

        public SerializationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: serialization.version (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("serialization.version"); }

    }

    public static class Slf4jVersionAccessors extends VersionFactory  {

        public Slf4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: slf4j.version (2.0.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("slf4j.version"); }

    }

    public static class SwaggerVersionAccessors extends VersionFactory  {

        private final SwaggerCodegenVersionAccessors vaccForSwaggerCodegenVersionAccessors = new SwaggerCodegenVersionAccessors(providers, config);
        private final SwaggerParserVersionAccessors vaccForSwaggerParserVersionAccessors = new SwaggerParserVersionAccessors(providers, config);
        public SwaggerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.swagger.codegen
         */
        public SwaggerCodegenVersionAccessors getCodegen() { return vaccForSwaggerCodegenVersionAccessors; }

        /**
         * Returns the group of versions at versions.swagger.parser
         */
        public SwaggerParserVersionAccessors getParser() { return vaccForSwaggerParserVersionAccessors; }

    }

    public static class SwaggerCodegenVersionAccessors extends VersionFactory  {

        private final SwaggerCodegenGeneratorsVersionAccessors vaccForSwaggerCodegenGeneratorsVersionAccessors = new SwaggerCodegenGeneratorsVersionAccessors(providers, config);
        public SwaggerCodegenVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: swagger.codegen.version (3.0.41)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("swagger.codegen.version"); }

        /**
         * Returns the group of versions at versions.swagger.codegen.generators
         */
        public SwaggerCodegenGeneratorsVersionAccessors getGenerators() { return vaccForSwaggerCodegenGeneratorsVersionAccessors; }

    }

    public static class SwaggerCodegenGeneratorsVersionAccessors extends VersionFactory  {

        public SwaggerCodegenGeneratorsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: swagger.codegen.generators.version (1.0.38)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("swagger.codegen.generators.version"); }

    }

    public static class SwaggerParserVersionAccessors extends VersionFactory  {

        public SwaggerParserVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: swagger.parser.version (2.1.13)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("swagger.parser.version"); }

    }

    public static class ThymeleafVersionAccessors extends VersionFactory  {

        public ThymeleafVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: thymeleaf.version (3.1.1.RELEASE)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("thymeleaf.version"); }

    }

    public static class TomcatVersionAccessors extends VersionFactory  {

        private final TomcatJakartaVersionAccessors vaccForTomcatJakartaVersionAccessors = new TomcatJakartaVersionAccessors(providers, config);
        public TomcatVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: tomcat.version (9.0.73)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("tomcat.version"); }

        /**
         * Returns the group of versions at versions.tomcat.jakarta
         */
        public TomcatJakartaVersionAccessors getJakarta() { return vaccForTomcatJakartaVersionAccessors; }

    }

    public static class TomcatJakartaVersionAccessors extends VersionFactory  {

        public TomcatJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: tomcat.jakarta.version (10.1.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("tomcat.jakarta.version"); }

    }

    public static class TypesafeVersionAccessors extends VersionFactory  {

        public TypesafeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: typesafe.version (1.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("typesafe.version"); }

    }

    public static class ValidatorVersionAccessors extends VersionFactory  {

        public ValidatorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: validator.version (0.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("validator.version"); }

    }

    public static class VelocityVersionAccessors extends VersionFactory  {

        private final VelocityToolsVersionAccessors vaccForVelocityToolsVersionAccessors = new VelocityToolsVersionAccessors(providers, config);
        public VelocityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: velocity.version (2.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("velocity.version"); }

        /**
         * Returns the group of versions at versions.velocity.tools
         */
        public VelocityToolsVersionAccessors getTools() { return vaccForVelocityToolsVersionAccessors; }

    }

    public static class VelocityToolsVersionAccessors extends VersionFactory  {

        public VelocityToolsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: velocity.tools.version (3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("velocity.tools.version"); }

    }

    public static class WebjarsVersionAccessors extends VersionFactory  {

        private final WebjarsJqueryVersionAccessors vaccForWebjarsJqueryVersionAccessors = new WebjarsJqueryVersionAccessors(providers, config);
        private final WebjarsLocatorVersionAccessors vaccForWebjarsLocatorVersionAccessors = new WebjarsLocatorVersionAccessors(providers, config);
        public WebjarsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.webjars.jquery
         */
        public WebjarsJqueryVersionAccessors getJquery() { return vaccForWebjarsJqueryVersionAccessors; }

        /**
         * Returns the group of versions at versions.webjars.locator
         */
        public WebjarsLocatorVersionAccessors getLocator() { return vaccForWebjarsLocatorVersionAccessors; }

    }

    public static class WebjarsJqueryVersionAccessors extends VersionFactory  {

        public WebjarsJqueryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: webjars.jquery.version (3.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("webjars.jquery.version"); }

    }

    public static class WebjarsLocatorVersionAccessors extends VersionFactory  {

        public WebjarsLocatorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: webjars.locator.version (0.53)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("webjars.locator.version"); }

    }

    public static class WsVersionAccessors extends VersionFactory  {

        public WsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: ws.version (8.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("ws.version"); }

    }

    public static class XmlutilVersionAccessors extends VersionFactory  {

        public XmlutilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: xmlutil.version (0.86.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("xmlutil.version"); }

    }

    public static class YamlktVersionAccessors extends VersionFactory  {

        public YamlktVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: yamlkt.version (0.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("yamlkt.version"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
