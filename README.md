[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Build Status](https://travis-ci.org/keshrath/Giphy4J.svg?branch=master)](https://travis-ci.org/keshrath/Giphy4J)
[![codecov](https://codecov.io/gh/keshrath/Giphy4J/branch/master/graph/badge.svg)](https://codecov.io/gh/keshrath/Giphy4J)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/532c896527fd435d93442f441c125c65)](https://www.codacy.com/app/keshrath/Giphy4J?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=keshrath/Giphy4J&amp;utm_campaign=Badge_Grade)

# Giphy4J

An unofficial Java library for the [Giphy API](https://github.com/Giphy/GiphyAPI).

## Access and API Keys

Take a look at the [Giphy API](https://github.com/Giphy/GiphyAPI) page to get your api key.

* The public beta/test key is "dc6zaTOxFJmzC”

## Example

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.search("cat", 1, 0);
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

## Rendition Guide

* fixed_height - Height set to 200px. Good for mobile use.
* fixed_height_still - Static preview image for fixed_height
* fixed_height_downsampled - Height set to 200px. Reduced to 6 frames to minimize file size to the lowest. Works well for unlimited scroll on mobile and as animated previews. See Giphy.com on mobile web as an example.
* fixed_width - Width set to 200px. Good for mobile use.
* fixed_width_still - Static preview image for fixed_width
* fixed_width_downsampled - Width set to 200px. Reduced to 6 frames. Works well for unlimited scroll on mobile and as animated previews.
* fixed_height_small - Height set to 100px. Good for mobile keyboards.
* fixed_height_small_still - Static preview image for fixed_height_small
* fixed_width_small - Width set to 100px. Good for mobile keyboards
* fixed_width_small_still - Static preview image for fixed_width_small
* downsized - File size under 1.5mb.
* downsized_still - Static preview image for downsized
* downsized_medium - File size under 5mb.
* downsized_large - File size under 8mb.
* original - Original file size and file dimensions. Good for desktop use.
* original_still - Preview image for original

## How to Use

Quick showcase how to use the library.

### Search Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.search("cat", 1, 0);
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

### Get GIF by ID Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchGiphy giphyData = giphy.searchByID("feqkVgjJpYtjy");
	
	giphyData.getData().getImages().getOriginal().getUrl();
```

### Translate Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchGiphy giphyData = giphy.translate("superman");
	
	giphyData.getData().getImages().getOriginal().getUrl();
```

### Random Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchRandom giphyData = giphy.searchRandom("cat");
	
	giphyData.getData().getImageOriginalUrl();
```

### Trending GIFs Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.trend();
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

### STICKER Search Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.searchSticker("cat", 1, 0);
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

### STICKER Translate Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchGiphy giphyData = giphy.translateSticker("superman");
	
	giphyData.getData().getImages().getOriginal().getUrl();
```

### STICKER Random Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchRandom giphyData = giphy.trendSticker("cat");
	
	giphyData.getData().getImageOriginalUrl();
```

### STICKER Trending Endpoint

```java
	Giphy giphy = new Giphy(API_KEY);
	
	SearchFeed feed = giphy.trendSticker();
	
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
```

## Download Giphy4J

Giphy4J can either be downloaded as a JAR file or embedded as Maven dependency. 

### Manual Install

Download JAR from [here](https://github.com/keshrath/Giphy4J/tree/master/distribution).

### Maven

```xml
	<dependency>
		<groupId>at.mukprojects</groupId>
		<artifactId>giphy4j</artifactId>
		<version>1.0.1</version>
	</dependency>
```

