plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.songhiltmvvm"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.songhiltmvvm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    kapt {
        correctErrorTypes =
            true

    }

    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)



        implementation("com.squareup.retrofit2:retrofit:2.11.0")
//okhttp
        implementation("com.squareup.okhttp3:okhttp:4.12.0")
        implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
        implementation("com.google.code.gson:gson:2.10.1")
        implementation("com.squareup.retrofit2:converter-gson:2.11.0")
        implementation("com.github.bumptech.glide:glide:4.16.0")
        implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
        implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
        implementation("androidx.navigation:navigation-dynamic-features-fragment:2.3.5")


        //Hilt
//        implementation("com.google.dagger:hilt-android:2.44")
//        kapt("com.google.dagger:hilt-android-compiler:2.44")
        implementation("com.google.dagger:hilt-android:2.51.1")
        kapt("com.google.dagger:hilt-android-compiler:2.51.1")

        // Retrofit
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.6")
        implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6")

        // Coroutines
        implementation("com.google.code.gson:gson:2.8.9")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.2")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    }
}