# customViewExample

※開発環境
AndroidStudio4.0.1, Kotlin
#5
2020/01/24
概要
よく使うサイトのまとめの追加

確認Point：TipsFragmentの追加

＃４
2020/12/29
概要
ログイン画面を作ってみよう

確認Point：loginFragment（一覧）の追加

＃３
2020/12/01
概要
よく使うAndroioのListner

確認Point：ListnerFragmentの追加、ListFragment（一覧）の追加

＃２
2020/11/01
概要
ConstraitLayout練習

確認Point：fragment_second.xmlにあるとサンプルをみて、Optionを調整しながらレイアウト作成の練習をしましょ。
コメントにQuestionがあるので、確認してみましょ。

※Relatelayout代わりにConstraitLayoutを使いましょ。

＃１
概要
シンプルなデザインを表示したい場合はCustomViewを生成しViewを表示する。

※表示する数が少ない場合は、LayoutにViewをAddして表示、リスト数が多い場合もしくは、動的にアイテムが変わる場合はパフォーマンスやメモリー管理のためRecyclerViewを利用すること
※RecyclerViewを利用して少ないアイテムを表示するのも可能だが、工数的効率ではない

確認Point
1. CustomView > Kotlinを利用すると少ないソースで定義ができる
2. CustomViewExampleFragment > Viewを表示しているFragment
3. dataClasses.kt > kotlinのDataClass（javaだとPOJO）
4. MainActivity > Fragmentを利用するためActivityの役割はない


