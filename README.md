## Demo App - Developing with Docker

This demo app shows a simple Employee profile CRUD operations using:
- UI app develoed in React
- API/Service app developed in SpringBoot
- mongodb for data storage

#### Creating Docker images

To create Docker image of Service app run below command in demo-service folder

    docker build -t demo-service:1.0 .

To create Docker image of UI app run below command in demo-ui folder

    docker build -t demo-ui:1.0 .

**Note:** The dot "." at the end of the command denotes location of the Dockerfile

List all docker images

    docker image ls

Delete docker image
    
    docker rmi demo-service:1.0
    docker rmi demo-ui:1.0

Check the contents of Docker image

    docker run --rm -it --entrypoint=sh demo-ui:1.0
    docker run --rm -it --entrypoint=sh demo-service:1.0

#### Starting docker container using our images

Step 1: Start/Stop mongodb in detached mode

    docker compose -f mongo-docker-compose.yaml up -d
    docker compose -f mongo-docker-compose.yaml down

Open Mongo Express UI in the browser
    
    http://localhost:8081/

Step 2: Start/Stop Service (demo-service) and UI (demo-ui) apps

    docker compose -f demo-app-docker-compose.yaml up -d
    docker compose -f demo-app-docker-compose.yaml down

List all docker containers
    
    docker ps


Open `http://localhos:3000` in browser to see our app