odl-rfproxy
===========

Using: To use this module, create a folder named "rfproxy" inside the opendaylight folder (usually "controller/opendaylight") and copy the pom.xml file and src folder into it. Compile the module using the command "mvn clean install -DskipTests -e". Next, add the following dependencies to the pom.xml of opendaylight distribution (usually "controller/opendaylight/distribution/opendaylight/"): <br />

groupId: org.opendaylight.controller<br />
artifcatId: rfproxy<br />
version: 1.0.0-SNAPSHOT<br />

and <br />

groupId: org.mongodb<br />
artifactId: mongo-java-driver<br />
version: 2.10.1<br />

Finally, recompile the distribution to include rfproxy.
