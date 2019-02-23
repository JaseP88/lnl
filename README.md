# Notes

### Docker
1. To build a dockerfile in path into an image
`docker build --tag=myappname .`
2. To run an image
`docker run myappname`


## Local Jenkins
1. download jenkins jar
2. set up local jenkins
3. run `java -jar jenkins.war --httpPort=8080`
4. to utilize git hooks expose jenkins port with `ngrok http 8080` and utlize hash url on github