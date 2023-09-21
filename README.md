# Android Library Example - BuildUtils included
[![Release](https://jitpack.io/v/chauhanz/Android-Library.svg)](https://jitpack.io/#chauhanz/Android-Library)

Simple Android build utilities to avoid hard coding build version code (API level) to improve code readability.

Instead of hard coding like this,
```kotlin
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    /*...*/
}
```
you can use `BuildExt`
```kotlin
if (BuildExt.VERSION.isDynamicColorSupported()) {
    /*...*/
}
```
to provide better code readability.

## Setup
### 1. Import JitPack Android Library
Add `maven { url 'https://jitpack.io' }` in
<details open>
  <summary>groovy - settings.gradle</summary>

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { url 'https://jitpack.io' }
    }
}
```
</details>

<details open>
  <summary>kotlin - settings.gradle.kts</summary>

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven ("https://jitpack.io")
    }
}
```
</details>

### 2. Add dependency
<details open>
  <summary>groovy - build.gradle</summary>

```gradle
dependencies {
    implementation "com.github.chauhanz:buildutils:0.0.6"
}
```
</details>
<details open>
  <summary>kotlin - build.gradle.kts</summary>

```gradle
dependencies {
    implementation("com.github.chauhanz:buildutils:0.0.6")
}
```
</details>

## Usage
### Import
```kotlin
import `in`.simplifiedbytes.library.utils.BuildExt
```

## License
```
Copyright 2023 cHAuHaNz

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
