# CSRF POC Project

### Links

Here are the [links](https://gist.github.com/Krasnyanskiy/51adf0d9985381acbaed) to read ant try.

### How to make a one-click attack

You can disable CSRF support via changing a flag in Spring configuration.

```xml
<security:csrf disabled="true"/>
```

This change allows you to perform a one-click attack. To make sure it works just fine you need to disable CSRF support in Spring configuration and press `Click me` button on jsFiddle [form](http://jsfiddle.net/krasnyanskiy/bfocngcq/9), and when you click on the `eye` on the main page, you'll notice that your form was actually updated. Is was hacked!

![alt tag](https://photos-6.dropbox.com/t/2/AADGUDdEcfxtBPJIjoQeJZQcbKV6OdFwJ3OEgQTtIb-wng/12/177399428/jpeg/32x32/1/_/1/2/eye.jpg/EN6r-oYBGIkYIAEoAQ/GwXKKnA4-44sj_CrGEENVb3qtuQsXckeagYrokCoxB4?size=1024x768&size_mode=2)
