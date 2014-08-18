odl-rfproxy
===========

Using: To use this module, create a folder named "rfproxy" inside the opendaylight folder (usually "controller/opendaylight") and copy the pom.xml file and src folder into it. Compile the module using the command "mvn clean install -DskipTests -e". Next, add the following dependencies to the pom.xml of opendaylight distribution (usually "controller/opendaylight/distribution/opendaylight/"):

groupId: org.opendaylight.controller
artifcatId: rfproxy
version: 1.0.0-SNAPSHOT

and 

groupId: org.mongodb
artifactId: mongo-java-driver
version: 2.10.1

Finally, recompile the distribution to include rfproxy.
