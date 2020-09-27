# customViewExample

概要
シンプルなデザインを表示したい場合はCustomViewを生成しViewを表示する。

※表示する数が少ない場合は、LayoutにViewをAddして表示、リスト数が多い場合もしくは、動的にアイテムが変わる場合はパフォーマンスやメモリー管理のためRecyclerViewを利用すること
※RecyclerViewを利用して少ないアイテムを表示するのも可能だが、工数的効率ではない

開発環境
AndroidStudio4.0.1, Kotlin

確認Point
1. CustomView > Kotlinを利用すると少ないソースで定義ができる
2. CustomViewExampleFragment > Viewを表示しているFragment
3. dataClasses.kt > kotlinのDataClass（javaだとPOJO）
4. MainActivity > Fragmentを利用するためActivityの役割はない
