FROM node:11.9
WORKDIR /webapp
COPY . /webapp
RUN npm install
RUN npm install -g @angular/cli@1.7.1
EXPOSE 4200
CMD ng serve --host 0.0.0.0
