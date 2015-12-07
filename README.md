Backblaze B2
============

This library is an implementation of the Backblaze B2 api in java.

Download
--------

Repository:
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Dependecy: 
```xml
	<dependency>
	    <groupId>com.github.Alelak</groupId>
	    <artifactId>backblaze-b2</artifactId>
	    <version>1.0</version>
	</dependency>
```

Usage
-----
Initialize:
```java
String accountId = "..." //The identifier for the account
String applicationKey = "..." //The application Key for the account
B2 b2 = new B2(accountId, applicationKey);
```

Create Bucket:
```
B2Bucket bucket = new B2Bucket();
bucket.setBucketName("music"); //bucket names are unique
bucket.setBucketType(B2.BUCKET_TYPE_PRIVATE); //public or private
b2.createBucket(bucket);
```

Get Upload Info:
```java
B2UploadInfo uploadInfo = b2.getUploadInfo(bucket.getBucketId()); //Get upload info for specific bucket
```

Upload File:
```java
File fileToUpload = new File("path/to/somewhere");
b2.uploadFile(fileToUpload, uploadInfo);

```

Check source code and [official docs](https://www.backblaze.com/b2/docs/) for more information.

License
=======

    Copyright 2015 Alladin El Akhrass

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.