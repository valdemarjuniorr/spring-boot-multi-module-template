# build the application without tests
build:
	mvn clean install -DskipTests

# execute build without tests and run the application with local-container profile
run: build
	java -jar app/target/app-0.0.1-SNAPSHOT.jar --spring.profiles.active=local

# execute build without tests and run the application with local-container profile in debug mode.
debug: build
	java -jar app/target/app-0.0.1-SNAPSHOT.jar --spring.profiles.active=local -Dagentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000

# create the container with postgres and localstack
compose-up:
	docker-compose -f docker-compose.local.yml up --build -d

# destroy the container with postgres and localstack
compose-down:
	docker-compose -f docker-compose.local.yml down

# Start the application locally using postgres docker database e localstack
start: compose-down compose-up run
