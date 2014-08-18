odl-rfproxy
===========

Using: To use this module, create a folder named "rfproxy" inside the opendaylight folder (usually "controller/opendaylight") and copy the pom.xml file and src folder into it. Compile the module using the command "mvn clean install -DskipTests -e". Next, add the following to the pom.xml of opendaylight distribution (usually "controller/opendaylight/distribution/opendaylight/"):

<pre>

<dependency>
    <groupId>org.opendaylight.controller</groupId>
    <artifactId>rfproxy</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongo-java-driver</artifactId>
    <version>2.10.1</version>
</dependency>
</pre>

Finally, recompile the distribution to include rfproxy.
