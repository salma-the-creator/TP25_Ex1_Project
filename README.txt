TP25 Ex1 - Voiture
------------------

This is an Android Studio project skeleton for "Exercice 1 - Voiture" that contains:
- Manual dependency injection (no Hilt): MainActivityNoHilt (launch activity)
- Hilt automatic dependency injection: MainActivityHilt (additional activity)
- Hilt configuration in Gradle and MyApp.kt (@HiltAndroidApp)

How to open:
1. Download the ZIP and extract.
2. Open Android Studio -> Open an existing project -> select the extracted folder.
3. Let Gradle sync. (You may need internet to download Gradle plugins and dependencies.)
4. Run the app. The launcher activity is MainActivityNoHilt; logs/console show outputs.
5. To test Hilt activity, change the LAUNCHER intent in AndroidManifest or launch MainActivityHilt.

Notes:
- This is a minimal skeleton for learning. You may want to add proper UI and permission settings.
- Kotlin and AGP versions are examples; adjust if your Android Studio suggests different versions.
