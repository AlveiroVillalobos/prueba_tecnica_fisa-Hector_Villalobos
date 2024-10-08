# **Prueba tecnica FISA**

## Pre requirements
- Java version 21, JDK (environment variables configured).
- IntelliJ IDEA.
- Gradle version 8.5 or higher (environment variables configured).
- Cucumber for Java Plugin (updated version).
- Gherkin Plugin (updated version).

## Installation
- To clone this repository locally
- Import the project to IntelliJ IDE under the structure of an existing Gradle project.
- Configure JRE System Library with JavaSE-21.


## Runners

- Run in Google Chrome
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=chrome --info
```
- Run in Google Chrome headless
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=chrome-headless --info
```

- Run in Firefox
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=firefox --info
```
- Run in Firefox headless
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=firefox-headless --info
```

- Run in Microsoft Edge
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=edge --info
```

- Run in Microsoft Edge headless
```
gradle clean test --tests "com.test.runners.VirtualPianoRunner" -Denvironment=edge-headless --info
```

