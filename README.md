# Giphy4J

An unofficial Java library for the [Giphy API](https://github.com/Giphy/GiphyAPI).

## How to Use

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.search("cat", 1, 0);
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

## Download ExclyCore

ExclyCore can either be downloaded as a JAR file or embedded as Maven dependency. 

### Manual Install

Download JAR from [here](https://github.com/keshrath/Giphy4J/tree/master/distribution).

### Maven

```xml
	<dependency>
		<groupId>at.mukprojects</groupId>
		<artifactId>giphy4j</artifactId>
		<version>1.0.0</version>
	</dependency>
```

