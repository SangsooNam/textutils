## TextUtils

[![DUB](https://img.shields.io/dub/l/vibe-d.svg)]()

Example code to explain how to test `TextUtils.isEmpty` with JUnit. By default, you will see this error when you run JUnit for the code containg `TextUtils.isEmtpy`

```
java.lang.RuntimeException: Method isEmpty in android.text.TextUtils not mocked. 
  See http://g.co/androidstudio/not-mocked for details.
```

Robolectric can solve this issue. However, you need to be aware that it could be 10x slower than JUnit. Check this blog post to see detils: http://sangsoonam.github.io/2018/12/02/is-textutils-isempty-evil.html
