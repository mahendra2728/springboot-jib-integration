# springboot-jib-integration

To build docker image use below command

mvn clean install jib:build



add the below tags in setting.xml file

<servers>
    <server>
		<id>registry.hub.docker.com</id>
		<username>DOCKER_HUB_USERNAME</username>
		<password>PASSWORD</password>
    </server>
</servers>