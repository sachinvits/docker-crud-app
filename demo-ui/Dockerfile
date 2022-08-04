FROM node:18-alpine3.15 AS development
ENV NODE_OPTIONS=--openssl-legacy-provider
ENV NODE_ENV development

RUN mkdir -p /home/app

# set default dir so that next commands executes in /home/app dir
WORKDIR /home/app

COPY ["package.json", "package-lock.json*", "./"]
# will execute npm install in /home/app because of WORKDIR
RUN npm install

COPY . .

EXPOSE 3000

# no need for /home/app/server.js because of WORKDIR
ENTRYPOINT [ "npm", "start" ]
