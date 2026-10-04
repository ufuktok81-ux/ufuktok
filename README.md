# !ufuktok

CloudStream 3 için Kotlin tabanlı plugin deposu ve boş provider başlangıç projesi.

Bu proje, TurkSpor deposundaki yayın sağlayıcılarını, yayın adreslerini, alan adı listelerini veya yayın çözümleme kodunu içermez. `!ufuktok` şu anda yalnızca CloudStream tarafından yüklenebilen bir provider iskeletidir. İçerik mantığını yalnızca kullanımına ve dağıtımına izin verilen kaynaklar için ekleyin.

## Yapı

- `Ufuktok/`: CloudStream plugin modülü.
- `Ufuktok/src/main/kotlin/com/ufuktok/UfuktokPlugin.kt`: plugin yükleme ve provider kaydı.
- `Ufuktok/src/main/kotlin/com/ufuktok/UfuktokProvider.kt`: arama ve içerik mantığının ekleneceği provider.
- `Ufuktok/src/main/AndroidManifest.xml`: Android manifest iskeleti.
- `repo.json`: CloudStream depo metadatası.
- `.github/workflows/build.yml`: plugin'i derleyip `builds` dalına `.cs3` ve `plugins.json` yayımlar.

## Derleme

Yerel ortamda JDK 17, Android SDK ve Gradle 8.12 gerekir:

```sh
gradle make makePluginsJson
```

GitHub Actions derlemesini elle başlatmak için Actions sekmesindeki **Build CloudStream plugin** iş akışını çalıştırın. Başarılı derlemeden sonra depo adresi:

```text
https://raw.githubusercontent.com/ufuktok81-ux/ufuktok/main/repo.json
```

İlk derlemede dış Gradle plugin deposuna erişim başarısız olursa iş akışı `.cs3` üretmez ve depo dizinini yayımlamaz.
