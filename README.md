# 公式ドキュメント
[公式README](https://github.com/Kotlin/dokka)


# やること

## ライブラリ導入
build.gradle(Project)
```
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath"org.jetbrains.dokka:dokka-gradle-plugin:1.7.20" # バージョン確認
    }
}
```

build.gradle(:app)
```
plugins {
    id 'org.jetbrains.dokka'
}
```

## 生成
ターミナルで以下のコマンドを打つ

```
./gradlew dokkaHtml # html方式で作成
./gradlew dokkaGfm # markdown方式で作成
```

`app/build/dokka`に出力されている

## gitに保存されるようにする（任意）
`app/.gitignore`を変更