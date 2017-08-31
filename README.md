<a href="https://labstack.com"><img height="80" src="https://cdn.labstack.com/images/labstack-logo.svg"></a>

## Android Client

## Installation

```groovy
dependencies {
    compile 'com.labstack:labstack-android:0.6.37'
}
```

## Quick Start

[Sign up](https://labstack.com/signup) to get an API key

`MainActivity.java`

```java
package main;

import com.labstack.android.Client;
import com.labstack.Document;
import com.labstack.Store;

public class Main {
    public static void main(String[] args) throws Exception {
        Client client = new Client("<ACCOUNT_ID>", "<API_KEY>");
        Store store = client.store();
        Document document = store.insert("users", new Document()
               .add("name", "Jack")
               .add("location", "Disney"));
    }
}
```

Run your app in the configured device

## [Docs](https://labstack.com/docs) | [Forum](https://forum.labstack.com)
