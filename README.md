RoundedButton-Android
===============

An Android library to create a customizable button.

![RoundedButton](https://raw.github.com/mink-lparrouy/RoundedButton-Android/master/screenshot.png)

Gradle
------
Add it in your root build.gradle at the end of repositories.
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
```
dependencies {
    ...
    compile 'com.github.mink-lparrouy:RoundedButton-Android:1.0'
}
```

Usage
-----
```xml
<com.minkagency.roundedbutton.RoundedButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Button"
    app:rb_backgroundColor="#009688"
    app:rb_cornerRadius="8dp"
    app:rb_strokeWidth="1dp"
    app:rb_strokeColor="#000"/>
```

Changelog
---------
* **1.0.0**
    * Initial release

License
-------
MIT License

Copyright (c) 2017 mink-lparrouy

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.