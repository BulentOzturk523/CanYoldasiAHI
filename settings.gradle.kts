--- a/app/build.gradle.kts
+++ b/app/build.gradle.kts
@@ -26,7 +26,7 @@
 
     buildTypes {
         release {
-            isMinifyEnabled = false
+            isMinifyEnabled = true
             proguardFiles(
                 getDefaultProguardFile("proguard-android-optimize.txt"),
                 "proguard-rules.pro"
@@ -34,14 +34,14 @@
         }
     }
     compileOptions {
-        sourceCompatibility = JavaVersion.VERSION_1_8
-        targetCompatibility = JavaVersion.VERSION_1_8
+        sourceCompatibility = JavaVersion.VERSION_17
+        targetCompatibility = JavaVersion.VERSION_17
     }
     kotlinOptions {
-        jvmTarget = "1.8"
+        jvmTarget = "17"
     }
     buildFeatures {
         compose = true
         viewBinding = true
     }
     composeOptions {
-        kotlinCompilerExtensionVersion = "1.5.1"
+        kotlinCompilerExtensionVersion = "1.5.10"
     }
     packaging {
         resources {
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CanYoldasiAHI"
include(":android-app")