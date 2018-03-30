# Hackathon-Backend

#### Requirements
    
1. ##### Java 8 or higher
```sh
$ brew cask update
$ brew cask install caskroom/versions/java8
```

2. ##### Download Spring Tool Suite (STS)
###### MacOS: http://download.springsource.com/release/STS/3.9.3.RELEASE/dist/e4.7/spring-tool-suite-3.9.3.RELEASE-e4.7.3-macosx-cocoa-x86_64.dmg


### Installation

Clone the repository

```sh
$ git clone https://github.com/Achintya9503/Hackathon-Backend.git

1. Open STS
2. Load Hackathon-Backend/Wowza in STS
3. GOTO Wowza/src/main/java/com.wowza/WowzaApplication.java
4. Hit RUN to start the server.
5. Server will run on http://localhost:8080
```

### APIs 


| METHOD | URL | DESCRIPTION |
| ------ | ------ | ------ |
| GET | [http://localhost:8080/api/Users] | Fetch list of all users
| POST | [http://localhost:8080/api/save] | Add user to database

